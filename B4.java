// Lớp NhanVien
class NhanVien {
    private String maNV;
    private String hoTen;
    private double luong;

    // Constructor không tham số
    public NhanVien() {
        this.maNV = "";
        this.hoTen = "";
        this.luong = 0;
    }

    // Constructor có mã và họ tên
    public NhanVien(String maNV, String hoTen) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = 0;
    }

    // Constructor đầy đủ thông tin
    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public void hienThiThongTin() {
        System.out.println("Ma nhan vien : " + maNV);
        System.out.println("Ho va ten    : " + hoTen);
        System.out.println("Luong        : " + luong);
        System.out.println("--------------------------------");
    }
}

// Lớp chạy chương trình
public class BaiTapNhanVien {
    public static void main(String[] args) {

        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien("NV01", "Hieu Quang Ngoc");
        NhanVien nv3 = new NhanVien("NV02", "Nguyen Van B", 18000000);

        nv1.hienThiThongTin();
        nv2.hienThiThongTin();
        nv3.hienThiThongTin();
    }
}
