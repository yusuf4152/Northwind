package kodlamaio.northwind.Business.Concretes;

import kodlamaio.northwind.Core.utilities.results.Result;
import kodlamaio.northwind.Core.utilities.results.SuccessResult;
import kodlamaio.northwind.DataAccess.Abstracts.CategoryDao;
import kodlamaio.northwind.Entities.Concretes.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryManager {
   private final CategoryDao categoryDao;

    public Result add(Category category){
        this.categoryDao.save(category);
        return  new SuccessResult("data eklendi");
    }
}
