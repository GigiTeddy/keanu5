package me.TeddyTheGamer.KeanuMod.util;

import me.TeddyTheGamer.KeanuMod.KeanuMod;
import me.TeddyTheGamer.KeanuMod.client.model.CyberKeanuModel;
import me.TeddyTheGamer.KeanuMod.client.render.CyberKeanuRenderer;
import me.TeddyTheGamer.KeanuMod.entities.CyberKeanu;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = KeanuMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)

public class ClientEventBusSubscriber {
	private static EntityType<CyberKeanu> cyberKeanuEntityType;
	 private static class CyberKeanuRenderFactory implements IRenderFactory<CyberKeanu> {
		    @Override
		    public EntityRenderer<? super CyberKeanu> createRenderFor(EntityRendererManager manager) {
		      return new CyberKeanuRenderer(manager,new CyberKeanuModel<CyberKeanu>(), 0.9F);
		    }
		  }
	
	@SubscribeEvent
	public static void onClientSetup(FMLClientSetupEvent event) {
	
		 RenderingRegistry.registerEntityRenderingHandler(ClientEventBusSubscriber.cyberKeanuEntityType, new CyberKeanuRenderFactory());
	}
}
