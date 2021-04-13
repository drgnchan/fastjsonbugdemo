import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import sun.reflect.misc.FieldUtil;

import java.io.IOException;
import java.util.List;

public class Main {

    static <T> WebResponse<List<T>> test(Class<T> clazz) throws IOException {
        return JSON.parseObject("{\n" +
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
                "}", new TypeReference<WebResponse<List<T>>>(){});
    }

    public static void main(String[] args) throws IOException {
        Main.test(RoleVO.class);
    }
}
