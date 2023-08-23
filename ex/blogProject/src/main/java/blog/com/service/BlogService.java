package blog.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blog.com.model.dao.BlogDao;
import blog.com.model.entity.BlogEntity;

@Service
public class BlogService {
	@Autowired
	private BlogDao blogDao;

	public List<BlogEntity> selectAll(Long accountId) {
		if (accountId == null) {
			return null;
		} else {
			return blogDao.findAll();
		}
	}

	// 保存処理
	public boolean createBlog(String blogTitle, String categoryName, String blogImage, String article, Long accountId) {
		// もしログインしている人のIDが存在しなかったら保存させない
		if (accountId == null) {
			return false;
		} else {
			blogDao.save(new BlogEntity(blogTitle, categoryName, blogImage, article, accountId));
			return true;
		}

	}

}
