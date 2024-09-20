package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void launchcodeInBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void codeInBrackets () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void afterBrackets () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void multipleBrackets () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode[]"));
    }
    @Test
    public void singleBracket () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void noBrackets () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }
    @Test
    public void singleBracketNoChar () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void singleOpenBracketNoChar () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void threeBrackets () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }
    @Test
    public void reversedBrackets () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void reversedWithChar () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode["));
    }
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}