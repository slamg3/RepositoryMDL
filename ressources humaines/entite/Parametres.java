package entite;

//import java.sql.DriverManager;
//import java.sql.Connection;

public class Parametres 
{
	private String nomUtilisateur;
	private String motDePasse;
	private String serveurBD;
	private String driverSGBD;
	public Parametres (){
      	nomUtilisateur = "gr3";
	  	motDePasse = "GR3";		
	  	driverSGBD ="sun.jdbc.odbc.JdbcOdbcDriver";
	  	serveurBD = "jdbc:odbc:ODBC_M2LG3";
	}
	public String getDriverSGBD() {
		return driverSGBD;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	public String getServeurBD() {
		return serveurBD;
	}
	
}
