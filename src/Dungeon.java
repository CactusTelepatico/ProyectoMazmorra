import java.util.Scanner;

public class Dungeon {
	// Tablero inicial
				/*
			    // System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				   System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
			       System.out.println("║@ ║ ║           ║¡Empieza tu aventura!");
				   System.out.println("║  ╚═╝           ╚");
				   System.out.println("║         "+key+"      "+door+"");
				   System.out.println("║      ╔═╗       ╔ ");
				   System.out.println("╚══════╝ ╚═══════╝"); 
				  	   // Posiciones @ ║ @ @ @ @ @ @ @ @║  */
	private static Scanner in;
	public static void main(String[] args) {
		int bucle = 0;
		//bucle general
		int x = 0;
		int y = 0;
		String key = " $";
		String door = "█";
		while(bucle==0)
		{
			int mov=0;
			int wall = 0;
			int nada = 0;
			//coordenadas 0,0
			while(x==0 && y ==0)
			{
				 key = "$";
				 door = "█";
				   System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				   System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
			       System.out.println("║@ ║ ║           ║¡Empieza tu aventura!");
				   System.out.println("║  ╚═╝           ╚");
				   System.out.println("║         "+key+"      "+door+"");
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
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝");
					
			}
			while(x==1 && y ==1)
			{
				
			/*	System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║@ ║ ║           ║Introduce un número de los que aparecen arriba, si no, no puedo entenderte :o");
				System.out.println("║  ╚═╝           ╚");
				System.out.println("║         "+key+"      "+door+"");
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
				System.out.println("║         "+key+"      "+door+"");
				System.out.println("║      ╔═╗       ╔ ");
				System.out.println("╚══════╝ ╚═══════╝"); 
					// Posiciones @ ║ @ @ @ @ @ @ @ @║		
				}
				else if(mov==0)
				{
				System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║@ ║ ║           ║No hay nada con lo que interactuar :I");
				System.out.println("║  ╚═╝           ╚");
				System.out.println("║         "+key+"      "+door+"");
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
				System.out.println("║         "+key+"      "+door+"");
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
						System.out.println("║         "+key+"      "+door+"");
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
				else if (mov==2){
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║@ ╚═╝           ╚");	
					System.out.println("║         "+key+"      "+door+""); 
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
				System.out.println("║         "+key+"      "+door+"");
				System.out.println("║      ╔═╗       ╔ ");
				System.out.println("╚══════╝ ╚═══════╝"); 
			        // Posiciones @ ║ @ @ @ @ @ @ @ @║ */
				in = new Scanner(System.in);
				mov = in.nextInt();
				
				if(mov <0 || mov>4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Introduce un número de los que aparecen arriba, si no, no puedo entenderte :o");
					System.out.println("║@ ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║ 
				}
				else if (mov==0)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║No hay nada con lo que interactuar :I");
					System.out.println("║@ ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║ 
				}
				else if (mov==3 || mov==1)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Ay! *Te estampas con la pared*...creo que mejor vamos para otro lado");
					System.out.println("║@ ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
						wall++;
						if(wall==5)
						{
							System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
							System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
							System.out.println("║  ║ ║           ║Ay! *Te estampas con la pared por última vez, has muerto");
							System.out.println("║@ ╚═╝           ╚");
							System.out.println("║         "+key+"      "+door+"");
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
				else if(mov==4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║@ ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝");	
					x--;
				}
				else if(mov==2)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║@        "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
					x++;
				}
		}
			while(x==3 && y==1 )
			{
			/*	System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║  ║ ║           ║");
				System.out.println("║  ╚═╝           ╚");
				System.out.println("║@        "+key+"      "+door+" ");
				System.out.println("║      ╔═╗       ╔ ");
				System.out.println("╚══════╝ ╚═══════╝"); 
			        // Posiciones @ ║ @ @ @ @ @ @ @ @║	*/
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Introduce un número de los que aparecen arriba, si no, no puedo entenderte :o");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║@        "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
				}
				else if(mov ==0)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║No hay nada con lo que interactuar :I");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║@        "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
				}
				else if(mov==1)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Ay! *Te estampas con la pared*...creo que mejor vamos para otro lado");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║@        "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
						wall++;
						if(wall==5)
						{
							System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
							System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
							System.out.println("║  ║ ║           ║Ay! *Te estampas con la pared por última vez, has muerto");
							System.out.println("║  ╚═╝           ╚");
							System.out.println("║@        "+key+"      "+door+" ");
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
				else if(mov==2)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║@     ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					x++;
				}
				else if(mov==3)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║   @     "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					y++;
					
				}
				else if(mov==4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║@ ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					x--;
				}
			}
			while(x==4 && y==1)
			{
			/*	System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║  ║ ║           ║");
				System.out.println("║  ╚═╝           ╚");
				System.out.println("║         "+key+"      "+door+"");
				System.out.println("║@     ╔═╗       ╔ ");
				System.out.println("╚══════╝ ╚═══════╝"); 
			        // Posiciones @ ║ @ @ @ @ @ @ @ @║ 				*/
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Introduce un número de los que aparecen arriba, si no, no puedo entenderte :o");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║@     ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
				}
				else if(mov ==0)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║No hay nada con lo que interactuar :I");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║@     ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
				}
				else if(mov==2 || mov==1)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Ay! *Te estampas con la pared*...creo que mejor vamos para otro lado");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║@     ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
						wall++;
						if(wall==5)
						{
							System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
							System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
							System.out.println("║  ║ ║           ║Ay! *Te estampas con la pared por última vez, has muerto");
							System.out.println("║  ╚═╝           ╚");
							System.out.println("║         "+key+"      "+door+"");
							System.out.println("║@     ╔═╗       ╔ ");
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
				else if(mov==4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║@        "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					x--;
				}
				else if(mov==3)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║   @  ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║ 
					y++;
				}
			}
			while(x==3 && y==2)
			{
			/*	System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║  ║ ║           ║");
				System.out.println("║  ╚═╝           ╚");
				System.out.println("║   @     "+key+"      "+door+" ");
				System.out.println("║      ╔═╗       ╔ ");
				System.out.println("╚══════╝ ╚═══════╝"); 
			        // Posiciones @ ║ @ @ @ @ @ @ @ @║  */
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Introduce un número de los que aparecen arriba, si no, no puedo entenderte :o");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║   @     "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
				}
				else if(mov ==0)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║No hay nada con lo que interactuar :I");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║   @     "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
				}
				else if(mov==1)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║@        "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
					y--;
				}
				else if(mov==2)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║   @  ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║ 
					x++;
				}
				else if(mov==3)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║     @   "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║ 
					y++;
				}
				else if(mov==4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Ay! *Te estampas con la pared*...creo que mejor vamos para otro lado");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║   @     "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
						wall++;
						if(wall==5)
						{
							System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
							System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
							System.out.println("║  ║ ║           ║Ay! *Te estampas con la pared por última vez, has muerto");
							System.out.println("║  ╚═╝           ╚");
							System.out.println("║   @     "+key+"      "+door+" ");
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
			}
			while(x==4 &y==2)
			{
			/*	System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║  ║ ║           ║");
				System.out.println("║  ╚═╝           ╚");
				System.out.println("║         "+key+"      "+door+"");
				System.out.println("║   @  ╔═╗       ╔ ");
				System.out.println("╚══════╝ ╚═══════╝"); 
			        // Posiciones @ ║ @ @ @ @ @ @ @ @║ */
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Introduce un número de los que aparecen arriba, si no, no puedo entenderte :o");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║   @  ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
				}
				else if(mov ==0)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║No hay nada con lo que interactuar :I");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║   @  ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
				}
				else if(mov==1)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║@     ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
					y--;
				}
				else if(mov==2)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Ay! *Te estampas con la pared*...creo que mejor vamos para otro lado");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║   @  ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
						wall++;
						if(wall==5)
						{
							System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
							System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
							System.out.println("║  ║ ║           ║Ay! *Te estampas con la pared por última vez, has muerto");
							System.out.println("║  ╚═╝           ╚");
							System.out.println("║         "+key+"      "+door+"");
							System.out.println("║   @  ╔═╗       ╔ ");
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
				else if(mov==3)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║     @╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║ 
					y++;
				}
				else if(mov==4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║   @     "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║ 
					x--;
				}
				
			}
			while(x==3 && y==3)
			{
			/*	System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║  ║ ║           ║");
				System.out.println("║  ╚═╝           ╚");
				System.out.println("║     @   "+key+"      "+door+" ");
				System.out.println("║      ╔═╗       ╔ ");
				System.out.println("╚══════╝ ╚═══════╝"); 
			        // Posiciones @ ║ @ @ @ @ @ @ @ @║  */
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Introduce un número de los que aparecen arriba, si no, no puedo entenderte :o");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║     @   "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
				}
				else if(mov ==0)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║No hay nada con lo que interactuar :I");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║     @   "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
				}
				else if(mov==1)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║   @     "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					y--;
				//	System.out.println("║ @          "+key+"      "+door+" ");
				}
				else if(mov==2)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║     @╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║ 
					x++;
				}
				else if(mov==3)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║       @ "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					y++;
				}
				else if(mov==4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝@          ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					x--;
				}
			}
			while(x==4 && y==3)
			{
			/*	System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║  ║ ║           ║");
				System.out.println("║  ╚═╝           ╚");
				System.out.println("║         "+key+"      "+door+"");
				System.out.println("║     @╔═╗       ╔ ");
				System.out.println("╚══════╝ ╚═══════╝"); 
			        // Posiciones @ ║ @ @ @ @ @ @ @ @║ 			*/
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Introduce un número de los que aparecen arriba, si no, no puedo entenderte :o");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║     @╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
				}
				else if(mov ==0)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║No hay nada con lo que interactuar :I");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║     @╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
				}
				else if(mov==1)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║   @  ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					y--;
				}
				else if(mov==2 || mov==3)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Ay! *Te estampas con la pared*...creo que mejor vamos para otro lado");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║     @╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
						wall++;
						if(wall==5)
						{
							System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
							System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
							System.out.println("║  ║ ║           ║Ay! *Te estampas con la pared por última vez, has muerto");
							System.out.println("║  ╚═╝           ╚");
							System.out.println("║         "+key+"      "+door+"");
							System.out.println("║     @╔═╗       ╔ ");
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
				else if(mov==4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║     @   "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
					x--;
				}
			}
			while(x==2 && y==3)
			{
			/*	System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║  ║ ║           ║");
				System.out.println("║  ╚═╝@          ╚");
				System.out.println("║         "+key+"      "+door+"");
				System.out.println("║      ╔═╗       ╔ ");
				System.out.println("╚══════╝ ╚═══════╝"); 
			        // Posiciones @ ║ @ @ @ @ @ @ @ @║		*/
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Introduce un número de los que aparecen arriba, si no, no puedo entenderte :o");
					System.out.println("║  ╚═╝@          ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
				}
				else if(mov ==0)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║No hay nada con lo que interactuar :I");
					System.out.println("║  ╚═╝@          ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
				}
				else if(mov==1)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Ay! *Te estampas con la pared*...creo que mejor vamos para otro lado");
					System.out.println("║  ╚═╝@          ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
						wall++;
						if(wall==5)
						{
							System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
							System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
							System.out.println("║  ║ ║           ║Ay! *Te estampas con la pared por última vez, has muerto");
							System.out.println("║  ╚═╝@          ╚");
							System.out.println("║         "+key+"      "+door+"");
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
				else if(mov==2)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║     @   "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					x++;
				}
				else if(mov==3)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝  @        ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					y++;
				}
				else if(mov==4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║@          ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
					x--;
				}
			}
		
	
			while(x==3 && y==4)
			{
			/*	System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║  ║ ║           ║");
				System.out.println("║  ╚═╝           ╚");
				System.out.println("║       @ "+key+"      "+door+" ");
				System.out.println("║      ╔═╗       ╔ ");
				System.out.println("╚══════╝ ╚═══════╝"); 
			        // Posiciones @ ║ @ @ @ @ @ @ @ @║	*/
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Introduce un número de los que aparecen arriba, si no, no puedo entenderte :o");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║       @ "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
				}
				else if(mov ==0)
				{
					if(key=="$")
					{
						key=" ";
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Coges la llave :D");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║       @ "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
		
					}
					else {
						System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
						System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
						System.out.println("║  ║ ║           ║No hay nada con lo que interactuar");
						System.out.println("║  ╚═╝           ╚");
						System.out.println("║       @ "+key+"      "+door+" ");
						System.out.println("║      ╔═╗       ╔ ");
						System.out.println("╚══════╝ ╚═══════╝"); 
					        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					}
				}
				else if(mov==1)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║     @   "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					y--;
				}
				else if(mov==2)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Ay! *Te estampas con la pared*...creo que mejor vamos para otro lado");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║       @ "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
						wall++;
						if(wall==5)
						{
							System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
							System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
							System.out.println("║  ║ ║           ║Ay! *Te estampas con la pared por última vez, has muerto");
							System.out.println("║  ╚═╝           ╚");
							System.out.println("║       @ "+key+"      "+door+" ");
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
				else if(mov==3)
				{
					if(key=="$")
					{
						System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
						System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
						System.out.println("║  ║ ║           ║¿Eso que hay en el suelo es una llave? :o");
						System.out.println("║  ╚═╝           ╚");
						System.out.println("║       @ "+key+"      "+door+" ");
						System.out.println("║      ╔═╗       ╔ ");
						System.out.println("╚══════╝ ╚═══════╝"); 
					        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
					}
					else if(key==" ")
					{
						System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
						System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
						System.out.println("║  ║ ║           ║");
						System.out.println("║  ╚═╝           ╚");
						System.out.println("║         @      "+door+" ");
						System.out.println("║      ╔═╗       ╔ ");
						System.out.println("╚══════╝ ╚═══════╝"); 
					        // Posiciones @ ║ @ @ @ @ @ @ @ @║
						y++;
					}
					
				}
				else if(mov==4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝  @        ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					x--;
				}
				
			}
			while(x==1 && y==3)
			{
				
			/*	System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║  ║ ║@          ║");
				System.out.println("║  ╚═╝           ╚");
				System.out.println("║         "+key+"      "+door+"");
				System.out.println("║      ╔═╗       ╔ ");
				System.out.println("╚══════╝ ╚═══════╝"); 
			        // Posiciones @ ║ @ @ @ @ @ @ @ @║		*/
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║@          ║Introduce un número de los que aparecen arriba, si no, no puedo entenderte :o");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
				}
				else if(mov ==0)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║@          ║No hay nada con lo que interactuar :I");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
				}
				else if(mov==1 || mov==4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║@          ║Ay! *Te estampas con la pared*...creo que mejor vamos para otro lado");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					wall++;
					if(wall==5)
					{
						System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
						System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
						System.out.println("║  ║ ║@          ║Ay! *Te estampas con la pared por última vez, has muerto");
						System.out.println("║  ╚═╝           ╚");
						System.out.println("║         "+key+"      "+door+"");
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
				else if(mov==2)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝@          ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
					x++;
				}
				else if(mov==3)
				{
					
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║  @        ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
					y++;
				}
				
			}
			while(x==2 && y==4)
			{
			/*	System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║  ║ ║           ║");
				System.out.println("║  ╚═╝  @        ╚");
				System.out.println("║         "+key+"      "+door+"");
				System.out.println("║      ╔═╗       ╔ ");
				System.out.println("╚══════╝ ╚═══════╝"); 
			        // Posiciones @ ║ @ @ @ @ @ @ @ @║		*/
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Introduce un número de los que aparecen arriba, si no, no puedo entenderte :o");
					System.out.println("║  ╚═╝  @        ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
				}
				else if(mov ==0)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║No hay nada con lo que interactuar :I");
					System.out.println("║  ╚═╝  @        ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
				}
				else if(mov==1)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝@          ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
					y--;
				}
				else if(mov==2)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║       @ "+key+"      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					x++;
				}
				else if(mov==3)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝    @      ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					y++;
				}
				else if(mov==4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║  @        ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					x--;
				}
			}
			while(x==1 && y==4)
			{
				/*	System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║  ║ ║  @        ║");
				System.out.println("║  ╚═╝           ╚");
				System.out.println("║         "+key+"      "+door+"");
				System.out.println("║      ╔═╗       ╔ ");
				System.out.println("╚══════╝ ╚═══════╝"); 
			        // Posiciones @ ║ @ @ @ @ @ @ @ @║		*/
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║  @        ║Introduce un número de los que aparecen arriba, si no, no puedo entenderte :o");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
				}
				else if(mov ==0)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║  @        ║No hay nada con lo que interactuar :I");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
				}
				else if(mov==1)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║@          ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
					y--;
				}
				else if(mov==2)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝  @        ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
					x++;
				}
				else if(mov==3)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║    @      ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
					y++;
				}
				else if(mov==4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║  @        ║Ay! *Te estampas con la pared*...creo que mejor vamos para otro lado");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
					wall++;
					if(wall==5)
					{
						System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
						System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
						System.out.println("║  ║ ║@          ║Ay! *Te estampas con la pared por última vez, has muerto");
						System.out.println("║  ╚═╝           ╚");
						System.out.println("║         "+key+"      "+door+"");
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
			}
			while(x==1 && y==5)
			{
			/*	System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║  ║ ║    @      ║");
				System.out.println("║  ╚═╝           ╚");
				System.out.println("║         "+key+"      "+door+"");
				System.out.println("║      ╔═╗       ╔ ");
				System.out.println("╚══════╝ ╚═══════╝");
					// Posiciones @ ║ @ @ @ @ @ @ @ @║	*/
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║    @      ║Introduce un número de los que aparecen arriba, si no, no puedo entenderte :o");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
				}
				else if(mov ==0)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║    @      ║No hay nada con lo que interactuar :I");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
				}
				else if(mov==1)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║  @        ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝");
						// Posiciones @ ║ @ @ @ @ @ @ @ @║
					y--;
					
				}
				else if(mov==2)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝    @      ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝");
						// Posiciones @ ║ @ @ @ @ @ @ @ @║
					x++;
				}
				else if(mov==3)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║      @    ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝");
						// Posiciones @ ║ @ @ @ @ @ @ @ @║
					y++;
				}
				else if(mov==4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║    @      ║Ay! *Te estampas con la pared*...creo que mejor vamos para otro lado");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝");
						// Posiciones @ ║ @ @ @ @ @ @ @ @║
					wall++;
					if(wall==5)
					{
						System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
						System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
						System.out.println("║  ║ ║    @      ║Ay! *Te estampas con la pared por última vez, has muerto");
						System.out.println("║  ╚═╝           ╚");
						System.out.println("║         "+key+"      "+door+"");
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
			}
			while(x==2 && y==5)
			{
			/*	System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║  ║ ║           ║");
				System.out.println("║  ╚═╝    @      ╚");
				System.out.println("║         "+key+"      "+door+"");
				System.out.println("║      ╔═╗       ╔ ");
				System.out.println("╚══════╝ ╚═══════╝");
					// Posiciones @ ║ @ @ @ @ @ @ @ @║	*/
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Introduce un número de los que aparecen arriba, si no, no puedo entenderte :o");
					System.out.println("║  ╚═╝    @      ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
				}
				else if(mov ==0)
				{
					if(key=="$")
					{
						key=" ";
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Coges la llave :D");
					System.out.println("║  ╚═╝    @      ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
					}
					else if(key==" ")
					{
						System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
						System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
						System.out.println("║  ║ ║           ║No hay nada con lo que interactuar :I");
						System.out.println("║  ╚═╝    @      ╚");
						System.out.println("║         "+key+"      "+door+"");
						System.out.println("║      ╔═╗       ╔ ");
						System.out.println("╚══════╝ ╚═══════╝"); 
					        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					}
				}
				else if(mov==1)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝  @        ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝");
						// Posiciones @ ║ @ @ @ @ @ @ @ @║
					y--;
				}
				else if(mov==2)
				{
					if(key=="$"){
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║¿Eso que hay en el suelo es una llave? :o");
					System.out.println("║  ╚═╝    @      ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝");
						// Posiciones @ ║ @ @ @ @ @ @ @ @║
					}
					else if(key==" ")
					{
						System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
						System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
						System.out.println("║  ║ ║           ║");
						System.out.println("║  ╚═╝           ╚");
						System.out.println("║         @      "+door+" ");
						System.out.println("║      ╔═╗       ╔ ");
						System.out.println("╚══════╝ ╚═══════╝"); 
					        // Posiciones @ ║ @ @ @ @ @ @ @ @║
						x++;
					}
				}
				else if(mov==3)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝      @    ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝");
						// Posiciones @ ║ @ @ @ @ @ @ @ @║
					y++;
				}
				else if(mov==4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║    @      ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝");
						// Posiciones @ ║ @ @ @ @ @ @ @ @║
					x--;
				}
			}
			while(x==3 && y==5)
			{
			/*	System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║  ║ ║           ║");
				System.out.println("║  ╚═╝           ╚");
				System.out.println("║         @            "+door+" ");
				System.out.println("║      ╔═╗       ╔ ");
				System.out.println("╚══════╝ ╚═══════╝"); 
			        // Posiciones @ ║ @ @ @ @ @ @ @ @║	*/
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Introduce un número de los que aparecen arriba, si no, no puedo entenderte :o");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         @      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
				}
				else if(mov ==0)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║No hay nada con lo que interactuar :I");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         @      "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
				}
				else if(mov==1)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║       @        "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					y--;
				}
				else if(mov==2)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║                "+door+" ");
					System.out.println("║      ╔═╗@      ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					x++;
				}
				else if(mov==3)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║           @    "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					y++;
				}
				else if(mov==4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝    @      ╚");
					System.out.println("║                "+door+" ");
					System.out.println("║      ╔═╗       ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					x--;
				}
			}
			while(x==4 && y==5)
			{
			/*	System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
				System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
				System.out.println("║  ║ ║           ║");
				System.out.println("║  ╚═╝           ╚");
				System.out.println("║         "+key+"      "+door+"");
				System.out.println("║      ╔═╗@      ╔ ");
				System.out.println("╚══════╝ ╚═══════╝"); 
			        // Posiciones @ ║ @ @ @ @ @ @ @ @║	*/
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Introduce un número de los que aparecen arriba, si no, no puedo entenderte :o");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗@      ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
				}
				else if(mov ==0)
				{
					if(key=="$")
					{
						key=" ";
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Coges la llave :D");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗@      ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
		
					}
					else {
						System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
						System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
						System.out.println("║  ║ ║           ║No hay nada con lo que interactuar");
						System.out.println("║  ╚═╝           ╚");
						System.out.println("║         "+key+"      "+door+"");
						System.out.println("║      ╔═╗@      ╔ ");
						System.out.println("╚══════╝ ╚═══════╝"); 
					        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
				}
				}
				else if(mov==1 || mov==2)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║Ay! *Te estampas con la pared*...creo que mejor vamos para otro lado");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗@      ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					wall++;
					if(wall==5)
					{
						System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
						System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
						System.out.println("║  ║ ║           ║Ay! *Te estampas con la pared por última vez, has muerto");
						System.out.println("║  ╚═╝           ╚");
						System.out.println("║         "+key+"      "+door+"");
						System.out.println("║      ╔═╗@      ╔ ");
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
				else if(mov==3)
				{
					System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
					System.out.println("║  ║ ║           ║");
					System.out.println("║  ╚═╝           ╚");
					System.out.println("║         "+key+"      "+door+"");
					System.out.println("║      ╔═╗  @    ╔ ");
					System.out.println("╚══════╝ ╚═══════╝"); 
				        // Posiciones @ ║ @ @ @ @ @ @ @ @║	
					y++;
				}
				else if(mov==4)
				{
					if(key=="$")
					{
						System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
						System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
						System.out.println("║  ║ ║           ║¿Eso que hay en el suelo es una llave? :o");
						System.out.println("║  ╚═╝           ╚");
						System.out.println("║         "+key+"      "+door+"");
						System.out.println("║      ╔═╗@      ╔ ");
						System.out.println("╚══════╝ ╚═══════╝"); 
					        // Posiciones @ ║ @ @ @ @ @ @ @ @║
					}
					else {
						System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
						System.out.println("╔══╗ ╔═══════════╗ 1: Izquierda 2:Abajo 3:Derecha 4:Arriba 0:Interactuar");
						System.out.println("║  ║ ║           ║");
						System.out.println("║  ╚═╝           ╚");
						System.out.println("║         @	 "+door+" ");
						System.out.println("║      ╔═╗       ╔ ");
						System.out.println("╚══════╝ ╚═══════╝"); 
					        // Posiciones @ ║ @ @ @ @ @ @ @ @║
						x--;
					}
					
				}
			}
			while(x==1 && y==6)
			{
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					
				}
				if(mov==0)
				{
					
				}
				if(mov==1)
				{
					
				}
				if(mov==2)
				{
					
				}
				if(mov==3)
				{
					
				}
				if(mov==4)
				{
					
				}
			}
			while(x==2 && y==6)
			{
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					
				}
				if(mov==0)
				{
					
				}
				if(mov==1)
				{
					
				}
				if(mov==2)
				{
					
				}
				if(mov==3)
				{
					
				}
				if(mov==4)
				{
					
				}
			}
			while(x==3 && y==6)
			{
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					
				}
				if(mov==0)
				{
					
				}
				if(mov==1)
				{
					
				}
				if(mov==2)
				{
					
				}
				if(mov==3)
				{
					
				}
				if(mov==4)
				{
					
				}
			}
			while(x==4 && y==6)
			{
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					
				}
				if(mov==0)
				{
					
				}
				if(mov==1)
				{
					
				}
				if(mov==2)
				{
					
				}
				if(mov==3)
				{
					
				}
				if(mov==4)
				{
					
				}
			}
			//...
			while(x==1 && y==7)
			{
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					
				}
				if(mov==0)
				{
					
				}
				if(mov==1)
				{
					
				}
				if(mov==2)
				{
					
				}
				if(mov==3)
				{
					
				}
				if(mov==4)
				{
					
				}
			}
			while(x==2 && y==7)
			{
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					
				}
				if(mov==0)
				{
					
				}
				if(mov==1)
				{
					
				}
				if(mov==2)
				{
					
				}
				if(mov==3)
				{
					
				}
				if(mov==4)
				{
					
				}
			}
			while(x==3 && y==7)
			{
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					
				}
				if(mov==0)
				{
					
				}
				if(mov==1)
				{
					
				}
				if(mov==2)
				{
					
				}
				if(mov==3)
				{
					
				}
				if(mov==4)
				{
					
				}
			}
			while(x==4 && y==7)
			{
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					
				}
				if(mov==0)
				{
					
				}
				if(mov==1)
				{
					
				}
				if(mov==2)
				{
					
				}
				if(mov==3)
				{
					
				}
				if(mov==4)
				{
					
				}
			}
			//...
			while(x==1 && y==8)
			{
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					
				}
				if(mov==0)
				{
					
				}
				if(mov==1)
				{
					
				}
				if(mov==2)
				{
					
				}
				if(mov==3)
				{
					
				}
				if(mov==4)
				{
					
				}
			}
			while(x==2 && y==8)
			{
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					
				}
				if(mov==0)
				{
					
				}
				if(mov==1)
				{
					
				}
				if(mov==2)
				{
					
				}
				if(mov==3)
				{
					
				}
				if(mov==4)
				{
					
				}
			}
			while(x==3 && y==8)
			{
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					
				}
				if(mov==0)
				{
					
				}
				if(mov==1)
				{
					
				}
				if(mov==2)
				{
					
				}
				if(mov==3)
				{
					
				}
				if(mov==4)
				{
					
				}
			}
			while(x==4 && y==8)
			{
				in = new Scanner(System.in);
				mov = in.nextInt();
				if(mov<0 || mov>4)
				{
					
				}
				if(mov==0)
				{
					
				}
				if(mov==1)
				{
					
				}
				if(mov==2)
				{
					
				}
				if(mov==3)
				{
					
				}
				if(mov==4)
				{
					
				}
			}
	
}
}
}
