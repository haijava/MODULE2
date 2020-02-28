package hai.exam1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long price;
    private Long priceSale;
    private String image;


    public Long getPriceSale() {
        return priceSale;
    }
    public void setPriceSale(Long priceSale) {
        this.priceSale = priceSale;
    }

    private  String description;
    private String status;

    @OneToOne(mappedBy = "product")
   /* @JsonIgnore*/
    private Item item;

    public ReceiptItem getReceiptItem() {
        return receiptItem;
    }

    public void setReceiptItem(ReceiptItem receiptItem) {
        this.receiptItem = receiptItem;
    }

    @OneToOne(mappedBy = "product")
    /* @JsonIgnore*/
    private ReceiptItem receiptItem;

    @OneToOne(mappedBy = "product")
    /* @JsonIgnore*/
    private ImageSlide imageSlide;


    @OneToMany(mappedBy = "product")
    Set<ImageView> imageViews;

    public Set<ImageView> getImageViews() {
        return imageViews;
    }

    public void setImageViews(Set<ImageView> imageViews) {
        this.imageViews = imageViews;
    }

    public ImageSlide getImageSlide() {
        return imageSlide;
    }

    public void setImageSlide(ImageSlide imageSlide) {
        this.imageSlide = imageSlide;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CommonsMultipartFile[] getFileDatas() {
        return fileDatas;
    }

    public void setFileDatas(CommonsMultipartFile[] fileDatas) {
        this.fileDatas = fileDatas;
    }

    @Transient
    private CommonsMultipartFile[] fileDatas;

    @ManyToOne
    @JoinColumn(name = "category_id")
/*    @JsonIgnore*/
    private Category category;

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

    public Product(){}

    public Long getId() {
        return id;
    }

    public void setId(Long productId) {
        this.id = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


}
