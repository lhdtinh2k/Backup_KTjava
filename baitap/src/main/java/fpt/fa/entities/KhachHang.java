package fpt.fa.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "KhachHang")
public class KhachHang {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int MaKH;
	
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	private String TenKH;
	
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	private String DiaChi;

	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	private String SoDienThoai;
	
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	private String DiaChiEmail;

	@OneToMany(mappedBy = "khachhang", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SuDungDichVu> suDungDichVus;
		

	
	public Set<SuDungDichVu> getSuDungDichVus() {
		return suDungDichVus;
	}

	public void setSuDungDichVus(Set<SuDungDichVu> suDungDichVus) {
		this.suDungDichVus = suDungDichVus;
	}

	public int getMaKH() {
		return MaKH;
	}

	public void setMaKH(int maKH) {
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

	public KhachHang() {
	}

	public KhachHang(int maKH, String tenKH, String diaChi, String soDienThoai, String diaChiEmail) {
		super();
		MaKH = maKH;
		TenKH = tenKH;
		DiaChi = diaChi;
		SoDienThoai = soDienThoai;
		DiaChiEmail = diaChiEmail;
	}

	@Override
	public String toString() {
		return "KhachHang [MaKH=" + MaKH + ", TenKH=" + TenKH + ", DiaChi=" + DiaChi + ", SoDienThoai=" + SoDienThoai
				+ ", DiaChiEmail=" + DiaChiEmail + "]";
	}	
		
	
}
