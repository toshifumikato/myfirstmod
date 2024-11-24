package net.cransmontana.mccourse.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.cransmontana.mccourse.MCCourseMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MOD_ID);

    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.parse("mccourse:alexandrite")))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        LOGGER.info("Registering item: {}", ModItems.ALEXANDRITE.getId());
    }
}
