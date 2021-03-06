package com.colin.anbet.event;

import com.colin.anbet.net.LoginBean;

/**
 * @ProjectName: Colin
 * @Package: com.chai.colin.event
 * @Description:
 * @Author: czc
 * @CreateDate: 2019/9/25 14:36
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/9/25 14:36
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class LoginEvent {
    private LoginBean loginBean;

    public LoginEvent(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }
}
