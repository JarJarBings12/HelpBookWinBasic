package ch.JarJarBings12.helpbookwin.basic.item.Objects;

import java.util.List;

import javax.swing.text.MaskFormatter;

import org.bukkit.Material;

import ch.JarJarBings12.helpbookwin.basic.windows.Objects.windowsObj;

public interface ItemConfigInterface {
	
	/* Methods to read Objects out of the Configuration */
	public String getConfigItemDisplayName(windowsObj w, int Slot); 
	public Material getConfigItemMaterial(windowsObj w, int Slot); 
	public boolean getConfigItemEnabled(windowsObj w, int Slot); 
	public String getConfigItemType(windowsObj w, int Slot); 
	public List<String> getConfigItemLore(windowsObj w, int Slot); 
	public String getConfigItemActionType(windowsObj w, int Slot); 
	public String getConfigItemActionPermission(windowsObj w, int Slot); 
	public String getConfigItemActionMessage(windowsObj w, int Slot); 
	
	/* Methods to write the Object Data into the Configuration */
	public void setConfigItemDisplayName(windowsObj w, int Slot, String DisplayName); 
	public void setConfigItemMaterial(windowsObj w, int Slot, Material Material); 
	public void setConfigItemEnabled(windowsObj w, int Slot, String Type); 
	public void setConfigItemType(windowsObj w, int Slot, String Type); 
	public void setConfigItemLore(windowsObj w, int Slot, List<String> Lore); 
	public void setConfigItemActionType(windowsObj w, int Slot, String ActionType); 
	public void setConfigItemActionPermission(windowsObj w, int Slot, String ActionPermission); 
	public void setConfigItemActionMessage(windowsObj w, int Slot, String ActionMessage); 
	

}
