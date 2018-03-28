package org.sdoaj.core.misc;

import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.feature.WorldGenMinable;

class EndGenMineable extends WorldGenMinable {
    EndGenMineable(IBlockState state, int blockCount) {
        super(state, blockCount, new EndGenMineable.EndStonePredicate());
    }

    static class EndStonePredicate implements Predicate<IBlockState> {
        private EndStonePredicate() {}

        public boolean apply(IBlockState apply) {
            return apply != null && apply.getBlock() == Blocks.END_STONE;
        }
    }
}
