package hai.exam1.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class ProductUpload {
    private Long productId;
    private String name;
    private Long price;
    private Long priceSale;
    private String image;
    private String imageone;

    public String getImageone() {
        return imageone;
    }

    public void setImageone(String imageone) {
        this.imageone = imageone;
    }

    public Long getPriceSale() {
     return priceSale;
    }

    public void setPriceSale(Long priceSale) {
        this.priceSale = priceSale;
    }

    private String description;
    private  String status;
    private CommonsMultipartFile[] fileDatas;
    private Category category;

    public ProductUpload() {
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CommonsMultipartFile[] getFileDatas() {
        return fileDatas;
    }

    public void setFileDatas(CommonsMultipartFile[] fileDatas) {
        this.fileDatas = fileDatas;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }



}
