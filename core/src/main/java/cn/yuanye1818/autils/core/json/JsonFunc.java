package cn.yuanye1818.autils.core.json;

import java.util.List;

import cn.yuanye1818.autils.core.json.jsonholder.FastJsonHolder;
import cn.yuanye1818.autils.core.json.jsonholder.JsonHolder;
import cn.yuanye1818.autils.global.App;

/**************************************************
 *
 * json工具类
 *
 **************************************************/
public class JsonFunc {
    private static JsonHolder JSON;

    private static JsonHolder getJSON() {
        if (JSON == null) {
            JSON = App.APP.createJsonHolder();
            if (JSON == null)
                JSON = new FastJsonHolder();
        }
        return JSON;
    }

    public static <T> T toBean(Class<T> tClass, String json) {
        return getJSON().toBean(tClass, json);
    }

    public static String toJson(Object obj) {
        return getJSON().toJson(obj);
    }

    public static <T> List<T> toBeanList(Class<T> tClass, String json) {
        return getJSON().toBeanList(tClass, json);
    }
}
