package vn.rivercrane.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.support.JpaDaoSupport;
import org.springframework.stereotype.Repository;

import vn.rivercrane.dao.ParagraphDao;
import vn.rivercrane.entity.Paragraph;


@Repository("paragraphDao")
public class ParagraphDaoImpl extends JpaDaoSupport implements ParagraphDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	public ParagraphDaoImpl(EntityManagerFactory entityManagerFactory) {
		super.setEntityManagerFactory(entityManagerFactory);
	}

	protected final EntityManager getEntityManager() {
		return entityManager;
	}

	public List<Paragraph> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public Paragraph save(Paragraph entity) {
		if (entity.getParagraphId() > 0) {
			return getEntityManager().merge(entity);
		} else {
			getEntityManager().persist(entity);
			return entity;
		}
	}

	public Paragraph findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Paragraph entity) {
		// TODO Auto-generated method stub
		
	}
}
