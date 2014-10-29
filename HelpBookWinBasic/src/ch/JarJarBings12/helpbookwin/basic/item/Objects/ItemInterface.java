package ch.JarJarBings12.helpbookwin.basic.item.Objects;

import java.util.List;

import org.bukkit.Material;

public interface ItemInterface {
	public String getDisplayName();
	public void setDisplayName(String DisplayName);
	public int getSlot();
	public void setSlot(int Slot);
	public String getType();
	public void setType(String Type);
	public List<String> getLore();
	public void setLore(List<String> Lore);
	public String getActionType();
	public void setActionType(String Action);
	public String getActionPermission();
	public void setActionPerission(String Permission);
	public String getActionMessage();
	public void setActionMessage(String Message);
	public void setMaterial(Material Material);
	public Material getMaterial();
	public void isEnabled(boolean Enabled);
	public boolean isEnabled();
}
