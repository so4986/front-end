package blog.com.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import blog.com.model.entity.AccountEntity;

@Repository
public interface AccountDao extends JpaRepository<AccountEntity, Long> {
	// ユーザー情報にDB保存
	AccountEntity save(AccountEntity accountEntity);

	// ユーザー情報(メールアドレス)DB検索
	AccountEntity findByAccountEmail(String accountEmail);

	AccountEntity findByAccountEmailAndPassword(String accountEmail, String password);

}