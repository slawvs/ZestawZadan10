# ZestawZadan10
Zestaw Zadan 10 z lekcji programowania w jezyku JAVA

## Zad 1.  Programowanie Wielowątkowe
Do napisania jest następujący program:
Wątek główny na początku funkcji main tworzy nowy wątek - nazwijmy go kulfon. Niech kulfon ma publiczne pole typu int (o nazwie naszaLiczba) i niech je inicjalizuje w konstruktorze wartością -1.
Następnie niech główny wątek w pętli która wykona się 40 razy losuje liczbę z przedziału 0-100:
Random randomGenerator = new Random();
int randomInt = randomGenerator.nextInt(100);
i ustawia pole naszaLiczba w klasie kulfon na wylosowaną wartość. Nadal w pętli która wykonuje się 40 razy, niech główny wątek śpi jedną sekundę. No koniec, zanim główny wątek skończy wykonywać funkcję main, niech wypisze: "Watek główny koniec pracy".
Teraz co ma robić kulfon? Niech sprawdza, czy pole naszaLiczba jest większe niż zero. Jeżeli nie jest to idzie spać na 200 milisekund. Jeżeli w końcu jest większe od zera: to kopiuje wartość w polu naszaLiczba do zmiennej lokalnej mojaLiczba i ustawia naszaLiczba znowu na -1. Załóżmy że mojaLiczba  to 45. Teraz niech kulfon wypisuje na ekran: "Odliczam od 45", i niech śpi 20 milisekund. Potem niech wypisze "Odliczam od 44" i tak dalej, aż do zera. 
Jeżeli tak zostawimy aplikację, to główny wątek po 40 razach się zakończy, ale kulfon niestety nie... Dlatego niech kulfon też sobie liczy ile już liczb przetworzył i jak przetworzy ostatnią czterdziestą, to niech zakończy swoje działanie. Na koniec swojej pracy, niech kulfon wypisze: "kulfon koniec pracy".
* Rozwiazanie: Main.java , kulfon.java
## Zad 2. http://pl.spoj.com/problems/AL_25_01/ 
AL_25_01_Ruletka.java
## Zad 3. http://pl.spoj.com/problems/FR_04_04/ 
FR_04_04_suma_algeb.java
## Zad 4. http://pl.spoj.com/problems/FR_04_01/ 
FR_04_01_Szyfrogram.java
