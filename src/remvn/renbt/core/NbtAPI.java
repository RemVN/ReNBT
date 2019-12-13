package remvn.renbt.core;

import org.bukkit.inventory.ItemStack;

public interface NbtAPI {

	// Add tag
    void addStringTag(ItemStack item, String key, String value);
    void addIntTag(org.bukkit.inventory.ItemStack item, String key, int value);
    void addDoubleTag(org.bukkit.inventory.ItemStack item, String key, int value);
    void addBooleanTag(org.bukkit.inventory.ItemStack item, String key, boolean value);
    
    // Get tag
    int getIntTag(org.bukkit.inventory.ItemStack item, String key);
    String getStringTag(org.bukkit.inventory.ItemStack item, String key);
    double getDoubleTag(org.bukkit.inventory.ItemStack item, String key);
    boolean getBooleanTag(org.bukkit.inventory.ItemStack item, String key);
	
    boolean hasTag(org.bukkit.inventory.ItemStack item, String key);
    void removeTag(org.bukkit.inventory.ItemStack item, String key);
}
