package test.single.server.test3.controller;

import com.alibaba.fastjson.JSONObject;
import com.mimu.simple.comn.http.SimpleHttpClient;
import com.mimu.simple.httpserver.core.request.SimpleHttpRequest;
import com.mimu.simple.httpserver.core.response.SimpleHttpResponse;
import com.mimu.simple.httpserver.util.ConvertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.single.server.test3.model.SchoolSchoolInfo;
import test.single.server.test3.request.RpcRequest;
import test.single.server.test3.service.SkyWalkingTestService;

@RestController
public class SkyWalkingTestController {

    private SkyWalkingTestService skyWalkingTestService;

    @Autowired
    public void setSkyWalkingTestService(SkyWalkingTestService skyWalkingTestService) {
        this.skyWalkingTestService = skyWalkingTestService;
    }

    @RequestMapping(value = "/rpc1/info.do")
    public String getRpc1Info(SimpleHttpRequest request, SimpleHttpResponse response) {
        try {
            RpcRequest convert = ConvertUtil.convert(request, RpcRequest.class);
            String url = "http://localhost:9092/rpc2/info.do?serial=%s";
            String s = SimpleHttpClient.get(String.format(url, convert.getSerial()));
            return s;
        } catch (Exception e) {
            return "";
        }
    }

    @RequestMapping(value = "/rpc2/info.do")
    public String getRpc2Info(SimpleHttpRequest request, SimpleHttpResponse response) {
        try {
            RpcRequest convert = ConvertUtil.convert(request, RpcRequest.class);
            String url = "http://localhost:9093/rpc3/info.do?serial=%s";
            String s = SimpleHttpClient.get(String.format(url, convert.getSerial()));
            return s;
        } catch (Exception e) {
            return "";
        }
    }

    @RequestMapping(value = "/rpc3/info.do")
    public String getRpc3Info(SimpleHttpRequest request, SimpleHttpResponse response) {
        try {
            RpcRequest convert = ConvertUtil.convert(request, RpcRequest.class);
            String url = "http://localhost:9093/rpc4/info.do?serial=%s";
            String s = SimpleHttpClient.get(String.format(url, convert.getSerial()));
            return s;
        } catch (Exception e) {
            return "";
        }
    }

    @RequestMapping(value = "/rpc4/info.do")
    public String getRpc4Info(SimpleHttpRequest request, SimpleHttpResponse response) {
        try {
            RpcRequest convert = ConvertUtil.convert(request, RpcRequest.class);
            SchoolSchoolInfo schoolInfo = skyWalkingTestService.getSchoolInfo(convert.getSerial());
            return JSONObject.toJSONString(schoolInfo);
        } catch (Exception e) {
            return "";
        }
    }
}
