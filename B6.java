// Lớp NguoiDung
class NguoiDung {
    private int maND;
    private String tenDangNhap;
    private String matKhau;
    private String email;

    private boolean hopLeMatKhau = true;
    private boolean hopLeEmail = true;

    public NguoiDung(int maND, String tenDangNhap, String matKhau, String email) {
        this.maND = maND;
        this.tenDangNhap = tenDangNhap;
        setMatKhau(matKhau);
        setEmail(email);
    }

    public int getMaND() {
        return maND;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public String getEmail() {
        return email;
    }

    public void setMatKhau(String matKhau) {
        if (matKhau != null && !matKhau.trim().isEmpty()) {
            this.matKhau = matKhau;
            hopLeMatKhau = true;
        } else {
            this.matKhau = matKhau;
            hopLeMatKhau = false;
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
            hopLeEmail = true;
        } else {
            this.email = email;
            hopLeEmail = false;
        }
    }

    public void hienThiThongTin() {
        System.out.println("Ma nguoi dung : " + maND);
        System.out.println("Ten dang nhap : " + tenDangNhap);

        if (hopLeEmail) {
            System.out.println("Email         : " + email);
        } else {
            System.out.println("Email         : Khong hop le");
        }

        if (hopLeMatKhau) {
            System.out.println("Mat khau      : " + matKhau);
        } else {
            System.out.println("Mat khau      : Khong duoc rong");
        }

        System.out.println("--------------------------------");
    }
}

// Lớp chạy chương trình
public class BaiTapNguoiDung {
    public static void main(String[] args) {

        NguoiDung nd1 = new NguoiDung(
                1,
                "hieuquangngoc",
                "123456",
                "hieuquangngoc@gmail.com"
        );

        NguoiDung nd2 = new NguoiDung(
                2,
                "nguyenvana",
                "",
                "vana@gmail.com"
        );

        NguoiDung nd3 = new NguoiDung(
                3,
                "tranvanb",
                "abcdef",
                "emailkhongdau@"
        );

        nd1.hienThiThongTin();
        nd2.hienThiThongTin();
        nd3.hienThiThongTin();
    }
}
