package com.msz.repositories;

import java.util.List;
import java.util.Map;

public interface RepositoryInterface<K, T> {
	public String save(K key, T obj);

	public Map<K, T> findAll();

	public List<T> findById(K id);
}
