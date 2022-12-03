package ${mod.package}.feature;

import ${mod.package}.feature.ModFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

import javax.annotation.Nullable;

public class LapisTreeSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> getTreeFeature(Random random, boolean bees) {
        return ModFeatures.LAPIS_TREE;
    }

}
