package com.TRIUMPH.AOS.items;

import net.minecraft.item.ItemPickaxe;

/**
 * Created by Bluewolf on 21/12/2015.
 * This is a pickaxe constructor
 */
public class ItemModPickaxe extends ItemPickaxe{
    public ItemModPickaxe(String unlocalisedName, ToolMaterial Material){
        super(Material);
        this.setUnlocalizedName(unlocalisedName);

    }
}
