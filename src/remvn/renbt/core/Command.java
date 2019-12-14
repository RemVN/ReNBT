package remvn.renbt.core;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String str, String[] args) {
		if(sender.hasPermission("renbt.admin")) {
			
			//TODO show help
			
			Player p = (Player) sender;
			p.getInventory().addItem(Example.testAddTag());
			
		}
		return true;
	}

}
