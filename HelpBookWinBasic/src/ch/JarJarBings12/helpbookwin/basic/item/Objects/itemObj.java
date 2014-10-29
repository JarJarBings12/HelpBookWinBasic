package ch.JarJarBings12.helpbookwin.basic.item.Objects;

import java.util.List;

import org.bukkit.Material;

public class itemObj implements ItemInterface {
	private final String SYSTEMWINNAME;
	private int SLOT;
	private String DISPLAYNAME;
	private Material MATERIAL;
	private boolean ENABLED;
	private String TYPE;
	private List<String> LORE;
	private String ATYPE;
	private String APERMISSION;
	private String AMESSAGE;
	
	public itemObj(String SystemWindowName, int Slot, String DisplayName, Material Material, Boolean isenabled, String Type, List<String> Lore, String AType, String APermission, String AMessage) {
		this.SYSTEMWINNAME = SystemWindowName;
		this.SLOT = Slot;
		this.DISPLAYNAME = DisplayName;
		this.MATERIAL = Material;
		this.ENABLED = isenabled; 
		this.TYPE = Type;
		this.LORE = Lore;
		this.ATYPE = AType;
		this.APERMISSION = APermission;
		this.AMESSAGE = AMessage;
	}
	
	@Override
	public String getDisplayName() {
		return this.DISPLAYNAME;
	}

	@Override
	public void setDisplayName(String DisplayName) {
		this.DISPLAYNAME = DisplayName;
		
	}

	@Override
	public int getSlot() {
		return this.SLOT;
	}

	@Override
	public void setSlot(int Slot) {
		this.SLOT = Slot;
	}

	@Override
	public String getType() {
		return this.TYPE;
	}

	@Override
	public void setType(String Type) {
		this.TYPE = Type;
	}

	@Override
	public List<String> getLore() {
		return this.LORE;
	}

	@Override
	public void setLore(List<String> Lore) {
		this.LORE = Lore;
	}
	
	@Override
	public String getActionType() {
		return this.ATYPE;
	}

	@Override
	public void setActionType(String Action) {
		this.ATYPE = Action;
	}

	@Override
	public String getActionPermission() {
		return this.APERMISSION;
	}

	@Override
	public void setActionPerission(String Permission) {
		this.APERMISSION = Permission;
	}

	@Override
	public String getActionMessage() {
		return this.AMESSAGE;
	}

	@Override
	public void setActionMessage(String Message) {
		this.AMESSAGE = Message;
	}
	@Override
	public Material getMaterial() {
		return this.MATERIAL;
	}

	@Override
	public void setMaterial(Material Material) {
		this.MATERIAL = Material;
		
	}

	@Override
	public boolean isEnabled() {
		return this.ENABLED;
	}
	
	@Override
	public void isEnabled(boolean Enabled) {
		this.ENABLED = Enabled;
	}
}
