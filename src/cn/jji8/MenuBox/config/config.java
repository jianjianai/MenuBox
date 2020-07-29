package cn.jji8.MenuBox.config;

import cn.jji8.MenuBox.controller.boxlist.box;
import cn.jji8.MenuBox.main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.Inventory;

import java.io.File;

public class config {

    /*
    * 我负责加载配置
    * */
    public config(){
        main.getMain().getLogger().info("开始加载配置文件");
        File File = new File(main.getMain().getDataFolder(),"/菜单");
        File.mkdirs();

        String[] a = File.list();//获取配置文件列表
        main.getMain().getLogger().info("__________________菜单文件列表__________________");
        for(int i = 0;i<a.length;i++){
            main.getMain().getLogger().info(a[i]);
        }
        main.getMain().getLogger().info("________________________________________________");

        //加载全部配置文件
        for(int i = 0;i<a.length;i++){
            main.getMain().getLogger().info(a[i]+"开始加载..");
            File s = new File(main.getMain().getDataFolder(),"/菜单/"+a[i]);
            YamlConfiguration y = YamlConfiguration.loadConfiguration(s);
            Inventory xz = Bukkit.createInventory(null,6*9,y.getString("箱子标题"));
            box box = new box(xz);//new 一个box
            for(int i1 = 0;i1<54;i++){
                xz.setItem(i1,y.getItemStack("箱子物品.第"+i+"个"));//设置箱子中的物品
                box.setgeiwanjiafasongxiaoxi();//设置玩家命令
            }



        }

        main.getMain().getLogger().info("配置文件加载完成");
    }
}
