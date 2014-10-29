package ch.JarJarBings12.helpbookwin.basic.windows.Objects;

import ch.JarJarBings12.helpbookwin.basic.files.filelist;
import ch.JarJarBings12.helpbookwin.basic.objects.JObjects;

public class windowsObjLoader implements WinConfigInterface {
	public void loadWindowObjects() {
		for(Object w : filelist.ca.getList("windows.cache")) {
			windowsObj win = new windowsObj(w.toString(), getConfigWindowDisplayName(w.toString()), getConfigPermission(w.toString()), getConfigWindowLines(w.toString()), getConfigWindowEnabled(w.toString()), getConfigWindowOpenSound(w.toString()));
			JObjects.windows.add(win);
		}
	}

	@Override
	public String getConfigWindowDisplayName(String Window) {
		return filelist.s.getString("windows.window."+Window+".DISPLAYNAME");
	}
	@Override
	public int getConfigWindowLines(String Window) {
		return filelist.s.getInt("windows.window."+Window+".LINES");
	}
	@Override
	public boolean getConfigWindowEnabled(String Window) {
		return filelist.s.getBoolean("windows.window."+Window+".ENABLED");
	}
	@Override
	public boolean getConfigWindowOpenSound(String Window) {
		return filelist.s.getBoolean("windows.window."+Window+".WINDOWOPENSOUND");
	}
	@Override
	public String getConfigPermission(String Window) {
		return filelist.s.getString("windows.window."+Window+".PERMISSION");
	}
}
