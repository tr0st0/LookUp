package net.trosto.lookup.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.trosto.lookup.LookUp;
import org.checkerframework.checker.units.qual.C;

public class ModCreativeModTab  {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LookUp.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LOOKUP_TAB = CREATIVE_MOD_TAB.register("look_up",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GRASSMOSPHERE.get()))
                    .title(Component.translatable("creative.lookup_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.GRASSMOSPHERE.get());

                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TAB.register(eventBus);
    }
}
