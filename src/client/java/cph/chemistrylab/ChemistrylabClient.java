package cph.chemistrylab;

/*import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.registry.RegistryEntry;*/
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

public class ChemistrylabClient implements ClientModInitializer {

	@Override
	public void onInitializeClient(ModContainer mod) {
		/*ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
			return tintIndex == 0 ? 0x01ABDD : -1;
		}, ModItems.FILLED_BEAKER);

		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
			return tintIndex == 0 ? 0x01ABDD : -1;
		}, ModItems.FILLED_TEST_TUBE); */

		// what a shame this doesn't work with quilt
	}
}