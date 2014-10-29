package ch.JarJarBings12.helpbookwin.basic.windows.Objects;

public interface WinConfigInterface {
	public String getConfigWindowDisplayName(String Window);
	public int getConfigWindowLines(String Window);
	public boolean getConfigWindowEnabled(String Window);
	public boolean getConfigWindowOpenSound(String Window);
	public String getConfigPermission(String Window);
}
