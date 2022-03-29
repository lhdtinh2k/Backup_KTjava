package fpt.fa.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "May")
public class May {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="MaMay")
	private int MaMay;
	
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	@Length(min = 4, message = "Chuỗi phải lớn hơn 4 ký tự")
	private String ViTri;
	
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	@Length(min = 4, message = "Chuỗi phải lớn hơn 4 ký tự")
	private String TrangThai;

	
	
	@OneToMany(mappedBy = "MaMay", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SuDungMay> suDungMays;
		
	public Set<SuDungMay> getSuDungMays() {
		return suDungMays;
	}

	public void setSuDungMays(Set<SuDungMay> suDungMays) {
		this.suDungMays = suDungMays;
	}

	public int getMaMay() {
		return MaMay;
	}

	public void setMaMay(int maMay) {
		MaMay = maMay;
	}

	public String getViTri() {
		return ViTri;
	}

	public void setViTri(String viTri) {
		ViTri = viTri;
	}

	public String getTrangThai() {
		return TrangThai;
	}

	public void setTrangThai(String trangThai) {
		TrangThai = trangThai;
	}

	public May() {
	}

	public May(int maMay, String viTri, String trangThai) {
		super();
		MaMay = maMay;
		ViTri = viTri;
		TrangThai = trangThai;
	}

	@Override
	public String toString() {
		return "May [MaMay=" + MaMay + ", ViTri=" + ViTri + ", TrangThai=" + TrangThai + "]";
	}
	
	
}
