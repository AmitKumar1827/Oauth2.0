package com.auth.server.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;


@Entity
@Table(name="user_details")
public class User implements Serializable {

/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;

//	private static final long serialVersionUID = 983648238746032841L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private Integer id;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="user_type")
	private String userType;
	
	@Column(name="email")
	private String emailId;
	

	
//	@ManyToMany(mappedBy = "consumers", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
//	private Set<Utility> utilitites;
	

	public User() {
		super();
	}

		
	public User(Integer userId, String userName, String userType, String password) {
		this.id = userId;
		this.userName = userName;
		this.password=password;

	}
	
	public User(String userName, String userType, String password) {
		
		this.userName = userName;
		this.password=password;

	}

	public User (User user) {
		super();
		this.id = user.getUserId();
		this.userName = user.getUserName();
		this.password=user.getPassword();
		this.userType = user.getUserType();
		this.emailId = user.getEmailId();

	}

	public Integer getUserId() {
		return id;
	}

	public void setUserId(Integer userId) {
		this.id = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


		
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	
}
