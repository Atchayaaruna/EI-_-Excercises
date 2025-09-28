package Structural.Flyweight;
import java.util.HashMap;
import java.util.Map;
class TreeFactory {
    private static Map<String, TreeType> treeMap = new HashMap<>();
    public static TreeType getTreeType(String name, String color) {
        String key = name + "-" + color;
        if (!treeMap.containsKey(key))
            treeMap.put(key, new TreeType(name, color));
        return treeMap.get(key);
    }
}
