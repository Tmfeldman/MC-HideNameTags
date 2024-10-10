package net.steakboi.hidenametags;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

public class Keybinds {
    public static final  Keybinds INSTANCE = new Keybinds();

    private Keybinds() {}

    public final KeyMapping toggleHideNameTags = new KeyMapping(
            "Toggle Hide Name Tags", // Will be localized using this translation key
            InputConstants.Type.KEYSYM, // Default mapping is on the keyboard
            GLFW.GLFW_KEY_F6, // Default key is F6
            "key.categories.misc" // Mapping will be in the misc category
    );
}
