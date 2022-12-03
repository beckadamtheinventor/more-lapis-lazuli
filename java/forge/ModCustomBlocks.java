package ${mod.package}.block

import ${mod.package}.block.ModBlocks;

public class ModCustomBlocks {

    public static final RegistryObject<Block> LAPIS_TREE_SAPLING = ModBlocks.registerBlock("lapis_tree_sapling",
            () -> new ModSaplingBlock(new LapisTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), () -> Material.DIRT),
            ModCreativeModeTab.TAB;
    );

}