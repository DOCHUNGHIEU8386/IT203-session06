// Lớp SanPham
class SanPham {
    private String maSP;
    private String tenSP;
    private double donGia;

    public SanPham(String maSP, String tenSP, double donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        setDonGia(donGia);
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia > 0) {
            this.donGia = donGia;
        } else {
            System.out.println(">> Don gia phai lon hon 0!");
            System.out.println("--------------------------------");
        }
    }

    public void hienThiThongTin() {
        System.out.println("Ma san pham : " + maSP);
        System.out.println("Ten san pham: " + tenSP);
        System.out.println("Don gia     : " + donGia);
        System.out.println("--------------------------------");
    }
}

// Lớp chạy chương trình
public class BaiTapSanPham {
    public static void main(String[] args) {

        SanPham sp = new SanPham(
                "P1001",
                "Laptop Gaming",
                25000000
        );

        sp.hienThiThongTin();

        // Thử gán giá không hợp lệ
        sp.setDonGia(-5000000);
        sp.hienThiThongTin();

        // Gán lại giá hợp lệ
        sp.setDonGia(23000000);
        sp.hienThiThongTin();
    }
}
