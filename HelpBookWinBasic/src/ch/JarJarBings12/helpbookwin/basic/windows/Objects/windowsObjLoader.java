package ch.JarJarBings12.helpbookwin.basic.windows.Objects;

import java.io.File;
import java.io.IOException;

import ch.JarJarBings12.helpbookwin.basic.files.filelist;
import ch.JarJarBings12.helpbookwin.basic.objects.JObjects;

public class windowsObjLoader implements WinConfigInterface {
	public void loadWindowObjects() {
		for(Object w : filelist.ca.getList("windows.cache")) {
			int i = 0;
			windowsObj win = new windowsObj(w.toString(), getConfigWindowDisplayName(w.toString()), getConfigPermission(w.toString()), getConfigWindowLines(w.toString()), getConfigWindowEnabled(w.toString()), getConfigWindowOpenSound(w.toString()));
			JObjects.windows.add(win);
			JObjects.cache.put(win.getSystemName(), i);
			i = i+1;
		}
	}
	
	public void saveWindowObjects() {
		for(windowsObj o : JObjects.windows) {
			setConfigWindowDisplayName(o);
			setConfigWindowEnabled(o);
			setConfigWindowLines(o);
			setConfigWindowOpenSound(o);
			setConfigPermission(o);
			try {
				filelist.s.save(filelist.storage);
			} catch (IOException e) {
				e.printStackTrace();
			}
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

	
	@Override
	public void setConfigWindowDisplayName(windowsObj w) {
		filelist.s.getString("windows.window."+w.getSystemName()+".DISPLAYNAME", w.getDisplayName());
		
	}

	@Override
	public void setConfigWindowLines(windowsObj w) {
		filelist.s.set("windows.window."+w.getSystemName()+".LINES", w.getLines());
	}

	@Override
	public void setConfigWindowEnabled(windowsObj w) {
		filelist.s.getBoolean("windows.window."+w.getSystemName()+".ENABLED", w.isEnabled());
	}

	@Override
	public void setConfigWindowOpenSound(windowsObj w) {
		filelist.s.set("windows.window."+w.getSystemName()+".WINDOWOPENSOUND", w.hasOpenSound());
		
	}

	@Override
	public void setConfigPermission(windowsObj w) {
		filelist.s.set("windows.window."+w.getSystemName()+".PERMISSION", w.getPermission());
	}
}
