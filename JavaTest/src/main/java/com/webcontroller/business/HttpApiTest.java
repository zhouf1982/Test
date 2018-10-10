package com.webcontroller.business;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhoufeng
 */
@Controller
@RequestMapping("/HttpApiTest")
public class HttpApiTest {

    @RequestMapping(value = "/Test",
            method = RequestMethod.GET,
            produces = "application/json; charset=UTF-8")
    public String Test(HttpServletRequest request, @RequestBody String json) {
        Gson gson = new Gson();

        Map<String,Object> reqMap = gson.fromJson(json,
                new TypeToken<Map<String, Object>>(){}.getType());


        reqMap.forEach((key, val) -> {
            System.out.println(key + ":\t" + val);
        });

        var retMap = new HashMap<String, Object>();

        retMap.put("code", "200");
        retMap.put("message", "成功");

        var retStr = gson.toJson(retMap);

        return retStr;
    }
}
