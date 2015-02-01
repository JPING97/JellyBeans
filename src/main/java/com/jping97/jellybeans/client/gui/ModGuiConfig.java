package com.jping97.jellybeans.client.gui;

import com.jping97.jellybeans.handler.ConfigurationHandler;
import com.jping97.jellybeans.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
/**
 * Created by jonathan_pingle on 2/1/15.
 */

public class ModGuiConfig extends GuiConfig

{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }


}
