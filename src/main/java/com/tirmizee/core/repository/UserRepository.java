package com.tirmizee.core.repository;

import com.tirmizee.core.domain.User;
import com.tirmizee.core.jdbcrepository.JdbcRepository;

public interface UserRepository extends JdbcRepository<User, Long>{
	
	public static final String TB_USERS = "USERS";
	
	public static final String COL_UPDATE_DATE = "UPDATE_DATE";
	public static final String COL_CREATE_DATE = "CREATE_DATE";
	public static final String COL_CREDENTIALSNONEXPIRED = "CREDENTIALSNONEXPIRED";
	public static final String COL_ACCOUNTNONEXPIRED = "ACCOUNTNONEXPIRED";
	public static final String COL_ACCOUNTNONLOCKED = "ACCOUNTNONLOCKED";
	public static final String COL_ENABLED = "ENABLED";
	public static final String COL_PASSWORD = "PASSWORD";
	public static final String COL_USERNAME = "USERNAME";
	public static final String COL_PROFILE_ID = "PROFILE_ID";
	public static final String COL_USER_ID = "USER_ID";
	
	public static final String UPDATE_DATE = "USERS.UPDATE_DATE";
	public static final String CREATE_DATE = "USERS.CREATE_DATE";
	public static final String CREDENTIALSNONEXPIRED = "USERS.CREDENTIALSNONEXPIRED";
	public static final String ACCOUNTNONEXPIRED = "USERS.ACCOUNTNONEXPIRED";
	public static final String ACCOUNTNONLOCKED = "USERS.ACCOUNTNONLOCKED";
	public static final String ENABLED = "USERS.ENABLED";
	public static final String PASSWORD = "USERS.PASSWORD";
	public static final String USERNAME = "USERS.USERNAME";
	public static final String PROFILE_ID = "USERS.PROFILE_ID";
	public static final String USER_ID = "USERS.USER_ID";
	
}
