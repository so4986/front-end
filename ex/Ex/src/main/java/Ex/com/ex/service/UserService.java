package Ex.com.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.graphql.security.GraphQlWebFluxSecurityAutoConfiguration;
import org.springframework.stereotype.Service;

import Ex.com.ex.model.dao.UserDao;
import Ex.com.ex.model.entity.UserEntity;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	// ユーザーの情報保存
	public boolean createAccount(String accountName, String accountEmail, String password) {
		// ユーザー情報（ユーザーメールアドレス）を条件にDB検索で検索する
		UserEntity userLest = userDao.findByAccountEmail(accountEmail);
		// ユーザ情報（ユーザ名、パスワード）を条件にDB検索で検索した結果
		// なかった場合には、保存
		if (userLest == null) {
			userDao.save(new UserEntity(accountName, accountEmail, password));
			return true;
		} else {
			return false;
		}
	}
	
	public UserEntity loginAccount(String AccountEmail,String passrord) {
		UserEntity userEntity= userDao.findByAccountEmailAndPassword(AccountEmail,Password);
		
		if(userEntity==null) {
			return null;
		}else {
			return userEntity;
		}
	}
		
}
