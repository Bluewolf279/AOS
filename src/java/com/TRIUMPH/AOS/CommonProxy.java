package com.TRIUMPH.AOS;

import com.TRIUMPH.AOS.blocks.ModBlocks;
import com.TRIUMPH.AOS.crafting.ModCrafting;
import com.TRIUMPH.AOS.items.ModItems;
import com.TRIUMPH.AOS.world.AOSWorldGen;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e) {
		ModItems.createItem();
		ModBlocks.createBlock();
	}
	
	public void init(FMLInitializationEvent e) {
		ModCrafting.initCrafting();
		ModCrafting.initSmelting();
		GameRegistry.registerWorldGenerator(new AOSWorldGen(), 0);
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
	
}
