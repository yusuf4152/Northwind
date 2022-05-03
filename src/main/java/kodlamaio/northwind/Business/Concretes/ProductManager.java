package kodlamaio.northwind.Business.Concretes;

import kodlamaio.northwind.Business.Abstracts.ProductService;
import kodlamaio.northwind.Core.utilities.results.DataResult;
import kodlamaio.northwind.Core.utilities.results.Result;
import kodlamaio.northwind.Core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.Core.utilities.results.SuccessResult;
import kodlamaio.northwind.DataAccess.Abstracts.ProductDao;
import kodlamaio.northwind.Entities.Concretes.Product;
import kodlamaio.northwind.Entities.dtos.ProductWithDetailsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductManager implements ProductService {
    private ProductDao productDao;
    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public DataResult<List<Product>>getAll() {
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "hello");
    }

    @Override
    public DataResult<List<Product>> getAllBySortUnitPrice() {
        Sort sort= Sort.by(Sort.Direction.ASC,"unitPrice");
        return new SuccessDataResult<List<Product>>( this.productDao.findAll(sort),"data listelendi");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("data girildi");
    }

    @Override
    public DataResult<List<Product>> getByProductName(String productName) {
        return new SuccessDataResult<>(this.productDao.getByProductName(productName),"data listelendi");
    }

    @Override
    public DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {

        return new SuccessDataResult<Product>(this.productDao.getByProductNameAndCategory_CategoryId(productName,categoryId),"data listelendi");
    }

    @Override
    public DataResult<List<Product>> getByProductNameOrCategory(String productName, int CategoryId) {
        return null;
    }

    @Override
    public DataResult<List<Product>> getByProductNameContains(String productName) {
        return null;
    }

    @Override
    public DataResult<List<Product>> getByCategoryIn(List<Integer> categories) {
        return null;
    }

    @Override
    public DataResult<List<Product>> getByNameAndCategory(String name, int categoryId) {
        return null;
    }

    @Override
    public DataResult<List<ProductWithDetailsDto>> getProductWithDetails() {
        return new SuccessDataResult<>(this.productDao.getProductWithDetails(),"data listelendi");
    }
}
