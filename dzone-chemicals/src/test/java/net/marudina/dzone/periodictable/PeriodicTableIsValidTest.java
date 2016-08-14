package net.marudina.dzone.periodictable;

import org.junit.Test;
import org.junit.Assert;

public class PeriodicTableIsValidTest {

	@Test
	public void test1() {
		Assert.assertTrue(PeriodicTable.isValidSymbol("Spenglerium", "Ee")); // -> true
	}

	@Test
	public void test2() {
		Assert.assertTrue(PeriodicTable.isValidSymbol("Zeddemorium", "Zr")); // -> true
	}

	@Test
	public void test3() {
		Assert.assertTrue(PeriodicTable.isValidSymbol("Venkmine", "Kn")); // -> true
	}

	@Test
	public void test4() {
		Assert.assertFalse(PeriodicTable.isValidSymbol("Stantzon", "Zt")); // -> false
	}

	@Test
	public void test5() {
		Assert.assertFalse(PeriodicTable.isValidSymbol("Melintzum", "Nn")); // -> false
	}

	@Test
	public void test6() {
		Assert.assertFalse(PeriodicTable.isValidSymbol("Tullium", "Ty")); // -> false
	}

	@Test
	public void test7() {
		Assert.assertFalse(PeriodicTable.isValidSymbol("Mercury", "Hg")); // -> false
	}

	@Test
	public void test8() {
		Assert.assertTrue(PeriodicTable.isValidSymbol("Mercury", "Cy")); // -> false
	}

	@Test
	public void test9() {
		Assert.assertTrue(PeriodicTable.isValidSymbol("Magnesium", "Ma")); // -> false
	}

	@Test
	public void test10() {
		Assert.assertTrue(PeriodicTable.isValidSymbol("Magnesium", "Am")); // -> false
	}

	@Test
	public void test11() {
		Assert.assertTrue(PeriodicTable.isValidSymbol("Xenon", "Nn")); // -> false
	}

	@Test
	public void test12() {
		Assert.assertFalse(PeriodicTable.isValidSymbol("Xenon", "Xx")); // -> false
	}

	@Test
	public void test13() {
		Assert.assertFalse(PeriodicTable.isValidSymbol("Xenon", "Oo")); // -> false
	}

	@Test
	public void test14() {
		Assert.assertFalse(PeriodicTable.isValidSymbol("Xenon", "Nm")); // -> false
	}

	@Test
	public void test15() {
		Assert.assertTrue(PeriodicTable.isValidSymbol("Xenon", "On")); // -> false
	}

	@Test
	public void test16() {
		Assert.assertTrue(PeriodicTable.isValidSymbol("Xenon", "Xe")); // -> false
	}
}
