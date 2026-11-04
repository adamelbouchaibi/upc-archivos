|     |          |     |      | Enginyeria |     | de           | Telecomunicacio´ |        |                |       | (GRETST) |     |     |        |     |
| --- | -------- | --- | ---- | ---------- | --- | ------------ | ---------------- | ------ | -------------- | ----- | -------- | --- | --- | ------ | --- |
|     |          |     |      |            |     | Probabilitat |                  |        | i Estad´ıstica |       |          |     |     |        |     |
| 17  | de gener | de  | 2023 |            |     |              |                  | Examen |                | final |          |     |     | Temps: | 3h  |
Notes finals provisionals: 24 de gener. Visualitzaci´o dels ex`amens: 25 de gener.
.
Allegacions: fins el 26 de gener. Els problemes tenen el mateix pes.
1. Dos jugadors, A i B, juguen al joc segu¨ent. Cada un d’ells llan¸ca dos daus equilibrats i guanya qui
treu una suma de punts m´es alta. Si hi ha empat, tornen a jugar de nou.
(a) Calculeu la probabilitat d’empat en el primer torn (primera vegada que els jugadors llancen els
|     |     | daus), | i la | probabilitat | que | guanyi | A   | en el | primer | torn. |     |     |     |     |     |
| --- | --- | ------ | ---- | ------------ | --- | ------ | --- | ----- | ------ | ----- | --- | --- | --- | --- | --- |
(b) Sigui N el nombre de torns que s’han de jugar fins que un dels jugadors guanya. Doneu la funci´o
de probabilitat i l’esperanc¸a de la variable aleat`oria N. Quan val la probabilitat que A acabi
|     |     | guanyant |     | el joc? |     |     |     |     |     |     |     |     |     |     |     |
| --- | --- | -------- | --- | ------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(c) Sigui N com a l’apartat anterior. Si el joc ha durat m´es de k torns, quan val la probabilitat
P(k+1
|     |     |     | ≤   | N ≤ 2k)? |     |     |     |     |     |     |     |     |     |     |     |
| --- | --- | --- | --- | -------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Resoluci´o:
(a) Siguin D i D les sumes de punts de A i B, respectivament, en un torn donat. Comptant les
|     |     |     | A   | B   |     |     |     |     |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
parelles de resultats de dos daus en qu`e la suma de punts´es j tenim P(D = j) = P(D = j) = p , on
|     |     |     |     |     |     |     |     |     |     |     |     | A   |     | B   | j   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
p = 1/36 si j = 2,12; p = 2/36 si j = 3,11; p = 3/36 si j = 4,10; p = 4/36 si j = 5,9; p = 5/36 si
|     | j   |     |     |     | j   |     |     | j   |     |     |     | j   |     | j   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
j = 6,8; i p j = 6/36 si j = 7. La probabilitat d’empat en cada torn val
|     |     |     |     |     |       | 6        |     |     |        | 6        |     |       |      |     |     |
| --- | --- | --- | --- | --- | ----- | -------- | --- | --- | ------ | -------- | --- | ----- | ---- | --- | --- |
|     |     |     |     | P(D |       | (cid:88) | P(D |     |        | (cid:88) | P(D | j)P(D |      |     |     |
|     |     |     |     | =   | D ) = |          | =   | j,D | = j) = |          |     | =     | = j) |     |     |
|     |     |     |     | A   | B     |          | A   | B   |        |          | A   |       | B    |     |     |
|     |     |     |     |     |       | j=1      |     |     |        | j=1      |     |       |      |     |     |
2(12+22+32+42+52)+62
|     |     |     |     |     |     |     |     |     |     |     | 146 |     | 73        |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --------- | --- | --- |
|     |     |     |     |     | =   |     |     |     |     |     | =   | =   | ≈ 0,1127. |     |     |
362
|     |     |     |     |     |     |     |     |     |     |     | 1296 | 648 |       |       |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ---- | --- | ----- | ----- | --- |
|     |     |     | P(D |     |     | P(D |     |     |     |     | P(D  |     | )+P(D | )+P(D |     |
Per simetria, A > D B ) = B > D A ). D’altra banda, A > D B B > D A A =
D ) = 1, d’on dedu¨ım que P(D > D ) = (1−P(D = D )/2. Per tant, la probabilitat que guanyi
|     | B    |         |       |     |     | A   | B   |          | A   | B    |     |         |     |     |     |
| --- | ---- | ------- | ----- | --- | --- | --- | --- | -------- | --- | ---- | --- | ------- | --- | --- | --- |
|     | A en | un torn | donat | val |     |     |     |          |     |      |     |         |     |     |     |
|     |      |         |       |     |     |     |     | 1−73/648 |     | 575  |     |         |     |     |     |
|     |      |         |       |     | P(D | >   | D ) | =        |     | =    | ≈   | 0,4437. |     |     |     |
|     |      |         |       |     |     | A   | B   |          |     |      |     |         |     |     |     |
|     |      |         |       |     |     |     |     |          | 2   | 1296 |     |         |     |     |     |
(b) El nombre de vegades N que els jugadors han de jugar fins que no es produeixi un empat ´es una
variable aleat`oria geom`etrica de par`ametre p = 1−P(D = D ) = 575/648. Per tant, la funci´o de
|     |              |     |     |       |     |     |     |                 |     | A   | B      |     |     |     |     |
| --- | ------------ | --- | --- | ----- | --- | --- | --- | --------------- | --- | --- | ------ | --- | --- | --- | --- |
|     | probabilitat |     | de  | N ´es |     |     |     |                 |     |     |        |     |     |     |     |
|     |              |     |     |       |     | P(N | =   | n) = (1−p)n−1p, |     |     | n ≥ 1. |     |     |     |     |
El nombre mitj`a de vegades que hauran de jugar ´es E(N) = 1/p = 648/575 ≈ 1,1270.
D’altra banda, si G A ´es l’esdeveniment “acaba guanyant el joc el jugador A”, tenim
|     |     |     |     |     |       | ∞        |     |         | ∞        |             |     |     |     |     |     |
| --- | --- | --- | --- | --- | ----- | -------- | --- | ------- | -------- | ----------- | --- | --- | --- | --- | --- |
|     |     |     |     |     |       | (cid:88) |     |         | (cid:88) |             |     |     |     |     |     |
|     |     |     |     |     | P(G ) | =        | P(G | ,N = k) | =        | (1−p)k−1P(D |     | >   | D ) |     |     |
|     |     |     |     |     | A     |          | A   |         |          |             |     | A   | B   |     |     |
|     |     |     |     |     |       | k=1      |     |         | k=1      |             |     |     |     |     |     |
∞
|     |     |     |     |     |     |     |       | (cid:88) |          |     | p/2 | 1   |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | ----- | -------- | -------- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     | P(D |       |          | (1−p)k−1 |     |     |     |     |     |     |
|     |     |     |     |     |     | =   | A > D | B )      |          | =   |     | = . |     |     |     |
|     |     |     |     |     |     |     |       |          |          |     | p   | 2   |     |     |     |
k=1
Defet,aquestresultatespotdedu¨ırpersimetriajaqueeljoc´esjustielsdosjugadorstenenlamateixa
|     | oportunitat |     | de       | guanyar. |     |     |     |     |     |     |     |     |     |     |     |
| --- | ----------- | --- | -------- | -------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     | (c) Hem     | de  | calcular |          |     |     |     |     |     |     |     |     |     |     |     |
(cid:80)2k
|     |     |     |       |     |          |     |      | P(k+1  | ≤        | N ≤  | 2k) |             | (1−p)n−1p |     |     |
| --- | --- | --- | ----- | --- | -------- | --- | ---- | ------ | -------- | ---- | --- | ----------- | --------- | --- | --- |
|     |     |     | P(k+1 |     |          |     |      |        |          |      |     | n=k+1       |           |     |     |
|     |     |     |       | ≤   | N ≤ 2k|N | ≥   | k+1) | =      |          |      |     | =           |           |     |     |
|     |     |     |       |     |          |     |      |        | P(N ≥    | k+1) |     |             | (1−p)k    |     |     |
|     |     |     |       |     |          |     |      | (1−p)k | −(1−p)2k |      |     |             |           |     |     |
|     |     |     |       |     |          |     |      | =      |          |      |     | = 1−(1−p)k. |           |     |     |
(1−p)k
1

Alternativament, per la propietat de “no mem`oria” de les variables aleat`ories geom`etriques, tenim
|     | P(k+1 |     |     |      |        |     | P(1 |       |      | 1−P(N |     | 1−(1−p)k. |     |
| --- | ----- | --- | --- | ---- | ------ | --- | --- | ----- | ---- | ----- | --- | --------- | --- |
|     |       | ≤   | N ≤ | 2k|N | ≥ k+1) | =   |     | ≤ N ≤ | k) = |       | >   | k) =      |     |
2. La densitat de probabilitat d’una variable aleat`oria cont´ınua X ´es la funci´o
(cid:40)
|     |     |     |     |     |     |         |     | kex,   | x < | 0   |     |     |     |
| --- | --- | --- | --- | --- | --- | ------- | --- | ------ | --- | --- | --- | --- | --- |
|     |     |     |     |     |     | f X (x) | =   |        |     |     |     |     |     |
|     |     |     |     |     |     |         |     | ke−2x, | x ≥ | 0   |     |     |     |
(a) Demostreu que la constant k val 2/3 i determineu la funci´o de distribuci´o de probabilitat de X.
| Sigui          | Y = g(X), | on   | g(x) =    | e−x/2.      |     |       |          |     |     |     |     |     |     |
| -------------- | --------- | ---- | --------- | ----------- | --- | ----- | -------- | --- | --- | --- | --- | --- | --- |
| (b) Determineu |           | la   | funci´o   | de densitat |     | de la | variable | Y.  |     |     |     |     |     |
| (c) Calculeu   |           | E(Y) | i E(lnY). |             |     |       |          |     |     |     |     |     |     |
Resoluci´o:
(cid:82)∞
(a) El valor de k queda determinat per la condici´o de normalitzaci´o f (x)dx = 1. Com que
|            |                 |          |         |          |                  |       |             |              |     |          | −∞       | X             |     |
| ---------- | --------------- | -------- | ------- | -------- | ---------------- | ----- | ----------- | ------------ | --- | -------- | -------- | ------------- | --- |
|            |                 | (cid:90) | ∞       |          | (cid:18)(cid:90) | 0     |             | (cid:90) ∞   |     | (cid:19) | (cid:18) | 1 (cid:19) 3k |     |
|            |                 |          |         |          |                  | exdx+ |             | e−2xdx       |     |          |          |               |     |
|            |                 |          | f (x)dx |          | = k              |       |             |              |     | =        | k 1+     | =             |     |
|            |                 |          | X       |          |                  |       |             |              |     |          |          | 2 2           |     |
|            |                 | −∞       |         |          |                  | −∞    |             | 0            |     |          |          |               |     |
| dedu¨ım    | que k           | = 2/3.   |         |          |                  |       |             |              |     |          |          |               |     |
| La funci´o | de distribuci´o |          | de      | X ´es    |                  |       |             |              |     |          |          |               |     |
|            |                 |          |         |          |                  |       | (cid:90) x | 2            | 2   |          |          |               |     |
|            |                 |          |         |          |                  |       |           | etdt         | =   | ex,      |          | x < 0         |     |
|            |                 |          |         | (cid:90) |                  |       |            | 3            | 3   |          |          |               |     |
|            |                 |          |         | x        |                  |       |  −∞        |              |     |          |          |               |     |
|            |                 | F        | (x) =   |          | f (t)dt          | =     |             |              |     |          |          |               |     |
|            |                 | X        |         |          | X                |       |             |              |     |          |          |               |     |
|            |                 |          |         |          |                  |       | 2           | (cid:90) x 2 |     |          | 1        |               |     |
|            |                 |          |         | −∞       |                  |       |           | e−2tdt       |     |          | e−2x,    |               |     |
|            |                 |          |         |          |                  |       |  +         |              |     | = 1−     |          | x ≥ 0         |     |
|            |                 |          |         |          |                  |       |  3         | 3            |     |          | 3        |               |     |
0
(b) Sigui g(x) = e−x/2 i sigui Y = g(X). Com que g(x) ´es mon`otona decreixent i derivable podem
e−x/2
aplicar el teorema del canvi de variable. Per a cada y > 0, l’equaci´o y = t´e soluci´o u´nica
| x = −2lny. | A   | m´es | |g′(x)| | = (1/2)e−x/2. |     | Per | tant, |     |     |     |     |     |     |
| ---------- | --- | ---- | ------- | ------------- | --- | --- | ----- | --- | --- | --- | --- | --- | --- |
4
|     |     |     |     |         |          |     |     |         |     | y3,    | 0   | < y < 1 |     |
| --- | --- | --- | --- | ------- | -------- | --- | --- | ------- | --- | ------ | --- | ------- | --- |
|     |     |     |     |         | (cid:12) |     |     |         |     |      |     |         |     |
|     |     |     |     | f (x)   | (cid:12) |     | f   | (−2lny) |     | 3     |     |         |     |
|     |     | f   | (y) | = X     |          |     | = X |         | =   |        |     |         |     |
|     |     |     | Y   |         | (cid:12) |     |     |         |     |        |     |         |     |
|     |     |     |     | |g′(x)| | (cid:12) |     |     | y/2     |     | 4      |     |         |     |
|     |     |     |     |         | x=−2lny  |     |     |         |     |      |     |         |     |
|     |     |     |     |         |          |     |     |         |     |  y−3, | y   | ≥ 1     |     |
3
| (c) Aplicant | el  | teorema | de       | l’esperanc¸a, |         |     |                  |              |     |     |            |              |          |
| ------------ | --- | ------- | -------- | ------------- | ------- | --- | ---------------- | ------------ | --- | --- | ---------- | ------------ | -------- |
|              |     |         |          |               |         |     | (cid:18)(cid:90) |              |     |     |            |              | (cid:19) |
|              |     |         | (cid:90) | ∞             |         |     | 2                | 0            |     |     | (cid:90) ∞ |              |          |
|              |     | E(g(X)) |          |               |         |     |                  | e(1−1/2)xdx+ |     |     |            | e−(2+1/2)xdx |          |
|              |     |         | =        | g(x)f         | X (x)dx |     | =                |              |     |     |            |              |          |
3
|     |     |     |     | −∞       |            |     |     | −∞  |     |     | 0   |     |     |
| --- | --- | --- | --- | -------- | ---------- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     | 2   | (cid:18) | 2 (cid:19) | 8   |     |     |     |     |     |     |     |
|     |     |     | =   | 2+       | =          | .   |     |     |     |     |     |     |     |
|     |     |     | 3   |          | 5          | 5   |     |     |     |     |     |     |     |
D’altra banda,
|     |        |     |         |     | 2 (cid:18)(cid:90) | 0           |     |     | (cid:90) ∞   |     |     | (cid:19) 1 1 | 1   |
| --- | ------ | --- | ------- | --- | ------------------ | ----------- | --- | --- | ------------ | --- | --- | ------------ | --- |
|     | E(lnY) |     | E(−X/2) |     |                    | (−x/2)exdx+ |     |     | (−x/2)e−2xdx |     |     |              |     |
|     |        | =   |         | =   |                    |             |     |     |              |     |     | = −          | = . |
|     |        |     |         |     | 3                  |             |     |     |              |     |     | 3 12         | 4   |
|     |        |     |         |     | −∞                 |             |     |     | 0            |     |     |              |     |
2

3. Els instants d’inici i final de cert senyal venen donats, respectivament, per les variables aleat`ories X i
| Y amb | densitat |     | conjunta: |     |     |     |     |     |     |     |     |     |     |
| ----- | -------- | --- | --------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(cid:26)
|     |     |     |     |     |       |       |     | Kxy, | 0 ≤ x     | < y ≤ | 1   |     |     |
| --- | --- | --- | --- | --- | ----- | ----- | --- | ---- | --------- | ----- | --- | --- | --- |
|     |     |     |     |     | f X,Y | (x,y) | =   |      |           |       |     |     |     |
|     |     |     |     |     |       |       |     | 0,   | altrament |       |     |     |     |
(a) Determineu el valor de la constant K i les funcions de densitat marginal de X i de Y. Qu`e val
| l’esperanc¸a |     |     | de la | durada | del senyal, |     | T = | Y −X? |     |     |     |     |     |
| ------------ | --- | --- | ----- | ------ | ----------- | --- | --- | ----- | --- | --- | --- | --- | --- |
(b) Calculeu l’esperanc¸a de X condicionada a Y = y i l’esperanc¸a de Y condicionada a X = x. Quin
significat tenen en teoria de l’estimaci´o? Digueu, per a cadascuna, si s´on millors, iguals, o pitjors
| que | la  | corresponent |     | estimaci´o |     | lineal. |     |     |     |     |     |     |     |
| --- | --- | ------------ | --- | ---------- | --- | ------- | --- | --- | --- | --- | --- | --- | --- |
(c) Determineu la funci´o de densitat conjunta, i la seva regi´o de validesa, de les variables
(cid:40)
Z = X
|     |     |     |     |     |     |     |     | T = | Y −X |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ---- | --- | --- | --- | --- |
Resoluci´o.
nul·la
(a) La densitat ´es no en el triangle de v`ertex (0,0), (0,1) i (1,1). Fixada x, y ∈ (x,1). Fixada
y, x ∈ (0,y).
|     |     |     |     |     | (cid:90) (cid:90) |     |           |     |     | (cid:90) | (cid:90) |     |     |
| --- | --- | --- | --- | --- | ----------------- | --- | --------- | --- | --- | -------- | -------- | --- | --- |
|     |     |     |     |     | ∞                 | ∞   |           |     |     | 1        | 1        |     |     |
|     |     |     |     | 1 = |                   | f   | (x,y)dxdy |     | = K | dx       | dyxy     |     |     |
X,Y
|        |          |       |     |          | −∞       | −∞   |          |       |            | 0    | x   |            |     |
| ------ | -------- | ----- | --- | -------- | -------- | ---- | -------- | ----- | ---------- | ---- | --- | ---------- | --- |
|        |          |       |     |          | (cid:90) |      |          |       | (cid:90)   |      |     |            |     |
|        |          |       |     |          | 1        | 1−x2 |          | K     | 1          |      | K   |            |     |
|        |          |       |     | =        | K        | dxx  |          | =     | dx(x−x3)   |      | = , |            |     |
|        |          |       |     |          |          |      | 2        | 2     |            |      | 8   |            |     |
|        |          |       |     |          | 0        |      |          |       | 0          |      |     |            |     |
| d’on K | = 8.     |       |     |          |          |      |          |       |            |      |     |            |     |
|        | (cid:90) | 1     |     |          |          |      |          |       | (cid:90) y |      |     |            |     |
|        |          |       |     | 4(x−x3), |          |      |          |       |            | 4y3, |     |            |     |
| f (x)  | =        | dy8xy | =   |          | 0 <      | x <  | 1. f     | (y) = | dx8xy      | =    | 0 < | y < 1.     |     |
| X      |          |       |     |          |          |      | Y        |       |            |      |     |            |     |
|        | x        |       |     |          |          |      |          |       | 0          |      |     |            |     |
|        |          |       |     |          |          |      | (cid:90) | 1     |            |      |     | (cid:90) 1 |     |
|        |          |       |     | 4        |          |      |          |       |            |      | 8   |            | 4   |
E[T] = E[Y]−E[X] = . (Ja que E[X] = dxx·4(x−x3) = , E[Y] = dyy·4y3 = .)
|     |     |     |     | 15  |     |     |     |     |         |     | 15  |     | 5   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ------- | --- | --- | --- | --- |
|     |     |     |     |     |     |     | 0   |     |         |     |     | 0   |     |
|     |     |     |     |     |     |     |     |     | f (x,y) | 8xy | 2x  |     |     |
(b) Calculem les densitats condicionades: f(x|y) = X,Y = = , 0 < x < y.
|     |     |     |     |     |     |     |     |     | f (y) | 4y3 | y2  |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ----- | --- | --- | --- | --- |
Y
|     | f   | (x,y) |     | 8xy |     | 2y  |     |     |     |     |     |     |     |
| --- | --- | ----- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
X,Y
| f(y|x) | =   |       | =   |         | =   |      | , x < | y < | 1.  |     |     |     |     |
| ------ | --- | ----- | --- | ------- | --- | ---- | ----- | --- | --- | --- | --- | --- | --- |
|        |     | f (x) |     | 4(x−x3) |     | 1−x2 |       |     |     |     |     |     |     |
X
|     | (cid:90) | ∞   |     | (cid:90) | y   | 2x  | 2   | (cid:90) y | 2   |     |     |     |     |
| --- | -------- | --- | --- | -------- | --- | --- | --- | ---------- | --- | --- | --- | --- | --- |
dxx2
| E[X|y] | =        | dxxf(x|y) |     | =        | dxx· |     | =   |     | =        | y.  |         |     |     |
| ------ | -------- | --------- | --- | -------- | ---- | --- | --- | --- | -------- | --- | ------- | --- | --- |
|        |          |           |     |          |      | y2  | y2  |     | 3        |     |         |     |     |
|        |          | −∞        |     |          | 0    |     |     | 0   |          |     |         |     |     |
|        | (cid:90) |           |     | (cid:90) |      |     |     |     | (cid:90) |     |         |     |     |
|        |          | ∞         |     |          | 1    | 2y  |     | 2   | 1        |     | 21+x+x2 |     |     |
dyy2
| E[Y|x] | =   | dxyf(y|x) |     | =   | dyy· |      | =   |      |     | =   |       | .   |     |
| ------ | --- | --------- | --- | --- | ---- | ---- | --- | ---- | --- | --- | ----- | --- | --- |
|        |     |           |     |     |      | 1−x2 |     | 1−x2 |     |     | 3 1+x |     |     |
|        |     | −∞        |     |     | x    |      |     |      | x   |     |       |     |     |
Les esperances condicionades donen la millor estimaci´o possible d’una variable, conegut el valor de
l’altra (estimaci´o no lineal). Per tant, en general l’estimaci´o no lineal ´es millor que l’estimaci´o lineal
|     |     |     |     |     |     |     |     | Xˆ  | 2Y  |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
llevat que coincideixin les dues. En el nostre cas, = ha resultat ser lineal (forma aY +b) aix´ı
3
|     |     |     |     |     | Yˆ  | 21+X+X2 |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | ------- | --- | --- | --- | --- | --- | --- | --- |
que les dues s´on iguals. En canvi = no t´e forma lineal aix´ı que aquesta estimaci´o´es millor
|     |     |     |     |     |     | 3   | 1+X |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
que la lineal.
|     |     |     |     |     |     |     |     |     |        | (cid:12)   | (cid:12)   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ------ | ---------- | ---------- | --- | --- |
|     |     |     |     |     |     |     |     |     | ∂(x,y) | (cid:12) 1 | 0 (cid:12) |     |     |
(c) Invertint la relaci´o x = z, y = z+t. El jacobi`a ´es = = 1.
|     |     |     |     |     |     |     |     |          |          | (cid:12)   | (cid:12)   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | -------- | -------- | ---------- | ---------- | --- | --- |
|     |     |     |     |     |     |     |     |          | ∂(z,t)   | (cid:12) 1 | 1 (cid:12) |     |     |
|     |     |     |     |     |     |     |     | (cid:12) | (cid:12) |            |            |     |     |
(cid:12)∂(x,y)(cid:12)
|     |     |     |     |     | f (z,t) | =   | f (x,y)(cid:12) |     |          | = 8z(z+t). |     |     |     |
| --- | --- | --- | --- | --- | ------- | --- | --------------- | --- | -------- | ---------- | --- | --- | --- |
|     |     |     |     |     | Z,T     |     | X,Y             |     | (cid:12) |            |     |     |     |
(cid:12)∂(z,t)(cid:12)
La condici´o 0 < x < y < 1 es tradueix en z,t > 0, z+t < 1. Alternativament, com la transformaci´o´es
lineal, el triangle en el pla xy es transforma en un triangle de v`ertex (0,0), (1,0) i (0,1) en el pla zt.
3

4. Certa variable aleat`oria es pot modelar amb la densitat
f(x) = √
1 e−(x
2
−
α
α
2
)2
, −∞ < x < ∞,
2πα
on α ´es un par`ametre positiu.
(a) Sigi Xˆ la mitjana mostral corresponent a una mostra de mida n. Quin tipus de variable ´es Xˆ?
Quin ´es l’estimador de α que s’obt´e amb el m`etode dels moments? Si amb una mostra de mida
100 resulta Xˆ = 5.17 doneu un interval per a α amb nivell de confian¸ca del 95%.
(Indicaci´o: si Z ∼ N(0,1), aleshores F (1.440) ≈ 0.925, F (1.645) ≈ 0.950, F (1.960) ≈ 0.975.)
Z Z Z
(b) Determineu l’estimador de m`axima versemblanc¸a del par`ametre α. Quin ´es el valor estimat d’α
si en la mostra de l’apartat anterior s’obtenia la desviaci´o no esbiaixada Sˆ = 5.30.
n
1 (cid:88)
(Indicaci´o: denoteu M = x2 i obteniu el seu valor a partir de Sˆ.)
2 n i
i=1
Resoluci´o.
n
1 (cid:88)
(a) La densitat correspon a una variable N(α,α). Llavors, Xˆ = X tamb´e´es una variable normal
i
n
i=1
α
amb µ = α i σ = √ .
n
L’estimador s’obt´e igualant el primer moment de X (esperanc¸a) al primer moment mostral (Xˆ). Aix´ı,
´es α = Xˆ, ´es a dir αˆ = Xˆ.
M
Xˆ −α
Per a obtenir l’interval de confian¸ca, Z = ∼ N(0,1).
√α
n
La regio´ de confianc¸a ve donada per −z < Z < z de manera que P(−z < Z < z ) = c. Per obtenir
c c c c
Xˆ −α
l’interval per a α, −z < < z , que equival a
c √α c
n
Xˆ Xˆ
< α < .
1+ √ zc 1− √ zc
n n
Amb c = 0.95 ´es z = 1.96. Per a α tenim un valor estimat igual a 5.17 i un interval (4.32,6.43) al
c
95% de confianc¸a.
(b)
(cid:88) n (cid:88) n (cid:18) (x i −α)2 √ (cid:19)
L = lnf(x ;α) = − −lnα−ln 2π
i 2α2
i=1 i=1
= (cid:88) n (cid:18) − x2 i + x i − 1 −lnα−ln √ 2π (cid:19) = −n M 2 +n Xˆ −nlnα−n (cid:18) 1 +ln √ 2π (cid:19) .
2α2 α 2 2α2 α 2
i=1
La condicio´ de m`axim ´es
dL M Xˆ n
2
0 = = n −n − .
dα α3 α2 α
(cid:112)
−Xˆ ± Xˆ2+4M
d’on α2+Xˆα−M = 0, amb solucions α = 2 . Ens quedem amb la soluci´o positiva:
2
2
(cid:112)
−Xˆ + Xˆ2+4M
2
αˆ = .
ML
2
Per a obtenir M , considerem S2 = M −Xˆ2 i S2 = n−1Sˆ2. M = n−1Sˆ2+Xˆ2 = 54.538 i αˆ = 5.24.
2 2 n 2 n ML
4
