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
	
	/* Get the Display Name of a Item out of the Configuration */
	@Override
	public String getConfigItemDisplayName(windowsObj w, int Slot) {
		return filelist.s.getString("windows.window."+w.getSystemName()+".ObjList.object"+Slot+".DISPLAYNAME");
	}
              
	/* Get the Item Material out of the Configuration */
	@Override
	public Material getConfigItemMaterial(windowsObj w, int Slot) {
		return Material.getMaterial(filelist.s.getString("windows.window."+w.getSystemName()+".ObjList.object"+Slot+".DISPLAYNAME"));
	}

	/* Check is the Item Enabled */
	@Override
	public boolean getConfigItemEnabled(windowsObj w, int Slot) {
		return filelist.s.getBoolean("windows.window."+w.getSystemName()+".ObjList.object"+Slot+".DISABLED");
	}
  
	/* Get the Item Type
	 * Item Types:
	 *  - BUTTON
	 *    This Type can Save this Tags:
	 *      MetaData:
	 *      - Display Name
	 *      - Material
	 *      - Lore
	 *      - Action Type
	 *      - Action Message
	 *      - Action Permission
	 *  - BOOK
	 *    This Type can Save the Book Meta
	 *      Meta data:
	 *      - Title
	 *      - Author
	 *      - Pages
	 *      - Lore
	 *      -
	 *  - LABEL
	 *    This Type can Save this:
	 *     Meta data:
	 *     - DisplayName
	 *     - Lore
	 *     - Message on Click
	 */
	@Override
	public String getConfigItemType(windowsObj w, int Slot) {
		return filelist.s.getString("windows.window."+w.getSystemName()+".ObjList.object"+Slot+".TYPE");
	}
	
	@Override
	public List<String> getConfigItemLore(windowsObj w, int Slot) {
		//TODO Finish this Method I have problems with the load of the List
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

	@Override
	public void setConfigItemDisplayName(windowsObj w, int Slot, String DisplayName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setConfigItemMaterial(windowsObj w, int Slot, Material Material) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setConfigItemEnabled(windowsObj w, int Slot, String Type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setConfigItemType(windowsObj w, int Slot, String Type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setConfigItemLore(windowsObj w, int Slot, List<String> Lore) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setConfigItemActionType(windowsObj w, int Slot, String ActionType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setConfigItemActionPermission(windowsObj w, int Slot, String ActionPermission) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setConfigItemActionMessage(windowsObj w, int Slot, String ActionMessage) {
		// TODO Auto-generated method stub
		
	}
	
	//TODO When the ItemConfigInterface is Finish add the Methods
}
