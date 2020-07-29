package cn.jji8.MenuBox.command.commandbox;

import cn.jji8.MenuBox.main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class commandbox {
    static Inventory xz = Bukkit.createInventory(null,6*9,"箱子标题");
    public static void generatebox(Player a){
        xz = Bukkit.createInventory(null,6*9,"箱子标题");
        a.openInventory(xz);
    }
    public static void editbox(Player a){
        a.openInventory(xz);
    }
    public static void preservationbox(Player a,String name) throws IOException {
        File s = new File(main.getMain().getDataFolder(),"/菜单/"+name);
        YamlConfiguration y = YamlConfiguration.loadConfiguration(s);

        y.set("箱子标题","箱子标题");
        for(int i = 0;i<54;i++){
            y.set("箱子物品.第"+i+"个.物品",xz.getItem(i));
        }
        y.save(s);
    }
}
