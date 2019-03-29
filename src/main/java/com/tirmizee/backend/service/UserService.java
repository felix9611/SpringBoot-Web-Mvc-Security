package com.tirmizee.backend.service;

import java.sql.Date;

import com.tirmizee.backend.api.user.data.ReqPasswordDTO;
import com.tirmizee.backend.api.user.data.ReqPasswordExpriedDTO;
import com.tirmizee.backend.api.user.data.ReqPasswordResetTokenDTO;
import com.tirmizee.backend.api.user.data.ReqUpdateEnable;
import com.tirmizee.backend.api.user.data.UserDetailCriteriaDTO;
import com.tirmizee.backend.api.user.data.UserDetailDTO;
import com.tirmizee.core.datatable.RequestTable;
import com.tirmizee.core.datatable.ResponseTable;

public interface UserService {
	
	long countUses();
	
	boolean isPasswordExpried(Date expriedDate);
	
	void forgotPassword(String email);
	
	void fourcePasswordExpired(String username);
	
	void resetPassword(ReqPasswordResetTokenDTO passwordResetTokenDTO);
	
	void changePasswordFirstLogin(String username, ReqPasswordDTO passwordDTO);
	
	void changePasswordExpired(String username, ReqPasswordExpriedDTO passwordExpriedDTO);
	
	void updateStatusEnable(ReqUpdateEnable updateEnable);
	
	ResponseTable<UserDetailDTO> pagingTable(RequestTable<UserDetailCriteriaDTO> requestTable); 
	
}
