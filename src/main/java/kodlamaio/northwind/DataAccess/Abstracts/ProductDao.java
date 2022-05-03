package kodlamaio.northwind.DataAccess.Abstracts;

import kodlamaio.northwind.Entities.Concretes.Product;
import kodlamaio.northwind.Entities.dtos.ProductWithDetailsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {
    List<Product> getByProductName(String productName);

    Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);

    List<Product> getByProductNameOrCategory(String productName, int CategoryId);

    List<Product> getByProductNameContains(String productName);

    List<Product> getByCategoryIn(List<Integer> categories);

    @Query("from Product where productName=:name and category.categoryId=:categoryId")
    List<Product> getByNameAndCategory(String name, int categoryId);
    @Query("select new kodlamaio.northwind.Entities.dtos.ProductWithDetailsDto(p.id,p.productName,c.categoryName) from Category c inner join c.products p")
     //                                                                                                             kategori ve kategoriyle ilişkilendirilmiş productlardan çek
    List<ProductWithDetailsDto> getProductWithDetails();

}
