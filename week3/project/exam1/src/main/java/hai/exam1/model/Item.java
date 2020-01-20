
package hai.exam1.model;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int quantity;
    private Long price;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Item(Long id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    public Item() {
    }
    public Item(Product product,int quantity) {
        this.product = product;
        this.quantity=quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
