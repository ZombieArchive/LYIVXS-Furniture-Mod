package net.lyivx.ls_furniture.registry.fabric;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.lyivx.ls_furniture.registry.ModBlockEntitys;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ModBlockEntitysImpl {

    @SuppressWarnings("deprecation")
    public static <E extends BlockEntity> BlockEntityType<E> createBlockEntityType(ModBlockEntitys.BlockEntityFactory<E> factory, Block... blocks) {
        return FabricBlockEntityTypeBuilder.create(factory::create, blocks).build();
    }
}
