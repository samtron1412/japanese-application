package vn.rivercrane.dao;

import java.util.List;

import vn.rivercrane.entity.Paragraph;


public interface ParagraphDao {
	List<Paragraph> findAll();
	Paragraph save(Paragraph entity);
	Paragraph findById(Long id);
	void delete(Paragraph entity);
	
}
