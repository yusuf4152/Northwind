package kodlamaio.northwind.Api.Controllers;
import kodlamaio.northwind.Business.Abstracts.ProductService;
import kodlamaio.northwind.Core.utilities.results.DataResult;
import kodlamaio.northwind.Core.utilities.results.Result;
import kodlamaio.northwind.Entities.Concretes.Product;
import kodlamaio.northwind.Entities.dtos.ProductWithDetailsDto;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductControllers {

    private final ProductService productService;

    public ProductControllers(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Product>> getAll(){
        return this.productService.getAll();
    }
    @PostMapping("/add")
    // request body burda ekleme yaparken bizim entitydeki fieldlarla gelen data nın filedlarını eşler
    public Result add(@RequestBody Product product){
        return  this.productService.add(product);
    }
    @GetMapping("/getByProductName")
    public DataResult<List<Product>> getByProductName(@RequestParam String productName){
        return this.productService.getByProductName(productName);
    }
    @GetMapping("getByProductNameAndCategoryId")
    public DataResult<Product> getByProductNameAndCategoryId(@RequestParam String productName,@RequestParam int categoryId){
        return this.productService.getByProductNameAndCategoryId(productName,categoryId);
    }
    @GetMapping("getAllBySortUnitPrice")
    public DataResult<List<Product>> getAllBySortUnitPrice() {
        return this.productService.getAllBySortUnitPrice();
    }
    @GetMapping("getProductWithDetails")
    DataResult <List<ProductWithDetailsDto>> getProductWithDetails(){
        return this.productService.getProductWithDetails();
    }
}











