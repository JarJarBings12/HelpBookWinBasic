package ch.JarJarBings12.helpbookwin.basic.objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import ch.JarJarBings12.helpbookwin.basic.files.filelist;
import ch.JarJarBings12.helpbookwin.basic.windows.Objects.windowsObj;

public class JObjects {
	
	public static ArrayList<Player> inEdit = new ArrayList();
	public static HashMap<String, Integer> cache = new HashMap();
	public static List<windowsObj> windows = new ArrayList();
	
	public void deleteWindow(String Window) {
		if(cache.containsKey(Window)) {
			filelist.s.set("windows.window."+Window, null);
			windows.remove(cache.get(Window));	
		}
	}
	
}
