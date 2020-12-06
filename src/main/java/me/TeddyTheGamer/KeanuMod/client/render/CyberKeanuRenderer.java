package me.TeddyTheGamer.KeanuMod.client.render;

import me.TeddyTheGamer.KeanuMod.KeanuMod;
import me.TeddyTheGamer.KeanuMod.client.model.CyberKeanuModel;
import me.TeddyTheGamer.KeanuMod.entities.CyberKeanu;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CyberKeanuRenderer extends MobRenderer<CyberKeanu, CyberKeanuModel<CyberKeanu>> {
	
public CyberKeanuRenderer(EntityRendererManager renderManagerIn, CyberKeanuModel<CyberKeanu> entityModelIn,
			float shadowSizeIn) {
		super(renderManagerIn, new CyberKeanuModel<CyberKeanu>(), 0.9F);
	}
/**
 * public CyberKeanuRenderer(EntityRendererManager renderManagerIn) {
	super(renderManagerIn, new CyberKeanuModel<CyberKeanu>(), 0.9F);
	
}
 */





protected static final ResourceLocation TEXTURE = new ResourceLocation (KeanuMod.MOD_ID, "textures/entity/cyberkeanu.png");
	



	
	@Override
	public ResourceLocation getEntityTexture (CyberKeanu entity) {
		return TEXTURE;
	}



	

	
	
		
	}


