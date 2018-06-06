package com.wailord444.wailsmod.init;

import java.util.ArrayList;
import java.util.List;

import com.wailord444.wailsmod.blocks.BlockBase;
import com.wailord444.wailsmod.blocks.OnitBlock;
import com.wailord444.wailsmod.blocks.OnitOre;
import com.wailord444.wailsmod.blocks.ABS.AdvancedBrewingStand;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//blocks
	public static final Block ONIT_BLOCK = new OnitBlock("onit_block", Material.IRON);
	public static final Block ADVANCED_BREWING_STAND = new AdvancedBrewingStand("advanced_brewing_stand", Material.IRON);
	public static final Block ONIT_ORE = new OnitOre("onit_ore", Material.IRON);
}
