package cph.chemistrylab;

import cph.chemistrylab.items.CustomBeakerItem;
import cph.chemistrylab.items.CustomTestTubeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.group.api.QuiltItemGroup;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {
    // mod items


    public static final Item BEAKER = Registry.register(Registry.ITEM, new Identifier("chemistrylab", "beaker"), new Item(new QuiltItemSettings().maxCount(16)));
    public static final Item FILLED_BEAKER = Registry.register(Registry.ITEM, new Identifier("chemistrylab", "filled_beaker"), new CustomBeakerItem(new QuiltItemSettings().maxCount(1)));
    public static final Item TEST_TUBE = Registry.register(Registry.ITEM, new Identifier("chemistrylab", "test_tube"), new Item(new QuiltItemSettings().maxCount(8)));
    public static final Item FILLED_TEST_TUBE = Registry.register(Registry.ITEM, new Identifier("chemistrylab", "filled_test_tube"), new CustomTestTubeItem(new QuiltItemSettings().maxCount(8)));
    // Custom Item Group
    @SuppressWarnings({"unused"}) public static final ItemGroup CHEMISTRY_GROUP = QuiltItemGroup.builder(
            new Identifier(Chemistrylab.MOD_ID, "chemistry_group"))
            .icon(() -> new ItemStack(FILLED_BEAKER))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(BEAKER));
                stacks.add(new ItemStack(TEST_TUBE));
            })
            .build() // build method must come before setName for some reason?
            .setName("Chemistry Lab");

    // init function
    public static void init() {
    }
}
