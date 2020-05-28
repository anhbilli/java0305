package Inheritance;

public class VCB extends Bank{
    //Tinh don ke thua: extends
    // -Gon code va tai sd lai code
    // -Thong nhat 1 quy chuan ve cach dat ten bien chung
    private float phanTramVonNhaNuoc;

    public float getPhanTramVonNhaNuoc() {
        return phanTramVonNhaNuoc;
    }

    public void setPhanTramVonNhaNuoc(float phanTramVonNhaNuoc) {
        this.phanTramVonNhaNuoc = phanTramVonNhaNuoc;
    }

    void print(){
        System.out.println("Day la Vietcombank");
    }
    void printKhauHieu(){
        super.print();//Su dung ham print tu lop cha class Bank
    }
    //Tra ve lai suat sau 1 nam
    @Override//Tinh da hinh ghi de lai theo phuong thuc cua lop cha
    float tinhTienLaiSuatSauMotNam(Integer money) {//money ten bien dai dien, bien local
        float tongTien = money * this.getLaiSuat() / 100 + money + 10;
        return tongTien;
    }

}
