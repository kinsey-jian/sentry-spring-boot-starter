package com.kinsey.sentry;

import io.sentry.Sentry;
import io.sentry.SentryClient;
import io.sentry.SentryClientFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zj on 2018/12/15
 */
@Configuration
@ConditionalOnClass(Sentry.class)
@EnableConfigurationProperties(SentryProperties.class)
public class SentryAutoConfiguration {

    @Bean
    public SentryClient sentry(SentryProperties properties){
        SentryClient sentryClient = SentryClientFactory.sentryClient(properties.getDns());
        sentryClient.setEnvironment(properties.getEnvironment());
        sentryClient.setServerName(properties.getServerName());
        sentryClient.setRelease(properties.getRelease());
        return sentryClient;
    }
}
