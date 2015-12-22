package com.TRIUMPH.AOS.blocks;

import com.TRIUMPH.AOS.unlocalizedNames;
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
		GameRegistry.registerBlock(BlueGlass = new BasicGlass(unlocalizedNames.BlueGlass), unlocalizedNames.BlueGlass);
		GameRegistry.registerBlock(EnderNuggetOre = new BasicBlock(unlocalizedNames.EnderCrystalOre), unlocalizedNames.EnderCrystalOre);
		GameRegistry.registerBlock(GreenStone = new BasicBlock(unlocalizedNames.GreenStone), unlocalizedNames.GreenStone);
		GameRegistry.registerBlock(smGreenstone = new BasicBlock(unlocalizedNames.SmoothGreenStone), unlocalizedNames.SmoothGreenStone);
		GameRegistry.registerBlock(GreenStone_Brick = new BasicBlock(unlocalizedNames.BrickGreenStone), unlocalizedNames.BrickGreenStone);
		GameRegistry.registerBlock(roughGreenstone = new BasicBlock(unlocalizedNames.RoughGreenStone), unlocalizedNames.RoughGreenStone);
		GameRegistry.registerBlock(EnderGreenGlass = new BasicGlass(unlocalizedNames.EnderGreenGlass), unlocalizedNames.EnderGreenGlass);
	}
}
