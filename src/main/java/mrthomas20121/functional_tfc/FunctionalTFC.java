package mrthomas20121.functional_tfc;

import com.buuz135.functionalstorage.FunctionalStorage;
import com.hrznstudio.titanium.module.ModuleController;
import net.dries007.tfc.common.blocks.wood.Wood;
import net.minecraftforge.fml.common.Mod;
import java.util.Arrays;

@Mod(FunctionalTFC.mod_id)
public class FunctionalTFC extends ModuleController {

	public static final String mod_id = "functional_tfc";

	@Override
	protected void initModules() {
		Arrays.stream(Wood.values()).map(TFCWoodType::new).forEach(FunctionalStorage.WOOD_TYPES::add);
	}
}
