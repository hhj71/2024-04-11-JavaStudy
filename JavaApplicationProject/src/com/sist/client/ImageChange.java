package com.sist.client;
import java.awt.*;

import javax.swing.ImageIcon;
public class ImageChange {
	public static Image getImage(ImageIcon ii,int width, int heigth)
	{
		Image deimg=ii.getImage().getScaledInstance(width, heigth, Image.SCALE_SMOOTH);
		return deimg;
	}
	
}
