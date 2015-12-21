package com.TRIUMPH.AOS.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block BlueGlass;
	public static Block EnderNuggetOre;
	public static Block GreenStone;
	public static Block smGreenstone;
	public static Block GreenStone_Brick;
	public static Block roughGreenstone;
	public static Block EnderGreenGlass;
	public static void createBlock(){
		GameRegistry.registerBlock(BlueGlass = new BasicGlass("BlueGlass"), "BlueGlass");
		GameRegistry.registerBlock(EnderNuggetOre = new BasicBlock("EnderNuggetOre"), "EnderNuggetOre");
		GameRegistry.registerBlock(GreenStone = new BasicBlock("GreenStone"), "GreenStone");
		GameRegistry.registerBlock(smGreenstone = new BasicBlock("smGreenstone"), "smGreenstone");
		GameRegistry.registerBlock(GreenStone_Brick = new BasicBlock("GreenStone_Brick"), "GreenStone_Brick");
		GameRegistry.registerBlock(roughGreenstone = new BasicBlock("roughGreenstone"), "roughGreenstone");
		GameRegistry.registerBlock(EnderGreenGlass = new BasicGlass("EnderGreenGlass"), "EnderGreenGlass");
	}
}
