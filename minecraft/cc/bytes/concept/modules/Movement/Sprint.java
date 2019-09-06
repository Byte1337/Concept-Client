package cc.bytes.concept.modules.Movement;

import org.lwjgl.input.Keyboard;

import cc.bytes.concept.module.Category;
import cc.bytes.concept.module.Module;

public class Sprint extends Module{

	public Sprint() {
		super("Sprint", Category.MOVEMENT, Keyboard.KEY_I);
	}
	
	@Override
	public void onPreMotion() {
		super.onPreMotion();
		
		if(mc.player.movementInput.moveFoward > 0);
		mc.player.setSprinting(true);
	}
}
