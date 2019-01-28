package com.hg.security.core.properties;

/**
 * @auther kim
 * @date 2019/1/27
 */
public class BrowserProperties {

    private String loginPage = "/hg-signIn.html";

    private LoginType loginType = LoginType.JSON;

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }

    public LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }
}
