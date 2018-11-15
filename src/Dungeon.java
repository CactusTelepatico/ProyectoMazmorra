import java.util.Scanner;

public class Dungeon {
	// Tablero inicial
				/*
			    // System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				   System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
			       System.out.println("║@ ║ ║           ║¡Empieza tu aventura!");
				   System.out.println("║  ╚═╝           ╚");
				   System.out.println("║         "+key+"      █ ");
				   System.out.println("║      ╔═╗       ╔ ");
				   System.out.println("╚══════╝ ╚═══════╝"); 
				  	   // Posiciones @ ║ @ @ @ @ @ @ @ @║  */
	private static Scanner in;
	public static void main(String[] args) {
		int bucle = 0;
		//bucle general
		while(bucle==0)
		{
			int mov=0;
			String key = "$";
			int x = 0;
			int y = 0;
			int wall = 0;
			int nada = 0;
			//coordenadas 0,0
			while(x==0 && y ==0)
			{
				   System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				   System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
			       System.out.println("║@ ║ ║           ║¡Empieza tu aventura!");
				   System.out.println("║  ╚═╝           ╚");
				   System.out.println("║         "+key+"      █ ");
				   System.out.println("║      ╔═╗       ╔ ");
				   System.out.println("╚══════╝ ╚═══════╝"); 
				  	   // Posiciones @ ║ @ @ @ @ @ @ @ @║	
				   System.out.println("Introduce cualquier número! :D");
				   in = new Scanner(System.in);
					nada = in.nextInt();
					x++;
					y++;
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║@ ║ ║           ║Introduce un número de los que aparecen arriba, si no, no puedo entenderte :o");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      █ ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝");
					
			}
			while(x==1 && y ==1)
			{
				
			/*	System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║@ ║ ║           ║Introduce un número de los que aparecen arriba, si no, no puedo entenderte :o");
				System.out.println("║  ╚═╝           ╚");
				System.out.println("║         "+key+"      █ ");
				System.out.println("║      ╔═╗       ╔ ");
				System.out.println("╚══════╝ ╚═══════╝"); */
					// Posiciones @ ║ @ @ @ @ @ @ @ @║	
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov <0 || mov >4)
				{
				System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║@ ║ ║           ║Introduce un número de los que aparecen arriba, si no, no puedo entenderte :o");
				System.out.println("║  ╚═╝           ╚");
				System.out.println("║         "+key+"      █ ");
				System.out.println("║      ╔═╗       ╔ ");
				System.out.println("╚══════╝ ╚═══════╝"); 
					// Posiciones @ ║ @ @ @ @ @ @ @ @║		
				}
				else if(mov!=2)
				{
				System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║@ ║ ║           ║Ay! *Te estampas con la pared*...creo que mejor vamos para otro lado");
				System.out.println("║  ╚═╝           ╚");
				System.out.println("║         "+key+"      █ ");
				System.out.println("║      ╔═╗       ╔ ");
				System.out.println("╚══════╝ ╚═══════╝"); 
			        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
					wall++;
					if(wall==5)
					{
						System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
						System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
						System.out.println("║@ ║ ║           ║Ay! *Te estampas con la pared por última vez, has muerto");
						System.out.println("║  ╚═╝           ╚");
						System.out.println("║         "+key+"      █ ");
						System.out.println("║      ╔═╗       ╔ ");
						System.out.println("╚══════╝ ╚═══════╝");
						System.out.println("  ▄▀▀▀▀▄    ▄▀▀█▄   ▄▀▀▄ ▄▀▄  ▄▀▀█▄▄▄▄      ▄▀▀▀▀▄   ▄▀▀▄ ▄▀▀▄  ▄▀▀█▄▄▄▄  ▄▀▀▄▀▀▀▄ ");
						System.out.println(" █         ▐ ▄▀ ▀▄ █  █ ▀  █ ▐  ▄▀   ▐     █      █ █   █    █ ▐  ▄▀   ▐ █   █   █ ");
						System.out.println(" █    ▀▄▄    █▄▄▄█ ▐  █    █   █▄▄▄▄▄      █      █ ▐  █    █    █▄▄▄▄▄  ▐  █▀▀█▀  ");
						System.out.println(" █     █ █  ▄▀   █   █    █    █    ▌      ▀▄    ▄▀    █   ▄▀    █    ▌   ▄▀    █  ");
						System.out.println(" ▐▀▄▄▄▄▀ ▐ █   ▄▀  ▄▀   ▄▀    ▄▀▄▄▄▄         ▀▀▀▀       ▀▄▀     ▄▀▄▄▄▄   █     █   ");
					    System.out.println(" ▐         ▐   ▐   █    █     █    ▐                            █    ▐   ▐     ▐   ");
						System.out.println("                   ▐    ▐     ▐                                 ▐                  ");	
						//Muerte
						
							x=0;
							y=0;	
						
						
						
					     
					}
				}
				else {
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║@ ╚═╝           ╚");
					System.out.println("║         "+key+"      █ ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
					x++;
				}
			}
			while(x==2 && y==1)
			{
			/*	System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║  ║ ║           ║");
				System.out.println("║@ ╚═╝           ╚");
				System.out.println("║         "+key+"      █ ");
				System.out.println("║      ╔═╗       ╔ ");
				System.out.println("╚══════╝ ╚═══════╝"); 
			        // Posiciones @ ║ @ @ @ @ @ @ @ @║ */
			}
		}
		
	}
	
	
}
