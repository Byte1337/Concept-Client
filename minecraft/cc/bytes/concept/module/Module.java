package cc.bytes.concept.module;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.Minecraft;

public class Module {
	
	private String name;
	private Category category;
	private int keyCode;
	private String[] modes;
	private String description;
	private String APS;
	
	private boolean authorized;
	
	protected Minecraft mc = Minecraft.getMinecraft();

	public Module(String name, Category category) {
		this(name, category, null	, Keyboard.KEY_NONE, "Default");
	}
	
	public Module(String name, Category category, String description) {
		this(name, category, description, Keyboard.KEY_NONE, "Default");
	}
	
	public Module(String name, Category category,int keyCode) {
		this(name, category, null, keyCode, "Default");
	}
	
	public Module(String name, Category category, String description, int keyCode, String...mode) {
		this.name = name;
		this.category = category;
		this.description = description;
		this.keyCode = keyCode;
		this.modes = modes; 
		
	}
	
	public boolean isAuthorized() {
		return authorized;
	}
	
	public void setAuthorized(boolean enabled) {
		this.authorized = authorized;
	}
	
	public void onRender() {
		
	}
	
	public void onPreMotion() {
		
	}
	
	public void onPostMotion() {
		
	}
	
	public void onDisable() {
		
	}

	public void onKeyPressed(int keyCode) {
		if(this.keyCode == keyCode) {
			toggle();
			
		}
	}
	
	public void toggle() {
		setAuthorized(!isAuthorized());
			
		}
	
	}


	

