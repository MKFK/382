package com.colin.anbet.net;

/**
 * @ProjectName: Colin
 * @Package: com.chai.colin.entity
 * @Description:
 * @Author: czc
 * @CreateDate: 2019/10/9 10:49
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/10/9 10:49
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class DepositBean {
    private String zmoney;
    private String memberSafeMoney;
    private String msg;
    private int status;
    public String getMsg() {
        return msg;
    }

    public int getStatus() {
        return status;
    }

    public String getMemberSafeMoney() {
        return memberSafeMoney;
    }

    public String getZmoney() {
        return zmoney;
    }
}
