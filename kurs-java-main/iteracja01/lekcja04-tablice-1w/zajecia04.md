
Zajęcia 04
============
1. [Tablice jednowymiarowe](https://github.com/robertgrochowski/kurs-java/blob/main/iteracja01/lekcja04-tablice-1w/zajecia04.md#tablice-jednowymiarowe)
2. [Dodatkowe materiały](https://github.com/robertgrochowski/kurs-java/blob/main/iteracja01/lekcja04-tablice-1w/zajecia04.md#dodatkowe-materia%C5%82y)

## Tablice (jednowymiarowe)

Do tej pory tworzyliśmy pojedyncze zmienne, do których przypisywaliśmy wartości liczbowe, napisy itd.

O ile operujemy na 1, 2, czy 5 takich zmiennych to nie ma większego problemu, jednak gdy mielibyśmy utworzyć 100 lub więcej zmiennych i wykonywać na nich działania, to robi się już bardzo nieprzyjemnie, bo:

-   jeśli numerowaliśmy zmienne jako np.  _computer1_,  _computer2_,  _computer3_,...,  _computer100_, okazuje się, że po usunięciu jednej zmiennej np. z numerem 30, należałoby zmienić nazwę wszystkich pozostałych zmiennych od 31 wzwyż,
-   kod staje się bardzo długi i powtarzalny i nie ma prostego sposobu, żeby uniknąć zapisania minimum 100 linijek kodu w celu utworzenia 100 obiektów.

Właśnie w celu rozwiązania takich problemów w programowaniu powstały **tablice**, czyli struktury danych, które pozwalają przechowywać więcej niż jedną wartość lub obiekt tego samego typu.

Deklaracja i inicjalizacja tablicy jest bardzo podobna deklaracji i inicjalizacji zmiennych.

❗ Znacznika możemy użyc przed/po nazwie tablicy, preferowany sposób to **przed**!

ZNACZNIK TABLICY - []

Deklaracja
TYP_ZMIENNYCH [] NAZWA_TABLICY;
```
int [] numbers;
```

Inicjalizacja
NAZWA_TABLICY = new TYP_ZMIENNYCH[ROZMIAR_TABLICY];
NAZWA_TABLICY = new int {1, 2, 3};
NAZWA_TABLICY = {1, 2, 3};
```
numbers = new int [10];
numbers = new int {1, 2, 3};
numbers = {1, 2, 3};
```

Deklaracja + Inicjzalizacja
TYP_ZMIENNYCH [] NAZWA_TABLICY = new TYP_ZMIENNYCH[ROZMIAR_TABLICY];
```
int [] numbers = new int [10];
int [] numbers = new int [] {1, 2, 3};
int [] numbers = {1, 2, 3};
```

Tablice zaraz po utworzeniu wypełnione są wartościami domyślnymi, dla

- liczb całkwoitych wartość domyślna to 0
- liczb rzeczywistych wartość domyślna to 0.0
- typu logicznego boolean wartość domyślna to false
- typu obiektowego np. String wartość domyślna to null

Przykładowe tablice (niżej) przechowują odpowiednio 10 zer oraz 10 wartości null.
```
int numbers[] = new int[10];
String names[] = new String[10];
```
![Skrót fori](https://app.javastart.pl/img/arrays_empty.png)

Przykład operacji na tablicach
```
//utworzenie tablicy, domyślnie wypełniona zerami(domyślna wartość int)  
int[] numbers = new int[5];  
//uzupełnienie wartości w poszczególnych komórkach tablicy  
numbers[0] = 1; // wypisanie wartości z tablicy
numbers[1] = 5;  
numbers[2] = 10;  
numbers[3] = 15;  
numbers[4] = 20;  
//podobnie wyświetlamy wprowadzone wartości  
System.out.println(numbers[0]); // nadpisanie wartości z tablicy
System.out.println(numbers[1]);  
System.out.println(numbers[2]);  
System.out.println(numbers[3]);  
System.out.println(numbers[4]);
```

Żeby dostać się do danego elementu musimy podać "adres" elementu w tablicy. Porównajmy tablicę do pudełka na leki na każdy dzień tygodnia. Żeby wyciągnąć leki musimy podać dzień, np. poniedziałek. W tablicach zamiast dnia mamy index. Wartości w tablicy indeksujemy od 0! Czyli pierwsza wartość będzie znajdować się pod indeksem 0. Jeżeli nasza tablic ma 10 elementów, to ostatni z nich będzie znajdować się pod indeksem 9 (dlatego, że indeksujemy od 0).

Każda tablica w Javie posiada ważną własność, którą możemy odczytać - jest to jej rozmiar. Czasami wielkość tablicy będzie ustalana na podstawie danych wprowadzonych przez użytkownika i nie będziesz jej znać, wtedy musisz się odwołać do wielkości tablicy o nazwie **length**. Własność length zwraca realny rozmiar tablicy. Jeśli więc utworzysz tablicę z 10 elementami i będą w niej tylko wartości domyślne, to _length_ i tak zwróci 10.

```
System.out.println(numbers.length);  
```

📚 Stwórz tablicę, która będzie przechowywać dni tygodnia i przypisz do niej wartości. A następnie wypisz szósty ostatni dzień tygodnia z tablicy.
Uwaga rozmiar tablicy musi być idealny!
Uwaga wypisując ostatni element z tablicy nie możesz użyc stałej liczby - 6.

```
String[] dniTygdodnia = new String[7]; 
  
dniTygdodnia[0] = "Poniedzialek";  
dniTygdodnia[1] = "Wtorek";  
dniTygdodnia[2] = "Środa";  
dniTygdodnia[3] = "Czwartek";  
dniTygdodnia[4] = "Piątek";  
dniTygdodnia[5] = "Sobota";  
dniTygdodnia[6] = "Niedziela";

System.out.println(dniTygdodnia[dniTygodnia.length]);
```

📚 Za pomocą pętli wypisz wszystkie dni tygodnia!
❓ Jaka pętla będzie do tego najlepsza?

```
for (int x = 0; x < dniTygdodnia.length; x++) {  
   System.out.print(dniTygdodnia[x] + " ");  
}
```
lub
```
int z = 0;  
while (z < dniTygdodnia.length) {  
   System.out.print(dniTygdodnia[z] + " ");  
  z++;  
}
```

📚 Zadeklaruj tablicę int'ów wszystkimi sposobami, przypisz do nich wartości, wypisz ich długość i po jednym elemencie.

```
int[] sposobPierwszy = new int[2];  
sposobPierwszy[0] = 1;  
sposobPierwszy[1] = 2;  
System.out.println("Dlugosc tablicy sposobPierwszy to " + sposobPierwszy.length);  
System.out.println("Element spod indeksu 0 z tablicy sposobPierwszy to " + sposobPierwszy[0]);  
  
int[] sposobDrugi = new int[]{1, 2};  
System.out.println("Dlugosc tablicy sposobDrugi to " + sposobPierwszy.length);  
System.out.println("Element spod indeksu 0 z tablicy sposobDrugi to " + sposobDrugi[0]);  
  
int [] sposobTrzeci = {1, 2};  
System.out.println("Dlugosc tablicy sposobTrzeci to " + sposobTrzeci.length);  
System.out.println("Element spod indeksu 0 z tablicy sposobTrzeci to " + sposobTrzeci[0]);
```

📚 Dana jest tablica:
```
int [] wszystkieLiczby = {23, 1, 92, -23, 123, 334, -231};
```
- wypisz całą tablicę
```
for (int i = 0; i < wszystkieLiczby.length; i++) {  
    System.out.println("Element pod indeskem " + i + " ma wartosc " + wszystkieLiczby[i]);  
}
```
- wypisz tylko liczby większe niż 4
```
for (int i = 0; i < wszystkieLiczby.length; i++) {  
    if (wszystkieLiczby[i] > 4) {  
        System.out.println(wszystkieLiczby[i]);  
  }  
}
```
- wypisz sume elementów tablicy
```
int suma = 0;  
for (int i = 0; i < wszystkieLiczby.length; i++) {  
    suma += wszystkieLiczby[i];  
}  
System.out.println("Suma to " + suma);
```

❗ W dwóch poniższych przykładach zwracamy uwagę na to jaką wartością zainicjalizować zmienną najwieksza/najmniejsza, nie możemy tam wstawić dowolnej liczby.

- znajdz największy element
```
int najwiekszy = wszystkieLiczby[0];  
for (int i = 0; i < wszystkieLiczby.length; i++) {  
    if (wszystkieLiczby[i] > najwiekszy) {  
        najwiekszy = wszystkieLiczby[i];  
  }  
}  
System.out.println("Najwieksza liczba to " + najwiekszy);
```
- znajdz najmniejszy element
```
int [] wszystkieLiczby = {23, 1, 92, -23, 123, 334, -231};  
int najmniejsza = wszystkieLiczby[0];  
for (int i = 0; i < wszystkieLiczby.length; i++) {  
    if (wszystkieLiczby[i] < najmniejsza) {  
        najmniejsza = wszystkieLiczby[i];  
  }  
}  
System.out.println("Najmniejsza liczba to " + najmniejsza);
```
- wypisz elementy o parzystej wartości
```
for (int i = 0; i < wszystkieLiczby.length; i++) {  
    if (wszystkieLiczby[i] % 2 == 0) {  
        System.out.println(wszystkieLiczby[i]);  
  }  
}
```
- wypisz elementy na nieparzystych indeskach
```
for (int i = 0; i < wszystkieLiczby.length; i++) {  
    if (i % 2 != 0) {  
        System.out.println(wszystkieLiczby[i]);  
  }  
}
```
- wypisz tablicę od tyłu
```
for (int i = wszystkieLiczby.length - 1; i >= 0; i--) {  
    System.out.println(wszystkieLiczby[i]);  
}
```

⌨️ NAZWA_TABLICY.fori - tworzy pętlę for iterującą się po danej tablicy

📚 Zadeklaruj tablicę 20-elementową i przypisz do niej liczby od 1 do 20.
```
int [] dwadziesciaLiczb = new int[20];  
for (int i = 0; i < dwadziesciaLiczb.length; i++) {  
    dwadziesciaLiczb[i] = i + 1;  
}
```

📚 Stwórz tablicę liczb całkowitych i
- wypisz największy element
- wypisz najmniejszy element
- wypisz średnią arytmetyczną i elementy większe od niej
```
int[] losoweLiczby = {1, -19, 10, 100, 900, -1800, 837};  
int najwiekszy = losoweLiczby[0];  
int najmniejszy = losoweLiczby[0];  
double suma = 0;  
for (int i = 0; i < losoweLiczby.length; i++) {  
    suma += losoweLiczby[i];  
 if (losoweLiczby[i] > najwiekszy) {  
        najwiekszy = losoweLiczby[i];  
  }  
    if (losoweLiczby[i] < najmniejszy) {  
        najmniejszy = losoweLiczby[i];  
  }  
}  
double srednia = suma / losoweLiczby.length;  
System.out.println("Najwieksza liczba to " + najwiekszy);  
System.out.println("Najmniejsza liczba to " + najmniejszy);  
System.out.println("Liczby większe niż srednia, która wynosi " + srednia);  
for (int i = 0; i < losoweLiczby.length; i++) {  
    if (losoweLiczby[i] > srednia) {  
        System.out.println(losoweLiczby[i]);  
  }  
}
```

📚 Dana jest tablica typu String przechowująca najlepszych 13 szachistów (styczeń 2022). Znajdz i wypisz
- Szachiste, którego imie i naziwsko jest najkrótsze
- Szachiste, którego imie i naziwsko jest najdłuższe
- Szachiste, którego imie i nazwsiko ma długość 11 (w przypadku gdy jest ich kilka wypisz pierwszego/ostatniego, jeśli nie ma żadnego niech zostanie wypisana wartość domyślna dla tego typu)

💡 Zwracamy uwagę, żeby tak formatować tablice w przyszłości (może liczbowe nie koniecznie :> )

```
String[] szachisci = {  
        "Carlsen, Magnus",  
		"Firouzja, Alireza",  
		"Ding, Liren",  
		"Caruana, Fabiano",  
		"Nepomniachtchi, Ian",  
		"Aronian, Levon",  
		"Giri, Anish",  
		"So, Wesley",  
		"Mamedyarov, Shakhriyar",  
		"Grischuk, Alexander",  
		"Rapport, Richard",  
		"Vachier-Lagrave, Maxime",  
		"Duda, Jan-Krzysztof",  
}; 
  
String najdluzszy = szachisci[0];  
String najkrotszy = szachisci[0];  
String dlugosc11 = null;  
  
for (int i = 0; i < szachisci.length; i++) {  
    if (szachisci[i].length() > najdluzszy.length()) {  
        najdluzszy = szachisci[i];  
  }  
    if (szachisci[i].length() < najkrotszy.length()) {  
        najkrotszy = szachisci[i];  
  }  
    if (szachisci[i].length() == 11) {  
        dlugosc11 = szachisci[i];  
  }  
}  
  
System.out.println("Szachsita z najdluzszym imieniem i nazwiskiem to " + najdluzszy);  
System.out.println("Szachsita z najkrotszym imieniem i nazwiskiem to " + najkrotszy);  
System.out.println("Szachsita z imieniem i nazwiskiem o dlugosci 11 to " + dlugosc11);
```


## Dodatkowe materiały

🌐 [Tablice jednowymiarowe - java start](https://javastart.pl/baza-wiedzy/java-podstawy-jezyka/tablice-jednowymiarowe)

🌐 [Tablice - samouczek programisty](https://www.samouczekprogramisty.pl/tablice-w-jezyku-java/)
