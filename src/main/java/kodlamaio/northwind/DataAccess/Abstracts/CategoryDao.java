package kodlamaio.northwind.DataAccess.Abstracts;

import kodlamaio.northwind.Entities.Concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category,Integer> {
}
