package ch.JarJarBings12.helpbookwin.basic.objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Material;

import ch.JarJarBings12.helpbookwin.basic.files.filelist;
import ch.JarJarBings12.helpbookwin.basic.item.Objects.itemObj;
import ch.JarJarBings12.helpbookwin.basic.windows.Objects.windowsObj;

public class JObjects {
	public static HashMap<String, Integer> cache = new HashMap();
	public static List<windowsObj> windows = new ArrayList();
	public static List<itemObj> items = new ArrayList();
	
	public void deleteWindow(String Window) {
		if(cache.containsKey(Window)) {
			filelist.s.set("windows.window."+Window, null);
			windows.remove(cache.get(Window));	
		}
	}
}
