
Zajęcia 02 - Instrukcje sterujące (if, operatory logiczne, switch)
============
1. [Instukcja warunkowa - if](https://github.com/robertgrochowski/kurs-java/blob/main/iteracja01/lekcja02-instrukcje-sterujace/zajecia02.md#instrukcja-warunkowa---if)
2. [Operatory](https://github.com/robertgrochowski/kurs-java/blob/main/iteracja01/lekcja02-instrukcje-sterujace/zajecia02.md#operatory)
3. [Instukcja warunkowa - switch](https://github.com/robertgrochowski/kurs-java/blob/main/iteracja01/lekcja02-instrukcje-sterujace/zajecia02.md#instrukcja-warunkowa---switch)
4. [Dodatkowe materiały](https://github.com/robertgrochowski/kurs-java/blob/main/iteracja01/lekcja02-instrukcje-sterujace/zajecia02.md#instrukcja-warunkowa---switch)

## Operatory logiczne

💡 Pamiętasz typ `boolean`? Jakie wartości przyjmuje ten typ zmiennej?

Mając takie dane 
```
boolean brandNew = true;
boolean black = true;
boolean diesel = false;
```

## Operatory porównania

Aby porównywać liczby musimy wprowadzić operatory porównania.

- `>` - większy
- `>=` - większy równy
- `<` - mniejszy
- `<=` - mniejszy równy
- `==` - równy
- `!=` - nie jest równy (inaczej: inny)

💡 Jaki operator porównania wstawisz aby wartość wyrażenia była prawdziwa?

`4` ? `5`

<details>
  <summary>Odpowiedź</summary>

  `<` lub `<=`   
    czyli  
  `4` < `5`   
  `4` <= `5`

</details>

Tak samo, przekładając na Javę będzie to

```
boolean result = 4 < 5; 
System.out.println(result); // true
```

📚 Dane są dwie zmienne `a` oraz `b`. Porównaj te liczby każdym możliwym operatorem i wypisz wynik na konsolę. Zmień wartości `a` i `b` tak, aby otrzymać różne wyniki.

```
int a = 5;
int b = 10;
```

<details>
  <summary>Odpowiedź</summary>

```
int a = 5;
int b = 10;
System.out.println(a < b);
System.out.println(a <= b);
System.out.println(a > b);
System.out.println(a >= b);
System.out.println(a == b);
```

</details>


## Instrukcja warunkowa - if

> Do tej pory każda linijka kodu, którą napisałeś w działającym programie została wykonana. W większych programach często musimy decydować co powinno być wykonane. Służy do tego **instrukcja warunkowa** `if`, której składnia wygląda następująco:

```
if (WARUNEK) {  
   // Kod 
}
```

Kod między `{` `}` po instrukcji `if` wykona się tylko wtedy kiedy `WARUNEK` będzie prawdą (`true`)

❗❗ Warunek który znajduje się w instrukcji warunkowej musi zawsze być wartością logiczną (`boolean`)

📚 Sprawdź, czy użytkownik programu jest pełnoletni i jeśli jest, to wypisz odpowiedni komunikat.
```
int wiek = 20;  
if (WARUNEK) {  
   System.out.println("Użytkownik jest pełnoletni");  
}
```

<details>
  <summary>Odpowiedź</summary>

```
int wiek = 20;  
if (wiek >= 18) {  
   System.out.println("Użytkownik jest pełnoletni");  
}
```

</details>

⭐ Warunki operatorów porównania czytamy od lewej do prawej. np. dla `if(a > b)` czytamy: _jeśli a jest większe od b, to..._

> Co jeśli chcielibyśmy wykonać również jakiś kod w przypadku, kiedy użytkownik nie jest pełnoletni? Z pomocą przychodzi słówko kluczowe `else`, które przejmuje sterowanie w momencie, gdy główny warunek nie jest spełniony.
```
if (WARUNEK) {  
   // Kod umiesczony w środku IF'a wykona się, gdy warunek będzie prawdziwy (WARUNEK = true) 
} else {  
   // Kod umieszczony w tej sekcji zostanie wykonany, gdy warunek nie będzie prawdziwy (WARUNEK = false) 
}
```

Przekładając na pełni poprawny składniowo kod Javy:


```
boolean warunek = true;

if (warunek) {  
    System.out.println("Warunek jest spelniony!");
} else {  
    System.out.println("Warunek nie jest spelniony!");
}
```

💡 Jaki będzie wynik tego programu? Co, jeśli, zmienimy wartość zmiennej na `false`?


📚 Sprawdź, czy użytkownik programu jest pełnoletni. W przypadku pozytywnym i negatywnym wyświetl odpowiedni komunikat.

```
int wiek = 20;  
if (wiek >= 18) {  
   System.out.println("Użytkownik jest pełnoletni");  
}
```

<details>
  <summary>Odpowiedź</summary>

```
int wiek = 20;  
if (wiek >= 18) {  
   System.out.println("Użytkownik jest pełnoletni");  
} else {  
   System.out.println("Użytkownik jest nie pełnoletni");  
}
```
</details>

> Instrukcja warunkową `if` można również dodać po `else`. Oznacza to, że dodatkowo nadajemy warunek w przypadku gdy poprzedni nie został spełniony.

```
if (WARUNEK) {  
    // Kod umiesczony w środku IF'a wykona się, gdy WARUNEK będzie prawdziwy
    // (WARUNEK = true)  
} else if (INNY WARUNEK){  
    // Kod umieszczony w tej sekcji zostanie wykonany, gdy WARUNEK nie będzie prawdziwy ale INNY WARUNEK będzie prawdziwy
    // (WARUNEK = false, INNY WARUNEK = true)
} else {  
    // Kod umieszczony w tej sekcji zostanie wykonany w każdym innym przypadku
    // (WARNUEK = false, INNY WARUNEK = false)
}
```

❗❗ Zauważ, że w instrukcji warunkowej `if` kod tylko w jednym z bloków `{` `}` zostanie wykonany. Inaczej mówiąc, nigdy nie będzie
sytuacji, gdy kod wykona się w dwóch miejscach np. po `if` oraz `else if`.

Przekładając na pełni poprawny składniowo kod Javy:

```
boolean warunek = false;
boolean innyWarunek = true;

if (warunek) {  
    System.out.println("Warunek jest spelniony!");
} else if(innyWarunek) {  
    System.out.println("inny warunek jest spelniony!");
} else {
    System.out.println("zaden warunek nie jest spelniony!");
}
```
📚 Manipuluj zmiennymi `warunek` oraz `innyWarunek` tak, aby otrzymać każdy rodzaj wiadomości.

❗❗ ilości wystąpień `else if` może być nieskończenie wiele. Natomiast `if` musi wystąpić raz, a `else` jest opcjonalne, ale może wystąpić maksymalnie raz.


📚 Co wyświetli się na konsoli i dlaczego?   
📚 Zamień wszystkie warunki na `false`. Jak przechwycić ten przypadek?

```
boolean warunek = false;
boolean innyWarunek1 = true;
boolean innyWarunek2 = true;
boolean innyWarunek3 = true;

if (warunek) {  
    System.out.println("Warunek jest spelniony!");
} else if(innyWarunek1) {  
    System.out.println("inny warunek1 jest spelniony!");
} else if(innyWarunek2) {  
    System.out.println("inny warunek2 jest spelniony!");
} else if(innyWarunek3) {  
    System.out.println("inny warunek3 jest spelniony!");
}
```


###📚 Zadania wspólne

<details>
  <summary>Zadania</summary>

📚 Dane są dwie zmienne

- m = 5
- n = 4

Oblicz ich średnią i wypisz komunikat czy średnia jest większa/równa/mniejsza od 4.

```
double m = 4, n = 4, srednia = (m + n) / 2;  
if (srednia > 4) {  
    System.out.println("Średnia jest większa od 4");  
} else if (srednia < 4) {  
    System.out.println("Średnia jest mniejsza od 4");  
} else {  
    System.out.println("Średnia jest równa 4");  
}
```


📚 Napisz kod, który będzie obsługiwał inteligentny termometr. Jeśli temeratura badanego jest mniejsza niż 36 stopni powinien wypisać "Jesteś osłabiony" w przypadku, gdy temepratura badanego wynosi 37 stopni wypisze "Temperatura w normie" natomiast w innym przypadku wypisze "Jesteś przeziębiony".
```
int temperatura = 38;  
if (temperatura < 36) {  
    System.out.println("Jesteś osłabiony");  
} else if (temperatura == 36) {  
    System.out.println("Temperatura w normie");  
} else {  
    System.out.println("Jesteś przeziębiony");  
}
```

📚 Napisz kod, który wypisze czy dana liczba jest dodatnia, ujemna czy jest równa zero i wypisze odpowiedni komunikat.
```
int liczba = 0;  
if (liczba < 0) {  
    System.out.println("Liczba jest ujemna");  
} else if (liczba == 0) {  
    System.out.println("Liczba wynosi 0");  
} else {  
    System.out.println("Liczba jest dodatnia");  
}
```

📚 Napisz program sprawdzajacy czy podana liczba jest parzysta
```
int zmienna = 3;  
if (zmienna % 2 == 0) {  
    System.out.println("Liczba jest parzysta!");  
}
```
</details>


## Operatory logiczne
Warunek który znajduje się w instrukcji warunkowej musi zawsze być wartością logiczną.

💡 Co w przypadku, gdybyśmy chcieli połączyć dwa/lub więcej warunków?
Przykładowo chcemy wypisać `Liczba poprawna`, gdy liczba jest większa niż `100` i mniejsza niż `500`. Jak to zrobić?

Moglibyśmy zrobić coś takiego
```
int liczba = 0;  
if (liczba > 100) {  
    if (liczba < 500) {  
        System.out.println("Liczba poprawna");  
  }  
}
```
⭐ Tworzenie `if'a` w `if'ie` (zagnieżdżanie) nie jest dobrą praktyką i powinniśmy tego unikać. Oczywiście nie zawsze jest inne wyjście!

Do tego zostały stworzone **operatory logiczne**.
- `&&` - logiczne `and` (koniunkcja)
- `||` - logiczne `or` (alternatywa)
- `!` - logiczne `not` (negacja)

Wracając do poprzedniego pytania - jak zrobić to lepiej. Rozwiązanie:
```
int liczba = 0;  
if (liczba > 100 && liczba < 500) {  
    System.out.println("Liczba poprawna");  
}
```
Użyliśmy tutaj operatora `&&` czyli `i` (koniunkcja). W tym przypadku dwa warunki muszą być spełnione, żeby Java wykonała kod znajdujący się w środku `if`.

💡 Jak zbadać czy liczba jest podzielna przez dwa?   
📚 Wypisz `Podzielna przez dwa lub ujemna` jeśli dana zmienna jest podzielna przez dwa lub jest liczbą ujemną.  

```
int zmienna = 3;  
if (zmienna % 2 == 0 || zmienna < 0) {  
    System.out.println("Podzielna przez dwa lub ujemna");  
} 
```
Tutaj użyliśmy operatora logicznego `lub`, wystarczy, że jeden warunek jest spełniony, aby Java wykonała kod w środku instrukcji `if`.


> Czasem zdarza się, że musimy zanegować warunek tzn. odwrócić jego wartość logiczną na przeciwną.

```
boolean warunek = true;
boolean warunek2 = !warunek; // false
```


📚 Co będzie wynikiem programu?
```
boolean warunek = true;
if (!warunek) {  
    System.out.println("1");  
} else {
    System.out.println("2");  
}
```

### porównywanie tekstu
❗❗ Tekstu nigdy nie porównujemy przez operator `==`. Do tego służy metoda `equals`. 

```
String brand = "Mercedes";

if(brand.equals("Audi")) {
    System.out.println("Posiadasz Audi");
} else {
    System.out.println("Nie posiadasz Audi");
}
```

### porównywanie wartości logicznych

```
boolean warunek = true;  
if (warunek == true) {  
    // instrukcja  
}
```
❗❗ Operacja `warunek == true` nie ma sensu, jest nadmiarowością. 

Powyższy kod jest tożsamy z poniższym.
```
boolean warunek = true;  
if (warunek) {  
    // instrukcja  
}
```

Podobnie w przypadku `warunek == false`. Zamiast tego, użyjmy `!warunek`.

```
boolean warunek = true;  
if (!warunek) {  // zamiast "warunek == false"
    // instrukcja  
}
```

## Instrukcja warunkowa - switch

>Innym typem instrukcji sterującej jest instrukcja `switch`. W odróżnieniu do instrukcji if jest ona przeznaczona przede wszystkim do warunków o wielu rozgałęzieniach. Nie operuje ona na warunkach logicznych `true` i `false`, ale na wartościach całkowitoliczbowych, znakowych a także na napisach.
```
    int dzienTygodnia = 2;
    switch (dzienTygodnia) {
      case 1:
        System.out.println("Poniedzialek.");
        break;
      case 2:
        System.out.println("Wtorek.");
        break;
      case 3:
        System.out.println("Sroda.");
        break;
      case 4:
        System.out.println("Czwartek.");
        break;
      case 5:
        System.out.println("Piatek.");
        break;
      case 6:
        System.out.println("Sobota.");
        break;
      case 7:
        System.out.println("Niedziela.");
        break;
      default:
        System.out.println("Nieznany dzien tygodnia!");
    }
```
W nawiasie po słowie switch podajemy zmienną lub wartość na podstawie której program ma podjąć dalszą decyzję.

Słowo **break** powoduje przerwanie wykonywania dalszych instrukcji w bloku _switch_, powinno się ono znajdować każdorazowo po wykonaniu odpowiednich instrukcji w ramach pojedynczego bloku _case_. Jeżeli o tym zapomnisz wykonane zostaną także instrukcje z dalszej części _switcha_ (usuń słowa _break_ z powyższego kodu i sprawdź ponownie jego działanie). Brak słowa _break_ jest najczęściej pojawiającym się błędem w kontekście instrukcji _switch_.

Słowo **default** oznacza domyślne zachowanie programu w przypadku, gdy żadna z wartości podanych powyżej nie została dopasowana (najłatwiej porównać to do bloku _else_ w konstrukcji _if-elseif-else_). Ponieważ jest to ostatnia instrukcja w naszym _switch'u_ nie musimy się już martwić przerywaniem wykonania i możemy pominąć instrukcję _break_. Blok _default_ jest opcjonalny, nie musisz go definiować, jeśli nie masz pomysłu na domyślne zachowanie.

📚 Napisz switch, który przyjmie liczbę reprezentującą ocenę z testu i dla danej oceny wypisz dany komunikat
- 2 - Nie zaliczyłeś
- 3 - Zdałeś dostatecznie
- 4 - Zdałeś dobrze
- 5 - Zdałeś bardzo dobrze

W przypadku innej oceny powinien zostać wypisany komunikat "Nierozpoznana ocena".
```
int ocena = 7;  
switch (ocena) {  
	case 2:  
        System.out.println("Nie zaliczyłeś");  
		break;
	case 3:  
        System.out.println("Zdałes dostatecznie");  
		 break;
	 case 4:  
        System.out.println("Zdales dobrze");  
		break;
	 case 5:  
        System.out.println("Zdales bardzo dobrze");  
		break;
	 default:  
        System.out.println("Nierozpoznana ocena");  
        break;
}
```
📚 Napisz switch, który przyjmie zmienna typu String jako miesiąc i wypisze ile dni ma dany miesiąc.
```
String miesiac = "styczen";  
switch (miesiac) {  
		case "styczen":  
	        System.out.println(31);  
			break;
		case "luty":  
	        System.out.println(28);  
			 break;
		case "marzec":  
	        System.out.println(31);  
		    break;
		case "kwiecien":  
	        System.out.println(30);  
		    break;
		case "maj":  
	        System.out.println(31);  
			break;
		case "czerwiec":  
	        System.out.println(30);  
	        break;
		case "lipiec":  
	        System.out.println(31);  
		    break;
		case "sierpień":  
	        System.out.println(31);  
		    break;
		case "wrzesień":  
	        System.out.println(30);  
	        break;
		case "październik":  
	        System.out.println(31);  
	        break;
		case "listopad":  
		     System.out.println(30);  
		     break;
		case "grudzień":  
	        System.out.println(31);  
	        break;
		default:  
	        System.out.println("Nierozpoznany miesiac"):
	        break;
 }
```
💡 Jak to zrobić lepiej?
```
String miesiac = "styczen";  
switch (miesiac) {  
    case "styczen":  
    case "marzec":  
    case "maj":  
    case "lipiec":  
    case "sierpień":  
    case "październik":  
    case "grudzień":  
        System.out.println(31);  
        break;
    case "luty":  
        System.out.println(28);
        break;
    case "kwiecien":  
    case "czerwiec":  
    case "wrzesień":  
    case "listopad":  
        System.out.println(30);  
        break;
    default:  
        System.out.println("Nierozpoznany miesiac");
        break;
 }
```
Powinniśmy połączyć case jeżeli to możliwe.

## Dodatkowe materiały

🌐 [Instrukcje sterujące - javastart](https://javastart.pl/baza-wiedzy/java-podstawy-jezyka/instrukcje-sterujace)

🌐 [Switch case - stormit](https://stormit.pl/switch-case/)

🌐 [Operatory - javastart](https://javastart.pl/baza-wiedzy/java-podstawy-jezyka/operatory-matematycze-i-logiczne)

🌐 [Operatory logiczne - stormit](https://stormit.pl/operatory-logiczne/)
