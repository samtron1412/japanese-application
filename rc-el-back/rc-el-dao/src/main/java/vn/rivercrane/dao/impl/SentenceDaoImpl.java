package vn.rivercrane.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.support.JpaDaoSupport;
import org.springframework.stereotype.Repository;

import vn.rivercrane.dao.SentenceDao;
import vn.rivercrane.entity.Sentence;


@Repository("SentenceDao")
public class SentenceDaoImpl extends JpaDaoSupport implements SentenceDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	public SentenceDaoImpl(EntityManagerFactory entityManagerFactory) {
		super.setEntityManagerFactory(entityManagerFactory);
	}

	protected final EntityManager getEntityManager() {
		return entityManager;
	}

	public List<Sentence> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public Sentence save(Sentence entity) {
		if (entity.getSentenceId() > 0) {
			return getEntityManager().merge(entity);
		} else {
			getEntityManager().persist(entity);
			return entity;
		}
	}

	public Sentence findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Sentence entity) {
		// TODO Auto-generated method stub
		
	}
}
