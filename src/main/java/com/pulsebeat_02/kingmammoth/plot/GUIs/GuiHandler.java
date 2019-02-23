package com.pulsebeat_02.kingmammoth.plot.GUIs;

import com.pulsebeat_02.kingmammoth.plot.GUIs.introduction.IntroductoryGUI.BlockGuiWindow;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        //I don't use any containers in my GUIs (GuiContainer), but if I did, I'd return them here.
        //You can only get away with what I'm doing here if your GUIs extend GuiScreen and not GuiContainer
        //Servers get containers - Clients get GUIs
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        {
            switch (ID) {
                case 0:

                    return new BlockGuiWindow(null);
                    break;

                case 1:

                    //return new DialogGUI();
                    break;

                case 2:

                    break;

                case 3:

                    break;

            }

            return null;
            //It is common Java convention to "break;" a switch case, but because all my cases end in returns, I don't need to
        } 
        
    }
    
    
}﻿﻿