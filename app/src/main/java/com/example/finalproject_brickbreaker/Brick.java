package com.example.finalproject_brickbreaker;

public class Brick {
    private boolean isVisible;
    public int row, column, height, width;

    public Brick(int row, int column, int height, int width){
        isVisible = true;
        this.row = row;
        this.column = column;
        this.height = height;
        this.width = width;
    }

    public void setInvisible(){
        isVisible = false;
    }

    public boolean getVisibility(){
        return this.isVisible;
    }
}
