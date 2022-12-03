package ${mod.package}.registry;

import ${mod.package}.${mod.class};
import ${mod.package}.blocks.LapisTreeSaplingBlock;
import ${mod.package}.feature.LapisTreeSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModCustomBlocks {
    public static final LapisTreeSaplingBlock LAPIS_TREE_SAPLING =
            new LapisTreeSaplingBlock(new LapisTreeSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING));

    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(${mod.class}.MOD_ID, "lapis_sapling"), LAPIS_TREE_SAPLING);
        Registry.register(Registry.ITEM, new Identifier(${mod.class}.MOD_ID, "lapis_sapling"), new BlockItem(LAPIS_TREE_SAPLING, new FabricItemSettings().group(${mod.class}.ITEM_GROUP)));
    }
}
