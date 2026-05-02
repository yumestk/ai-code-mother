package com.yume.yuaicodemother.service;

import com.mybatisflex.core.service.IService;
import com.yume.yuaicodemother.model.entity.User;
import com.yume.yuaicodemother.model.vo.LoginUserVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 用户 服务层。
 *
 * @author <a href="https://github.com/yumestk">yumestk</a>
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount
     * @param userPassword
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 退出登录
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 获取登录用户
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 获得脱敏的已登录用户信息
     * @param user
     * @return
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 加密
     * @param userPassword
     * @return
     */
    String getEncryptPassword(String userPassword);
}
