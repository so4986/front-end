package Ex.com.ex.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Ex.com.ex.model.entity.UserEntity;

@Repository
public interface UserDao extends JpaRepository<UserEntity, Long> {
	//ユーザー情報(メールアドレス)DB検索
	UserEntity findByAccountEmail(String AccountEmail);
	//ユーザー情報にDB保存
	UserEntity save(UserEntity userEntity);
	//ユーザー情報を取得
	List<UserEntity> findAll();
}