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

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "KhachHang")
public class KhachHang {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int MaKH;
	
	
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	@Length(min = 4, message = "Chuỗi phải lớn hơn 4 ký tự")
	private String TenKH;
	
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	@Length(min = 4, message = "Chuỗi phải lớn hơn 4 ký tự")
	private String DiaChi;

	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	private String SoDienThoai;
	
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	private String DiaChiEmail;

	@OneToMany(mappedBy = "MaKH", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SuDungDichVu> suDungDichVus;
	
	@OneToMany(mappedBy = "MaKH", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SuDungMay> suDungMays;

	
	public Set<SuDungMay> getSuDungMays() {
		return suDungMays;
	}

	public void setSuDungMays(Set<SuDungMay> suDungMays) {
		this.suDungMays = suDungMays;
	}

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
