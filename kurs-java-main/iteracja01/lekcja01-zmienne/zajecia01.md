
Zajęcia 01 - syso, zmienne, typy proste, String, Scanner
============
1. [Operacje syso - wypisywanie tekstu](https://github.com/robertgrochowski/kurs-java/blob/main/iteracja01/lekcja01-zmienne/zajecia01.md#operacje-syso---wypisywanie-tekstu)
2. [Zmienne (typy proste, String)](https://github.com/robertgrochowski/kurs-java/blob/main/iteracja01/lekcja01-zmienne/zajecia01.md#zmienne-typy-proste-string)
3. [Scanner]()
4. [Operatory (+=, ++, --)](https://github.com/robertgrochowski/kurs-java/blob/main/iteracja01/lekcja01-zmienne/zajecia01.md#zmienne-typy-proste-string)
5. [Dodatkowe materiały](https://github.com/robertgrochowski/kurs-java/blob/main/iteracja01/lekcja01-zmienne/zajecia01.md#dodatkowe-materia%C5%82y)

## Operacje standardowego wyjścia - wypisywanie tekstu
Wyjście programu można interpretować przez np. konsolę i tekst. Do wypisywania tekstu w Javie służy instrukcja

`System.out.print` lub `System.out.println`

✅ **Łańcuch znaków** - inaczej ciąg liter, znaków specjalnych itp. Mówiąc prosto - jest to tekst.  
✅ **Instrukcja** - pojedyncza (jedna) komenda kończąca się średnikiem.


- `System.out.print` - **nie** dodaje znaku nowej linii na końcu wypisanego łańcucha znaków.
```
System.out.print("Hello World!");  
System.out.print("Hello World!");  
```

<details>
  <summary>Wynik</summary>

```
Hello World!Hello World!
```
</details>

- `System.out.println`- dodaje znak nowej linii na koniec wypisanego łańcucha znaków.
```
System.out.println("Hello World!");  
System.out.println("Hello World!");  
System.out.println("");
System.out.println("Hello World!");  
```

<details>
  <summary>Wynik</summary>

```
Hello World!
Hello World!

Hello World!
```
</details>

❗ Zauważ, że pusty `println` wypisuje sam znak nowej linii.   
⌨️ `sout` + `Enter` - skrót do wygenerowania `System.out.println("");`


## Komentarze
Komentarze w kodzie są ignorowane i pomijane przez Jave, wyróżniamy trzy różne komentarze

- **jednolinijkowy**  
  `//` - znak zakomentowania linijki
```
// To jest komentarz jednolinijkowy. Wszystko co znajduje się w tej linijce zostanie zignorowane przez kompilator
 ```

⌨️ `Ctrl` + `/` - zakomentowanie lub odkomentowanie zaznaczonego obszaru komentarzem jednolinijkowym

- **wielolinijkowy**   
  `/*` - znak rozpoczęcia komentarza  
  `*/` - znak zakończenia komentarza

```
/*
To jest przykład komentarza wielolinijkowego
dzięki niemu nie musimy komentować
każdej linijki oddzielnie. Zamiast tego możemy
łatwo zakomentować większy obszar kodu
*/
```

- **komentarz dokumentujący** - JavaDoc  
`/**` - znak rozpoczęcia dokumentacji JavaDoc  
  `*/` - znak zakończenia dokumentacji JavaDoc

Dokumentowanie kodu jest dosyć pracochłonnym rozwiązaniem. Aby ułatwić pracę programistom, kod można dokumentować bezpośrednio w miejscu, gdzie jest on napisany.
Do tego używa się JavaDoc czyli komentarza, który jest specjalnie interpretowany przez IDE oraz inne narzędzia do generowania dokumentacji.

✅ **IDE** - _ang. integrated development environment_ - program np. IntelliJ dostarczający wiele rozwiązań, które mają na celu przyspieszyć oraz ułatwić pracę wytworzania oprogramowanie.
JavaDoc ma następującą konstrukcję
```
/**
komentarz opisujący kod

@author Nazwa Autora
@since Data powstania
...
@param ...
*/
```

- **TODO** - _do zrobienia_ - znacznik w komentarzu, który jest specjalnie interpretowany przez IntellJ.   

Często nie jesteśmy w stanie uzupełnić kodu za jednym razem. Do tego używa się znacznika TODO który ma nam przypomnieć w przyszłości
aby do tego miejsca w kodzie wrócić. Innym przykładem może być miejsce, w którym zrobiliśmy coś nienajlepiej i chcielibysmy to poprawić 
kiedy będziemy mieli więcej czasu.
  
```
//TODO znacznik z IntelllJ służacy do oznaczania kodu, do których można w łatwy sposób wrócić i znaleźć co zostało jeszcze do zrobienia
```
💡 Pokaż kurstanowi gdzie można znaleźć zakładkę TODO w IntellJ

## Zmienne (typy proste, String)
Pisząc programy, musimy mieć miejsce, w którym będziemy przechowywali wartości. Na przykład, pisząc aplikację do serwisu motoryzacyjnego,
musielibyśmy przechować wszystkie cechy każdego auta np. markę, producenta, przebieg, kolor itp. Do przechowywania tych informacji używa się
zmiennych.

**Zmienna** - _ang. variable_ - miejsce, w którym przetrzymujemy jakąś wartość (inaczej kontener, pojemnik). Każda zmienna ma swój
1. typ
2. nazwę 
3. wartość

### Typy zmiennych

- typy całkowite - np. `12`
- typy zmiennoprzecinkowe np. `12.5`
- typ logiczny - `true` / `false`
- typ znakowy - np. `a`

## Deklaracja zmiennej

Zanim użyjemy zmiennej, musimy ją **zadeklarować**, czyli powiedzieć Javie, jakiego typu będzie oraz jaką będzie miała nazwę.
Dzięki temu Java wie, ile pamięci musi zarezerwować, aby było można przechować zmienną.

✅ **Deklaracja** - Określenie typu oraz nazwy zmiennej

Składnia deklaracji  
`TYP_ZMIENNEJ NAZWA_ZMIENNEJ;`

### Nazwa zmiennej
`NAZWA_ZMIENNEJ`

💡 Według konwencji Javy zmienne powinniśmy nazywać używając konwencji camelCase (wielbłąda), w której kolejne wyrazy są pisane
łącznie, rozpoczynając każdy następny wyraz wielką literą (oprócz pierwszego) `przykladUzyciaKonwencjiCamelCase`.

❗❗ nie używamy polskich znaków w kodzie, a najlepiej wszędzie pisać po angielsku

**Przykład**
np. dla nazwy zmiennej `pojemność silnika` powinniśmy napisać `pojemnoscSilnika` a jeszcze lepiej `engineVolume`

### Typy zmiennej
`TYP_ZMIENNEJ`

Zmienna może mieć następujące typy:

- `int` - typ liczby całkowitej - np. `12`
- `double` - typ liczby zmiennoprzecinkowej np. `12.5`
- `boolean` - typ logiczny, przymuje wartości _prawda_ lub _fałsz_ czyli `true` / `false`
- `String` - typ tekstowy - np. `Hej!`.

### Przykłady deklaracji

- **int** - typ całkowity

_Przykład:_ Zmienna przechowująca ilość koni mechanicznych auta
```
int horsePower;
```

- **double** - typ zmiennoprzecinkowy

_Przykład:_ Zmienna przechowująca spalanie auta
```
double consumption;  
```

- **boolean** - typ logiczny

_Przykład:_ Zmienna przechowująca informację o tym, czy auto jest nowe
```
boolean brandNew;  
```

- **String** - typ tekstowy

_Przykład:_ Zmienna przechowująca nazwę marki.
```
String brand;  
```

## Inicjalizacja

**Inicjalizacja zmiennej** - przypisanie wartości do zmiennej

`NAZWA_ZMIENNEJ = WARTOSC;`

_Przykład:_ Inicjalizacja zmiennej przechowującej ilość koni mechanicznych auta
```
int horsePower; // Deklaracja
horsePower = 200; // Inicjalizacja
```
❗❗ Pamiętajmy, że wartość musi zgadzać się z typem który wcześniej zadeklarowaliśmy.   
❗❗ Zawsze musimy najpierw zadeklarować zmienną zanim ją zinicjalizujemy.


### Deklaracja i inicjalizacja zmiennej
Możliwe jest zadeklarowanie i inicjalizowanie zmiennej w jednej linijce. Ma to następującą składnię:

`TYP_ZMIENNEJ NAZWA_ZMIENNEJ = WARTOŚĆ;`

⭐ Prawie zawsze nie rozbija się deklaracji i inicjalizacji, aby poprawić czytelność kodu.   
⭐ Jeśli znamy wartość zmiennej na początku - przypiszmy ją od razu (zainicjalizujmy).


- **int** - typ całkowity

_Przykład:_ Zmienna przechowująca ilość koni mechanicznych auta
```
int horsePower = 10;
```

- **double** - typ zmiennoprzecinkowy

_Przykład:_ Zmienna przechowująca spalanie auta
```
double consumption = 12.5;  
```
❗❗ Wartość ułamkową od całkowitej oddziela kropka `.` (nie przecinek!)

- **boolean** - typ logiczny

_Przykład:_ Zmienna przechowująca informację o tym, czy auto jest nowe
```
boolean brandNew = true;  
```
❗❗ dozwolone wartości to **tylko** `true` lub `false`

- **String** - typ tekstowy

_Przykład:_ Zmienna przechowująca nazwę marki.
```
String brand = "Mercedes";  
```

❗❗ Wartość tekstu musi być pomiędzy cudzysłowiem `" "`

### Przykłady z użyciem konsoli
```
// Deklaracja i inicjalizacja zmiennych
int horsePower = 10;
double consumption = 12.5;  
boolean new = true;  
String brand = "Mercedes"; 
 
// Wypisanie wartości
System.out.println(horsePower);
System.out.println(consumption);
System.out.println(brandNew);
System.out.println(brand);
```
<details>
  <summary>Wynik</summary>

```
10
12.5
true
Mercedes
```
</details>

## Łączenie tekstu (String)

String pozwala nam na łączenie tekstu z innymi zmiennymi dzięki znakowi `+`.

```
int horsePower = 10;
double consumption = 12.5;  
String brand = "Mercedes"; 

System.out.println("Spalanie twojego samochodu wynosi "+ consumption +" L/100km");
System.out.println("Twoja marka samochodu to: " + brand);

String welcomeIn = "Witaj w ";
System.out.println(welcomeIn + brand);
```
<details>
  <summary>Wynik</summary>

```
Spalanie twojego samochodu wynosi 12.5 L/100km
Twoja marka samochodu to: Mercedes
Witaj w Mercedes
```
</details>

## Operatory arytmetyczne

Dysponujemy podstawowymi operatorami matematycznymi dla typów liczbowych:
- `+` - dodawanie
- `-` - odejmowanie
- `*` - mnożenie
- `/` - dzielenie
- `%` - reszta z dzielenia (inaczej modulo)

📚  Napisz program, który wyświetli wyniki podstawowych operacji matemtaycznych (dodawanie, odejmowanie, mnożenie, dzielenie) dwóch zmiennych. Dodatkowo, oblicz resztę z dzielenia pierwszej zmiennej przez 4.

<details>
  <summary>Rozwiązanie</summary>

```
int a = 10;
int b = 5

int suma = a + b;
int roznica = a - b;
int iloczyn = a * b;
int iloraz = a / b;
int modulo = a % 4;

System.out.println(suma);  
System.out.println(roznica);  
System.out.println(iloczyn);  
System.out.println(iloraz);
System.out.println(modulo);
```

</details>

<details>
  <summary>Wynik programu</summary>

```
15  
5   
50   
2   
2   
```
</details>

💡 Co zrobić, aby obok wyniku danej operacji była wypisana również nazwa operacji?

<details>
  <summary>Wynik</summary>

```
int a = 10;
int b = 5

int suma = a + b;
int roznica = a - b;
int iloczyn = a * b;
int iloraz = a / b;
int modulo = a % 4;

System.out.println("suma = " + suma);
System.out.println("roznica = " + roznica);
System.out.println("iloczyn = " + iloczyn);
System.out.println("iloraz = " + iloraz);
System.out.println("modulo = " + modulo); 
```
</details>


⌨️ `Ctrl` + `D` - kopiowanie lini, w której znajduje się aktualnie kursor  
⌨️ `Ctrl` + `Y` - usunięcie lini, w której znajduje się aktualnie kursor

❗❗ Zwróć uwage na ten przypadek - spróbujmy urchomić ten kod

```
int a = 10;  
int b = 5;  
System.out.println("suma = " + a + b);  
System.out.println("roznica = " + a - b);
System.out.println("mnożenie = " + a * b);  
System.out.println("dzielenie = " + a / b);  
```

💡 Mamy błąd w linice z róznicą - dlaczego?

Linijka z różnicą nie może zostać skompilowana, ponieważ String nie obsługuje odejmowania `-`.

💡 Po zakomentowaniu tej linijki program się skompiluje poprawnie, natomiast wynik dodawania będzie zły. Dlaczego?

Kompilator uwzględnia kolejność dodawania - dlatego przypadek dla dzielenia i mnożenia działa.   
Natomiast dla dodawania i odejmowania nie zadziała, ponieważ dodajemy tekst do siebie, a nie wartości zmiennych.

❗❗ Aby zmienić kolejność należy użyć nawiasów


```
int a = 10;  
int b = 5;  
System.out.println("suma = " + (a + b));  
System.out.println("roznica = " + (a - b));
System.out.println("mnożenie = " + (a * b));  
System.out.println("dzielenie = " + (a / b));  
```
⭐ Dobrą praktyką jest dodanie nawiasów do wszystkich operacji, które mają wykonać się przed łączeniem tekstu (tak jak wyżej - mamy nawiasy również dla dzielenia i mnożenia)

📚 Wypisz wynik dodawania dwóch liczb tak aby na konsoli został dokładnie wypisany String:
Wynik dodawania liczby: WARTOSC oraz liczby: WARTOSC wynosi WYNIK

```
int liczba1 = 10;  
int liczba2 = 15;  
System.out.println("Wynik dodawania liczby " + liczba1 + " liczby " + liczba2 + " wynosi " + (liczba1 + liczba2));
```

### Operatory (+=, ++, --)

💡 Jak zwiększyć wartość zmiennej o `2`?   

Najprostszym sposobem będzie edycja wartości zmiennej jak poniżej
```
int liczba = 5;  
liczba = liczba + 2;  
```
To samo co wyżej możemy zrobić za pomocą operatora skróconego operatora
```
int liczba = 5;  
liczba += 2;  
```
>zapis `+=` Oznacza, że do zmiennej po lewej stronie dodamy to co znajduje się po prawej stronie.
Dwa powyższe zapisy mają taki sam efekt, natomiast drugi sposób jest zalecany!

📚 Zadeklaruj zmienną typu int o nazwie tmp i zmodyfikuj jej wartość za pomocą dwóch wcześniej przedstawionych sposobów z wykorzystaniem operacji odejmowania zamiast dodawania.
```
int tmp = 10;  
tmp = tmp - 2;  
System.out.println(tmp);  
tmp -= 2;  
System.out.println(tmp);
```
Analogicznie możemy postępować z innymi operatorami matematycznymi.
```
int tmp = 100;  
tmp /= 2;  
System.out.println(tmp);  
tmp *= 10;  
System.out.println(tmp);  
tmp += 1;  
System.out.println(tmp);  
tmp -= 100;  
System.out.println(tmp);
```
Istnieją spejalne operatory dla wartości zwiększania i zmniejszania o jeden. Są to następująco
- `++` - zwiększenie wartości zmiennej o 1
- `--` - zmniejszenie wartości zmiennej o 1


```
int wynik = 10;  
wynik++;  
System.out.println(wynik);  
wynik--;  
System.out.println(wynik);
```


## Nazywanie zmiennych

💡 Dobrą praktyką jest nazywanie zmiennych rzeczownikiem! Bardzo ważne jest, żeby odpowiednio nazywać zmienne tak, żeby nazwa mówiła developerowi czym jest dana zmienna. Kod piszemy raz natomiast często go czytamy, dlatego w idealnym przypadku nasz kod powinno się czytać jak książkę, spójrzmy na poniższy przykład.
```
int x = 100_000;  
double y = 0.1;  
double z = 0.05;  
System.out.println(x + x * (y - z));
```
💡 Powyższy kod nie jest ani długi, ani skompilkowany czy jesteśmy w stanie łatwo zrozumieć co on robi?
Nie jest to łatwe, a co gdybyśmy nazwali zmienne tym czym one są? Spójrzmy na poniższy przykład.
```
int kwotaInwestycji = 100_000;  
double procentZwrotu = 0.1;  
double inflacja = 0.05;  
System.out.println(kwotaInwestycji + kwotaInwestycji * (procentZwrotu - inflacja));
```
Dzięki temu, że ładnie nazwaliśmy zmienne możemy bardzo łatwo przeczytać kod i zrozumieć co on robi, dlatego właśnie nazywanie zmiennych jest tak ważne!

## Materiały i zadania dodatkowe

📚 Typy proste
https://javastart.pl/baza-wiedzy/java-podstawy-jezyka/typy-danych

📚 Znaki specjalne
```
/*  
\" - cudzysłów  
\n - znak przejścia do nowej linii  
\t - znak tabulacji (tab)  
\\ - backslash  
*/
System.out.print("1\"1");  
System.out.print("2\n2");  
System.out.print("3\t3");  
System.out.print("4\\4");
```


📚 Wszystkie typy proste z przykładem

<details>
  <summary>Treść</summary>

```
public class PrimitiveTypes {  
    public static void main(String[] args) {  
  
        System.out.println("Integer");  
 int myInt = 5; // decimal-form literal  
  
  System.out.println(myInt);  
  
  System.out.println(Integer.BYTES + " wielkosc w bajtach");  
  System.out.println(Integer.MAX_VALUE+ " maksymalna wartosc");  
  System.out.println(Integer.MIN_VALUE + " minimalna wartosc");  
  
  
  System.out.println("\nByte");  
 byte myByte = 5;  
  
  System.out.println(myByte);  
  
  System.out.println(Byte.BYTES + " wielkosc w bajtach");  
  System.out.println(Byte.MAX_VALUE+ " maksymalna wartosc");  
  System.out.println(Byte.MIN_VALUE + " minimalna wartosc");  
  
  
  System.out.println("\nShort");  
 byte myShort = 5;  
  
  System.out.println(myShort);  
  
  System.out.println(Short.BYTES + " wielkosc w bajtach");  
  System.out.println(Short.MAX_VALUE+ " maksymalna wartosc");  
  System.out.println(Short.MIN_VALUE + " minimalna wartosc");  
  
  
  System.out.println("\nLong");  
 long myLong = 5l;  
  
  System.out.println(myLong);  
  
  System.out.println(Long.BYTES + " wielkosc w bajtach");  
  System.out.println(Long.MAX_VALUE+ " maksymalna wartosc");  
  System.out.println(Long.MIN_VALUE + " minimalna wartosc");  
  
  
  System.out.println("\nCharacter");  
 char myChar = 'A';  
 char myCharU = '\u0041'; //uninode  
  char myCharUD = 65; //ascii  
  
  System.out.println(myChar);  
  System.out.println(myCharU);  
  System.out.println(myCharUD);  
  
  System.out.println(Character.BYTES + " wielkosc w bajtach");  
  System.out.println(Character.MAX_VALUE+ " maksymalna wartosc");  
  System.out.println(Character.MIN_VALUE + " minimalna wartosc");  
  
  
  System.out.println("\nFloating-point single precision");  
 float myFloat = 2.5f;  
  
  System.out.println(myFloat);  
  
  System.out.println(Float.BYTES + " wielkosc w bajtach");  
  System.out.println(Float.MAX_VALUE+ " maksymalna wartosc");  
  System.out.println(Float.MIN_VALUE + " minimalna wartosc");  
  
  
  System.out.println("\nFloating-point double precision");  
 double myDouble = 2.5;  
  
  System.out.println(myDouble);  
  
  System.out.println(Double.BYTES + " wielkosc w bajtach");  
  System.out.println(Double.MAX_VALUE+ " maksymalna wartosc");  
  System.out.println(Double.MIN_VALUE + " minimalna wartosc");  
  
  System.out.println("\nBoolean");  
 boolean myBooleanT = true;  
 boolean myBooleanF = false;  
  
  System.out.println(myBooleanT);  
  System.out.println(myBooleanF);  
  }
```
</details>

## Dodatkowe materiały

🌐 [Typy proste - samouczekprogramisty](https://www.samouczekprogramisty.pl/typy-proste-w-jezyku-java/)

🌐 [Typy danych - java start](https://javastart.pl/baza-wiedzy/java-podstawy-jezyka/typy-danych)

🌐 [Zmienne](https://kursjava.com/zmienne/)

🌐 [Scanner - javastart](https://javastart.pl/baza-wiedzy/java-podstawy-jezyka/podstawowe-wejscie-wyjscie)

🌐 [Scanner - programistajava](https://programistajava.pl/operacje-wejscia-i-wyjscia-w-javie/)

🌐 [Scanner - szymonleyk](https://szymonleyk.pl/java-scanner/)

🌐 [Metody dostępne na Stringu](https://stormit.pl/string-metody/)
