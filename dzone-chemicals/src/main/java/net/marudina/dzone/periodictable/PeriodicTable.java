package net.marudina.dzone.periodictable;

import java.util.HashSet;
import java.util.Set;

public class PeriodicTable {

	public static boolean isValidSymbol(String elementName, String symbol) {
		char[] elem = elementName.toCharArray();
		char[] sym = symbol.toCharArray();
		
		elem[0] = Character.toLowerCase(elem[0]);
		sym[0] = Character.toLowerCase(sym[0]);

		for (int i = 0; i < (elem.length - 1); i++) {
			if (elem[i] == sym[0]) {
				for (int j = i + 1; j < elem.length; j++) {
					if (elem[j] == sym[1]) {
						return true;
					}
				}
				
				return false;
			}
		}

		return false;
	}
	
	public static String findFirstValidSymbol(String elementName) {
		char[] elem = elementName.toCharArray();
		elem[0] = Character.toLowerCase(elem[0]);
		char first = elem[0], second = elem[1];
		
		for (int i = 1; i < elem.length - 1; i++) {
			if (elem[i] < first) {
				first = elem[i];
				second = elem[i + 1];
			} else if (elem[i] < second) {
				second = elem[i];
			}
		}
		
		if (elem[elem.length - 1] < second) {
			second = elem[elem.length - 1];
		}
		
		return "" + Character.toUpperCase(first) + second;
	}
	
	public static int countDistinctValidSymbolsForName(String elementName) {
		char[] elem = elementName.toCharArray();
		elem[0] = Character.toLowerCase(elem[0]);
		Set<String> symbols = new HashSet<>();
		
		for (int i = 0; i < elem.length - 1; i++) {
			for (int j = i + 1; j < elem.length; j++) {
				symbols.add("" + elem[i] + elem[j]);
			}
		}
		return symbols.size();
	}
}
