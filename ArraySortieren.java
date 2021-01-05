package tests;


/**
 * Eine Klasse, die verschiedene Methoden zum sortieren 
 * von Arrays bereitstellt, aber auch ein paar extra Methoden, die
 * nicht unbedingt zum sortieren notwendig sind.
 * 
 * @author Jannik Schmidtke
 * @version 0.1
 * @since 20.12.2020
 *
 */
public class ArraySortieren {

	/**
	 * 
	 * Die Main Methode.
	 * 
	 * @param args Kommandozeilenparameter
	 */
	public static void main(String[] args) {
		ArraySortieren as = new ArraySortieren();
		as.start();
	}
	
	/**
	 * Initialisierungsmethode.
	 */
	private void start() {
		int[] arr = {343, 647, 531, 999, 355, 531, 798, 33, 41, 20, 220, 666, 187, 2000};
		//int[] simpleArr = {1, 2, 3, 4, 5};
		System.out.println(indexOfStartAt(indexOf(531, arr)+1, 531, arr));
	}
	
	/**
	 * 
	 * Sortiert ein Array in aufsteigender 
	 * Reihenfolge.
	 * 
	 * @param arr Das zu sortierende Array
	 */
	public void sortArrayAscending(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	/**
	 * 
	 * Sortiert ein Array in absteigender
	 * Reihenfolge.
	 * 
	 * @param arr Das zu sortierende Array
	 */
	public void sortArrayDescending(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
	}
	
	/**
	 * 
	 * Eine Methode um ein Array zufällig auszugeben.
	 * 
	 * @param arr Das Array, welches zufällig ausgegeben werden soll.
	 */
	public void randomizeArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int randomIndex = (int) Math.floor(Math.random() * arr.length);
			int tmp = arr[randomIndex];
			arr[randomIndex] = arr[i];
			arr[i] = tmp;
		}
	}
	
	/**
	 * 
	 * Gibt ein Array rückwarts aus.
	 * 
	 * @param arr Das zu sortierende Array
	 */
	public void reverseArray(int[] arr) {
		for(int j = 0, i = arr.length-1; j < i; j++, i--) {
			int tmp = arr[j];
			arr[j] = arr[i];
			arr[i] = tmp;
		}
	}
	
	/**
	 * 
	 * Eine Methode, um das erste Element eines 
	 * Arrays zu bekommen.
	 * 
	 * @param arr Das Array
	 * @return Gibt den Wert von dem übergebenen Array
	 * an der Stelle 0 zurück.
	 */
	public int getFirstElement(int[] arr) {
		return arr[0];
	}
	
	/**
	 * 
	 * Eine Methode, um das letzte Element eines
	 * Arrays zu bekommen.
	 * 
	 * @param arr Das Array
	 * @return Gibt den Wert an der letzten Stelle des 
	 * übergebenen Arrays zurück.
	 */
	public int getLastElement(int[] arr) {
		return arr[arr.length-1];
	}
	
	/**
	 * 
	 * Eine Methode, um die Länge eines
	 * Arrays zu bekommen.
	 * 
	 * @param arr Das Array
	 * @return Gibt die Länge des übergebenen Arrays zurück.
	 */
	public int getLength(int[] arr) {
		return arr.length;
	}
	
	/**
	 * 
	 * Eine Methode, um herauszufinden welchen Index
	 * eine bestimmte Zahl in einem Array hat.
	 * 
	 * @param num Die Zahl, von welcher der Index ermittelt werden soll.
	 * @param arr Das Array, in welchem der Index, der Zahl ermittelt werden soll.
	 * @return Gibt den Index der übergebenen Zahl zurück.
	 */
	public int indexOf(int num, int[] arr) {
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != num) {
				j++;
			} else {
				break;
			}
		}
		return j;
	}
	
	/**
	 * 
	 * Eine Methode, um den Index einer bestimmten Zahl,
	 * ab einem bestimmten Startpunkt, herauszufinden.
	 * 
	 * @param startAt Der Startpunkt ab dem angefangen werden soll zu suchen.
	 * @param num Die Zahl, von welcher der Index ermittelt werden soll.
	 * @param arr Das Array, in welchem der Index der Zahl, von einem bestimmten
	 * Startpunkt an, ermittelt werden soll. 
	 * @return Gibt den Index der übergebenen Zahl, ab dem übergebenen Startpunkt, zurück.
	 */
	public int indexOfStartAt(int startAt, int num, int[] arr) {
		int j = startAt;
		for(int i = startAt; i < arr.length; i++) {
			if(arr[i] != num) {
				j++;
			} else {
				break;
			}
		}
		return j;
	}
	
	/**
	 * 
	 * Eine Methode, um den Wert eines Index, eines Arrays zu ermitteln.
	 * 
	 * @param i Der Index, von dem der Wert ausgegeben werden soll.
	 * @param arr Das Array, in welchem ermittelt werden soll.
	 * @return Gibt den Wert, des übergebenen Index, des übergebenen
	 * Arrays aus.
	 */
	public int getValueAt(int i, int[] arr) {
		return arr[i];
	}
	
	/**
	 * 
	 * Eine Methode, um den größten Wert eines Arrays zu ermitteln.
	 * 
	 * @param arr Das Array, in dem ermittelt werden soll.
	 * @return Gibt den größten Wert, des übergebenen Arrays zurück.
	 */
	public int getMaxValue(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	/**
	 * 
	 * Eine Methode, um den kleinsten Wert eines Arrays zu ermitteln.
	 * 
	 * @param arr Das Array, in dem ermittelt werden soll.
	 * @return Gibt den kleinsten Wert, des übergebenen Arrays zurück.
	 */
	public int getMinValue(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	/**
	 * 
	 * Eine Methode, um die Zahlen eines Arrays zu summieren.
	 * 
	 * @param arr Das Array, welches summiert werden soll.
	 * @return Gibt die Summe der Zahlen, des übergebenen Arrays zurück.
	 */
	public int sumArray(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	/**
	 * 
	 * Eine Methode, die den Durchschnitt eines Arrays ermittelt.
	 * 
	 * @param arr Das Array, aus dem der Durchschnitt ermittelt werden soll.
	 * @return Gibt den Durchschnitt, aus dem übergebenen Array zurück.
	 */
	public int arrayAverage(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum/arr.length;
	}
	
	/**
	 * 
	 * Eine Methode, welche die Anzahl der Geraden Zahlen, eines Arrays ermittelt.
	 * 
	 * @param arr Das Array, in dem ermittelt werden soll.
	 * @return Gibt die Anzahl der Geraden Zahlen, des übergebenen Arrays zurück.
	 */
	public int countEvenNumbers(int[] arr) {
		int evenNumbers = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenNumbers++;
			}
		}
		return evenNumbers;
	}
	
	/**
	 * 
	 * Eine Methode, welche die Anzahl der Ungeraden Zahlen, eines Arrays ermittelt.
	 * 
	 * @param arr Das Array, in dem ermittelt werden soll.
	 * @return Gibt die Anzahl der Ungeraden Zahlen, des übergebenen Arrays zurück.
	 */
	public int countOddNumbers(int[] arr) {
		int oddNumbers = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				oddNumbers++;
			}
		}
		return oddNumbers;
	}
	
	/**
	 * 
	 * Eine Methode, welche die Geraden Zahlen auf der Konsole ausgibt.
	 * 
	 * @param arr Das Array, aus welchem die Geraden Zahlen ausgegeben werden sollen.
	 */
	public void printEvenNumbers(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				if(i == arr.length-1) {
					System.out.print(arr[i]);
				} else {
					System.out.print(arr[i] + ", ");
				}
			}
		}
	}
	
	
	/**
	 * 
	 * Eine Methode, welche die Ungeraden Zahlen auf der Konsole ausgibt.
	 * 
	 * @param arr Das Array, aus welchem die Ungeraden Zahlen ausgegeben werden sollen.
	 */
	public void printOddNumbers(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				if(i == arr.length-1) {
					System.out.print(arr[i]);
				} else {
					System.out.print(arr[i] + ", ");
				}
			}
		}
	}
	
	/**
	 * 
	 * Eine Methode, um ein Array schöner darzustellen.
	 * 
	 * @param arr Das Array, welches schöner dargestellt werden soll.
	 * @return Gibt das übergebene Array schöner und übersichtlicher zurück.
	 */
	public String toString(int[] arr) {
		String str = "";
 		for(int i = 0; i < arr.length; i++) {
 			if(i == arr.length-1) {
 				str += String.valueOf(arr[i]);
 			} else {
 				str += String.valueOf(arr[i]) + ", ";
 			}
		}
 		return "["+str+"]";
	}
}
