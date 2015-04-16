package vn.rivercrane.dao;

import java.util.List;

import vn.rivercrane.entity.ParagraphSentence;


public interface ParagraphSentenceDao {
	List<ParagraphSentence> findAll();
	ParagraphSentence save(ParagraphSentence entity);
	ParagraphSentence findById(Long id);
	void delete(ParagraphSentence entity);
	
}
