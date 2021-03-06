package com.colin.anbet.entity;

import java.util.List;

/**
 * @ProjectName: Colin
 * @Package: com.chai.colin.entity
 * @Description:
 * @Author: czc
 * @CreateDate: 2019/10/16 10:41
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/10/16 10:41
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class UserAccountBean {

    private String totalPages;
    private List<UserAccountItem> rows;

    public List<UserAccountItem> getRows() {
        return rows;
    }

    public String getTotalPages() {
        return totalPages;
    }
}
