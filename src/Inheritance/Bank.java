package Inheritance;

public class Bank {
    private String bankName;
    private String logo;
    private float laiSuat;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public float getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(float laiSuat) {
        this.laiSuat = laiSuat;
    }
    //Tra ve lai suat sau 1 nam
    float tinhTienLaiSuatSauMotNam(Integer money){//money ten bien dai dien, bien local
        float tongTien = money * laiSuat/100 + money;
        return tongTien;
    }

    void print(){
        System.out.println("Day la lop cha");
    }
}
