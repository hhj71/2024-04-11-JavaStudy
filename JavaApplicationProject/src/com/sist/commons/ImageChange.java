package com.sist.commons;
import java.awt.*;

import javax.swing.*;
public class ImageChange {
	public static Image getImage(ImageIcon icon,int width, int heigth)
	{
		Image deimg=icon.getImage().getScaledInstance(width, heigth, Image.SCALE_SMOOTH);
		return deimg;
	}
	
}
