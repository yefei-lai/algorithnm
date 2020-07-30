package com.study.algorithnm.other;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 使用 LinkedHashMap 实现
 */
public class LRUCache1 {

    private int capacity;
    private LinkedHashMap<Integer, Integer> map;

    public LRUCache1(int capacity){
        this.capacity = capacity;
        map = new LinkedHashMap<>(capacity);
    }

    public int get(int key){
        if (map.containsKey(key)){
            int value = map.get(key);
            map.remove(key);
            map.put(key, value);
            return value;
        }
        return -1;
    }

    public void put(int key, int value){
        if (map.containsKey(key)){
            map.remove(key);
        }
        if (!map.containsKey(key) && map.size() == capacity){ //内存已满
            map.remove(map.entrySet().iterator().next().getKey()); //移除第一个元素
        }
        map.put(key, value);
    }
}
