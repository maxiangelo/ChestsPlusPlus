package com.jamesdpeters.minecraft.chests.v1_14_R1;

import com.jamesdpeters.minecraft.chests.ChestOpener;
import com.jamesdpeters.minecraft.chests.MaterialChecker;
import com.jamesdpeters.minecraft.chests.NMSProvider;
import org.bukkit.entity.ItemFrame;

public class NMSProviderImpl implements NMSProvider {
    @Override
    public ChestOpener getChestOpener() {
        return new ChestOpener_1_14();
    }

    @Override
    public MaterialChecker getMaterialChecker() {
        return new MaterialChecker_1_14();
    }

    @Override
    public void setItemFrameVisible(ItemFrame itemFrame, boolean visible) {
        //Not support in 1.14
    }
}
