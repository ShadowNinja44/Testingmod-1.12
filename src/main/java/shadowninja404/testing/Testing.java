package shadowninja404.testing;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Testing.MODID, name = Testing.MOD_NAME, version = Testing.VERSION)
public class Testing {
	public static final String MODID = "testingmod";
	public static final String MOD_NAME = "A mod to test developing";
    public static final String VERSION = "@VERSION@";
    public static final String DEPENDENCIES = "";
    
    @Instance(MODID)
    public static Testing instance;
    
    @SidedProxy(clientSide = "shadowninja404.testing.ClientProxy", serverSide = "shadowninja404.testing.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	proxy.postInit(event);
    }
}
