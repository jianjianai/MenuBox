package cn.jji8.MenuBox.controller;

import cn.jji8.MenuBox.controller.box.box;

import java.util.ArrayList;
import java.util.HashMap;

/*
* 我是一个box列表，专门控制box
* 每个box是一个菜单。
* */
public class boxlist {
    ArrayList<box> biao = new ArrayList();
    HashMap<String,box> namebiao = new HashMap<String,box>();

    /*
    * 打开给玩家box的方法
    * 打开成功返回true 失败返回false
    * name 菜单名字
    * wanjia 玩家名字
    * */
    public boolean dakai(String name,String wanjia){
        if(namebiao.containsKey(name)){
            namebiao.get(name).dakai(wanjia);
            return true;
        }
        return false;
    }
    /*
     * 添加一个box，玩家点击的时候会调用他
     * 每个菜单都是一个box
     * */
    public void addbox(box box,String name){
        biao.add(box);
        namebiao.put(name,box);
    }
    /*
     * 判断玩家是否打开箱子
     * */
    public boolean ifwanjiadakaixiangzi(String wanjia){
        for(int i = 0;i<biao.size();i++){
            if(biao.get(i).ifdakaixiangzi(wanjia)){
                return true;
            }
        }
        return false;
    }
    /*
    * 调用玩家打开箱子的点击方法
    * wanjia 玩家名字
    * weizi 点击位置
    * */
    public void dianji(String wanjia,int weizi){
        for(int i = 0;i<biao.size();i++){
            if(biao.get(i).ifdakaixiangzi(wanjia)){
                biao.get(i).dianji(wanjia,weizi);
            }
        }
    }
}
