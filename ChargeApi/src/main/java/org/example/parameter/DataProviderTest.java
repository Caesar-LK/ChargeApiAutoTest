package org.example.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @author :Caesar
 * @date 2025/09/09 11:55
 **/
public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age){
        System.out.println("testDataProvider name =="+name+" age=="+age);
    }

    @DataProvider(name = "data")
    public Object[][] provideData(){
        Object[][] data=new Object[][]{
                {"zhangsan",10},
                {"lisi",22},
                {"wangwu",33},
                {"zhaoliu",44},
        };
            return data;
    }
    @Test(dataProvider = "methoddata")
    public void test1(String name,int age ){
        System.out.println("test11111方法  =="+name+" age=="+age);
    }

    @Test(dataProvider = "methoddata")
    public void test2(String name,int age ){
        System.out.println("test22222方法  =="+name+" age=="+age);
    }




    @DataProvider(name = "methoddata")
    public Object[][] methoddataTest(Method method){
        Object[][] result=null;
        if(method.getName().equals("test1")){
            result=new Object[][]{
                    {"zhangsan",10},
                    {"lisi",22},
                    {"wangwu",33}
            };
        }else if (method.getName().equals("test2")){
                result=new Object[][]{
                        {"zhangsan1111",30},
                        {"lisi2222",42},
                };
            }
        return result;
    }
}
