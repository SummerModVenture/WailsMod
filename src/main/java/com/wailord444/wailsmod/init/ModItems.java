package com.wailord444.wailsmod.init;

import java.util.ArrayList;
import java.util.List;

import com.wailord444.wailsmod.armor.ArmorBase;
import com.wailord444.wailsmod.items.ItemBase;
import com.wailord444.wailsmod.items.tools.*;

import com.wailord444.wailsmod.util.Reference;
import com.wailord444.wailsmod.util.handlers.SoundsHandler;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();

	//Materials
	public static final ToolMaterial MATERIAL_MEME = EnumHelper.addToolMaterial("material_meme", 2, 420, 5.0F, 2.0F, 10);
	public static final ToolMaterial MATERIAL_ONIT = EnumHelper.addToolMaterial("material_onit", 4, 2420, 16.0F, 5.0F, 22);
	public static final ToolMaterial MATERIAL_LAZORITE = EnumHelper.addToolMaterial("material_lazorite", 5, 5000, 40.0F, 6.0F, 30);
	public static final ItemArmor.ArmorMaterial ORANGE_ESSENCE = EnumHelper.addArmorMaterial("orange_essence", Reference.MOD_ID+":orange_essence",420, new int[] {2,5,5,2}, 30, SoundsHandler.ONIT, 0.0F);

	//Items
	public static final Item ONIT_ESSENCE = new ItemBase("onit_essence");
	public static final Item ONIT_SHARD = new ItemBase("onit_shard");
	public static final Item ONIT_INGOT = new ItemBase("onit_ingot");
	public static final Item SPICY_ONIT_FUEL = new ItemBase("spicy_onit_fuel");
	public static final Item LAZORITE_FRAGMENT = new ItemBase("lazorite_fragment");

	//Tools
	public static final ToolSword MEME_BLADE = new ToolSword("meme_blade", MATERIAL_MEME);

	public static final ToolSword ONIT_SWORD = new ToolSword("onit_sword", MATERIAL_ONIT);
	public static final ToolAxe ONIT_AXE = new ToolAxe("onit_axe", MATERIAL_ONIT);
	public static final ToolPickaxe ONIT_PICKAXE = new ToolPickaxe("onit_pickaxe", MATERIAL_ONIT);
	public static final ToolHoe ONIT_HOE = new ToolHoe("onit_hoe", MATERIAL_ONIT);
	public static final ToolSpade ONIT_SPADE = new ToolSpade("onit_spade", MATERIAL_ONIT);

	public static final ToolPickaxe LAZOR_DRILL = new ToolPickaxe("lazor_drill", MATERIAL_LAZORITE);

	//Armor
	public static final Item MMGA_HAT = new ArmorBase("mmga_hat", ORANGE_ESSENCE, 1, EntityEquipmentSlot.HEAD);

}