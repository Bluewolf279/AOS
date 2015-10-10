package com.TRIUMPH.AOS.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
public class ModItems {
	public static Item tutorialItem;
	public static Item Poison_Arrow;
	
	public static void createItem() {
		GameRegistry.registerItem(tutorialItem = new BasicItem("tutorial_item"), "tutorial_item");
		GameRegistry.registerItem(Poison_Arrow = new BasicItem("Poison Arrow"), "Poison Arrow");
	}
}