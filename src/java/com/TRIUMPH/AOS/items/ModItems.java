package com.TRIUMPH.AOS.items;

import com.TRIUMPH.AOS.unlocalizedNames;
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
	public static ArmorMaterial EndercrystalAr = EnumHelper.addArmorMaterial(unlocalizedNames.EnderCrystal,"AOS:EndercrystalAr",33,new int[]{3,8,6,3},15);
	public static void createItem() {
		GameRegistry.registerItem(Poison_Arrow	= new BasicItem("Poison Arrow"), "Poison Arrow");
		GameRegistry.registerItem(Ender_nugget	= new BasicItem(unlocalizedNames.EnderNugget), unlocalizedNames.EnderNugget);
		GameRegistry.registerItem(Ender_crystal	= new BasicItem(unlocalizedNames.EnderCrystal), unlocalizedNames.EnderCrystal);
		GameRegistry.registerItem(Ender_crystalSword = new ItemModSword(unlocalizedNames.EnderCrystalSword,EndercrystalTo), unlocalizedNames.EnderCrystalSword);
		GameRegistry.registerItem(Ender_CrystalPickaxe = new ItemModPickaxe(unlocalizedNames.EnderCrystalPickaxe,EndercrystalTo), unlocalizedNames.EnderCrystalPickaxe);

		GameRegistry.registerItem(Ender_CrystalHelmet = new ItemModArmor(unlocalizedNames.EnderCrystalHelmet,EndercrystalAr,1,0),unlocalizedNames.EnderCrystalHelmet);
		GameRegistry.registerItem(Ender_CrystalChestpiece = new ItemModArmor(unlocalizedNames.EnderCrystalChestplate,EndercrystalAr,1,1),unlocalizedNames.EnderCrystalChestplate);
		GameRegistry.registerItem(Ender_CrystalLeggings = new ItemModArmor(unlocalizedNames.EnderCrystalLeggings,EndercrystalAr,2,2),unlocalizedNames.EnderCrystalLeggings);
		GameRegistry.registerItem(Ender_CrystalBoots = new ItemModArmor(unlocalizedNames.EnderCrystalBoots,EndercrystalAr,1,3),unlocalizedNames.EnderCrystalBoots);
	}
}