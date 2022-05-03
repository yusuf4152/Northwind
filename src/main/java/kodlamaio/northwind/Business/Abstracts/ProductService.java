package kodlamaio.northwind.Business.Abstracts;

import kodlamaio.northwind.Core.utilities.results.DataResult;
import kodlamaio.northwind.Core.utilities.results.Result;
import kodlamaio.northwind.Entities.Concretes.Product;
import kodlamaio.northwind.Entities.dtos.ProductWithDetailsDto;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();
    DataResult<List<Product>> getAllBySortUnitPrice();
    Result add(Product product);
    DataResult <List<Product>>getByProductName(String productName);
    DataResult <Product> getByProductNameAndCategoryId(String productName,int categoryId);
    DataResult  <List<Product>> getByProductNameOrCategory(String productName,int CategoryId);
    DataResult  <List<Product>> getByProductNameContains(String productName);
    DataResult  <List<Product> >getByCategoryIn(List<Integer> categories);
    DataResult  <List<Product>> getByNameAndCategory(String name,int categoryId);
    DataResult <List<ProductWithDetailsDto>> getProductWithDetails();
}
