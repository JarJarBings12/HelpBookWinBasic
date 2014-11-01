package ch.JarJarBings12.helpbookwin.basic.item.Objects.loaders;

import java.util.List;

import org.bukkit.Material;

import ch.JarJarBings12.helpbookwin.basic.files.filelist;
import ch.JarJarBings12.helpbookwin.basic.item.Objects.loaders.typesinterfaces.BookConfigInterface;
import ch.JarJarBings12.helpbookwin.basic.windows.Objects.windowsObj;

public class BookLoader implements BookConfigInterface {

	@Override
	public String getConfigBookAuthor(windowsObj w, int Slot) {
		return filelist.s.getString("windows.window."+w.getSystemName()+".ObjList.object."+Slot+".AUTHOR");
	}

	@Override
	public String getConfigBookTitle(windowsObj w, int Slot) {
		return filelist.s.getString("windows.window."+w.getSystemName()+".ObjList.object."+Slot+".TITLE");
	}

	@Override
	public List<String> getConfigBookPages(windowsObj w, int Slot) {
		return filelist.s.getStringList("windows.window."+w.getSystemName()+".ObjList.object."+Slot+".PAGES");
	}

	@Override
	public List<String> getConfigBookLore(windowsObj w, int Slot) {
		return filelist.s.getStringList("windows.window."+w.getSystemName()+".ObjList.object."+Slot+".LORE");
	}

	@Override
	public void setConfigBookAuthor(windowsObj w, bookObj book, int Slot) {
		filelist.s.set("windows.window."+w.getSystemName()+".ObjList.object."+Slot+".AUTHOR", book.getLore());
	}

	@Override
	public void setConfigBookTitle(windowsObj w, bookObj book, int Slot) {
		filelist.s.set("windows.window."+w.getSystemName()+".ObjList.object."+Slot+".TITLE", book.getTitle());
	}

	@Override
	public void setConfigBookPages(windowsObj w, bookObj book, int Slot) {
		filelist.s.set("windows.window."+w.getSystemName()+".ObjList.object."+Slot+".PAGES", book.getPages());
	}

	@Override
	public void setConfigBookLore(windowsObj w, bookObj book, int Slot) {
		filelist.s.set("windows.window."+w.getSystemName()+".ObjList.object."+Slot+".LORE", book.getLore());
	}

}
