// Lớp Sach
class Sach {
    // Thuộc tính của đối tượng
    private String maSach;
    private String tenSach;
    private double gia;

    // Constructor (tham số trùng tên thuộc tính – dùng this)
    public Sach(String maSach, String tenSach, double gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.gia = gia;
    }

    public void hienThiThongTin() {
        System.out.println("Ma sach : " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Gia sach: " + gia);
        System.out.println("--------------------------------");
    }
}

// Lớp chạy chương trình
public class BaiTapSach {
    public static void main(String[] args) {

        Sach sach1 = new Sach(
                "S001",
                "Lap trinh Java co ban",
                350000
        );

        sach1.hienThiThongTin();
    }
}
