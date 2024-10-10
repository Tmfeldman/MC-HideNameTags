package net.steakboi.hidenametags;

import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(HideNameTags.MOD_ID)
public class HideNameTags
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "hidenametags";
    public static boolean hideNameTags;
    static {
        hideNameTags = false;
    }

}
