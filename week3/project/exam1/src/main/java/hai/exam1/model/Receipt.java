package hai.exam1.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "receipt")
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long receiptId;
    private Long amountTotal;



    @OneToMany(mappedBy = "receipt")
    Set<ReceiptItem> receiptItems;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    public Receipt() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Long receiptId) {
        this.receiptId = receiptId;
    }

    public Set<ReceiptItem> getReceiptItems() {
        return receiptItems;
    }

    public void setReceiptItems(Set<ReceiptItem> receiptItems) {
        this.receiptItems = receiptItems;
    }

    public Long getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(Long amountTotal) {
        this.amountTotal = amountTotal;
    }
}
