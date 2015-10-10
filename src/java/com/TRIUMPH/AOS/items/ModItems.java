package com.TRIUMPH.AOS.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
public class ModItems {
	public static Item tutorialItem;
	
	public static void createItem() {
		GameRegistry.registerItem(tutorialItem = new BasicItem("tutorial_item"), "tutorial_item");
	}
}