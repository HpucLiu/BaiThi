package model;

/**
 *
 * Họ tên sinh viên: Liêu Hoàng Phúc
 */
public class KhachHang {

    private String maso;
    private String hoten;
    private int sonhankhau;
    private double chisocu;
    private double chisomoi;

    //constructor
    public KhachHang() {
    }

    public KhachHang(String maso) {
        this.maso = maso;
    }

    public KhachHang(String maso, String hoten, int sonhankhau, double chisocu, double chisomoi) {
        this.maso = maso;
        this.hoten = hoten;
        this.sonhankhau = sonhankhau;
        this.chisocu = chisocu;
        this.chisomoi = chisomoi;
    }

    //setter và getter
    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getSonhankhau() {
        return sonhankhau;
    }

    public void setSonhankhau(int sonhankhau) {
        this.sonhankhau = sonhankhau;
    }

    public double getChisocu() {
        return chisocu;
    }

    public void setChisocu(double chisocu) {
        this.chisocu = chisocu;
    }

    public double getChisomoi() {
        return chisomoi;
    }

    public void setChisomoi(double chisomoi) {
        this.chisomoi = chisomoi;
    }

    //phương thức tính toán    
    public double getTieuThu() {
        return getChisomoi() - getChisocu();
    }

    public double getDinhMuc() {
        return sonhankhau * 4;
    }

    public double tinhTienTra() {
        double tieuThu = getTieuThu();
        double dinhMuc = getDinhMuc();
        double tienNuoc = 0;
        if (getTieuThu() <= tienNuoc) {
            tienNuoc = tieuThu * 6700;
        } else if (getTieuThu() <= getDinhMuc() * 1.5) {
            tienNuoc = tieuThu * 6700 + (tieuThu - getDinhMuc()) * 12900;
        } else {
            tienNuoc = dinhMuc * 6700 + (( dinhMuc * 0.5) * 12900) + ((tieuThu - dinhMuc * 1.5) * 14400);
        }
        //Tổng tiền nước
        double thueGTGT = 0.05 * tienNuoc;
        double phiTDVTN = 0.25 * tienNuoc;
        double thueTDVTN = 0.08 * phiTDVTN;

        tienNuoc = tienNuoc * thueGTGT + phiTDVTN + thueTDVTN;

        return tienNuoc;
    }
}
