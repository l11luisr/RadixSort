public class Pasos {
	
	public void muestraPasos() {
		
		System.out.println("\n Atendiento al dígito de menor peso (unidades): Apilando ...");
		try {
			Thread.sleep(5000);
			} catch (InterruptedException ex) {
				System.out.println("\n Error en Thread.sleep ...");
			}
		System.out.println("\n\t 1: 721 \n\t 2: 572, 672 \n\t 4: 191 \n\t 5: 345, 425, 365 \n\t 6: 836, 236 \n\t 7: 467");
		System.out.println("\n Orden primera pasada: 721, 572, 672, 194, 345, 425, 365, 836, 236, 467");
		
		System.out.println("\n ************************************************************************ ");
		System.out.println("\n Atendiento al dígito de en medio (decenas): Apilando ...");
		try {
			Thread.sleep(5000);
			} catch (InterruptedException ex) {
				System.out.println("\n Error en Thread.sleep ...");
			}
		System.out.println("\n\t 2: 721, 425 \n\t 3: 836, 236 \n\t 4: 345 \n\t 6: 365, 467 \n\t 7: 572, 672 \n\t 9: 194");
		System.out.println("\n Orden segunda pasada: 721, 425, 836, 236, 345, 365, 467, 572, 672, 194");
		
		System.out.println("\n ************************************************************************ ");
		System.out.println("\n Atendiento al dígito de mayor peso (centenas): Apilando ...");
		try {
			Thread.sleep(5000);
			} catch (InterruptedException ex) {
				System.out.println("\n Error en Thread.sleep ...");
			}
		System.out.println("\n\t 1: 194 \n\t 2: 236, 672 \n\t 3: 345, 365 \n\t 4: 425, 467 \n\t 5: 572 \n\t 6: 672 \n\t 7: 721 \n\t 8: 836");
		System.out.println("\n Orden tercera pasada: 194, 236, 345, 365, 425, 467, 572, 672, 721, 836");
		
	}

}
