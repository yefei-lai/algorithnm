package com.study.algorithnm.other;

import com.study.algorithnm.model.Node;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * LRU算法（缓存过期算法）
 * 用双向链表实现，链表尾表示最近被访问的元素，越靠近链表头表示越早之前被访问的元素
 */
public class LRUCache {

    private LinkedList<Node> cache;

    private int capacity;

    public LRUCache(int capacity){
        this.cache = new LinkedList<>();
        this.capacity = capacity;
    }

    /**
     * 查询一个元素，返回""表示没有找到
     * @param key
     * @return
     */
    public Object get(String key){
        Iterator<Node> iterator = cache.descendingIterator();
        Object result = "";
        while (iterator.hasNext()){
            Node node = iterator.next();
            if (node.key == key){
                result = node.val;
                iterator.remove();
                put(key, result);// 把原来该位置的元素删除，并把新元素添加到链表尾部
                break;
            }
        }
        return result;
    }

    /**
     * 插入一个元素
     * @param key
     * @param val
     */
    public void put(Object key, Object val){
        //遍历查找是否有key的元素，如果有则删除
        Iterator<Node> iterator = cache.iterator();
        while (iterator.hasNext()){
            Node node = iterator.next();
            if (node.key.equals(key)){
                iterator.remove();
                break;
            }
        }
        //缓存已满，删除一个最近最少访问的元素（位于链表头）
        if (capacity == cache.size()){
            cache.removeFirst();
        }
        //添加元素至链表尾
        Node addNode = new Node(key, val);
        cache.add(addNode);
     }

}