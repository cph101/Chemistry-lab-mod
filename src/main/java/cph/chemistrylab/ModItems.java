package cph.chemistrylab;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Custom Item Group
    private static final ItemGroup CHEMISTRY_GROUP = new ItemGroup(11, "chemistryLab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.GUNPOWDER);
        }

        @Override
        public Text getDisplayName() {
            return Text.of("Chemistry Lab");
        }
    };

    // mod items

    public static final Item TestTube = Registry.register(Registry.ITEM, new Identifier("chemistrylab", "test_tube"), new Item(new Item.Settings().group(CHEMISTRY_GROUP).maxCount(1)));

    // init function

    public static void init() {
        // init my ass
        return;
    }
}
