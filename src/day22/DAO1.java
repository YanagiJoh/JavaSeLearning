package day22;

import java.util.*;

public class DAO1<T> {

    private Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        if (map.containsKey(id)) {
            map.put(id, entity);
        }
    }

    public void delete(String id) {
        map.remove(id);
    }

    public List<T> list() {
//        Collection<T> values = map.values();
//        return (List<T>) values;

        ArrayList<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for(T t : values){
            list.add(t);
        }
        return list;
    }
}
