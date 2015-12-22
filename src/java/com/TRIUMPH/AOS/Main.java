package com.TRIUMPH.AOS;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
//TODO ADD LIQUID TNT
//TODO ADD BABY DOG THAT TURNS INTO A CREEPER WHEN HURT
public class Main {
	public static final String MODID = "AOS";
	public static final String MODNAME = "AOS Mod";
	public static final String VERSION = "0.1";

	@Instance
	public static Main instance = new Main();

	@SidedProxy(clientSide="com.TRIUMPH.AOS.ClientProxy", serverSide="com.TRIUMPH.AOS.ServerProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		Main.proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		Main.proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		Main.proxy.postInit(e);
	}
}
