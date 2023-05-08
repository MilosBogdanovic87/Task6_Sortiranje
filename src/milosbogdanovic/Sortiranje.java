package milosbogdanovic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Sortiranje {

	// Metoda za Bubble sortiranje
	public void bubbleSortiranje() throws NumberFormatException, IOException {
		int[] a = new int[100];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos dimenzije niza
		System.out.println("Unesite broj elemenata n niza a:");
		int n = Integer.parseInt(ulaz.readLine());

		// Unos elemenata niza a
		System.out.println("Unesite elemente niza a: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Integer.parseInt(ulaz.readLine());
		}

		// Štampanje niza pre sortiranja
		System.out.println("Niz a pre sortiranja: ");
		for (int i = 1; i <= n; i++)
			System.out.print(a[i] + " ");

		// Sortiranje elemenata niza
		for (int i = 1; i <= n - 1; i++)
			for (int j = i + 1; j <= n; j++) {
				if (a[i] > a[j]) {
					// Zamena elemenata niza a
					int pom = a[i];
					a[i] = a[j];
					a[j] = pom;
				}
			}

		// Štampanje niza posle sortiranja
		System.out.println("\nNiz a posle sortiranja: ");
		for (int i = 1; i <= n; i++)
			System.out.print(a[i] + " ");
	}

	// Metoda za Selection sortiranje
	public void selectionSortiranje() {

		int velicina, i, j, pom;
		int a[] = new int[50];

		Scanner scan = new Scanner(System.in);
		System.out.print("Unesite broj elemenata n niza a: ");
		velicina = scan.nextInt();

		System.out.println("Unesite elemente niza a: ");
		for (i = 0; i < velicina; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = scan.nextInt();
		}

		System.out.print("Sortiranje niza metodom Selection..\n");
		for (i = 0; i < velicina; i++) {
			for (j = i + 1; j < velicina; j++) {
				if (a[i] > a[j]) {
					pom = a[i];
					a[i] = a[j];
					a[j] = pom;
				}
			}
		}

		System.out.print("\nNiz a posle sortiranja: ");
		for (i = 0; i < velicina; i++) {
			System.out.print(a[i] + "  ");
		}

	}

	// Metoda za Merge sortiranje
	public void mergeSortiranje() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite velicinu niza a: ");
		int n = sc.nextInt();

		int[] a = new int[n];
		System.out.println("Unesite elemente niza a: ");
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}

		mergeSort(a, 0, n - 1);

		System.out.println("Sortiran niz:");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void mergeSort(int[] a, int start, int kraj) {
		if (start < kraj) {
			int sred = (start + kraj) / 2;
			mergeSort(a, start, sred);
			mergeSort(a, sred + 1, kraj);
			merge(a, start, sred, kraj);
		}
	}

	public static void merge(int[] a, int start, int sred, int kraj) {
		int i, j, k;
		int n1 = sred - start + 1;
		int n2 = kraj - sred;

		int[] prviNiz = new int[n1];
		int[] drugiNiz = new int[n2];

		// kopiramo podatke u privremene nizove
		for (i = 0; i < n1; i++) {
			prviNiz[i] = a[start + i];
		}
		for (j = 0; j < n2; j++) {
			drugiNiz[j] = a[sred + 1 + j];
		}

		i = 0; // početni indeks prvog podniza
		j = 0; // početni indeks drugog podniza
		k = start; // početni indeks spojenog podniza

		// spajamo podnizove u sortirani niz
		while (i < n1 && j < n2) {
			if (prviNiz[i] <= drugiNiz[j]) {
				a[k] = prviNiz[i];
				i++;
			} else {
				a[k] = drugiNiz[j];
				j++;
			}
			k++;
		}

		// dodajemo preostale elemente iz prvog podniza
		while (i < n1) {
			a[k] = prviNiz[i];
			i++;
			k++;
		}

		// dodajemo preostale elemente iz drugog podniza
		while (j < n2) {
			a[k] = drugiNiz[j];
			j++;
			k++;
		}
	}

}
