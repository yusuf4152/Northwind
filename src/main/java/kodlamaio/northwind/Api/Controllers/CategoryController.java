package kodlamaio.northwind.Api.Controllers;

import kodlamaio.northwind.Business.Concretes.CategoryManager;
import kodlamaio.northwind.Core.utilities.results.Result;
import kodlamaio.northwind.Entities.Concretes.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryManager categoryManager;

   @PostMapping("add")
    public Result add(@RequestBody Category category){
    return  this.categoryManager.add(category);
    }
}
