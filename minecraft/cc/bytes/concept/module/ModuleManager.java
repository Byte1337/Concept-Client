package cc.bytes.concept.module;

import java.util.ArrayList;

import cc.bytes.concept.modules.Movement.Sprint;

public class ModuleManager {
	
	public ArrayList<Module> modulesList = new ArrayList<Module>();
	
	public void initiateclient() {
		modulesList.add(new Sprint());
	}
	
	public ArrayList<Module> getAuthorizedModules(){
		ArrayList<Module> toggledModules = new ArrayList<Module>();
		for(Module module : modulesList) {
			if(module.isAuthorized());
			toggledModules.add(module);
			
		}
		return toggledModules;
		
	}
	

}

