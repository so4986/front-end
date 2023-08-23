package Ex.com.ex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ex.com.ex.model.dao.AccountDao;
import Ex.com.ex.model.entity.AccountEntity;

@Service
public class AccountService {
	@Autowired
	private AccountDao accountDao;

	// ユーザーの情報保存
	public boolean createAccount(String accountName, String accountEmail, String password) {
		// ユーザー情報（ユーザーメールアドレス）を条件にDB検索で検索する
		AccountEntity accountLest = accountDao.findByAccountEmail(accountEmail);
		// ユーザ情報（ユーザ名、パスワード）を条件にDB検索で検索した結果
		// なかった場合には、保存
		if (accountLest == null) {
			accountDao.save(new AccountEntity(accountName, accountEmail, password));
			return true;
		} else {
			return false;
		}
	}
	
	public AccountEntity loginAccount(String accountEmail,String password) {
		AccountEntity account= accountDao.findByAccountEmailAndPassword(accountEmail,password);
		 
		if(account==null) {
			return null;
		}else {
			return account;
		}
	}
		
}
