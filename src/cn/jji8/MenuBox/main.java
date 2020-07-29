package cn.jji8.MenuBox;

import cn.jji8.MenuBox.config.config;
import cn.jji8.MenuBox.controller.controller;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
/*
* 主类
* */
public class main extends JavaPlugin {
    public static main main;
    config config;

    @Override
    public void onEnable(){
        getLogger().info("插件开始加载..");
        main = this;
        //加载配置
        config = new config();
        //注册主控制器
        controller controller  = new controller();
        Bukkit.getPluginManager().registerEvents(controller,this);
        getLogger().info("插件加载完成..");
    }



    /*
    * 获取主配置
    * */
    public  config getmainConfig() {
        return config;
    }
    /*
    * 获取main
    * */
    public static cn.jji8.MenuBox.main getMain() {
        return main;
    }
}
