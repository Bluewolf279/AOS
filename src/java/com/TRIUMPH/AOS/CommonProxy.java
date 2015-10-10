package com.TRIUMPH.AOS;

import com.TRIUMPH.AOS.blocks.ModBlocks;
import com.TRIUMPH.AOS.items.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent e) {
		ModItems.createItem();
		ModBlocks.createBlock();
	}
	
	public void init(FMLInitializationEvent e) {
		
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
	
}
