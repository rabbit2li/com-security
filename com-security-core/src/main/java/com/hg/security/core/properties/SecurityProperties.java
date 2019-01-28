package com.hg.security.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @auther kim
 * @date 2019/1/27
 */
@ConfigurationProperties(prefix = "com.security")
public class SecurityProperties {

    private BrowserProperties browser = new BrowserProperties();

    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }
}
