package de.bst.kata.bloom;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Coding Kata: Bloomiges
 * 
 * Szenario:
 * 
 * - Web-Serverdaten sind auf 100 Server verteilt. <BR/>
 * - Jeder Server hält die Daten für einen Zeitabschnitt. <BR/>
 * - User werden über Cookie-ID identifiziert. <BR/>
 * - Es gibt 1 Million User <BR/>
 * - Die Anwendung ermöglicht es, die Daten für einen User abzurufen. <BR/>
 * - Derzeit geht dafür eine Anfrage an alle 100 Server <BR/>
 * - Cookie ID sind meistens nur auf wenigen Servern (<10) vertreten <BR/>
 * - Die meisten Server liefern dabei ein leeres Ergebnis <BR/>
 * 
 * Aufgabe:
 * 
 * 1. Einen Index bauen, der alle Cookeie-ID für einen Server enthält und der
 * sagen kann, ob eine Cookie-ID enthalten ist. <BR/>
 * 
 * 2. Einen Index bauen, der viel weniger Speicher benötigt. Der Trick: Wir
 * erlauben, es, wenn der Index gelegentlich (< 1%) einen Treffer liefert,
 * obwohl das Elemenent nicht enthalten ist (False Positive). Dann würden wir
 * kaum noch unnötige Lookups machen. False Negatives sind, natürlich, nicht
 * erlaubt.
 * 
 */
public class IndexTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
