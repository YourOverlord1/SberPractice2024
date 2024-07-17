package rest.spring.base;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rest.spring.model.Basket;
import rest.spring.model.Client;
import java.util.HashMap;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BaseData<S, T> {
    private HashMap<S, T> storage = new HashMap<>();
    private Integer Holder = 0;

    public void setStorage(S s, T t) {
        this.storage.put(s, t);
    }

    public void remove(S s){
        this.storage.remove(s);
    }

    public T get(S s){
        return this.storage.get(s);
    }

    public HashMap<S, T> getAll(){
        return this.storage;
    }
}