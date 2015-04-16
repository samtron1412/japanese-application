package vn.rivercrane.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import vn.rivercrane.dao.ParagraphSentenceDao;
import vn.rivercrane.entity.ParagraphSentence;
import vn.rivercrane.service.ParagraphSentenceService;


@Service( "ParagraphSentenceService" )
public class ParagraphSentenceServiceImpl implements ParagraphSentenceService {
	
	@Autowired
	ParagraphSentenceDao ParagraphSentenceDao;
	
   @Autowired
   public ParagraphSentenceServiceImpl(@Qualifier("ParagraphSentenceDao") ParagraphSentenceDao ParagraphSentenceDao){
      this.ParagraphSentenceDao = ParagraphSentenceDao;
   }
	public List<ParagraphSentence> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ParagraphSentence save(ParagraphSentence entity) {
		// TODO Auto-generated method stub
		return ParagraphSentenceDao.save(entity);
	}

	public ParagraphSentence findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(ParagraphSentence entity) {
		// TODO Auto-generated method stub
		
	}
	
}
