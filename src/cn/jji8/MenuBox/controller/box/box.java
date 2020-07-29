package cn.jji8.MenuBox.controller.box;

import org.bukkit.Bukkit;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.List;

public class box {
    Inventory xiangzi;//箱子
    List[] geiwanjiafasongxiaoxi = new List[54];//给玩家发送消息
    List[] wanjiamingling = new List[54];//玩家发送命令|消息
    List[] houtaimingling = new List[54];//后台命令

    public void dakai(String wanjia){
        Player player = org.bukkit.Bukkit.getPlayer(wanjia);
        if(player!=null){
            player.openInventory(xiangzi);
        }
    }
    /*
    * 构造方法，需要一个物品已经设置好的箱子。
    * 这个交给配置类了。
    * */
    public box(Inventory xiangzi){
        this.xiangzi = xiangzi;
    }
    /*
    * 玩家点击时调用本方法，控制箱子
    * wanjia 点击箱子的玩家
    * weizhi 玩家点击的位置
    * */
    public void dianji(String wanjia, int weizhi){
        Player a = Bukkit.getPlayer(wanjia);
        if(geiwanjiafasongxiaoxi[weizhi]!=null){
            for(int q=0;q<geiwanjiafasongxiaoxi[weizhi].size();q++){
                a.sendRawMessage(((String)geiwanjiafasongxiaoxi[weizhi].get(q)).replaceAll("%玩家%",wanjia));//给玩家发送消息
            }
        }
        if(wanjiamingling[weizhi]!=null){
            for(int q=0;q<wanjiamingling[weizhi].size();q++){
                a.chat(((String)wanjiamingling[weizhi].get(q)).replaceAll("%玩家%",wanjia));//玩家发送命令|消息
            }
        }
        if(houtaimingling[weizhi]!=null){
            for(int q=0;q<houtaimingling[weizhi].size();q++){
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(),((String)houtaimingling[weizhi].get(q)).replaceAll("%玩家%",wanjia));//玩家发送命令|消息
            }
        }
    }
    /*
    * 判断玩家是否打开箱子
    * */
    public boolean ifdakaixiangzi(String wanjia){
        List wanjiabiao = xiangzi.getViewers();
        for(int i = 0;i<wanjiabiao.size();i++){
            if(((HumanEntity)wanjiabiao.get(i)).getName().equals(wanjia)){
                return true;
            }
        }
        return false;
    }
    /*设置点击位置玩家命令
     * wz 点击物品的位子
     * xiaoxi 点击位置执行给玩家发送消息
     * */
    public void setgeiwanjiafasongxiaoxi(int wz,List xiaoxi){
        geiwanjiafasongxiaoxi[wz]=xiaoxi;
    }
    /*设置点击位置玩家命令
    * wz 点击物品的位子
    * ml 点击位置执行的命令
    * */
    public void setwanjiamingling(int wz,List ml){
        wanjiamingling[wz]=ml;
    }
    /*设置点击位置后台命令
     * wz 点击物品的位子
     * ml 点击位置执行的命令
     * */
    public void sethoutaimingling(int wz,List ml){
        houtaimingling[wz]=ml;
    }
}
