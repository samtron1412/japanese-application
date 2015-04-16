package vn.rivercrane.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import vn.rivercrane.dao.SentenceDao;
import vn.rivercrane.entity.Sentence;
import vn.rivercrane.service.SentenceService;


@Service( "SentenceService" )
public class SentenceServiceImpl implements SentenceService {
	
	@Autowired
	SentenceDao SentenceDao;
	
   @Autowired
   public SentenceServiceImpl(@Qualifier("SentenceDao") SentenceDao SentenceDao){
      this.SentenceDao = SentenceDao;
   }
	public List<Sentence> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Sentence save(Sentence entity) {
		// TODO Auto-generated method stub
		return SentenceDao.save(entity);
	}

	public Sentence findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Sentence entity) {
		// TODO Auto-generated method stub
		
	}
	
}
