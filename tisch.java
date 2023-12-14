import java.util.HashMap;
import javafx.beans.binding.MapBinding;
/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 12.12.2023
 * @author 
 */

public class tisch {
  
  // Anfang Attribute
  private double flaechenLaenge;
  private double flaechenBreite;
  private double beinHoehe;
  private String holzart;
  private boolean premQuali;
  // Ende Attribute

  public tisch(double flaechenLaenge, double flaechenBreite, double beinHoehe, String holzart, boolean premQuali) {
    this.flaechenLaenge = flaechenLaenge;
    this.flaechenBreite = flaechenBreite;
    this.beinHoehe = beinHoehe;
    this.holzart = holzart;
    this.premQuali = premQuali;
  }

  // Anfang Methoden
  public double getFlaechenLaenge() {
    return flaechenLaenge;
  }

  public double getFlaechenBreite() {
    return flaechenBreite;
  }

  public double getBeinHoehe() {
    return beinHoehe;
  }

  public String getHolzart() {
    return holzart;
  }

  public void setHolzart(String holzartNeu) {
    holzart = holzartNeu;
  }
  
  

  public double calcFlaechenPreis() {
    // Kosten tischplatte (Dicke: 6 cm): 570 Eur / m²
    double flaeche = this.flaechenLaenge * this.flaechenBreite;
    return 570 * flaeche;
  }

  public double calcBeinPreis() {
    // Kosten Beine: 200 Eur / m
    return 200 * beinHoehe;
  }

  public double calcAufschlag() {
    /*Aufschläge je nach Holzart:
    Buche - ohne Aufschlag
    Esche - ohne Aufschlag
    Erle - 5% günstiger
    Kirsche - 25% Aufschlag
    Eiche - 35% Aufschlag
    Nuss - 100% Aufschlag  */ 
    
      HashMap<String, Double> hm = new HashMap<String, Double>() {{
        put("Erle", new Double(0.05));
        put("Kirsche", new Double(0.25));
        put("Eiche", new Double(0.35));
        put("Nuss", new Double(1));
      }};  
    
    
    if (!hm.containsKey(this.holzart)) {
      return 0;
    } else {
      return  hm.get(this.holzart).doubleValue();
    } // end of if-else
  }

  public double calcPrice() {
    double preis = calcBeinPreis() + calcFlaechenPreis();
    
    if (this.holzart.equals("Erle")) {
      preis = preis - (preis * calcAufschlag());
    } // end of if
    else {
      preis =  preis + (preis * calcAufschlag());
    } // end of if-else
    
    if (this.premQuali) {
      preis = preis + (preis * 0.3);
    } // end of if
    
    return preis;
  }

  public boolean getPremQuali() {
    return premQuali;
  }

  // Ende Methoden
} // end of tisch
