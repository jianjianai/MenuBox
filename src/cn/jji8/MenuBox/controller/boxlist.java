package cn.jji8.MenuBox.controller;

import cn.jji8.MenuBox.controller.box.box;

import java.util.ArrayList;
/*
* 我是一个box列表，专门控制box
* 每个box是一个菜单。
* */
public class boxlist {
    static ArrayList<box> biao = new ArrayList();
    /*
     * 添加一个box，玩家点击的时候会调用他
     * 每个菜单都是一个box
     * */
    public static void addbox(box box){
        biao.add(box);
    }
    /*
     * 判断玩家是否打开箱子
     * */
    public static boolean ifwanjiadakaixiangzi(String wanjia){
        for(int i = 0;i<biao.size();i++){
            if(biao.get(i).ifdakaixiangzi(wanjia)){
                return true;
            }
        }
        return false;
    }
    /*
    * 调用玩家打开箱子的点击付费
    * wanjia 玩家名字
    * weizi 点击位置
    * */
    public static void dianji(String wanjia,int weizi){
        for(int i = 0;i<biao.size();i++){
            if(biao.get(i).ifdakaixiangzi(wanjia)){
                biao.get(i).dianji(wanjia,weizi);
            }
        }
    }
}
