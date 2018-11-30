package cn.yuanye1818.autils.core.utils;

import java.util.Collection;
import java.util.Map;

public class CollectionFunc {

    public static int count(Collection cs) {
        return cs == null ? 0 : cs.size();
    }

    public static int count(Map map) {
        return map == null ? 0 : map.size();
    }

    public static int count(Object... objs) {
        return objs == null ? 0 : objs.length;
    }

}
