package org.example.groups;

import org.testng.annotations.Test;

/**
 * @author :Caesar
 * @date 2025/09/08 17:45
 **/
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1() {
        System.out.println("GroupsOnClass3<UNK> teacher1 <UNK>");
    }

    public void teacher2() {
        System.out.println("GroupsOnClass3<UNK> teacher2 <UNK>");
    }

}
