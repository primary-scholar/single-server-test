package test.single.server.test1;

import com.mimu.simple.httpserver.SimpleHttpServer;
import test.single.server.test1.config.AppConfig;

public class AppServer {
    public static void main(String[] args) {
        SimpleHttpServer server = SimpleHttpServer.getServer().config(AppConfig.class).port(9091).create();
        server.startServer();
    }
}
