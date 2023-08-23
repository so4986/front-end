package blog.com.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "account")
public class AccountEntity {
	@Id
	@Column(name = "account_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long accountId;

	@Column(name = "account_name")
	private String accountName;

	@Column(name = "account_email")
	private String accountEmail;

	@Column(name = "password")
	private String password;

	public AccountEntity() {

	}

	public AccountEntity(String accountName, String accountEmail, String password) {
		this.accountName = accountName;
		this.accountEmail = accountEmail;
		this.password = password;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountEmail() {
		return accountEmail;
	}

	public void setAccountEmail(String accountEmail) {
		this.accountEmail = accountEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
