import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String test_str1 = "{\n" +
            "    \"code\":\"0\",\n" +
            "    \"body\":[\n" +
            "        {\n" +
            "            \"permissions\":[\n" +
            "                {\n" +
            "                    \"isOn\":true,\n" +
            "                    \"description\":\"管理员\",\n" +
            "                    \"id\":\"1158980326240948224\",\n" +
            "                    \"type\":\"管理员\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"name\":\"管理员\",\n" +
            "            \"structureIds\":[\n" +
            "\n" +
            "            ],\n" +
            "            \"id\":\"1158980326442274816\",\n" +
            "            \"pubAuthStructureIds\":[\n" +
            "                \"a7132b4dbf4348568481ea9d3910f93e\"\n" +
            "            ],\n" +
            "            \"channelIds\":[\n" +
            "                \"13104094068857937920385969428\"\n" +
            "            ],\n" +
            "            \"url\":\"/cmdf/v1/upload/image/5e1ea5219ffd541d4067bbfd.jpeg\",\n" +
            "            \"menuBarIds\":[\n" +
            "                \"12155486046352875541425648494\"\n" +
            "            ]\n" +
            "        }\n" +
            "    ],\n" +
            "    \"message\":\"获取成功\"\n" +
            "}";

    static <T> WebResponse<ArrayList<T>> test(String str, Class<T> clazz) throws IOException {
        final ParameterizedTypeImpl inner = new ParameterizedTypeImpl(new Type[]{clazz}, null, List.class);
        final ParameterizedTypeImpl outer = new ParameterizedTypeImpl(new Type[]{inner}, null, WebResponse.class);
        return JSON.parseObject(str, outer);
    }

    public static void main(String[] args) throws IOException {
        System.out.println(test_str1);
        System.out.println(Main.test(test_str1, RoleVO.class));
    }

}
