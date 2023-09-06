package pxu.com.model;

public class Mobile {
	private Long id;
	private String name;
	private String brandName;
	private String image;

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Mobile(Long id, String name, String brandName, String image) {
		super();
		this.id = id;
		this.name = name;
		this.brandName = brandName;
		this.image = image;
	}

	public Mobile() {
		super();
	}
}
