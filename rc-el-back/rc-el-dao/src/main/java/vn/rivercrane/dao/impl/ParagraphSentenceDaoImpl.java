package vn.rivercrane.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.support.JpaDaoSupport;
import org.springframework.stereotype.Repository;

import vn.rivercrane.dao.ParagraphSentenceDao;
import vn.rivercrane.entity.ParagraphSentence;


@Repository("ParagraphSentenceDao")
public class ParagraphSentenceDaoImpl extends JpaDaoSupport implements ParagraphSentenceDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	public ParagraphSentenceDaoImpl(EntityManagerFactory entityManagerFactory) {
		super.setEntityManagerFactory(entityManagerFactory);
	}

	protected final EntityManager getEntityManager() {
		return entityManager;
	}

	public List<ParagraphSentence> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public ParagraphSentence save(ParagraphSentence entity) {
		if (entity.getParagraphSentenceId() > 0) {
			return getEntityManager().merge(entity);
		} else {
			getEntityManager().persist(entity);
			return entity;
		}
	}

	public ParagraphSentence findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(ParagraphSentence entity) {
		// TODO Auto-generated method stub
		
	}
}
