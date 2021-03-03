package com.NoComment1105.Periodic.registry;

import com.NoComment1105.Periodic.periodic;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //items
    public static final Item URANIUM = new Item(new Item.Settings().group(periodic.ITEM_GROUP));

    //Block Items
    public static final BlockItem URANIUM_BLOCK = new BlockItem(ModBlocks.URANIUM_BLOCK, new Item.Settings().group(periodic.ITEM_GROUP));
    public static final BlockItem URANIUM_ORE = new BlockItem(ModBlocks.URANIUM_ORE, new Item.Settings().group(periodic.ITEM_GROUP));

    //registering the existance of the items note that blocks need an item form too
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "uranium"), URANIUM);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "uranium_block"),URANIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(periodic.MOD_ID, "uranium_ore"), URANIUM_ORE);
    }
}
