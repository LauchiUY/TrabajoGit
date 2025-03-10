public class CodigoParaRefactorizar{

	public static final double IVA = 0.21;

	public double calculoIva(double precioBase) {
		double precioFinal;
		precioFinal = precioBase + (IVA * precioBase);
		return precioFinal;
	}

	public double calculoIva(double precioBase, double porcentajeDescuento) {
		double precioFinal;
		precioFinal = precioBase + (IVA * precioBase);
		calculoIva(precioBase);
		precioFinal = precioFinal - (precioFinal * porcentajeDescuento / 100);
		return precioFinal;
	}

	public boolean bisiesto(int anio) {
		return (anio % 400 == 0) || (anio % 4 == 0) && (anio % 100 != 0);
	}

	public int diasMes(int mes, int anio) {
		int diasMes = 0;
		switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				diasMes = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				diasMes = 30;
				break;
			case 2:
				if (
						(bisiesto(anio))  //esto se entiende?
				)
					diasMes = 29;
				else
					diasMes = 28;
				break;
		}
		return diasMes;
	}


	public double subidaPrecio(double precioBase, double subida) {
		precioBase = precioBase + subida;
		double precioConIVA = calculoIva(precioBase);
		// Externalizar la salida de consola

		mostrarPrecio(precioBase, precioConIVA);
		return precioBase;
	}

	public void mostrarPrecio(double precioBase, double precioConIVA){
		System.out.println("El nuevo precio base es " + precioBase);
		System.out.println("El precio con IVA es " + precioConIVA);
	}
}

