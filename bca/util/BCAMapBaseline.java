package bca.util;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BCAMapBaseline<K,V> implements BCAMap<K,V> {
    protected Map<K, V> m = new HashMap<K, V>();

    @Override
    public int size() {
        return m.size();
    }

    @Override
    public boolean isEmpty() {
        return m.isEmpty();
    }

    @Override
    public boolean containsKey(K key) {
        return m.containsKey(key);
    }

    @Override
    public boolean containsValue(V value) {
        return m.containsValue(value);
    }

    @Override
    public V get(K key) {
        return m.get(key);
    }

    @Override
    public V getOrDefault(K key, V defaultValue) {
        return m.getOrDefault(key, defaultValue);
    }

    @Override
    public V put(K key, V value) {
        if (key == null || value == null)
            throw new NullPointerException();
        return m.put(key, value);
    }

    @Override
    public V remove(K key) {
        return m.remove(key);
    }

    @Override
    public void clear() {
        m.clear();
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return m.entrySet();
    }

    @Override
    public Set<K> keySet() {
        return m.keySet();
    }

   
}
