package kodlamaio.northwind.Entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithDetailsDto {
    private int id;
    private String productName;
    private  String categoryName;
}
