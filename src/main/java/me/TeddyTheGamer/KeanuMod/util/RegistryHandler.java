package me.TeddyTheGamer.KeanuMod.util;

import me.TeddyTheGamer.KeanuMod.KeanuMod;
import me.TeddyTheGamer.KeanuMod.Item.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

	public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KeanuMod.MOD_ID);
	
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	public static final RegistryObject<Item> CARD = ITEMS.register("card", ItemBase::new);
}
