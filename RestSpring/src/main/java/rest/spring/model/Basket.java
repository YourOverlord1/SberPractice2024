package rest.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Basket {
    private long id;
    private int promocode;
    private String name;
    private ArrayList<Product> products;
}