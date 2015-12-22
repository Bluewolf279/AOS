package com.TRIUMPH.AOS;


import com.TRIUMPH.AOS.Models.EnderCombatArmor;
import com.TRIUMPH.AOS.client.render.blocks.BlockRenderRegister;

import com.TRIUMPH.AOS.client.render.items.ItemRenderRegister;

import com.TRIUMPH.AOS.items.ModItems;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.HashMap;
import java.util.Map;

public class ClientProxy extends CommonProxy {
	public static final Map<Item,ModelBiped> armorModels = new HashMap<Item, ModelBiped>();
	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}
	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);

		BlockRenderRegister.registerBlockRenderer();

		ItemRenderRegister.registerItemRenderer();
		EnderCombatArmor EnderCombatArmor = new EnderCombatArmor(0.5f);

		armorModels.put(ModItems.Ender_CrystalHelmet,EnderCombatArmor);
		armorModels.put(ModItems.Ender_CrystalChestpiece,EnderCombatArmor);
		armorModels.put(ModItems.Ender_CrystalLeggings,EnderCombatArmor);
		armorModels.put(ModItems.Ender_CrystalBoots,EnderCombatArmor);
	}
	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}
}
