package vn.rivercrane.service;

import java.util.List;

import vn.rivercrane.entity.Sentence;

public interface SentenceService {
	
	List<Sentence> findAll();

	Sentence save(Sentence entity);

	Sentence findById(Long id);

	void delete(Sentence entity);
}
