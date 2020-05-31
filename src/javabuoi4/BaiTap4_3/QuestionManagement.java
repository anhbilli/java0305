package javabuoi4.BaiTap4_3;

public class QuestionManagement {
    private Question[] danhSachCauHoi;

    public QuestionManagement(Question[] danhSachCauHoi) {
        this.danhSachCauHoi = danhSachCauHoi;
    }

    public QuestionManagement() {
    }

    public Question[] getDanhSachCauHoi() {
        return danhSachCauHoi;
    }

    public void setDanhSachCauHoi(Question[] danhSachCauHoi) {
        this.danhSachCauHoi = danhSachCauHoi;
    }

    //Tinh diem
    public double tinhDiem(String[] danhSachDapAnChon){
        int soCauDung = 0;
        for( int i = 0; i < danhSachDapAnChon.length; i++){
            if(danhSachCauHoi[i].isTrue(danhSachDapAnChon))
                soCauDung++;
        }
        return soCauDung * 1.0 / danhSachCauHoi.length;
    }

    //TIm kiem cau hoi theo do kho
    public Question[] timTheoDoKho(String doKho){
        //Tinh so luong cau hoi co cung do kho
        int soLuong = 0;
        for(Question question : danhSachCauHoi){
            if(question.getDoKho() == doKho)
        }
        Question[] result = new Question[soLuong];
        int i = 0;
        for(Question question : result){
            if(question.getDoKho() == doKho){
                result[i] = question;
                i++;
            }
        }
        return result;
    }


}
