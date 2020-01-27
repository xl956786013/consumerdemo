package com.xuling.consumerdemo.model.dto;

import com.xuling.consumerdemo.model.User;

import java.util.List;

public class UserDto extends User {
    private static final long serialVersionUID = -4434519222725304040L;
    private String userIds;
    private List<Long> userIdList;
    private String birthdayStr;

    public String getUserIds() {
        return userIds;
    }

    public void setUserIds(String userIds) {
        this.userIds = userIds;
    }

    public List<Long> getUserIdList() {
        return userIdList;
    }

    public void setUserIdList(List<Long> userIdList) {
        this.userIdList = userIdList;
    }

    public String getBirthdayStr() {
        return birthdayStr;
    }

    public void setBirthdayStr(String birthdayStr) {
        this.birthdayStr = birthdayStr;
    }
}
