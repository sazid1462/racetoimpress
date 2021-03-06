package com.chorki.game.racetoimpress;

public interface Commons {

    public static final int BOARD_WIDTH = 514;
    public static final int BOARD_HEIGHT = 800;
    public static final int BOARD_MIDDLE = 514/2;
    
    public static final int BORDER_RIGHT = 514;
    public static final int BORDER_LEFT = 0;
    public static final int BORDER_TOP = -100;
    public static final int BORDER_BOTTOM = 900;
    
    public static final int CAR_WIDTH = 60;
    public static final float SMOOTHINGFACTOR = 8; 
    public static final float DELAY = 16/SMOOTHINGFACTOR;
    public static final int DELAY_HIT = 3000;
    public static final int MAX_VX = 7;
    public static final int MAX_VY = 15;
    public static final int MAX_BOOST_VY = 25;

}