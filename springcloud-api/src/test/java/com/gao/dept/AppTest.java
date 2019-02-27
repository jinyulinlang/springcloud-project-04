package com.gao.dept;

import com.gao.api.Dept;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */


    @Test
    public void shouldAnswerWithTrue() {
        assertTrue (true);
    }

    @Test
    public void deptDemo() {
        Dept dept = new Dept ();
        dept.setDeptNo (11L).setDb_source ("01").setDname ("技术部");
        System.out.println (dept.toString ());
    }
}
