package cph.chemistrylab;


import net.minecraft.item.Item;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chemistrylab implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("chemistrylab");
	public static final String MOD_ID = "chemistrylab";

	@Override
	public void onInitialize(ModContainer mod) {
		ModItems.init();
		LOGGER.info("Chemistry lab initialized! Hi there ;)");
	}
}