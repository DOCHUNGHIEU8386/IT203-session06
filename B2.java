// Lớp TaiKhoan
class TaiKhoan {
    private String tenDangNhap;
    private String matKhau;
    private String email;

    public TaiKhoan(String tenDangNhap, String matKhau, String email) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.email = email;
    }

    public void capNhatMatKhau(String matKhauMoi) {
        this.matKhau = matKhauMoi;
        System.out.println(">> Cap nhat mat khau thanh cong!");
    }

    public void hienThiThongTin() {
        System.out.println("Ten dang nhap : " + tenDangNhap);
        System.out.println("Email         : " + email);
        System.out.println("Mat khau      : ********");
        System.out.println("--------------------------------");
    }
}

// Lớp chính
public class BaiTapTaiKhoan {
    public static void main(String[] args) {

        TaiKhoan tk = new TaiKhoan(
                "hieuquangngoc",
                "123456",
                "hieuquangngoc@gmail.com"
        );

        tk.hienThiThongTin();

        tk.capNhatMatKhau("newpass2026");

        tk.hienThiThongTin();
    }
}
