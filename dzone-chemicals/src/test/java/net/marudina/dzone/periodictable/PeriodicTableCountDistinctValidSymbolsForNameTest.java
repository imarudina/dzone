package net.marudina.dzone.periodictable;

import org.junit.Assert;
import org.junit.Test;

public class PeriodicTableCountDistinctValidSymbolsForNameTest {

	@Test
	public void test1() {
		Assert.assertEquals(11, PeriodicTable.countDistinctValidSymbolsForName("Zuulon"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(11, PeriodicTable.countDistinctValidSymbolsForName("Zuuuulon"));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(1, PeriodicTable.countDistinctValidSymbolsForName("aa"));
		Assert.assertEquals(1, PeriodicTable.countDistinctValidSymbolsForName("aaaaa"));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(1, PeriodicTable.countDistinctValidSymbolsForName("ab"));
		Assert.assertEquals(2, PeriodicTable.countDistinctValidSymbolsForName("aab"));
		Assert.assertEquals(3, PeriodicTable.countDistinctValidSymbolsForName("aabb"));
		Assert.assertEquals(3, PeriodicTable.countDistinctValidSymbolsForName("aaaaabbbbb"));
	}
	
	@Test
	public void test5() {
		Assert.assertEquals(1, PeriodicTable.countDistinctValidSymbolsForName("ab"));
		Assert.assertEquals(2, PeriodicTable.countDistinctValidSymbolsForName("aaaaab"));
		Assert.assertEquals(4, PeriodicTable.countDistinctValidSymbolsForName("aaaaabc"));
	}
	
}
