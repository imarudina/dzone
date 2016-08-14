package net.marudina.dzone.periodictable;

import org.junit.Assert;
import org.junit.Test;

public class PeriodicTableFirstSymbolTest {

	@Test
	public void test1() {
		Assert.assertEquals("Ei", PeriodicTable.findFirstValidSymbol("Gozerium"));
	}

	@Test
	public void test2() {
		Assert.assertEquals("Ie", PeriodicTable.findFirstValidSymbol("Slimyrine"));
	}

	@Test
	public void test3() {
		Assert.assertEquals("Ab", PeriodicTable.findFirstValidSymbol("Abdone"));
	}

	@Test
	public void test4() {
		Assert.assertEquals("Ba", PeriodicTable.findFirstValidSymbol("Gfedcba"));
	}
	
}
