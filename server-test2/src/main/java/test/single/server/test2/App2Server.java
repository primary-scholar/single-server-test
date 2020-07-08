package test.single.server.test2;

import com.mimu.simple.httpserver.SimpleHttpServer;
import test.single.server.test2.config.AppConfig;

public class App2Server {
    public static void main(String[] args) {
        SimpleHttpServer server = SimpleHttpServer.getServer().config(AppConfig.class).port(9092).create();
        server.startServer();
    }
}
