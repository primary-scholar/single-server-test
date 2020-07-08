package test.single.server.test1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import test.single.server.test1.App1Server;

@Configuration
@ComponentScan(basePackageClasses= App1Server.class)
public class AppConfig {
}
