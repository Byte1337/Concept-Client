package cc.bytes.concept;

import cc.bytes.concept.module.Module;
import cc.bytes.concept.module.ModuleManager;
import cc.bytes.concept.ui.UIRenderer;

public class ConceptBase {
	
	public static String client_Name = "ConceptClient";
	public static String client_Version = "0.1";
	
	public static UIRenderer uiRenderer;
	public static ModuleManager moduleManager;
	
	public static void initiateclient() {
		uiRenderer = new UIRenderer();
		moduleManager = new ModuleManager();
		moduleManager.initiateclient();
	}
	
	public static void onRenderGui() {
		uiRenderer.UIDrawing();
		
	}
	
	public static void onDisabled() {
		}
	
	public static void onRender() {
		for(Module module : moduleManager.getAuthorizedModules()) {
			module.onRender();
		}
	}
	
	public static void onPreMotion() {
		for(Module module : moduleManager.getAuthorizedModules()) {
			module.onPreMotion();
		}
	}
	
	public static void onPostMotion() {
		for(Module module : moduleManager.getAuthorizedModules()) {
			module.onPostMotion();
		}	
	}
	
	
	public static void onKeyPressed(int keyCode) {
		for(Module module : moduleManager.modulesList) {
			module.onKeyPressed(keyCode);
		}
	}

}

