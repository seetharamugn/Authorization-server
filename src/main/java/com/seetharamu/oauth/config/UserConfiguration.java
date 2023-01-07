package com.seetharamu.oauth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfiguration extends GlobalAuthenticationConfigurerAdapter {

    PasswordEncoder passwordEncoder=PasswordEncoderFactories.createDelegatingPasswordEncoder();


    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication().withUser("seetharama").password(passwordEncoder.encode("redhat")).roles("USER","ADMIN","MANAGER").authorities("CAN_READ","CAN_WRITE","CAN_DELETE").and()
                .withUser("rama").password(passwordEncoder.encode("admin")).roles("USER").authorities("CAN_READ","CAN_WRITE");
    }
}