package com.fashion_point.pojos;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String title;
	
	private String description;
	
	private int price;
	
	@Column(name="discounted_price")
	private int discountedPrice;
	
	@Column(name="discounted_percent")
	private int discountPercent;
	
	private int quantity;
	
	private String brand;
	
	private String color;
	
	@Embedded
	@ElementCollection(fetch = FetchType.EAGER)
	@Column(name="sizes")
	
	private Set<Size>sizes=new HashSet<>();
	
	@Column(name="image_src")
	private String imageSrc;
	
	@Column(name="num_ratings")
	private int numRatings;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="category_id")
	private Category category;
	
	private LocalDateTime createdAt;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(Long id, String title, String description, int price, int discountedPrice, int discountPercent,
			int quantity, String brand, String color, Set<Size> sizes, String imageSrc, int numRatings,
			Category category, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.discountedPrice = discountedPrice;
		this.discountPercent = discountPercent;
		this.quantity = quantity;
		this.brand = brand;
		this.color = color;
		this.sizes = sizes;
		this.imageSrc = imageSrc;
		this.numRatings = numRatings;
		this.category = category;
		this.createdAt = createdAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(int discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Set<Size> getSizes() {
		return sizes;
	}

	public void setSizes(Set<Size> sizes) {
		this.sizes = sizes;
	}

	public String getImageSrc() {
		return imageSrc;
	}

	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}

	public int getNumRatings() {
		return numRatings;
	}

	public void setNumRatings(int numRatings) {
		this.numRatings = numRatings;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	
	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", description=" + description + ", price=" + price
				+ ", discountedPrice=" + discountedPrice + ", discountPercent=" + discountPercent + ", quantity="
				+ quantity + ", brand=" + brand + ", color=" + color + ", sizes=" + sizes + ", imageSrc=" + imageSrc
				+ ", numRatings=" + numRatings + ", category=" + category + ", createdAt=" + createdAt + "]";
	}
	
	
	
	
	

}
