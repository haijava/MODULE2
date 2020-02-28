package hai.exam1.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "receiptItems")
public class ReceiptItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long receiptItemId;
    private Long price;
    private Long quantity;
    @ManyToOne
    @JoinColumn(name = "receipt_id")
    private Receipt receipt;

    public Long getReceiptItemId() {
        return receiptItemId;
    }

    public void setReceiptItemId(Long receiptItemId) {
        this.receiptItemId = receiptItemId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
