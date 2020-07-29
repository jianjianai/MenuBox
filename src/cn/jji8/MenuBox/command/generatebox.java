package cn.jji8.MenuBox.command;

import cn.jji8.MenuBox.command.commandbox.commandbox;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/*
* 生成菜单
* */
public class generatebox implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        commandbox.generatebox((Player) commandSender);
        return true;
    }
}
