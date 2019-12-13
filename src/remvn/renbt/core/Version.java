package remvn.renbt.core;

import org.bukkit.Bukkit;

import remvn.renbt.core.version.NbtAPI_1_12_2;

public enum Version {

    v1_12_R1(new NbtAPI_1_12_2()),
    v1_13_R1(null),
    v1_13_R2(null),
    ;
	private NbtAPI nbtAPI;
    Version(NbtAPI nbtAPI) {
    	this.nbtAPI = nbtAPI;
    }
    
    public NbtAPI getNbtAPI() {
    	return nbtAPI;
    }

    public static Version getServerVersion() {
        String s = Bukkit.getServer().getClass().getPackage().getName();
        s = s.substring(s.lastIndexOf(".") + 1);
        for(Version ver : Version.values()){
            if(s.startsWith(ver.name())) return ver;
        }
        return null;
    }

}
