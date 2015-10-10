package com.TRIUMPH.AOS.client.render.blocks;

import com.TRIUMPH.AOS.Main;
import com.TRIUMPH.AOS.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;



public class BlockRenderRegister {
	
	public static String modid = Main.MODID;
	public static void registerBlockRenderer() {
		register(ModBlocks.GreenStone);
	}
	
	public static void register(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));

	}
}
