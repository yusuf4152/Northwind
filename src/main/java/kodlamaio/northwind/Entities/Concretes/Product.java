package kodlamaio.northwind.Entities.Concretes;
import lombok.Data;
import javax.persistence.*;
@Data
@Entity
// sen bir entitysin dedim
@Table(name = "products")
// veritabanındaki tablo karşılığın productslar dedim
public class Product {
    @Id
    // jpa nın kullanıcagı ıd sensin dedim
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // id 1 1 artacak dedim
    @Column(name = "product_id")
    // ve senin veritabanındaki kolon adın prduct id dedim
    private int id;
/*
    @Column(name = "category_id")
    private int categoryId;
*/
    @Column (name ="product_name")
    private String productName;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "units_in_stock")
    private short unitsInStock;

    @Column(name = "quantity_per_unit")
    private String quantityPerUnit;
    @ManyToOne
    @JoinColumn( name="category_id")
    // kategorilerde bağlanacağı kolonun adı
    private Category category;
}

