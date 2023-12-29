package com.devJava.courseSpring1.entites;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
@Entity
@Table(name = "tb_product")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String descriprion;
	private Double price;
	private String imgUrl;
	// usamos o Set para por conta dele não permitir a repetição de valores
	@Transient
	private Set<Category> categories = new HashSet<>();
	public Product(long id, String name, String descriprion, Double price, String imgUrl) {
		super();
		this.id = id;
		this.name = name;
		this.descriprion = descriprion;
		this.price = price;
		this.imgUrl = imgUrl;
	}
	public Product() {
		super();
	}
	public Product(String name, String descriprion, Double price, String imgUrl) {
		super();
		this.name = name;
		this.descriprion = descriprion;
		this.price = price;
		this.imgUrl = imgUrl;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescriprion() {
		return descriprion;
	}
	public void setDescriprion(String descriprion) {
		this.descriprion = descriprion;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", descriprion=" + descriprion + ", price=" + price
				+ ", imgUrl=" + imgUrl + "]";
	}
	
	
}
