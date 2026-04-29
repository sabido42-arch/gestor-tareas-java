package gestiontareas;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionTareas {
	
	static ArrayList<Tarea> listaTareas = new ArrayList<>();
	static int contadorId = 1;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		while (opcion != 5) {
			
			System.out.println("MENU");
			System.out.println("1. Añadir tarea");
			System.out.println("2. Ver tareas");
			System.out.println("3. Marcar como completada");
			System.out.println("4. Eliminar tarea");
			System.out.println("5. Salir");
			
			System.out.println("Selecciona una opción: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
			
			case 1:
				añadirTarea(sc);
				break;
				
			case 2: 
				mostrarTareas();
				break;
				
			case 3:
				completarTarea(sc);
				break;
				
			case 4:
				eliminarTarea(sc);
				break;
				
			case 5:
				System.out.println("Saliendo");
				break;
				
				default: 
					System.out.println("Opción no válida");
			
			}
		}
	}
	
	// Métodos
			static void añadirTarea(Scanner sc) {
				
				System.out.println("Introduce la descripción de la tarea: ");
				String descripcion = sc.nextLine();
				
				Tarea nueva = new Tarea(contadorId, descripcion);
				listaTareas.add(nueva);
				
				System.out.println("Tarea añadida correctamente");
				contadorId ++;
				}
			
			static void mostrarTareas() {
				
				if(listaTareas.isEmpty()) {
					System.out.println("No hay tareas registradas");
				} else {
					System.out.println("LISTA DE TAREAS");
					for(int i = 0; i < listaTareas.size(); i ++) {
						System.out.println(listaTareas.get(i));
						}
					}
			}
			
			static void completarTarea(Scanner sc) {
				
				System.out.println("Introduce el ID de la tarea a completar; ");
				int id = sc.nextInt();
				
				boolean encontrada = false;
				
				for(int i = 0; i < listaTareas.size(); i ++) {
					
					if(listaTareas.get(i).getid()== id) {
						listaTareas.get(i).completar();
						System.out.println("Tarea marcada como completada");
						encontrada = true;
						break;
					}
				}
				
				if(!encontrada) {
					System.out.println("Tarea no encontrada");
				}
			}
			
			static void eliminarTarea(Scanner sc) {
				
				
				System.out.println("Introduce el ID de la tarea a eliminar: ");
				int id = sc.nextInt()
;
				boolean eliminada = false;
				
				for(int i = 0; i < listaTareas.size(); i ++) {
					
					if(listaTareas.get(i).getid() ==  id) {
						listaTareas.remove(i);
						System.out.println("Tarea eliminada correctamente");
						eliminada = true;
						break;
					}
				}
				if(!eliminada) {
					System.out.println("Tarea no encontrada");
				}
			}
	}		
			

