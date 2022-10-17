![](https://github.com/xmslyz/LuhnAlgorithm/workflows/tests/badge.svg)



# LuhnAlgorithm
Algorytm ten wygląda następująco:

- Dla każdej pozycji cyfry określone zostają wagi (mnożniki).
- Najczęściej jest to 2 dla pozycji nieparzystych, 1 dla parzystych.
- Każdą cyfrę liczby mnoży się przez odpowiadającą jej wagę od prawej do lewej.
- Przy obliczaniu cyfry kontrolnej przyjmuje się, że ostatnia pozycja jest parzysta, a przy sprawdzaniu – nieparzysta.
- Jeśli w wyniku mnożenia otrzymano liczbę dwucyfrową, dodaje się cyfry do siebie, otrzymując liczbę jednocyfrową.
- Dodaje się wszystkie otrzymane liczby do siebie.
- Wykonuje się operację mod 10 na otrzymanej sumie (pozostawia się jedynie cyfrę jedności).
- Następnie, jeśli otrzymana cyfra nie równa się 0, odejmuje się ją od 10. Otrzymano cyfrę kontrolną, która jest
  "doklejana" do liczby. W innym przypadku dokleją się 0 jako sumę kontrolną
- [DO ZROBIENIA] Sprawdzenie poprawności liczby odbywa się poprzez zastosowanie na całej liczbie (łącznie z cyfrą
  kontrolną) kroków 1-5. Jeżeli liczba jest poprawna, otrzyma się w wyniku zero.

            * PRZYKŁAD
            * Dana jest liczba 92480[_].     
            * [_] - jest poszuiwaną liczbą kontrolną.
            * Wykonuje się mnożenie przez odpowiednie wagi.
            * Od lewej do prawej, pierwsza pozycja jest nieparzysta
            * (inaczej mówiąc – pozostawia się wolne miejsce na cyfrę kontrolną).
            * W nawiasie kwadratowym podano indeks pozycji.
            * [5] 9 × 2 = 18
            * [4] 2 × 1 = 2
            * [3] 4 × 2 = 8
            * [2] 8 × 1 = 8
            * [1] 0 × 2 = 0
            * Cyfry liczby 18 (jako dwucyfrowej) dodaje się do siebie, otrzymując 9.
            * Otrzymane liczby dodaje się do siebie: 9 + 2 + 8 + 8 + 0 = 27.
            * Wykonuje się operację mod 10: 27 mod 10 = 7.
            * 7 ≠ 0, więc wykonuje się operację 10 – 7 = 3.
            * Cyfrę kontrolną 3 "dokleja się" do liczby, otrzymując 92480[3].
