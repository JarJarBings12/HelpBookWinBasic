package ch.JarJarBings12.helpbookwin.basic.windows.Objects;

public class windowsObj implements WindowsInterface {
	private final String SYSTEMNAME;
	private String DISPLAYNAME;
	private String PERMISSION;
	private int LINES;
	private boolean ENABLED;
	private boolean OPENSOUND;
	
	public windowsObj(String SystemName, String DisplayName, String Permission, int lines, boolean Enabled, boolean OpenSound) {
		this.SYSTEMNAME = SystemName;
		this.DISPLAYNAME = DisplayName;
		this.PERMISSION = Permission;
		this.LINES = lines;
		this.ENABLED = Enabled;
		this.OPENSOUND = OpenSound;
	}
	
	@Override
	public String getSystemName() {
		return this.SYSTEMNAME;
	}
	
	@Override
	public String getDisplayName() {
		return this.DISPLAYNAME;
	}
	
	@Override
	public String getPermission() {
		return this.PERMISSION;
	}
	
	@Override
	public int getLines() {
		return this.LINES;
	}
	
	@Override
	public boolean isEnabled() {
		return this.ENABLED;
	}
	
	@Override 
	public void isEnabled(boolean Enabled) {
		this.ENABLED = Enabled;
	}
	
	@Override
	public boolean hasOpenSound() {
		return this.OPENSOUND;
	}
	
	@Override
	public void hasOpenSound(boolean Enabled) {
		this.OPENSOUND = Enabled;
	}
	
	@Override
	public void setDisplayName(String DisplayName) {	
		this.DISPLAYNAME = DisplayName;
	}
	
	@Override
	public void setPermission(String Permission) {
		this.PERMISSION = Permission;
	}
	
	@Override
	public void setLines(int Lines) {
		this.LINES = Lines;
	}	
}
