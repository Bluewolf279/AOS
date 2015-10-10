package com.TRIUMPH.AOS.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block GreenStone;
	
	public static void createBlock(){
		GameRegistry.registerBlock(GreenStone = new BasicBlock("GreenStone"), "GreenStone");
	}
}
