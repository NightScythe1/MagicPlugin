package com.elmakers.mine.bukkit.api.protection;

import javax.annotation.Nonnull;

import com.elmakers.mine.bukkit.api.magic.MagicProvider;

/**
 * Register via PreLoadEvent.register()
 */
public interface PlayerWarpProvider extends PlayerWarpManager, MagicProvider {
    /**
     * Used in Recall configurations for enabling/disabling groups of warp types.
     * Must be a unique key.
     * @return
     */
    @Nonnull
    String getKey();
}
