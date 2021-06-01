/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package intrerfaces.visedit;

import java.awt.Graphics;

/**
 *
 * @author Admin
 */
public interface Button {
        void draw(Graphics g);
    String click(int x, int y);
    void setX(int X);
    void setY(int Y);
    void setWidth(int W);
    void setHeight(int H);
    int getX();
    int getY();
    int getWidth();
    int getHeight();
}
