package cph.chemistrylab.items;

import net.minecraft.item.Item;
import net.minecraft.text.Text;

public class CustomTestTubeItem extends Item {
    public CustomTestTubeItem(Settings settings) {
        super(settings);
    }
    public String beakerName = "Test Tube with Copper Sulfate";
    @Override
    public Text getName() {
        return Text.of(beakerName);
    }

    @Override
    public String toString() {
        return beakerName;
    }

    @Override
    public String getTranslationKey() {
        return beakerName;
    }

    @Override
    protected String getOrCreateTranslationKey() {
        return beakerName;
    }
}
