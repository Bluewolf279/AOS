package com.TRIUMPH.AOS.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
public class ModItems {
	public static Item tutorialItem;
	public static Item Poison_Arrow;
	public static Item Ender_nugget;
	public static Item Ender_crystal;
	public static ToolMaterial Endercrystal = EnumHelper.addToolMaterial("Ender_crystal", 3, 2000, 10.0F, 3.0F, 15);
	public static Item Ender_crystalSword;
	public static Item Ender_CrystalPickaxe;
	public static void createItem() {
		GameRegistry.registerItem(tutorialItem	= new BasicItem("tutorial_item"), "tutorial_item");
		GameRegistry.registerItem(Poison_Arrow	= new BasicItem("Poison Arrow"), "Poison Arrow");
		GameRegistry.registerItem(Ender_nugget	= new BasicItem("Ender_nugget"), "Ender_nugget");
		GameRegistry.registerItem(Ender_crystal	= new BasicItem("Ender_crystal"), "Ender_crystal");
		GameRegistry.registerItem(Ender_crystalSword = new ItemModSword("Ender_crystalSword",Endercrystal), "Ender_crystalSword");
		GameRegistry.registerItem(Ender_CrystalPickaxe = new ItemModPickaxe("Ender_CrystalPickaxe",Endercrystal), "Ender_CrystalPickaxe");
	}
}