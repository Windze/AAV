
package net.mcreator.silveroretest.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class GhostLeavesBlock extends LeavesBlock {
	public GhostLeavesBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f).noOcclusion());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
