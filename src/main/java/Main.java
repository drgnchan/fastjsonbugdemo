import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import sun.reflect.misc.FieldUtil;

import java.io.IOException;
import java.util.List;

public class Main {

    static <T> WebResponse<List<T>> test(Class<T> clazz) throws IOException {
        String str = FileUtils.readFile("/Users/chenrl/Desktop/test2.txt");
        return JSON.parseObject(str, new TypeReference<WebResponse<List<T>>>(){});
    }

    public static void main(String[] args) throws IOException {
        Main.test(RoleVO.class);
    }
}
