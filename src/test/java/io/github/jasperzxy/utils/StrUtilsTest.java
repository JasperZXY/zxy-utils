package io.github.jasperzxy.utils;

import org.junit.Test;
import static org.junit.Assert.*;

public class StrUtilsTest {

    @Test
    public void testIsEmpty() {
        assertTrue(StrUtils.isEmpty(null));
        assertTrue(StrUtils.isEmpty(""));
        assertFalse(StrUtils.isEmpty(" "));
        assertFalse(StrUtils.isEmpty("a"));
    }

    @Test
    public void testIsNotEmpty() {
        assertFalse(StrUtils.isNotEmpty(null));
        assertFalse(StrUtils.isNotEmpty(""));
        assertTrue(StrUtils.isNotEmpty(" "));
        assertTrue(StrUtils.isNotEmpty("a"));
    }

    @Test
    public void testIsBlank() {
        assertTrue(StrUtils.isBlank(null));
        assertTrue(StrUtils.isBlank(""));
        assertTrue(StrUtils.isBlank(" "));
        assertTrue(StrUtils.isBlank("  "));
        assertTrue(StrUtils.isBlank("\t"));
        assertTrue(StrUtils.isBlank("\n"));
        assertFalse(StrUtils.isBlank("a"));
        assertFalse(StrUtils.isBlank(" a "));
    }

    @Test
    public void testIsNotBlank() {
        assertFalse(StrUtils.isNotBlank(null));
        assertFalse(StrUtils.isNotBlank(""));
        assertFalse(StrUtils.isNotBlank(" "));
        assertTrue(StrUtils.isNotBlank("a"));
        assertTrue(StrUtils.isNotBlank(" a "));
    }

    @Test
    public void testReverse() {
        assertNull(StrUtils.reverse(null));
        assertEquals("", StrUtils.reverse(""));
        assertEquals("a", StrUtils.reverse("a"));
        assertEquals("cba", StrUtils.reverse("abc"));
        assertEquals("321cba", StrUtils.reverse("abc123"));
    }

    @Test
    public void testCapitalize() {
        assertNull(StrUtils.capitalize(null));
        assertEquals("", StrUtils.capitalize(""));
        assertEquals("A", StrUtils.capitalize("a"));
        assertEquals("Abc", StrUtils.capitalize("abc"));
        assertEquals("ABC", StrUtils.capitalize("ABC"));
    }

    @Test
    public void testUncapitalize() {
        assertNull(StrUtils.uncapitalize(null));
        assertEquals("", StrUtils.uncapitalize(""));
        assertEquals("a", StrUtils.uncapitalize("A"));
        assertEquals("abc", StrUtils.uncapitalize("Abc"));
        assertEquals("aBC", StrUtils.uncapitalize("ABC"));
    }
}
