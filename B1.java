import java.time.LocalDate;

class SinhVien {
    private String maSV;
    private String hoTen;
    private LocalDate ngaySinh;
    private double diemTrungBinh;

    public SinhVien(String maSV, String hoTen, LocalDate ngaySinh, double diemTrungBinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public void hienThiThongTin() {
        System.out.println("Ma sinh vien: " + maSV);
        System.out.println("Ho ten sinh vien: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Diem trung binh: " + diemTrungBinh);
        System.out.println("------------------------------");
    }
}

public class Bai1 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(
                "SV001",
                "Hieu Quang Ngoc",
                LocalDate.of(2004, 8, 15),
                8.7
        );

        SinhVien sv2 = new SinhVien(
                "SV002",
                "Tran Minh Duc",
                LocalDate.of(2003, 12, 5),
                7.9
        );

        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
    }
}
