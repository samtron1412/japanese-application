package vn.rivercrane.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import vn.rivercrane.dao.ParagraphDao;
import vn.rivercrane.entity.Paragraph;
import vn.rivercrane.service.ParagraphService;


@Service( "paragraphService" )
public class ParagraphServiceImpl implements ParagraphService {
	
	@Autowired
	ParagraphDao paragraphDao;
	
   @Autowired
   public ParagraphServiceImpl(@Qualifier("paragraphDao") ParagraphDao paragraphDao){
      this.paragraphDao = paragraphDao;
   }
	public List<Paragraph> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Paragraph save(Paragraph entity) {
		// TODO Auto-generated method stub
		return paragraphDao.save(entity);
	}

	public Paragraph findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Paragraph entity) {
		// TODO Auto-generated method stub
		
	}
	
}
