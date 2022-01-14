package io.github.TheRealDoomSlayer.theawakening.core.init;

import io.github.TheRealDoomSlayer.theawakening.TheAwakening;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ItemInit {

	private ItemInit() {}
        
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TheAwakening.MODID);

    public static final RegistryObject<Item> PYRIUM_INGOT = ITEMS.register("pyrium_ingot",
    		 () -> new Item(new Item.Properties().tab(TheAwakening.THE_AWAKENING_MATERIALS).fireResistant()));
    
    public static final RegistryObject<Item> OUTERIUM_INGOT = ITEMS.register("outerium_ingot",
   		 () -> new Item(new Item.Properties().tab(TheAwakening.THE_AWAKENING_MATERIALS)));

	public static final RegistryObject<Item> RAW_PYRIUM = ITEMS.register("raw_pyrium",
			() -> new Item(new Item.Properties().tab(TheAwakening.THE_AWAKENING_MATERIALS).fireResistant()));
    
    // Block Items
    public static final RegistryObject<BlockItem> PYRIUM_BLOCK_ITEM = ITEMS.register("pyrium_block",
    		() -> new BlockItem(BlockInit.PYRIUM_BLOCK.get(), 
    				new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS).stacksTo(64).fireResistant()));

	public static final RegistryObject<BlockItem> PYRIUM_ORE_BLOCK_ITEM = ITEMS.register("pyrium_ore",
			() -> new BlockItem(BlockInit.PYRIUM_ORE.get(),
					new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS).stacksTo(64)));

        
    public static final RegistryObject<BlockItem> EXODENDRON_WOOD_ITEM = ITEMS.register("exodendron_wood",
    		() -> new BlockItem(BlockInit.EXODENDRON_WOOD.get(),
    				new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS).stacksTo(64)));
    
    public static final RegistryObject<BlockItem> EXODENDRON_LOG_ITEM = ITEMS.register("exodendron_log",
    		() -> new BlockItem(BlockInit.EXODENDRON_LOG.get(),
    				new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS).stacksTo(64)));
    
    public static final RegistryObject<BlockItem> STRIPPED_EXODENDRON_LOG_ITEM = ITEMS.register("stripped_exodendron_log",
    		() -> new BlockItem(BlockInit.STRIPPED_EXODENDRON_LOG.get(),
    				new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS).stacksTo(64)));

	public static final RegistryObject<BlockItem> EXODENDRON_PLANKS_ITEM = ITEMS.register("exodendron_planks",
			() -> new BlockItem(BlockInit.EXODENDRON_PLANKS.get(),
					new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS).stacksTo(64)));
    // Tools
    public static final RegistryObject<SwordItem> PYRIUM_SWORD = ITEMS.register("pyrium_sword",
    		() -> new SwordItem(ToolMaterialInit.PYRIUM, 9 , 1.6f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant().durability(1500)));

    public static final RegistryObject<PickaxeItem> PYRIUM_PICKAXE = ITEMS.register("pyrium_pickaxe",
    		() -> new PickaxeItem(ToolMaterialInit.PYRIUM, 6 , 1.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant().durability(1500)));

    public static final RegistryObject<ShovelItem> PYRIUM_SHOVEL = ITEMS.register("pyrium_shovel",
    		() -> new ShovelItem(ToolMaterialInit.PYRIUM, 5 , 1.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant().durability(1500)));

    public static final RegistryObject<HoeItem> PYRIUM_HOE = ITEMS.register("pyrium_hoe",
    		() -> new HoeItem(ToolMaterialInit.PYRIUM, 4 , 1.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant().durability(1500)));

    public static final RegistryObject<AxeItem> PYRIUM_AXE = ITEMS.register("pyrium_axe",
    		() -> new AxeItem(ToolMaterialInit.PYRIUM, 12 , 1.2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant().durability(1500)));

    // Armor
    public static final RegistryObject<ArmorItem> PYRIUM_HELMET = ITEMS.register("pyrium_helmet", 
    		() -> new ArmorItem(ArmorMaterialInit.PYRIUM, EquipmentSlot.HEAD,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()));
    
    public static final RegistryObject<ArmorItem> PYRIUM_LEGGINGS = ITEMS.register("pyrium_leggings", 
    		() -> new ArmorItem(ArmorMaterialInit.PYRIUM, EquipmentSlot.LEGS,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()));

    public static final RegistryObject<ArmorItem> PYRIUM_BOOTS = ITEMS.register("pyrium_boots", 
    		() -> new ArmorItem(ArmorMaterialInit.PYRIUM, EquipmentSlot.FEET,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()));

    public static final RegistryObject<ArmorItem> PYRIUM_CHESTPLATE = ITEMS.register("pyrium_chestplate", 
    		() -> new ArmorItem(ArmorMaterialInit.PYRIUM, EquipmentSlot.CHEST,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()));

    public static final RegistryObject<HorseArmorItem> PYRIUM_HORSE_ARMOR = ITEMS.register("pyrium_horse_armor",
   		 () -> new HorseArmorItem(16,"horse_armor_pyrium" , new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant()));

}
   