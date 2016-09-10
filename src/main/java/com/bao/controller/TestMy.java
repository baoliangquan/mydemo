package com.bao.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bao on 2016/7/13 0013.
 */
public class TestMy {
    private String type;
    private String name;
    private String address;

    public static List<TestMy> list = new ArrayList<TestMy>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<TestMy> getList() {
        return list;
    }

    public void setList(List<TestMy> list) {
        this.list = list;
    }

    public TestMy() {
        init();
    }
    public TestMy(String type, String name, String address) {
        this.type = type;
        this.name = name;
        this.address = address;
    }

    public void init(){
        list.add(new TestMy("中餐","炒饭","科技园"));
        list.add(new TestMy("中餐","快餐","家乐园"));
        list.add(new TestMy("中餐","快餐","白石洲"));
        list.add(new TestMy("西餐","意粉","南山"));
        list.add(new TestMy("粤菜","海鲜","后海"));
    }

    public  List<TestMy> getData(){
        List<TestMy> myList = new ArrayList<TestMy>();
        for (TestMy t: list  ) {
            if(t.getType().equals("中餐")){
                myList.add(t);
            }
        }
        return  myList;
    }

    public static void main(String[] args){
        TestMy test = new TestMy();
        List<TestMy> list = test.getData();
        for (TestMy t :list){
            System.out.println("餐饮类型"+t.getType()+"\t"+"菜式："+t.getName()+"地址:"+t.getAddress());
        }
        int a = 3;
        double b = 100d;
        System.out.println(a/b);
    }
}
