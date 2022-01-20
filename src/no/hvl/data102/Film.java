package no.hvl.data102;

import java.util.Objects;

public abstract class Film {
	private int m_filmnr;
	private int m_lanseringsAaar;
	private String m_filmSkaparNamn;
	private String m_tittel;
	private String m_filmselskap;
	private Sjanger m_sjanger;
	
	public Film() {
		
	}
	
	public Film(
		int filmnr,
		int lanseringsaar, 
		String filmSkaparNamn, 
		String tittel, 
		String selskap, 
		Sjanger sjanger)
	{
		this.m_filmnr = filmnr;
		this.m_lanseringsAaar = lanseringsaar;
		this.m_filmSkaparNamn = filmSkaparNamn;
		this.m_tittel  = tittel;
		this.m_filmselskap = selskap;
		this.m_sjanger = sjanger;
		
	}
	
	
	@Override
	public int hashCode() {
		Integer tmp = this.m_filmnr;
		return tmp.hashCode();
	}

	public boolean equals(Film rhs) {
		if(this.m_filmnr == rhs.getFilmnr())
			return true;
		else
			return false;
	}
	
	public int getFilmnr() {
		return m_filmnr;
	}

	public void setFilmnr(int m_filmnr) {
		this.m_filmnr = m_filmnr;
	}

	public int getLanseringsAaar() {
		return m_lanseringsAaar;
	}

	public void setLanseringsAaar(int m_lanseringsAaar) {
		this.m_lanseringsAaar = m_lanseringsAaar;
	}

	public String getFilmSkaparNamn() {
		return m_filmSkaparNamn;
	}

	public void setFilmSkaparNamn(String m_filmSkaparNamn) {
		this.m_filmSkaparNamn = m_filmSkaparNamn;
	}

	public String getTittel() {
		return m_tittel;
	}

	public void setTittel(String m_tittel) {
		this.m_tittel = m_tittel;
	}

	public String getTilmselskap() {
		return m_filmselskap;
	}

	public void setFilmselskap(String m_filmselskap) {
		this.m_filmselskap = m_filmselskap;
	}

	public Sjanger getSjanger() {
		return m_sjanger;
	}

	public void setSjanger(Sjanger m_sjanger) {
		this.m_sjanger = m_sjanger;
	}
	
	
}
