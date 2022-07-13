package net.grantalf.bassmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.grantalf.bassmod.BassMod;
import net.grantalf.bassmod.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item EBONY_SIGN = registerItem("ebony_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.BASS).maxCount(16),
                    ModBlocks.EBONY_SIGN_BLOCK, ModBlocks.EBONY_WALL_SIGN_BLOCK));


    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BassMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BassMod.LOGGER.debug("Registering Mod Items for " + BassMod.MOD_ID);
    }
}
