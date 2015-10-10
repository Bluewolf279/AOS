package com.TRIUMPH.AOS.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block tutorialBlock;
	
	public static void createBlock(){
		GameRegistry.registerBlock(tutorialBlock = new BasicBlock("tutorial_block"), "GreenStone");
	}
}
