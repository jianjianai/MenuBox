package cn.jji8.MenuBox.controller;

import cn.jji8.MenuBox.main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;


public class controller implements Listener {
    //玩家点击时触发
    @EventHandler
    public void InventoryClickEvent(InventoryClickEvent a) {
        if(main.getmainConfig().boxlist.ifwanjiadakaixiangzi(a.getWhoClicked().getName())){
            a.setCancelled(true);
            main.getmainConfig().boxlist.dianji(a.getWhoClicked().getName(),a.getRawSlot());
        }
    }
}
