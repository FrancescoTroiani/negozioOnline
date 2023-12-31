package org.generation.italy;

public class Prodotto {
	/*codice (String): codice identificativo del prodotto (non č possibile inserire due prodotti con lo stesso codice)
	Descrizione (String)
	Prezzo (float)
	Sconto (float):
	*/
Prodotto (String codice, String descrizione, float prezzo, float sconto, int quantitąDisponibile)
{
	this.codice=codice;
	this.descrizione=descrizione;
	this.prezzo=prezzo;
	this.sconto=sconto;
	this.quantitąDisponibile=quantitąDisponibile;
}
	
private	String codice, descrizione;							
private	float prezzo,sconto;
private int quantitąDisponibile;


public float getSconto() {
	return sconto;
}
public void setSconto(float sconto) {
	this.sconto = sconto;
}
public String getCodice() {
	return codice;
}
public void setCodice(String codice) {
	this.codice = codice;
}
public String getDescrizione() {
	return descrizione;
}
public void setDescrizione(String descrizione) {
	this.descrizione = descrizione;
}
public float getPrezzo() {
	return prezzo;
}
public void setPrezzo(float prezzo) {
	this.prezzo = prezzo;
}
public int getQuantitąDisponibile() {
	return quantitąDisponibile;
}
public void setQuantitąDisponibile(int quantitą) {
	quantitąDisponibile-=quantitą;
}
public void ApplicaSconto (String codice,float perc) 
	{
	if (codice.equals(this.codice))
		this.prezzo=prezzo-(prezzo*perc/100);
	}

}

