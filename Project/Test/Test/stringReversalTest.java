package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//import package.classname
import stringReversal.index;
/**
 * DO NOT MODIFY
 * */

 class stringReversalTest {

    @Test
      void stringToArrayListReversal() {
        index index = new index();
        String expected = "olleh";
        String expected1 = "yfitops";
        String expected2 = "tnedirT";

        assertEquals(expected, index.stringToArrayListReversal("hello"));
        assertEquals(expected1, index.stringToArrayListReversal("spotify"));
        assertNotEquals(expected2, index.stringToArrayListReversal("trident"));

    }

    @Test
    void stringToStringBuilderReversal() {
        index index = new index();
        String expected = "olleh";
        String expected1 = "yfitops";
        String expected2 = "tnedirT";

        assertEquals(expected, index.stringToStringBuilderReversal("hello"));
        assertEquals(expected1,index.stringToStringBuilderReversal("spotify"));
        assertNotEquals(expected2, index.stringToStringBuilderReversal("trident"));


    }

    @Test
    void stringToArrayReversal() {
        index index = new index();
        String expected = "olleh";
        String expected1 = "yfitops";
        String expected2 = "tnedirT";

        assertEquals(expected, index.stringToArrayReversal("hello"));
        assertEquals(expected1,index.stringToArrayReversal("spotify"));
        assertNotEquals(expected2, index.stringToArrayReversal("trident"));

    }


}