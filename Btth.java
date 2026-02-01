// Lớp TaiKhoanNganHang
class TaiKhoanNganHang {
    // ===== Thuộc tính (Đóng gói) =====
    private String soTaiKhoan;
    private String tenChuTK;
    private double soDu;

    // ===== Constructor không tham số =====
    public TaiKhoanNganHang() {
        this.soTaiKhoan = "CHUA_CO";
        this.tenChuTK = "CHUA_XAC_DINH";
        this.soDu = 0;
    }

    // ===== Constructor có tham số =====
    public TaiKhoanNganHang(String soTaiKhoan, String tenChuTK, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTK = tenChuTK;
        setSoDu(soDu);
    }

    // ===== Getter =====
    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public String getTenChuTK() {
        return tenChuTK;
    }

    public double getSoDu() {
        return soDu;
    }

    // ===== Setter kiểm tra hợp lệ =====
    public void setSoDu(double soDu) {
        if (soDu >= 0) {
            this.soDu = soDu;
        } else {
            System.out.println("So du khong hop le, gan ve 0");
            this.soDu = 0;
        }
    }

    // ===== Nghiệp vụ: Gửi tiền =====
    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Gui tien thanh cong: " + soTien);
        } else {
            System.out.println("So tien gui phai > 0");
        }
    }

    // ===== Nghiệp vụ: Rút tiền =====
    public void rutTien(double soTien) {
        if (soTien <= 0) {
            System.out.println("So tien rut phai > 0");
        } else if (soTien > soDu) {
            System.out.println("So du khong du de rut");
        } else {
            soDu -= soTien;
            System.out.println("Rut tien thanh cong: " + soTien);
        }
    }

    // ===== Hiển thị thông tin =====
    public void hienThiThongTin() {
        System.out.println("So tai khoan : " + soTaiKhoan);
        System.out.println("Chu tai khoan: " + tenChuTK);
        System.out.println("So du        : " + soDu);
        System.out.println("--------------------------------");
    }
}

// Lớp chạy chương trình
public class BaiTapTaiKhoanNganHang {
    public static void main(String[] args) {

        // Tạo tài khoản không tham số
        TaiKhoanNganHang tk1 = new TaiKhoanNganHang();

        // Tạo tài khoản có tham số
        TaiKhoanNganHang tk2 = new TaiKhoanNganHang(
                "VCB001",
                "Hieu Quang Ngoc",
                10000000
        );

        // Hiển thị ban đầu
        tk1.hienThiThongTin();
        tk2.hienThiThongTin();

        // Thao tác với tk1
        tk1.guiTien(3000000);
        tk1.rutTien(500000);
        tk1.hienThiThongTin();

        // Thao tác với tk2
        tk2.guiTien(2000000);
        tk2.rutTien(15000000); // rút quá số dư
        tk2.rutTien(4000000);
        tk2.hienThiThongTin();
    }
}
