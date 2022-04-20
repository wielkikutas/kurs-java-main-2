
Zajęcia 03 - pętle
============

 1. [Pętla for](https://github.com/robertgrochowski/kurs-java/blob/main/iteracja01/lekcja03-petle/lekcja03.md#p%C4%99tla-for)
 2. [Pętla while i do-while](https://github.com/robertgrochowski/kurs-java/blob/main/iteracja01/lekcja03-petle/lekcja03.md#p%C4%99tla-while-i-do-while)
 3. [Break](https://github.com/robertgrochowski/kurs-java/blob/main/iteracja01/lekcja03-petle/lekcja03.md#break)
 4. [Continue](https://github.com/robertgrochowski/kurs-java/blob/main/iteracja01/lekcja03-petle/lekcja03.md#continue)
 5. [Zadania do domu](https://github.com/robertgrochowski/kurs-java/blob/main/iteracja01/lekcja03-petle/lekcja03.md#zadania-do-domu)
 6. [Dodatkowe materiały](https://github.com/robertgrochowski/kurs-java/blob/main/iteracja01/lekcja03-petle/lekcja03.md#dodatkowe-materia%C5%82y)

## Pętla for

<details>
  <summary>Wprowadzenie teoretyczne</summary>

### Wprowadzenie teoretyczne
Praca na pojedynczych wartościach nie stanowi dużego problemu, natomiast co gdybyśmy chcieli sto razy wyświetlić tekst `Uczę się Javy`?

💡 Jak byś zrobił to dzisiejszy stan wiedzy? ➡️ Copy paste

Przy opcji Ctrl+C, Ctrl+V pojawia się problem, którym jest powtarzalność kodu. Będziemy mieli w kodzie 100 linijek, które robią tę samą rzecz i nie posiadają żadnej logiki biznesowej przez co tylko zmniejszają czytelność kodu.

**DRY (Don't repeat yourself)** powtarzanie kodu jest złe i staramy się tego nie robić (o ile jest to możliwe).

**Inny przykład** - co gdybyśmy chcieli wyświetlić liczby parzyste mniejsze od 100?

Do rozwiązania tego typu problemów w większości języków programowania powstały specjalne konstrukcje nazywane **pętlami**, można je zapamiętać jako "powtarzaj ten kod w kółko tak długo jak ci kazałem".

> **Pętla for** - będziemy wykorzystywać w sytuacji, gdy z góry wiemy, ile razy mają wykonać się pewne instrukcje. Na przykład, jeśli chcemy wyświetlić dany text ``n`` razy, lub sprawdzić czy 1000 użytkowników jest pełnoletnich, a nie tylko jeden.
 
 </details>
 
 <details>
  <summary>Składnia pętli for</summary>
 
### Składnia pętli for
```
for (BLOK_PIERWSZY; BLOK_DRUGI ; BLOK_TRZECI) {  
    // ciało pętli
}
```
W pętli zazwyczaj znajdują się 3 elementy oddzielone średnikami (każdy z bloków/elementów jest opcjonalny!).

1️⃣ z nich jest wyrażeniem początkowym - najczęściej deklaracja zmiennej będącej licznikiem pętli. Zauważ, że zmienna ta będzie dostępna tylko w ciele pętli, po kończącym nawiasie klamrowym dostęp do zmiennej i nie będzie już możliwy, dlatego w kolejnej pętli deklarację zmiennej i musimy powtórzyć.

W tym miejscu zazwyczaj deklarujemy i inicjalizujemy zmienne, których będziemy używać w pętli.

✅ **Inicjalizacja** = zazwyczaj jest to wprowadzenie zmiennej i jej wartości aby miała jakiś stan początkowy

2️⃣ elementem po średniku jest wyrażenie reprezentujące warunek zatrzymania pętli, które musi zwracać _true_ lub _false_.

3️⃣ i ostatnim elementem w nawiasie pętli for jest wyrażenie, które wykonuje się przy każdej iteracji pętli, w 99% przypadków będzie to modyfikacja licznika.

✅ **Iteracja** = jeden obrót pętli

W tym miejscu zazwyczaj po każdym iteracją po pętli modyfikujemy wartości zmiennych wprowadzonych w pierwszym bloku.

W każdym przebiegu pętli wykonane będą wszystkie instrukcje, które zamieścimy w ciele pętli, czyli pomiędzy nawiasami klamrowymi. Oczywiście możemy tam umieścić nie tylko instrukcję przypisania, czy wyświetlenia informacji, ale także warunki _if_, albo kolejną pętlę.

 </details>

 <details>
  <summary>Zadania wspólne</summary>

### Zadania wspólne
<details>
  <summary>Zadanie proste</summary>

> Napisz pętlę, która wyświetli wartości od 10 do 0.

```
for (int i = 10; i >= 0 ; i++) {  
    System.out.println(i);  
}
```
</details>

<details>
  <summary>Zadanie trudniejsze</summary>

> Napisz pętlę, która wyświetli wszystkie liczby parzyste z zakresu 1-102.

```
for (int i = 0; i <= 102; i++) {  
    if (i % 2 == 0) {  
        System.out.println(i);  
  }  
}
```
</details>
 
  </details>
 
## Pętla while i do-while
 
 <details>
  <summary>Wprowadzenie teoretyczne</summary>

### Wprowadzenie teoretyczne
Pętla for idealnie nadaje się do sytuacji, gdy dokładnie znamy liczbę iteracji, która ma się wykonać lub jeśli chcemy wykonywać pewne operacje na każdym elemencie tablicy. Co jednak z sytuacjami, gdy ilość przebiegów pętli nie jest znana, np. chcemy podwajać liczbę, dopóki będzie mniejsza od 1000? Z pomocą przychodzi pętla `while` oraz `do-while`.
 
</details>
  
 <details>
  <summary>Pętla while</summary>
 
 ### Pętla while

> **Pętla while** - Pętlę `while` możemy dosłownie przetłumaczyć na _**dopóki**  warunek jest prawdziwy, powtarzaj kod w pętli_. Brzmi to podobnie jak przy pętli `for`, jednak różnica jest taka, że ponieważ nie występuje tutaj jawny licznik, to ilość przebiegów pętli będzie zazwyczaj uzależniona od jakiegoś warunku uwzględniającego czynnik zewnętrzny - np. dane wczytane od użytkownika lub z pliku.

Składnia pętli `while`
```
while (WARUNEK) {  
    // ciało pętli  
}
```
  
  </details>
 
<details>
  <summary>Pętla do-while</summary>
 
  ### Pętla do-while
 
> **Pętla do-while** - Jak już sama nazwa sugeruje pętla **do while** jest bardzo podobna do tradycyjnej pętli while. Jedyną, ale bardzo ważną różnicą jest to, że pętla do while zawsze wykona się **przynajmniej jeden raz**, ponieważ najpierw wykonywany jest kod zawarty w pętli, a dopiero później sprawdzany jest warunek.

Składnia pętli `do while`
```
do {  
    // ciało pętli  
} while (WARUNEK);
```

 </details>
 
 <details>
  <summary>Zadania wspólne</summary>
 
### 📚 Zadania wspólne
<details>
  <summary>Zadanie proste</summary>

> Oblicz sumę liczb naturalnych mniejszych niż 1000 używając pętli `while`

```
int liczba, wynik = 0;
while(liczba < 1000) {  
    wynik += liczba;
    liczba++;
}
System.out.println(liczba);  
```
</details>

<details>
  <summary>Zadanie trudniejsze</summary>

> Napisz pętlę `while`, która wypisze liczby z przedziału `a` i `b` gdzie `a` i `b` są stałymi, zdefiniowanymi w programie


```
final int a = 5;
final int b = 10;
int liczba = a;

while(liczba <= b) {
    System.out.println(liczba);
    liczba++
}
```

W obu przypadkach można pokazać przykład skróconego użycia `++` np. w tym zadaniu:
```
final int a = 5;
final int b = 10;
int liczba = a;

while(liczba++ <= b) {
    System.out.println(liczba);
}
```
</details>
 
 </details>

<details>
  <summary>Podsumowanie</summary>
  
### Podsumowanie
Jako podsumowanie tematyki pętli możemy zastosować następujący podział:

-   Pętlę  `for`  stosuj w przypadku, gdy znana jest liczba iteracji.
-   Pętlę  `while` używaj w sytuacji, gdy nie znasz ilości iteracji pętli, ale znasz warunek, który powinien ją zatrzymać.
-   Pętlę  `do while`  stosuj w sytuacji, gdy nie znasz ilości iteracji pętli, ale musisz mieć gwarancję, że ciało pętli wykona się przynajmniej raz.

 </details>
 
## Break
  
<details>
  <summary>Break</summary>
  
Pętle można przerwać na dwa sposoby: 
1. Poprzez warunek końcowy - w przypadku pętli `for` znajduje się on w drugim bloku a dla pę dla pętli `while` (lub `do while`) jest to moment, w którym warunek nie zostaje spełniony (`= false`).
2. Poprzez `break` (lub `return` o którym będzie później).

> Słowo kluczowe `break` może zostać użyte do natychmiastowego przerwania wykonywania pętli

Przykład:

```
for(int i = 0; i < 6; i++) {
    if(i == 4) {
        break;
    }
    System.out.println(i);
}
```
<details>
<summary>Wynik</summary> 

```
0
1
2
3
```
</details>

❗❗ Należy pamiętać, że używać `break` powinniśmy tylko wtedy, gdy nie mamy innego wyboru. Zmniejsza to czytelność i zrozumienie kodu.  
⭐ Mówi się, że każdą dobrze zaprojektowaną pętlę można przerwać bez `break` (używając warunków końcowych).
  
</details>
 
## Continue
 
<details>
<summary>Continue</summary> 
 
> Słowo kluczowe `continue` służy do pominięcia aktualnie wykonywanej iteracji.

Przykład:


```
for(int i = 0; i < 6; i++) {
    if(i == 4) {
        continue;
    }
    System.out.println(i);
}
``` 

<details>
<summary>Wynik</summary> 

```
0
1
2
3
5
```
</details>

⭐ Zazwyczaj `continue` używamy wtedy, kiedy chcemy przefiltrować część iteracji.
 
 </details>
 
## Zadania do domu

<details>
<summary>Zadania do domu</summary> 

📦 [Zadania i rozwiązania](https://github.com/robertgrochowski/kurs-java-zadania/tree/main/lekcja03)

 </details>

## Dodatkowe materiały


<details>
<summary>Dodatkowe materiały</summary> 

🌐 [Pętle - samouczek programisty](https://www.samouczekprogramisty.pl/petle-i-instrukcje-warunkowe-w-jezyku-java/)

🌐 [for - w3schools](http://kurs.aspnetmvc.pl/Wzorce/DRY)

🌐 [for - javatpoint](https://www.javatpoint.com/java-for-loop)

🌐 [for - dokumentacja oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html)

🌐 [break i continue - w3schools](https://www.w3schools.com/java/java_break.asp)

🌐 [Zasada DRY - Don't reapeat yourself](http://kurs.aspnetmvc.pl/Wzorce/DRY)
 
  </details>
