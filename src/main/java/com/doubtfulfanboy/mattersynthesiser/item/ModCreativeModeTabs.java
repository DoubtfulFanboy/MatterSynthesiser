package com.doubtfulfanboy.mattersynthesiser.item;

import com.doubtfulfanboy.mattersynthesiser.MatterSynthesiser;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MatterSynthesiser.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab MATTER_SYNTHESISER_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTab(CreativeModeTabEvent.Register event) {
        MATTER_SYNTHESISER_TAB = event.registerCreativeModeTab(new ResourceLocation(MatterSynthesiser.MOD_ID,"matter_synthesiser_tab"),
                builder -> builder.icon(() -> new ItemStack(Blocks.DIRT))
                        .title(Component.translatable("creativemodetabs.matter_synthesiser_tab")));
    }
}
