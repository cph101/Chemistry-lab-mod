package cph.chemistrylab.items;

import net.minecraft.item.Item;
import net.minecraft.text.Text;

public class CustomBeakerItem extends Item {
    public CustomBeakerItem(Settings settings) {
        super(settings);
    }
    public String beakerName = "Beaker of Copper Sulfate";
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
