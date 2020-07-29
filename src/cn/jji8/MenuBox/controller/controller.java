package cn.jji8.MenuBox.controller;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;


public class controller implements Listener {
    //玩家点击时触发
    @EventHandler
    public void InventoryClickEvent(InventoryClickEvent a) {
        if(boxlist.ifwanjiadakaixiangzi(a.getWhoClicked().getName())){
            a.setCancelled(true);
        }
    }
}
