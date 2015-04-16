package vn.rivercrane.service;

import java.util.List;

import vn.rivercrane.entity.ParagraphSentence;

public interface ParagraphSentenceService {
	
	List<ParagraphSentence> findAll();

	ParagraphSentence save(ParagraphSentence entity);

	ParagraphSentence findById(Long id);

	void delete(ParagraphSentence entity);
}
