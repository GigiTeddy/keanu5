package me.TeddyTheGamer.KeanuMod.init;

import me.TeddyTheGamer.KeanuMod.KeanuMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
	public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, KeanuMod.MOD_ID);
	//DeferredRegister.create(ForgeRegistries.ENTITIES, KeanuMod.MOD_ID);
	
	public static final RegistryObject<EntityType<Entity>> CYBERKEANU = ENTITY_TYPES.register("cyberkeanu",
			() -> EntityType.Builder.create(EntityClassification.CREATURE).size(1.0F, 1.0F)
			.build(new ResourceLocation(KeanuMod.MOD_ID).toString()));
	
}
