# ReNBT

NBT Utils for Minecraft ItemStack

Currently work with Minecraft version: 1.12.2

Example code: 
```

		// Example ItemStack
		ItemStack item = new ItemStack(Material.DIAMOND);
		
		// Get the API
		NbtAPI nbtAPI = ReNBT.geNbtAPI();
		
		// Add int tag with key "power" and value 1000 to this ItemStack
		nbtAPI.addIntTag(item, "power", 1000);
		
		// Get value with key from ItemStack
		int power = nbtAPI.getIntTag(item, "power");
		System.out.println("Power of the diamond: " + power);

```
