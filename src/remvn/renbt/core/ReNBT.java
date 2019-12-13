package remvn.renbt.core;

import org.bukkit.plugin.java.JavaPlugin;

public class ReNBT extends JavaPlugin {

	private Version version;
	public static ReNBT main;
	
	public void onEnable() {
		main = this;
		initVersion();
	}
	
	public void initVersion() {
		version = Version.getServerVersion();
	}
	
	public void onDisable() {
		
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
