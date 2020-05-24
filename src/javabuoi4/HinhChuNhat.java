package javabuoi4;

public class HinhChuNhat {
    private int width;
    private int height;

    public HinhChuNhat(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int chuVi(){
        int chuVi = (width + height)*2;
        return chuVi;
    }
    public int dienTich(){
        int dienTich = width * height;
        return dienTich;
    }
    public boolean checkHV(){
        if( width == height){
            return true;
        }
        else {
            return false;
        }
    }
}
