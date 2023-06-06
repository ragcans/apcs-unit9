package bca.util;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class BCAMapByArrayList<K,V> implements BCAMap<K,V> {

	protected ArrayList<Entry<K, V>> list = new ArrayList<>();

	@Override
	public boolean containsKey(K key) {

		return getOrDefault(key, null) != null;
	}

	@Override
	public boolean containsValue(V value) {
		if (value == null) {
			throw new NullPointerException("value cannot be null!");
		}

		for (Entry<K, V> e : list) {
			if (e.getValue().equals(value)) {
				return true;
			}
		}

		return false;
	}

	@Override
	public V get(K key) {
		return getOrDefault(key, null);
	}

	@Override
	public V getOrDefault(K key, V defaultValue) {
		if (key == null) {
			throw new NullPointerException("key cannot be null!");
		}

		for (Entry<K, V> e : list) {
			if (e.getKey().equals(key)) {
				return e.getValue();
			}
		}

		return defaultValue;
	}

	@Override
	public V put(K key, V value) {
		if (key == null) {
			throw new NullPointerException("key cannot be null!");
		}
		if (value == null) {
			throw new NullPointerException("value cannot be null!");
		}

		for (Entry<K, V> e : list) {
			if (e.getKey().equals(key)) {
				V o = e.getValue();
				e.setValue(value);
				return o;
			}
		}

		list.add(new SimpleEntry<K, V>(key, value));
		return null;
	}

	@Override
	public V remove(K key) {
		if (key == null) {
			throw new NullPointerException("key cannot be null!");
		}

		for (int i = 0; i < list.size(); i++) {
			Entry<K,V> e = list.get(i);
			if (e.getKey().equals(key)) {
				list.remove(i);
				return e.getValue();
			}
		}

		return null;
	}

	@Override
	public void clear() {
		list.clear();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int size() {
		return list.size();
	}

	public Set<Entry<K, V>> entrySet() {
		Set<Entry<K, V>> entries = new HashSet<>();
		for (Entry<K, V> e : list) {
			entries.add(new SimpleEntry<K, V>(e));
		}
		return entries;
	}

	/**
	 * Returns a set containing the keys in the map.
	 */
	public Set<K> keySet() {
		HashSet<K> keys = new HashSet<>();
		for (Entry<K, V> e : list) {
			keys.add(e.getKey());
		}
		return keys;
	}
}
