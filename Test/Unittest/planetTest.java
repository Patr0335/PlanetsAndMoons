package Unittest;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class planetTest {

    public static ArrayList<String> list;



    @Test
    void getColor() {
        Planet p = new Planet("Mars","Red",21296,"4th from the sun",246806302);
        assertEquals("Red", p.getColor());
    }





    @Test
    void testAddElement() {
        new Planet("Mars","Red",21296,"4th from the sun",246806302) {

        };

    }
}