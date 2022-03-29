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
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "DichVu")
public class DichVu {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int MaDV;
	
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	@Length(min = 4, message = "Chuỗi phải lớn hơn 4 ký tự")
	private String TenDV;
	
	@Column(nullable = true)
	@Length(min = 4, message = "Chuỗi phải lớn hơn 4 ký tự")
	private String DonViTinh;

	@Column(nullable = true)
	@Min(value = 18, message = "Tuổi không được nhỏ hơn {value}")
	private double DonGia;

	@OneToMany(mappedBy = "MaDV", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SuDungDichVu> suDungDichVus;
	


	public Set<SuDungDichVu> getSuDungDichVus() {
		return suDungDichVus;
	}

	public void setSuDungDichVus(Set<SuDungDichVu> suDungDichVus) {
		this.suDungDichVus = suDungDichVus;
	}

	public int getMaDV() {
		return MaDV;
	}

	public void setMaDV(int maDV) {
		MaDV = maDV;
	}

	public String getTenDV() {
		return TenDV;
	}

	public void setTenDV(String tenDV) {
		TenDV = tenDV;
	}

	public String getDonViTinh() {
		return DonViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		DonViTinh = donViTinh;
	}

	public double getDonGia() {
		return DonGia;
	}

	public void setDonGia(double donGia) {
		DonGia = donGia;
	}

	public DichVu(int maDV, String tenDV, String donViTinh, double donGia) {
		super();
		MaDV = maDV;
		TenDV = tenDV;
		DonViTinh = donViTinh;
		DonGia = donGia;
	}

	public DichVu() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DichVu [MaDV=" + MaDV + ", TenDV=" + TenDV + ", DonViTinh=" + DonViTinh + ", DonGia=" + DonGia + "]";
	}

	public DichVu(int maDV, @Length(min = 4, message = "Chuỗi phải lớn hơn 4 ký tự") String tenDV,
			@Length(min = 4, message = "Chuỗi phải lớn hơn 4 ký tự") String donViTinh,
			@Min(value = 18, message = "Tuổi không được nhỏ hơn {value}") double donGia,
			Set<SuDungDichVu> suDungDichVus) {
		super();
		MaDV = maDV;
		TenDV = tenDV;
		DonViTinh = donViTinh;
		DonGia = donGia;
		this.suDungDichVus = suDungDichVus;
	}

	
	
}
