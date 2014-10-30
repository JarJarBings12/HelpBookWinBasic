package ch.JarJarBings12.helpbookwin.basic.item.Objects;

import java.util.List;

import org.bukkit.Material;

import ch.JarJarBings12.helpbookwin.basic.windows.Objects.windowsObj;

public interface ItemConfigInterface {
	public String getConfigItemDisplayName(windowsObj w, int Slot); 
	public Material getConfigItemMaterial(windowsObj w, int Slot); 
	public boolean getConfigItemEnabled(windowsObj w, int Slot); 
	public String getConfigItemType(windowsObj w, int Slot); 
	public List<String> getConfigItemLore(windowsObj w, int Slot); 
	public String getConfigItemActionType(windowsObj w, int Slot); 
	public String getConfigItemActionPermission(windowsObj w, int Slot); 
	public String getConfigItemActionMessage(windowsObj w, int Slot); 
	//TODO Add the Set Methods
}
