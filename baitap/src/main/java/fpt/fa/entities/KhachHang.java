package fpt.fa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "KhachHang")
public class KhachHang {
	@Id
	private String MaKH;
	
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	private String TenKH;
	
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	private String DiaChi;

	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	private String SoDienThoai;
	
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	private String DiaChiEmail;

	public String getMaKH() {
		return MaKH;
	}

	public void setMaKH(String maKH) {
		MaKH = maKH;
	}

	public String getTenKH() {
		return TenKH;
	}

	public void setTenKH(String tenKH) {
		TenKH = tenKH;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getSoDienThoai() {
		return SoDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		SoDienThoai = soDienThoai;
	}

	public String getDiaChiEmail() {
		return DiaChiEmail;
	}

	public void setDiaChiEmail(String diaChiEmail) {
		DiaChiEmail = diaChiEmail;
	}

	public KhachHang(String maKH, String tenKH, String diaChi, String soDienThoai, String diaChiEmail) {
		super();
		MaKH = maKH;
		TenKH = tenKH;
		DiaChi = diaChi;
		SoDienThoai = soDienThoai;
		DiaChiEmail = diaChiEmail;
	}

	public KhachHang() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "KhachHang [MaKH=" + MaKH + ", TenKH=" + TenKH + ", DiaChi=" + DiaChi + ", SoDienThoai=" + SoDienThoai
				+ ", DiaChiEmail=" + DiaChiEmail + "]";
	}
	
	
		
	
}
