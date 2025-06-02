package Product;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product<T>{
    private String item;
    private T name;

    @Override
    public String toString() {
        return item + name;
    }
}
