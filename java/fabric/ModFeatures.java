package ${mod.package}.feature;

import ${mod.package}.${mod.class};
import ${mod.package}.registry.ModBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ModFeatures {

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> LAPIS_TREE =
            ConfiguredFeatures.register("${mod.mcpath}:lapis_tree", Feature.TREE, new TreeFeatureConfig.Builder(
            BlockStateProvider.of(ModBlocks.LAPIS_LOG),
            new StraightTrunkPlacer(8, 3, 0),
            BlockStateProvider.of(ModBlocks.LAPIS_LEAVES),
            new BlobFoliagePlacer(ConstantIntProvider.create(5), ConstantIntProvider.create(0), 3),
            new TwoLayersFeatureSize(1, 0, 1)
    ).build());

}
