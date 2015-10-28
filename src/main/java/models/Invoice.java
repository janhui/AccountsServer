package models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by josekalladanthyil on 27/10/15.
 */
@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    private String companyName;
    @Column(name="created_at", nullable=false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    private double amount;
    private String category;

    public Invoice(String companyName, double amount, String category) {
        this.companyName = companyName;
        this.amount = amount;
        this.category = category;
        this.createdAt = new Date();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getId() {
        return id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
