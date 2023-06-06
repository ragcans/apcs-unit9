package bca.util;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;


// Starter code for BCAHashMap
public class BCAHashMap<K, V> implements BCAMap<K, V> {

	protected LinkedList<Entry<K, V>> buckets[] = null;

	@SuppressWarnings("unchecked")
	public BCAHashMap(int numBuckets) {
		// TODO
        // instantiate buckets using numBuckets
        // fill each bucket with an empty LinkedList
	}

	@Override
	public boolean containsKey(K key) {
        // TODO
        return false;
    }

	@Override
	public boolean containsValue(V value) {
		if (value == null) {
			throw new NullPointerException("value cannot be null!");
		}

        // TODO

		return false;
	}

	@Override
	public V get(K key) {
        // TODO
		return null;
	}

	@Override
	public V getOrDefault(K key, V defaultValue) {
		if (key == null) {
			throw new NullPointerException("key cannot be null!");
		}

		// TODO
		return null;
	}

	@Override
	public V put(K key, V value) {
		if (key == null) {
			throw new NullPointerException("key cannot be null!");
		}
		if (value == null) {
			throw new NullPointerException("value cannot be null!");
		}

		// TODO
		return null;
	}

	@Override
	public V remove(K key) {
		if (key == null) {
			throw new NullPointerException("key cannot be null!");
		}

		// TODO
		return null;
	}

	@Override
	public void clear() {
		// TODO
	}

	public boolean isEmpty() {
		// TODO
		return true;
	}

	public int size() {
		// TODO
		return 0;
	}

	public Set<Entry<K, V>> entrySet() {
		// TODO
		return null;
	}

	/**
	 * Returns a set containing the keys in the map.
	 */
	public Set<K> keySet() {
		// TODO
		return null;
	}
}
