package milosbogdanovic;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		Sortiranje sort = new Sortiranje();

		System.out.println("Unesite koje sortiranje želite unosom brojeva od 1 do 3!!");
		System.out.println("Bubble sort: 1");
		System.out.println("Selection sort: 2");
		System.out.println("Merge sort: 3");
		int n = sc.nextInt();

		switch (n) {
		case 1: {
			System.out.println("Odabrali ste Bubble sortiranje!\n");
			sort.bubbleSortiranje();
			System.out.println(
					"\nBubble sortiranje je jedan od jednostavnijih algoritama za sortiranje. \nAlgoritam se sastoji od upoređivanja svakog elementa niza sa svakim drugim elementom niza i razmenom pozicija ako je potrebno, sve dok niz ne bude sortiran.\nOsnovna ideja iza Bubble sortiranja je da se manji elementi niza postepeno \"izbijaju\" na početak niza, dok veći elementi polako prelaze na kraj niza.\nU svakoj iteraciji kroz niz, algoritam prolazi kroz sve elemente niza i upoređuje ih sa susednim elementima.\nAko je vrednost susednog elementa manja od vrednosti trenutnog elementa, tada se pozicije elemenata razmenjuju.\nOvaj proces se ponavlja sve dok svi elementi niza ne budu u sortiranom redosledu.\nNedostatak: Vremenska složenost Bubble sortiranja ga čini manje efikasnim od drugih algoritama za sortiranje");
			break;
		}
		case 2: {
			System.out.println("Odabrali ste Selection sortiranje!\n");
			sort.selectionSortiranje();
			System.out.println(
					"\n -Selection sort je algoritam za sortiranje niza koji radi tako što pronalazi najmanji element u nizu i zatim ga stavlja na prvo mesto, \nzatim pronalazi drugi najmanji element i stavlja ga na drugo mesto, i tako dalje, sve dok se ceo niz ne sortira.\nOsnovna ideja iza Selection sortiranja je da se pronađe najmanji element u nizu i stavi na prvu poziciju.\nZatim se pronađe drugi najmanji element i stavi na drugu poziciju, i tako se nastavlja sve dok se ceo niz ne sortira.");
			break;
		}
		case 3: {
			System.out.println("Odabrali ste Merge sortiranje!\n");
			sort.mergeSortiranje();
			System.out.println(
					"\nMerge sort je algoritam za sortiranje niza koji koristi princip \"podeli pa vladaj\".\nTo znači da se niz deli na manje podnizove, svaki od njih se sortira zasebno, a zatim se sortirani podnizovi spajaju u jedan veliki sortirani niz.\nOsnovna ideja Merge sort-a je da se niz razbije u više nizova deljenjem na pola pa na pola.\nNiz se deli sve dok ne ostane jedan član, a zatim se ponovo spajaju jedan po jedan element i tom prilikom se sortiraju.\nNa kraju dobijamo ukupni niz koji je sortiran!");
			break;
		}
		default:
			throw new IllegalArgumentException("Morate uneti od 1 do 3 a vi ste uneli: " + n);
		}

	}

}
