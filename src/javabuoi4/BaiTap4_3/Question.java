package javabuoi4.BaiTap4_3;

public class Question {
    private String noiDungCauHoi, dapAn1, dapAn2, dapAn3, dapAn4, dapAnDung, doKho;

    public Question(String noiDungCauHoi, String dapAn1, String dapAn2, String dapAn3, String dapAn4, String dapAnDung, String doKho) {
        this.noiDungCauHoi = noiDungCauHoi;
        this.dapAn1 = dapAn1;
        this.dapAn2 = dapAn2;
        this.dapAn3 = dapAn3;
        this.dapAn4 = dapAn4;
        this.dapAnDung = dapAnDung;
        this.doKho = doKho;
    }

    public Question() {
    }

    public String getNoiDungCauHoi() {
        return noiDungCauHoi;
    }

    public void setNoiDungCauHoi(String noiDungCauHoi) {
        this.noiDungCauHoi = noiDungCauHoi;
    }

    public String getDapAn1() {
        return dapAn1;
    }

    public void setDapAn1(String dapAn1) {
        this.dapAn1 = dapAn1;
    }

    public String getDapAn2() {
        return dapAn2;
    }

    public void setDapAn2(String dapAn2) {
        this.dapAn2 = dapAn2;
    }

    public String getDapAn3() {
        return dapAn3;
    }

    public void setDapAn3(String dapAn3) {
        this.dapAn3 = dapAn3;
    }

    public String getDapAn4() {
        return dapAn4;
    }

    public void setDapAn4(String dapAn4) {
        this.dapAn4 = dapAn4;
    }

    public String getDapAnDung() {
        return dapAnDung;
    }

    public void setDapAnDung(String dapAnDung) {
        this.dapAnDung = dapAnDung;
    }

    public String getDoKho() {
        return doKho;
    }

    public void setDoKho(String doKho) {
        this.doKho = doKho;
    }

    //Kiem tra dap an dung hay khong
    public boolean isTrue(String dapAnChon){
        return dapAnChon == dapAnDung;

    }

}
