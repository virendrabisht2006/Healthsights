package com.qms.rest.service;

import com.qms.rest.model.ResetPassword;
import com.qms.rest.model.RestResult;
import com.qms.rest.model.SecurityQuestion;
import com.qms.rest.model.User;

import java.util.Set;

public interface UserService {

    RestResult resetPassword(ResetPassword resetPassword);

    RestResult forgotPassword(String email);

    User getUserInfo(String userName, String password) throws Exception;

    RestResult addUser(User user);

    RestResult updateUser(User user);

    User getUserInfo(String userName);

    User getUserInfoByUserId(int userId);

    Set<SecurityQuestion> getSecurityQuestions();
}
