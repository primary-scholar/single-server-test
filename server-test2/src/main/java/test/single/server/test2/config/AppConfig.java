package test.single.server.test2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import test.single.server.test2.AppServer;

@Configuration
@ComponentScan(basePackageClasses= AppServer.class)
public class AppConfig {
}
