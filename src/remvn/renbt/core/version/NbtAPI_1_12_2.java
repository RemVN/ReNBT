package remvn.renbt.core.version;

import org.bukkit.craftbukkit.v1_12_R1.inventory.CraftItemStack;

import net.minecraft.server.v1_12_R1.ItemStack;
import net.minecraft.server.v1_12_R1.NBTTagCompound;
import remvn.renbt.core.NbtAPI;

public class NbtAPI_1_12_2 implements NbtAPI {

    public NBTTagCompound getTag(org.bukkit.inventory.ItemStack item) {
        ItemStack itemNMS = CraftItemStack.asNMSCopy(item);
        NBTTagCompound tag = new NBTTagCompound();
        if(itemNMS.hasTag()) tag = itemNMS.getTag();
        return tag;
    }

    public void setTag(org.bukkit.inventory.ItemStack item, ItemStack itemNMS, NBTTagCompound tag) {
        itemNMS.setTag(tag);
        item.setItemMeta(CraftItemStack.asBukkitCopy(itemNMS).getItemMeta());
    }

    // Add tag
    
    public void addStringTag(org.bukkit.inventory.ItemStack item, String key, String value) {
        ItemStack itemNMS = CraftItemStack.asNMSCopy(item);
        NBTTagCompound tag = getTag(item);
        tag.setString(key, value);
        setTag(item, itemNMS, tag);
    }

    public void addIntTag(org.bukkit.inventory.ItemStack item, String key, int value) {
        ItemStack itemNMS = CraftItemStack.asNMSCopy(item);
        NBTTagCompound tag = getTag(item);
        tag.setInt(key, value);
        setTag(item, itemNMS, tag);
    }

    public void addDoubleTag(org.bukkit.inventory.ItemStack item, String key, double value) {
        ItemStack itemNMS = CraftItemStack.asNMSCopy(item);
        NBTTagCompound tag = getTag(item);
        tag.setDouble(key, value);
        setTag(item, itemNMS, tag);
    }

    public void addBooleanTag(org.bukkit.inventory.ItemStack item, String key, boolean value) {
        ItemStack itemNMS = CraftItemStack.asNMSCopy(item);
        NBTTagCompound tag = getTag(item);
        tag.setBoolean(key, value);
        setTag(item, itemNMS, tag);
    }
    
    // Get tag
    
    public int getIntTag(org.bukkit.inventory.ItemStack item, String key) {
        if(!hasTag(item, key)) return 0;
        NBTTagCompound tag = getTag(item);
        return tag.getInt(key);
    }

    public String getStringTag(org.bukkit.inventory.ItemStack item, String key) {
        if(!hasTag(item, key)) return "";
        NBTTagCompound tag = getTag(item);
        return tag.getString(key);
    }

    public double getDoubleTag(org.bukkit.inventory.ItemStack item, String key) {
        if(!hasTag(item, key)) return 0;
        NBTTagCompound tag = getTag(item);
        return tag.getDouble(key);
    }
	
    public boolean getBooleanTag(org.bukkit.inventory.ItemStack item, String key) {
        if(!hasTag(item, key)) return false;
        NBTTagCompound tag = getTag(item);
        return tag.getBoolean(key);
    }

	
    //
	
    public boolean hasTag(org.bukkit.inventory.ItemStack item, String key) {
        ItemStack itemNMS = CraftItemStack.asNMSCopy(item);
        if(!itemNMS.hasTag()) return false;
        return itemNMS.getTag().hasKey(key);
    }

    public void removeTag(org.bukkit.inventory.ItemStack item, String key) {
        ItemStack itemNMS = CraftItemStack.asNMSCopy(item);
        if(hasTag(item, key)) {
        	NBTTagCompound tag = getTag(item);
        	tag.remove(key);
        	setTag(item, itemNMS, tag);
        }
    }
    
}
