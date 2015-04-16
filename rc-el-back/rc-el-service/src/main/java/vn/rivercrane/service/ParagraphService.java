package vn.rivercrane.service;

import java.util.List;

import vn.rivercrane.entity.Paragraph;

public interface ParagraphService {
	
	List<Paragraph> findAll();

	Paragraph save(Paragraph entity);

	Paragraph findById(Long id);

	void delete(Paragraph entity);
}
