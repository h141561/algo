package no.hvl.data102.adt;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;

public interface FilmarkivADT {
	/**
	 * Visar ein film
	 * @param nr er nummeret på filmen som skal visast. Om nummeret ikkje finst får du ei feilmelding.
	 * 
	 */
	void visFilm(int nr);
	
	/**
	 * Legger til ein ny film.
	 * @param nyFilm
	 */
	void leggTilFilm(Film nyFilm);
	
	/**
	 * Slettar ein film med gitt nr.
	 * @param filmNr som skal slettast.
	 * @return true om filmen blei sletta, false ellers.
	 */
	boolean slettFilm(int filmNr);
	
	/**
	 * Søkar gjennno og finner alle filmar med delstrengen i tittel.
	 * @param delStreng
	 * @return ein taball alle filmane med delstrengen i tittelen.
	 */
	Film[] soekTittel(String delStreng);
	
	/**
	 * Finner ut kor månge filmar det er med gitt sjanger.
	 * @param sjanger
	 * @return antalet
	 */
	int antal(Sjanger sjanger);
	
	/**
	 * returnerar antal filmar i arkivet
	 * @return antalet
	 */
	int antal();
}
