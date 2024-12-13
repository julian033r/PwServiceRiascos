package pio.daw.julianencriptador;

public class PwServiceriascostest {
	public static void main(String[] args) {
		PwServiceriascos servicio = new PwServiceriascos();
		String password = "miSuperPassword";
		String passwordEncriptada = servicio.encriptarContrasena(password);
		System.out.println("Prueba del alumno Alejandro");
		System.out.println("La contraseña encriptada es: "+passwordEncriptada);
		
		boolean esValida = servicio.verificarContraseña(password, passwordEncriptada);
		System.out.println("La contraseña encriptada es valida: "+esValida);
		

	}

}

