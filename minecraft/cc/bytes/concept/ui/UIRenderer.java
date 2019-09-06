package cc.bytes.concept.ui;

import cc.bytes.concept.ConceptBase;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;

public class UIRenderer extends Gui{
	
	private Minecraft mc = Minecraft.getMinecraft();
	
	public void UIDrawing() {
		GlStateManager.scale(2, 2, 2);
		mc.fontRendererObj.drawStringWithShadow(ConceptBase.client_Name, 1, 1, 0xffffffff);
		GlStateManager.scale(0.5, 0.5, 0.5);
	}

}
