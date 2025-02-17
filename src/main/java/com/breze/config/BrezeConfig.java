package com.breze.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Discription 项目配置类解释文件，所有项目主体配置应在此编写
 * @Copyright(c) 2022 , 青枫网络工作室
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "breze")
public class BrezeConfig {

    private String name;
    private String title;
    private String version;
    private String copyrightYear;
    private String copyrightName;
    private Boolean swaggerEnabled;
}
