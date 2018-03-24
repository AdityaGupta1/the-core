package org.sdoaj.core.misc;

import com.google.common.base.Predicate;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.feature.WorldGenMinable;

class NetherGenMineable extends WorldGenMinable {
    NetherGenMineable(IBlockState state, int blockCount) {
        super(state, blockCount, new NetherGenMineable.NetherrackPredicate());
    }

    static class NetherrackPredicate implements Predicate<IBlockState> {
        private NetherrackPredicate() {}

        public boolean apply(IBlockState apply) {
            return apply != null && apply.getBlock() == Blocks.NETHERRACK;
        }
    }
}
