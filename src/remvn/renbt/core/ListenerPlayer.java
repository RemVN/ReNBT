package remvn.renbt.core;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

public class ListenerPlayer implements Listener {

	static NbtAPI nbtAPI = ReNBT.geNbtAPI();
	
	@EventHandler
	public void onHurt(EntityDamageByEntityEvent e) {
		Entity entity = e.getEntity();
		Entity damager = e.getDamager();
		if(damager instanceof Player) {
			Player p = (Player) damager;
			ItemStack item = p.getInventory().getItemInMainHand();
			int power = nbtAPI.getIntTag(item, "power");
			p.sendMessage("Power: " + power);
		}
	}
	
}
