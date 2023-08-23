package blog.com.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import blog.com.model.entity.BlogEntity;

public interface BlogDao extends JpaRepository<BlogEntity, Long> {
	List<BlogEntity> findByAccountId(Long accountId);

	BlogEntity save(BlogEntity blogEntity);
}
