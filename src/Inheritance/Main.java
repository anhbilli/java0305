package Inheritance;

public class Main {
    public static void main(String[] args) {
        VCB vcb = new VCB();
        vcb.setBankName("Vietcombank");
        vcb.setLaiSuat(6.5f);
        vcb.printKhauHieu();

        Integer tienGui = 2000;
        System.out.println("So tien lai sau 1 nam: "+
                vcb.tinhTienLaiSuatSauMotNam(tienGui));

        STB stb = new STB();
        stb.setLaiSuat(8.0f);
        System.out.println("So tien lai sau 1 nam: "+
                stb.tinhTienLaiSuatSauMotNam(tienGui));

        VCBWallet wallet = new VCBWallet();
        wallet.setBankName("Vietcombank");
        wallet.setPhanTramVonNhaNuoc(56f);
    }
}
