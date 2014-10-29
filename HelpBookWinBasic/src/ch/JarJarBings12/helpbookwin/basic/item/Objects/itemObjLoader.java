package ch.JarJarBings12.helpbookwin.basic.item.Objects;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;

import ch.JarJarBings12.helpbookwin.basic.files.filelist;
import ch.JarJarBings12.helpbookwin.basic.objects.JObjects;
import ch.JarJarBings12.helpbookwin.basic.windows.Objects.windowsObj;

public class itemObjLoader implements ItemConfigInterface {
	
	public void loadItemObject(String Window, int slot) {
		
	}
	
	@Override
	public String getConfigItemDisplayName(windowsObj w, int Slot) {
		return filelist.s.getString("windows.window."+w.getSystemName()+".ObjList.object"+Slot+".DISPLAYNAME");
	}
              
	@Override
	public Material getConfigItemMaterial(windowsObj w, int Slot) {
		return Material.getMaterial(filelist.s.getString("windows.window."+w.getSystemName()+".ObjList.object"+Slot+".DISPLAYNAME"));
	}

	@Override
	public boolean getConfigItemEnabled(windowsObj w, int Slot) {
		return filelist.s.getBoolean("windows.window."+w.getSystemName()+".ObjList.object"+Slot+".DISABLED");
	}
  
	@Override
	public String getConfigItemType(windowsObj w, int Slot) {
		return filelist.s.getString("windows.window."+w.getSystemName()+".ObjList.object"+Slot+".TYPE");
	}
 
	@Override
	public List<String> getConfigItemLore(windowsObj w, int Slot) {
		List<String> lore = new ArrayList();
		return lore;
	}

	@Override
	public String getConfigItemActionType(windowsObj w, int Slot) {
		return filelist.s.getString("windows.window."+w.getSystemName()+".ObjList.object"+Slot+".ACTION.TYPE");
	}

	@Override
	public String getConfigItemActionPermission(windowsObj w, int Slot) {
		return filelist.s.getString("windows.window."+w.getSystemName()+".ObjList.object"+Slot+".ACTION.USEPERMISSION");
	}

	@Override
	public String getConfigItemActionMessage(windowsObj w, int Slot) {
		return filelist.s.getString("windows.window."+w.getSystemName()+".ObjList.object"+Slot+".ACTION.MESSAGE");
	}
}
