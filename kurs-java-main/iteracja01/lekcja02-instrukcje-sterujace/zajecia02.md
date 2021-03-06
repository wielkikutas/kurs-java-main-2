
Zaj臋cia 02 - Instrukcje steruj膮ce (if, operatory logiczne, switch)
============
1. [Instukcja warunkowa - if](https://github.com/robertgrochowski/kurs-java/blob/main/iteracja01/lekcja02-instrukcje-sterujace/zajecia02.md#instrukcja-warunkowa---if)
2. [Operatory](https://github.com/robertgrochowski/kurs-java/blob/main/iteracja01/lekcja02-instrukcje-sterujace/zajecia02.md#operatory)
3. [Instukcja warunkowa - switch](https://github.com/robertgrochowski/kurs-java/blob/main/iteracja01/lekcja02-instrukcje-sterujace/zajecia02.md#instrukcja-warunkowa---switch)
4. [Dodatkowe materia艂y](https://github.com/robertgrochowski/kurs-java/blob/main/iteracja01/lekcja02-instrukcje-sterujace/zajecia02.md#instrukcja-warunkowa---switch)

## Operatory logiczne

馃挕 Pami臋tasz typ `boolean`? Jakie warto艣ci przyjmuje ten typ zmiennej?

Maj膮c takie dane 
```
boolean brandNew = true;
boolean black = true;
boolean diesel = false;
```

## Operatory por贸wnania

Aby por贸wnywa膰 liczby musimy wprowadzi膰 operatory por贸wnania.

- `>` - wi臋kszy
- `>=` - wi臋kszy r贸wny
- `<` - mniejszy
- `<=` - mniejszy r贸wny
- `==` - r贸wny
- `!=` - nie jest r贸wny (inaczej: inny)

馃挕 Jaki operator por贸wnania wstawisz aby warto艣膰 wyra偶enia by艂a prawdziwa?

`4` ? `5`

<details>
  <summary>Odpowied藕</summary>

  `<` lub `<=`   
    czyli  
  `4` < `5`   
  `4` <= `5`

</details>

Tak samo, przek艂adaj膮c na Jav臋 b臋dzie to

```
boolean result = 4 < 5; 
System.out.println(result); // true
```

馃摎 Dane s膮 dwie zmienne `a` oraz `b`. Por贸wnaj te liczby ka偶dym mo偶liwym operatorem i wypisz wynik na konsol臋. Zmie艅 warto艣ci `a` i `b` tak, aby otrzyma膰 r贸偶ne wyniki.

```
int a = 5;
int b = 10;
```

<details>
  <summary>Odpowied藕</summary>

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

> Do tej pory ka偶da linijka kodu, kt贸r膮 napisa艂e艣 w dzia艂aj膮cym programie zosta艂a wykonana. W wi臋kszych programach cz臋sto musimy decydowa膰 co powinno by膰 wykonane. S艂u偶y do tego **instrukcja warunkowa** `if`, kt贸rej sk艂adnia wygl膮da nast臋puj膮co:

```
if (WARUNEK) {  
   // Kod 
}
```

Kod mi臋dzy `{` `}` po instrukcji `if` wykona si臋 tylko wtedy kiedy `WARUNEK` b臋dzie prawd膮 (`true`)

鉂椻潡 Warunek kt贸ry znajduje si臋 w instrukcji warunkowej musi zawsze by膰 warto艣ci膮 logiczn膮 (`boolean`)

馃摎 Sprawd藕, czy u偶ytkownik programu jest pe艂noletni i je艣li jest, to wypisz odpowiedni komunikat.
```
int wiek = 20;  
if (WARUNEK) {  
   System.out.println("U偶ytkownik jest pe艂noletni");  
}
```

<details>
  <summary>Odpowied藕</summary>

```
int wiek = 20;  
if (wiek >= 18) {  
   System.out.println("U偶ytkownik jest pe艂noletni");  
}
```

</details>

猸? Warunki operator贸w por贸wnania czytamy od lewej do prawej. np. dla `if(a > b)` czytamy: _je艣li a jest wi臋ksze od b, to..._

> Co je艣li chcieliby艣my wykona膰 r贸wnie偶 jaki艣 kod w przypadku, kiedy u偶ytkownik nie jest pe艂noletni? Z pomoc膮 przychodzi s艂贸wko kluczowe `else`, kt贸re przejmuje sterowanie w momencie, gdy g艂贸wny warunek nie jest spe艂niony.
```
if (WARUNEK) {  
   // Kod umiesczony w 艣rodku IF'a wykona si臋, gdy warunek b臋dzie prawdziwy (WARUNEK = true) 
} else {  
   // Kod umieszczony w tej sekcji zostanie wykonany, gdy warunek nie b臋dzie prawdziwy (WARUNEK = false) 
}
```

Przek艂adaj膮c na pe艂ni poprawny sk艂adniowo kod Javy:


```
boolean warunek = true;

if (warunek) {  
    System.out.println("Warunek jest spelniony!");
} else {  
    System.out.println("Warunek nie jest spelniony!");
}
```

馃挕 Jaki b臋dzie wynik tego programu? Co, je艣li, zmienimy warto艣膰 zmiennej na `false`?


馃摎 Sprawd藕, czy u偶ytkownik programu jest pe艂noletni. W przypadku pozytywnym i negatywnym wy艣wietl odpowiedni komunikat.

```
int wiek = 20;  
if (wiek >= 18) {  
   System.out.println("U偶ytkownik jest pe艂noletni");  
}
```

<details>
  <summary>Odpowied藕</summary>

```
int wiek = 20;  
if (wiek >= 18) {  
   System.out.println("U偶ytkownik jest pe艂noletni");  
} else {  
   System.out.println("U偶ytkownik jest nie pe艂noletni");  
}
```
</details>

> Instrukcja warunkow膮 `if` mo偶na r贸wnie偶 doda膰 po `else`. Oznacza to, 偶e dodatkowo nadajemy warunek w przypadku gdy poprzedni nie zosta艂 spe艂niony.

```
if (WARUNEK) {  
    // Kod umiesczony w 艣rodku IF'a wykona si臋, gdy WARUNEK b臋dzie prawdziwy
    // (WARUNEK = true)  
} else if (INNY WARUNEK){  
    // Kod umieszczony w tej sekcji zostanie wykonany, gdy WARUNEK nie b臋dzie prawdziwy ale INNY WARUNEK b臋dzie prawdziwy
    // (WARUNEK = false, INNY WARUNEK = true)
} else {  
    // Kod umieszczony w tej sekcji zostanie wykonany w ka偶dym innym przypadku
    // (WARNUEK = false, INNY WARUNEK = false)
}
```

鉂椻潡 Zauwa偶, 偶e w instrukcji warunkowej `if` kod tylko w jednym z blok贸w `{` `}` zostanie wykonany. Inaczej m贸wi膮c, nigdy nie b臋dzie
sytuacji, gdy kod wykona si臋 w dw贸ch miejscach np. po `if` oraz `else if`.

Przek艂adaj膮c na pe艂ni poprawny sk艂adniowo kod Javy:

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
馃摎 Manipuluj zmiennymi `warunek` oraz `innyWarunek` tak, aby otrzyma膰 ka偶dy rodzaj wiadomo艣ci.

鉂椻潡 ilo艣ci wyst膮pie艅 `else if` mo偶e by膰 niesko艅czenie wiele. Natomiast `if` musi wyst膮pi膰 raz, a `else` jest opcjonalne, ale mo偶e wyst膮pi膰 maksymalnie raz.


馃摎 Co wy艣wietli si臋 na konsoli i dlaczego?   
馃摎 Zamie艅 wszystkie warunki na `false`. Jak przechwyci膰 ten przypadek?

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


###馃摎 Zadania wsp贸lne

<details>
  <summary>Zadania</summary>

馃摎 Dane s膮 dwie zmienne

- m = 5
- n = 4

Oblicz ich 艣redni膮 i wypisz komunikat czy 艣rednia jest wi臋ksza/r贸wna/mniejsza od 4.

```
double m = 4, n = 4, srednia = (m + n) / 2;  
if (srednia > 4) {  
    System.out.println("艢rednia jest wi臋ksza od 4");  
} else if (srednia < 4) {  
    System.out.println("艢rednia jest mniejsza od 4");  
} else {  
    System.out.println("艢rednia jest r贸wna 4");  
}
```


馃摎 Napisz kod, kt贸ry b臋dzie obs艂ugiwa艂 inteligentny termometr. Je艣li temeratura badanego jest mniejsza ni偶 36 stopni powinien wypisa膰 "Jeste艣 os艂abiony" w przypadku, gdy temepratura badanego wynosi 37 stopni wypisze "Temperatura w normie" natomiast w innym przypadku wypisze "Jeste艣 przezi臋biony".
```
int temperatura = 38;  
if (temperatura < 36) {  
    System.out.println("Jeste艣 os艂abiony");  
} else if (temperatura == 36) {  
    System.out.println("Temperatura w normie");  
} else {  
    System.out.println("Jeste艣 przezi臋biony");  
}
```

馃摎 Napisz kod, kt贸ry wypisze czy dana liczba jest dodatnia, ujemna czy jest r贸wna zero i wypisze odpowiedni komunikat.
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

馃摎 Napisz program sprawdzajacy czy podana liczba jest parzysta
```
int zmienna = 3;  
if (zmienna % 2 == 0) {  
    System.out.println("Liczba jest parzysta!");  
}
```
</details>


## Operatory logiczne
Warunek kt贸ry znajduje si臋 w instrukcji warunkowej musi zawsze by膰 warto艣ci膮 logiczn膮.

馃挕 Co w przypadku, gdyby艣my chcieli po艂膮czy膰 dwa/lub wi臋cej warunk贸w?
Przyk艂adowo chcemy wypisa膰 `Liczba poprawna`, gdy liczba jest wi臋ksza ni偶 `100` i mniejsza ni偶 `500`. Jak to zrobi膰?

Mogliby艣my zrobi膰 co艣 takiego
```
int liczba = 0;  
if (liczba > 100) {  
    if (liczba < 500) {  
        System.out.println("Liczba poprawna");  
  }  
}
```
猸? Tworzenie `if'a` w `if'ie` (zagnie偶d偶anie) nie jest dobr膮 praktyk膮 i powinni艣my tego unika膰. Oczywi艣cie nie zawsze jest inne wyj艣cie!

Do tego zosta艂y stworzone **operatory logiczne**.
- `&&` - logiczne `and` (koniunkcja)
- `||` - logiczne `or` (alternatywa)
- `!` - logiczne `not` (negacja)

Wracaj膮c do poprzedniego pytania - jak zrobi膰 to lepiej. Rozwi膮zanie:
```
int liczba = 0;  
if (liczba > 100 && liczba < 500) {  
    System.out.println("Liczba poprawna");  
}
```
U偶yli艣my tutaj operatora `&&` czyli `i` (koniunkcja). W tym przypadku dwa warunki musz膮 by膰 spe艂nione, 偶eby Java wykona艂a kod znajduj膮cy si臋 w 艣rodku `if`.

馃挕 Jak zbada膰 czy liczba jest podzielna przez dwa?   
馃摎 Wypisz `Podzielna przez dwa lub ujemna` je艣li dana zmienna jest podzielna przez dwa lub jest liczb膮 ujemn膮.  

```
int zmienna = 3;  
if (zmienna % 2 == 0 || zmienna < 0) {  
    System.out.println("Podzielna przez dwa lub ujemna");  
} 
```
Tutaj u偶yli艣my operatora logicznego `lub`, wystarczy, 偶e jeden warunek jest spe艂niony, aby Java wykona艂a kod w 艣rodku instrukcji `if`.


> Czasem zdarza si臋, 偶e musimy zanegowa膰 warunek tzn. odwr贸ci膰 jego warto艣膰 logiczn膮 na przeciwn膮.

```
boolean warunek = true;
boolean warunek2 = !warunek; // false
```


馃摎 Co b臋dzie wynikiem programu?
```
boolean warunek = true;
if (!warunek) {  
    System.out.println("1");  
} else {
    System.out.println("2");  
}
```

### por贸wnywanie tekstu
鉂椻潡 Tekstu nigdy nie por贸wnujemy przez operator `==`. Do tego s艂u偶y metoda `equals`. 

```
String brand = "Mercedes";

if(brand.equals("Audi")) {
    System.out.println("Posiadasz Audi");
} else {
    System.out.println("Nie posiadasz Audi");
}
```

### por贸wnywanie warto艣ci logicznych

```
boolean warunek = true;  
if (warunek == true) {  
    // instrukcja  
}
```
鉂椻潡 Operacja `warunek == true` nie ma sensu, jest nadmiarowo艣ci膮. 

Powy偶szy kod jest to偶samy z poni偶szym.
```
boolean warunek = true;  
if (warunek) {  
    // instrukcja  
}
```

Podobnie w przypadku `warunek == false`. Zamiast tego, u偶yjmy `!warunek`.

```
boolean warunek = true;  
if (!warunek) {  // zamiast "warunek == false"
    // instrukcja  
}
```

## Instrukcja warunkowa - switch

>Innym typem instrukcji steruj膮cej jest instrukcja `switch`. W odr贸偶nieniu do instrukcji if jest ona przeznaczona przede wszystkim do warunk贸w o wielu rozga艂臋zieniach. Nie operuje ona na warunkach logicznych `true` i `false`, ale na warto艣ciach ca艂kowitoliczbowych, znakowych a tak偶e na napisach.
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
W nawiasie po s艂owie switch podajemy zmienn膮 lub warto艣膰 na podstawie kt贸rej program ma podj膮膰 dalsz膮 decyzj臋.

S艂owo **break** powoduje przerwanie wykonywania dalszych instrukcji w bloku _switch_, powinno si臋 ono znajdowa膰 ka偶dorazowo po wykonaniu odpowiednich instrukcji w ramach pojedynczego bloku _case_. Je偶eli o tym zapomnisz wykonane zostan膮 tak偶e instrukcje z dalszej cz臋艣ci _switcha_ (usu艅 s艂owa _break_ z powy偶szego kodu i sprawd藕 ponownie jego dzia艂anie). Brak s艂owa _break_ jest najcz臋艣ciej pojawiaj膮cym si臋 b艂臋dem w kontek艣cie instrukcji _switch_.

S艂owo **default** oznacza domy艣lne zachowanie programu w przypadku, gdy 偶adna z warto艣ci podanych powy偶ej nie zosta艂a dopasowana (naj艂atwiej por贸wna膰 to do bloku _else_ w konstrukcji _if-elseif-else_). Poniewa偶 jest to ostatnia instrukcja w naszym _switch'u_ nie musimy si臋 ju偶 martwi膰 przerywaniem wykonania i mo偶emy pomin膮膰 instrukcj臋 _break_. Blok _default_ jest opcjonalny, nie musisz go definiowa膰, je艣li nie masz pomys艂u na domy艣lne zachowanie.

馃摎 Napisz switch, kt贸ry przyjmie liczb臋 reprezentuj膮c膮 ocen臋 z testu i dla danej oceny wypisz dany komunikat
- 2 - Nie zaliczy艂e艣
- 3 - Zda艂e艣 dostatecznie
- 4 - Zda艂e艣 dobrze
- 5 - Zda艂e艣 bardzo dobrze

W przypadku innej oceny powinien zosta膰 wypisany komunikat "Nierozpoznana ocena".
```
int ocena = 7;  
switch (ocena) {  
	case 2:  
        System.out.println("Nie zaliczy艂e艣");  
		break;
	case 3:  
        System.out.println("Zda艂es dostatecznie");  
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
馃摎 Napisz switch, kt贸ry przyjmie zmienna typu String jako miesi膮c i wypisze ile dni ma dany miesi膮c.
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
		case "sierpie艅":  
	        System.out.println(31);  
		    break;
		case "wrzesie艅":  
	        System.out.println(30);  
	        break;
		case "pa藕dziernik":  
	        System.out.println(31);  
	        break;
		case "listopad":  
		     System.out.println(30);  
		     break;
		case "grudzie艅":  
	        System.out.println(31);  
	        break;
		default:  
	        System.out.println("Nierozpoznany miesiac"):
	        break;
 }
```
馃挕 Jak to zrobi膰 lepiej?
```
String miesiac = "styczen";  
switch (miesiac) {  
    case "styczen":  
    case "marzec":  
    case "maj":  
    case "lipiec":  
    case "sierpie艅":  
    case "pa藕dziernik":  
    case "grudzie艅":  
        System.out.println(31);  
        break;
    case "luty":  
        System.out.println(28);
        break;
    case "kwiecien":  
    case "czerwiec":  
    case "wrzesie艅":  
    case "listopad":  
        System.out.println(30);  
        break;
    default:  
        System.out.println("Nierozpoznany miesiac");
        break;
 }
```
Powinni艣my po艂膮czy膰 case je偶eli to mo偶liwe.

## Dodatkowe materia艂y

馃寪 [Instrukcje steruj膮ce - javastart](https://javastart.pl/baza-wiedzy/java-podstawy-jezyka/instrukcje-sterujace)

馃寪 [Switch case - stormit](https://stormit.pl/switch-case/)

馃寪 [Operatory - javastart](https://javastart.pl/baza-wiedzy/java-podstawy-jezyka/operatory-matematycze-i-logiczne)

馃寪 [Operatory logiczne - stormit](https://stormit.pl/operatory-logiczne/)
