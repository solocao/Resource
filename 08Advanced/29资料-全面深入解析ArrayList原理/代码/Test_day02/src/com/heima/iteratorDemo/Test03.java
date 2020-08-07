package com.heima.iteratorDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 长沙黑马程序员
 * @since JDK 1.8
 *
 * 案例三:
 *      已知集合：List<String> list = new ArrayList<String>();里面有三个元素："hello"、"PHP"、"JavaSE"，
 *      使用迭代器遍历集合看有没有"PHP"这个元素，如果有，就使用集合对象删除该元素
 */
public class Test03 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();
        //添加元素
        list.add("hello");
        list.add("PHP");
        list.add("Java");

        //获取迭代器
        Iterator<String> it = list.iterator();
        //遍历集合
        while (it.hasNext()) {
            String s = it.next();
            if(s.equals("PHP")) {
                list.remove("PHP");
            }
        }

        System.out.println(list);
    }
}
