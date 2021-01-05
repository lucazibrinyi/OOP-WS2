package com.codecool.oopws2;

public class RoundedRectangle extends Rectangle {
    private int roundRadius;

    public int getRoundRadius() {
        return roundRadius;
    }

    public RoundedRectangle(int height, int width) {
        super(height, width);
    }
/*
    public RoundedRectangle(int height, int width, int size) {
        super(height, width, size);
    }
*/
    public void setRoundRadius(int roundRadius){
        this.roundRadius=roundRadius;
    }

    public RoundedRectangle(int height, int width, int roundRadius) {
        super(height, width);
        this.roundRadius=roundRadius;
    }

    @Override
    public double calculateArea() {
        return (getWidth() * getHeight()) - (4 * (roundRadius * roundRadius)) + (roundRadius * roundRadius * Math.PI);
    }

//    @Override
//    public String toString() {
//        return "RoundedRectangle{" +
//                "height= "+ super.getHeight()+" "+
//                "width= "+super.getWidth()+" "+
//                "roundRadius=" + roundRadius +
//                '}';
//    }

//itt a generate-ben kiválasztásnál a lenyíló menüben String(concat)+super.toString -et
    @Override
    public String toString() {
        return "RoundedRectangle{" +
                "roundRadius=" + roundRadius +
                "} " + super.toString();
    }

    public void printRoundRadius() {
        System.out.println(toString());
    }
}
