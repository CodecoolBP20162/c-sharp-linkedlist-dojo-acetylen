package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
    private LinkedListDojo array = new LinkedListDojo();

    @BeforeEach
    void initialize(){
        for(int i=0; i<6; i++)
            array.append(i*2);
    }


    @Test
    void addTest(){
//        LinkedListDojo linkedListDojo = new LinkedListDojo();
        String result = "0, 2, 4, 6, 8, 10";
        assertEquals(result, array.toString());

        array.append(11);
        array.append(10);
        array.append(11);

        result = "0, 2, 4, 6, 8, 10, 11, 10, 11";
        assertEquals(result, array.toString());

    }

    @Test
    void removeTest(){
        array.remove(4);
        array.remove(8);
        array.remove(6);
        String result = "0, 2, 10";
        assertEquals(result, array.toString());

    }

    @Test
    void removeTest_LastItem(){
        array.remove(10);
        String result = "0, 2, 4, 6, 8";
        assertEquals(result, array.toString());

    }

    @Test
    void prependTest(){
        array.prepend(3);
        array.prepend(6);

        String result = "6, 3, 0, 2, 4, 6, 8, 10";
        assertEquals(result, array.toString());


    }

    @Test
    void getTest(){
        int result = 6;
        assertEquals(result, array.get(3));
        result = 10;
        assertEquals(result, array.get(5));

    }


    @Test
    void sizeTest(){
        assertEquals(6, array.getSize());
    }


    @Test
    void getTest_FromTail(){

        assertEquals(4, array.getFromTail(2) );
        assertEquals(0, array.getFromTail(0) );
        assertEquals(2, array.getFromTail(1) );

    }

}
