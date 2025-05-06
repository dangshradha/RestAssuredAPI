package api.payload;

//POJO class for Products API
public class Product {
		private String title;
	    private int price;
	    private String description;
	    private String image;
	    private String category;
	    public Product(String title,int price,String description,String image,String category){
	        this.title=title;
	        this.price=price;
	        this.description=description;
	        this.image=image;
	        this.category=category;
	    }
	
	    public String getTitle() {
	        return title;
	    }
	
	    public void setTitle(String title) {
	        this.title = title;
	    }
	
	    public int getPrice() {
	        return price;
	    }
	
	    public void setPrice(int price) {
	        this.price = price;
	    }
	
	    public String getDescription() {
	        return description;
	    }
	
	    public void setDescription(String description) {
	        this.description = description;
	    }
	
	    public String getImage() {
	        return image;
	    }
	
	    public void setImage(String image) {
	        this.image = image;
	    }
	
	    public String getCategory() {
	        return category;
	    }
	
	    public void setCategory(String category) {
	        this.category = category;
	    }
}
	
	
