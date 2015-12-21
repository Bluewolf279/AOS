package com.TRIUMPH.AOS.items;

import net.minecraft.item.Item;
import net.minecraft.creativetab.*;

public class BasicItem extends Item{

	public BasicItem(String unlocalizedName) {
		super();

		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(ModItems.AOStab);
	}
}
