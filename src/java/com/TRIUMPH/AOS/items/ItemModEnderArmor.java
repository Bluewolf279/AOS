package com.TRIUMPH.AOS.items;

import com.TRIUMPH.AOS.ClientProxy;
import com.TRIUMPH.AOS.Main;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.http.impl.client.ProxyClient;

/**
 * Created by user on 21/12/2015.
 * Armor Constructor
 */
public class ItemModEnderArmor extends ItemArmor{
    public ItemModEnderArmor(String unlocalisedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setUnlocalizedName(unlocalisedName);
        this.setCreativeTab(ModItems.AOStab);
        this.setMaxStackSize(1);
    }
    @Override
    public String getUnlocalizedName(){
        return String.format("item%s%s", Main.MODID,getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    @Override
    public String getUnlocalizedName(ItemStack itemStack){
        return String.format("item.%s%s",Main.MODID,getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf("_")+1);
    }
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){

        String name = this.getUnwrappedUnlocalizedName(super.getUnlocalizedName());
        name = name.substring(0,name.indexOf("_"));
        return String.format("%s:textures/models/armor/%s_layer_%d.png",Main.MODID,name,0);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving,ItemStack itemStack,int armorSlot){

        ModelBiped armorModel = ClientProxy.armorModels.get(this);
        return armorModel;
    }
}
