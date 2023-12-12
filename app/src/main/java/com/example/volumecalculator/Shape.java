package com.example.volumecalculator;

public class Shape {
    int shapeImageRes;
    String shapeText;

    public Shape(int shapeImageRes, String shapeText) {
        this.shapeImageRes = shapeImageRes;
        this.shapeText = shapeText;
    }

    public int getShapeImageRes() {
        return shapeImageRes;
    }

    public void setShapeImageRes(int shapeImageRes) {
        this.shapeImageRes = shapeImageRes;
    }

    public String getShapeText() {
        return shapeText;
    }

    public void setShapeText(String shapeText) {
        this.shapeText = shapeText;
    }
}
