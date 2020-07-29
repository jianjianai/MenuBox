package cn.jji8.MenuBox.command;

import cn.jji8.MenuBox.command.commandbox.commandbox;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/*
* 编辑菜单
* */
public class editbox implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        commandbox.editbox((Player) commandSender);
        return true;
    }
}
