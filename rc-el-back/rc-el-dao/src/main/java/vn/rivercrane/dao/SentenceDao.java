package vn.rivercrane.dao;

import java.util.List;

import vn.rivercrane.entity.Sentence;


public interface SentenceDao {
	List<Sentence> findAll();
	Sentence save(Sentence entity);
	Sentence findById(Long id);
	void delete(Sentence entity);
	
}
