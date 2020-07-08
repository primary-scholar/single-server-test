package test.single.server.test2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import test.single.server.test2.App2Server;

@Configuration
@ComponentScan(basePackageClasses= App2Server.class)
public class AppConfig {
}
