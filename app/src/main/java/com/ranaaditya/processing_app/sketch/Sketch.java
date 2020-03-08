package com.ranaaditya.processing_app.sketch;

import processing.core.PApplet;

public class Sketch extends PApplet {

    int screenHeight = 600;
    int screenWidth = 600;
    int c = 50;
    int d = 50;

    public Sketch(int h, int w, int c, int d) {
        if (h > 0 && w > 0) {
            this.screenHeight = h;
            this.screenWidth = w;
        }
        if (c > 0 && d > 0) {
            this.c = c;
            this.d = d;
        }
    }

    public void settings() {
        size(screenWidth, screenHeight);
    }

    public void setup() {
    }

    public void draw() {
        if (mousePressed) {
            ellipse(mouseX, mouseY, c, d);
        }
    }
}
