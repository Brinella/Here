package com.Emma.Test;

import Emma.runArray;
import junit.framework.TestCase;

import java.util.Arrays;

/**
 * Created by Long on 2/22/2018.
 */
public class TestArray extends TestCase{

    runArray arr = new runArray();
    public void testArrayContent() throws Exception
    {
        assertTrue(Arrays.equals(arr.array1, arr.array2));
    }
}
