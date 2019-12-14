package remvn.renbt.core;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ReNBT extends JavaPlugin {

	private Version version;
	public static ReNBT main;
	
	public void onEnable() {
		main = this;
		initVersion();
		initCommand();
//		initListener();
	}

	public void initListener() {
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new ListenerPlayer(), this);
	}
	
	public void initVersion() {
		version = Version.getServerVersion();
	}
	
	public void initCommand() {
		this.getCommand("renbt").setExecutor(new Command());
	}
	
    public void onDisable(){

    }
	
	public Version getVersion() {
		return version;
	}
	
	public static NbtAPI geNbtAPI() {
		return main.getVersion().getNbtAPI();
	}
	
	public static ReNBT getInstance() {
		return main;
	}
	
}
