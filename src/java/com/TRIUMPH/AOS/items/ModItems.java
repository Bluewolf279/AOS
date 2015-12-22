package com.TRIUMPH.AOS.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import scala.tools.nsc.doc.model.Public;

public class ModItems {
	public static final CreativeTabs AOStab = new CreativeTabs("AOS") {
		@Override
		public Item getTabIconItem() {
			return Ender_crystal;
		}

	};

	public static Item Poison_Arrow;
	public static Item Ender_nugget;
	public static Item Ender_crystal;
	public static Item Ender_crystalSword;
	public static Item Ender_CrystalPickaxe;
	public static Item Ender_CrystalHelmet;
	public static Item Ender_CrystalChestpiece;
	public static Item Ender_CrystalLeggings;
	public static Item Ender_CrystalBoots;

	public static ToolMaterial EndercrystalTo = EnumHelper.addToolMaterial("Ender_crystalTo", 3, 2000, 10.0F, 3.0F, 15);
	public static ArmorMaterial EndercrystalAr = EnumHelper.addArmorMaterial("Ender_crystal","AOS:EndercrystalAr",33,new int[]{3,8,6,3},15);
	public static void createItem() {
		GameRegistry.registerItem(Poison_Arrow	= new BasicItem("Poison Arrow"), "Poison Arrow");
		GameRegistry.registerItem(Ender_nugget	= new BasicItem("Ender_nugget"), "Ender_nugget");
		GameRegistry.registerItem(Ender_crystal	= new BasicItem("Ender_crystal"), "Ender_crystal");
		GameRegistry.registerItem(Ender_crystalSword = new ItemModSword("Ender_crystalSword",EndercrystalTo), "Ender_crystalSword");
		GameRegistry.registerItem(Ender_CrystalPickaxe = new ItemModPickaxe("Ender_CrystalPickaxe",EndercrystalTo), "Ender_CrystalPickaxe");

		GameRegistry.registerItem(Ender_CrystalHelmet = new ItemModEnderArmor("Ender_CrystalHelmet",EndercrystalAr,1,0),"Ender_CrystalHelmet");
		GameRegistry.registerItem(Ender_CrystalChestpiece = new ItemModEnderArmor("Ender_CrystalChestpiece",EndercrystalAr,1,1),"Ender_CrystalChestpiece");
		GameRegistry.registerItem(Ender_CrystalLeggings = new ItemModEnderArmor("Ender_CrystalLeggings",EndercrystalAr,2,2),"Ender_CrystalLeggings");
		GameRegistry.registerItem(Ender_CrystalBoots = new ItemModEnderArmor("Ender_CrystalBoots",EndercrystalAr,1,3),"Ender_CrystalBoots");
	}
}