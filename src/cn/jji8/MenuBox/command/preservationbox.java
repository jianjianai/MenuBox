package cn.jji8.MenuBox.command;

import cn.jji8.MenuBox.command.commandbox.commandbox;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.IOException;

/*
* 保存菜单
* */
public class preservationbox implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(strings.length!=1){
            return false;
        }
        try {
            commandbox.preservationbox((Player) commandSender,strings[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
