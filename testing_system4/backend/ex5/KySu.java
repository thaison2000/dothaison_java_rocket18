package backend.ex5;

public class KySu extends Canbo{
    private String nganhDaoTao;

	public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
}
