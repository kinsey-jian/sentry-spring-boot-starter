package com.kinsey.sentry;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by zj on 2018/12/15
 */
@Data
@ConfigurationProperties(prefix = "sentry")
public class SentryProperties {

    private String dns;

    private String serverName;

    private String release;

    private String environment;

}
