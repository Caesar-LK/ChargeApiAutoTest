package org.example.groups;

import org.testng.annotations.Test;

/**
 * @author :Caesar
 * @date 2025/09/08 17:44
 **/
@Test(groups ="stu")
public class GroupsOnClass1 {
    public void stu1() {
        System.out.println("GroupsOnClass1中的 stu1 运行");
    }

    public void stu2() {
        System.out.println("GroupsOnClass1中的 stu2 运行");
    }
}
