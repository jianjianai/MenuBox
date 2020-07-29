package cn.jji8.MenuBox.command;

import cn.jji8.MenuBox.main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
/*
* 打开菜单
* */
public class openbox implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(2!=strings.length){
            return false;
        }
        if(main.getmainConfig().boxlist.dakai(strings[0],strings[1])){
            return true;
        }
        commandSender.sendMessage("菜单名不正确");
        return true;
    }
}
