package Ex.com.ex.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "blog")
public class BlogEntity {
	@Id
	@Column(name = "blog_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long blogId;

	@Column(name = "blog_title")
	private String blogTitle;

	@Column(name = "category_name")
	private String categoryName;

	@Column(name = "blog_image")
	private String blogImage;

	@Column(name = "article")
	private String article;

	@Column(name = "account_id")
	private Long accountId;
	
	

	public BlogEntity(String blogTitle, String categoryName, String blogImage, String article, Long accountId) {
		super();
		this.blogTitle = blogTitle;
		this.categoryName = categoryName;
		this.blogImage = blogImage;
		this.article = article;
		this.accountId = accountId;
	}



	public Long getBlogId() {
		return blogId;
	}



	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}



	public String getBlogTitle() {
		return blogTitle;
	}



	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}



	public String getCategoryName() {
		return categoryName;
	}



	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}



	public String getBlogImage() {
		return blogImage;
	}



	public void setBlogImage(String blogImage) {
		this.blogImage = blogImage;
	}



	public String getArticle() {
		return article;
	}



	public void setArticle(String article) {
		this.article = article;
	}



	public Long getAccountId() {
		return accountId;
	}



	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	
	

	
}
