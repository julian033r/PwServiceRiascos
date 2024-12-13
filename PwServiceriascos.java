package pio.daw.julianencriptador;
import org.jasypt.util.password.BasicPasswordEncryptor;
public class PwServiceriascos {
private BasicPasswordEncryptor passwordEncryptor;
	
	public PwServiceriascos() {
		
		this.passwordEncryptor= new BasicPasswordEncryptor();}
		
	public String encriptarContrasena(String contrasena) {
		
		return passwordEncryptor.encryptPassword(contrasena);
	}
	
	public boolean verificarContraseña(String contrasena, String contrasenaEncriptada) {
		return passwordEncryptor.checkPassword(contrasena,contrasenaEncriptada);
	}
	
	
}