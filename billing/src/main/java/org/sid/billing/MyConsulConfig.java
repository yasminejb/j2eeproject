package org.sid.billing;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@ConfigurationProperties(prefix = "token")
@Component
@Data
public class MyConsulConfig {
    private long accessTokenTimeOut;
    private long refreshTokenTimeOut;

}
