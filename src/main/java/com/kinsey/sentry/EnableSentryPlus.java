package com.kinsey.sentry;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by zj on 2018/12/15
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({SentryAutoConfiguration.class})
public @interface EnableSentryPlus {
}
