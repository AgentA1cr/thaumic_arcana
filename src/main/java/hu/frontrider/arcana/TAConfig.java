package hu.frontrider.arcana;

import net.minecraftforge.common.config.Config;

import static hu.frontrider.arcana.ThaumicArcana.MODID;

@Config(modid = MODID)
public class TAConfig {
    @Config.Comment({"Toggles weather or not it should enable the platinum recipe.",
            "This one has a toggle, because it can be truly game breaking.",
            "Turn it on, if metal transmutation is the intended way of getting resources."})
    @Config.Name("Enable platinum")
    public static boolean enablePlatinum = false;

    @Config.Comment({"a list of entities that can not be enchanted.",
            "Slimes are blacklisted, because the rendering can never be correct. (because of the varying size)"})
    @Config.Name("Enchantable entity blacklist")
    public static String[] entityBlacklist = new String[]{("minecraft:slime")};

}
