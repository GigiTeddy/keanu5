package me.TeddyTheGamer.KeanuMod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import me.TeddyTheGamer.KeanuMod.entities.CyberKeanu;
import me.TeddyTheGamer.KeanuMod.init.ModEntityTypes;
import me.TeddyTheGamer.KeanuMod.util.RegistryHandler;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("keanumod")
public class KeanuMod
{
	public static EntityType<CyberKeanu> cyberKeanuEntityType;
    @SuppressWarnings("unused")
	private static final Logger LOGGER = LogManager.getLogger("keanumod");
    public static final String MOD_ID = "keanumod";
    public static KeanuMod instance;
    

    public KeanuMod() {
     
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
        RegistryHandler.init();
        ModEntityTypes.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


	private void setup(final FMLCommonSetupEvent event)
    {

    }
    public static void  onEntityTypeRegistration(RegistryEvent.Register<EntityType<?>> entityTypeRegisterEvent) {
    	
    	cyberKeanuEntityType = EntityType.Builder.<CyberKeanu>create(CyberKeanu::new, EntityClassification.CREATURE)
                .size(1.0F, 1.0F)
                .build(MOD_ID);
        cyberKeanuEntityType.setRegistryName("cyberkeanu");
        entityTypeRegisterEvent.getRegistry().register(cyberKeanuEntityType);
    }

    private void doClientStuff(final FMLClientSetupEvent event) {}
    

}
