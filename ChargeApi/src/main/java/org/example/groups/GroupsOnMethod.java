//package org.example.groups;
//
//import org.testng.annotations.AfterGroups;
//import org.testng.annotations.BeforeGroups;
//import org.testng.annotations.Test;
//
///**
// * @author :Caesar
// * @date 2025/09/08 17:28
// **/
//public class GroupsOnMethod {
//
//    @Test(groups = "server")
//    public void test1() {
//        System.out.println("这个是服务端的组方法 1");
//    }
//
//    @Test(groups ="server")
//    public void test2() {
//        System.out.println("这个是服务端的组方法 22");
//    }
//
//    @Test(groups = "client")
//    public void test3() {
//        System.out.println("这个是客户端的组方法 33333");
//    }
//
//    @Test(groups ="client")
//    public void test4() {
//        System.out.println("这个是客户端的组方法 444444");
//    }
//    @BeforeGroups("server")
//    public void beforGroupsOnserver() {
//        System.out.println("beforGroupsOnserver服务端组之前运行的方法");
//    }
//
//    @AfterGroups("server")
//    public void afterGroupsOnserver() {
//        System.out.println("afterGroupsOnserver服务端组之后运行的方法");
//    }
//
//    @BeforeGroups("client")
//    public void beforGroupsOnclient() {
//        System.out.println("beforGroupsOnserver客户端组之前运行的方法");
//    }
//
//    @AfterGroups("client")
//    public void afterGroupsOnclient() {
//        System.out.println("afterGroupsOnserver客户端组之后运行的方法");
//    }
//}
