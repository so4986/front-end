package Ex.com.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ex.com.ex.model.dao.BlogDao;
import Ex.com.ex.model.entity.BlogEntity;

@Service
public class BlogService {
	@Autowired
	private BlogDao blogDao;
	public List<BlogEntity> selectAll(Long accountId){
		if(accountId==null) {
			return null;
		}else {
			return blogDao.findAll();
			}
	}
	
	
}
