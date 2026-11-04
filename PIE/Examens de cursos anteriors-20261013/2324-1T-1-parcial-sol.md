|       |               | Enginyeria |         |           | de Telecomunicacio´ |        |              | (GRETST) |        |        |
| ----- | ------------- | ---------- | ------- | --------- | ------------------- | ------ | ------------ | -------- | ------ | ------ |
|       |               |            |         |           | Probabilitat        | i      | Estad´ıstica |          |        |        |
| 22 de | novembre      |            | de 2023 |           |                     | Examen | parcial      |          | Temps: | 1h 55m |
| Notes | provisionals: |            | 29 de   | novembre, | Atenea              |        |              |          |        |        |
1. Tenim dues urnes amb monedes. A la primera, hi ha 9 monedes justes i 3 monedes trucades. A la
segona, hiha8monedesjustesi4monedestrucades. Lesprobabilitatsdesortircaraperalesmonedes
| trucades | s´on iguals |     | a 3/7 a | la primera | urna | i 3/5 a la    | segona. |     |     |     |
| -------- | ----------- | --- | ------- | ---------- | ---- | ------------- | ------- | --- | --- | --- |
| S’extreu | a l’atzar   | una | moneda  | de cada    | urna | i es llencen. |         |     |     |     |
(a) Trobeu la probabilitat que surtin dues cares i la probabilitat que surti almenys una creu.
(b) Determineu la probabilitat que la moneda de la segona urna estigui trucada condicionada a que
| surtin | dues | cares. |     |     |     |     |     |     |     |     |
| ------ | ---- | ------ | --- | --- | --- | --- | --- | --- | --- | --- |
(c) Repetim el joc, amb reposici´o, fins que surten dues cares. Determineu el nombre esperat de
| tirades. |     |     |     |     |     |     |     |     | (3.5 | punts) |
| -------- | --- | --- | --- | --- | --- | --- | --- | --- | ---- | ------ |
Resoluci´o
| (a) Com | que |     |     |     |        |      |          |      |     |     |
| ------- | --- | --- | --- | --- | ------ | ---- | -------- | ---- | --- | --- |
|         |     |     |     |     | P(creu | ⩾    | 1−P(cara |      |     |     |
|         |     |     |     |     |        | 1) = |          | = 2) |     |     |
calculem la probabilitat que surtin dues cares. La probabilitat que surti cara amb la moneda de
| la  | primera | urna | ´es |     |     |     |     |     |       |     |
| --- | ------- | ---- | --- | --- | --- | --- | --- | --- | ----- | --- |
|     |         |      |     |     |     |     |     | 1   | 3 3 1 | 27  |
P(cara1) = P(cara1|justa1)P(justa1)+P(cara1|trucada1)P(trucada1) = · + · =
|     |     |     |     |     |     |     |     | 2   | 4 7 4 | 56  |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ----- | --- |
An`alogament, la probabilitat que surti cara amb la moneda de la segona urna ´es
|     |     |     |     |     |     |     |     | 1   | 2 3 1 | 8   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ----- | --- |
P(cara2) = P(cara2|justa2)P(justa2)+P(cara2|trucada2)P(trucada2) = · + · =
|     |     |     |     |     |     |     |     | 2   | 3 5 3 | 15  |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ----- | --- |
Com que aquests esdeveniments s´on independents, la probabilitat que surtin dues cares ´es
27 8 9
P(cara
|     |     |     |     |     |     | = 2) = | ·   | =   |     |     |
| --- | --- | --- | --- | --- | --- | ------ | --- | --- | --- | --- |
56 15 35
| i per | tant, | la probabilitat |     | que | surti | almenys una | creu ´es |     |     |     |
| ----- | ----- | --------------- | --- | --- | ----- | ----------- | -------- | --- | --- | --- |
9 26
P(creu ⩾
|     |     |     |     |     |     | 1) = | 1−  | =   |     |     |
| --- | --- | --- | --- | --- | --- | ---- | --- | --- | --- | --- |
35 35
| (b) Per | la f´ormula |     | de Bayes, |     |     |        |                           |     |     |     |
| ------- | ----------- | --- | --------- | --- | --- | ------ | ------------------------- | --- | --- | --- |
|         |             |     |           |     |     | P(cara | = 2|trucada2)·P(trucada2) |     |     |     |
P(trucada2|cara
= 2) =
|     |     |     |     |     |     |     | P(cara | = 2) |     |     |
| --- | --- | --- | --- | --- | --- | --- | ------ | ---- | --- | --- |
Tenim
|     |       |     |        |             |     |                            |     | 27 3   | 81  |     |
| --- | ----- | --- | ------ | ----------- | --- | -------------------------- | --- | ------ | --- | --- |
|     |       |     | P(cara |             |     | P(cara1)·P(cara2|trucada2) |     |        |     |     |
|     |       |     | =      | 2|trucada2) |     | =                          |     | = ·    | =   |     |
|     |       |     |        |             |     |                            |     | 56 5   | 280 |     |
| Per | tant, |     |        |             |     |                            |     |        |     |     |
|     |       |     |        |             |     |                            | 81  | 1 35 3 |     |     |
P(trucada2|cara
|     |     |     |     |     |     | = 2) | = · | · =   |     |     |
| --- | --- | --- | --- | --- | --- | ---- | --- | ----- | --- | --- |
|     |     |     |     |     |     |      | 280 | 3 9 8 |     |     |
(c) El nombre de tirades fins que surten dues cares ´es una distribuci´o geom`etrica amb p = 9/35.
| L’esperanc¸a |     | d’aquesta |     | variable | aleat`oria | ´es 1/p | = 35/9. |     |     |     |
| ------------ | --- | --------- | --- | -------- | ---------- | ------- | ------- | --- | --- | --- |
1

2. Sigui X una variable aleat`oria cont´ınua i considerem la variable Y = g(X), obtinguda de X amb la
transformaci´o
(cid:40)
0, x < 0
g(x) = .
x2, x ⩾ 0
(a) Si la variable X t´e densitat f (x) = 0 si x < 1 i f (x) = 4/x5 si x ⩾ 1, determineu la funci´o de
X X
distribuci´o F (x), la funci´o de densitat f (y), i la densitat condicionada f (y|Y > 2).
X Y Y
(b) En aquest apartat, X ´es uniforme en l’interval [−1,1]. Calculeu la funci´o de distribuci´o F (y).
Y
Quan val P(Y = 0)? Determineu tamb´e E[Y]. (3.5 punts)
Resoluci´o
(a) La funci´o de distribuci´o de X es F (x) = x 4/u5du = 1−1/x4 si x ⩾ 1.
X (cid:114)1
Per a x > 0, la funci´o g(x) = x2 ´es mon`otona creixent, amb derivada g′(x) = 2x, i transforma de
forma bijectiva l’interval 0 < x < 1 en 0 < y < 1, i l’interval x > 1 en y > 1. Aix´ı, aplicant el
teorema del canvi de variable, si y > 0 tenim:

0, 0 < y < 1
(cid:12) 
f Y (y) = |
f
g
X
′(
(
x
x
)
)
|
(cid:12)
(cid:12) (cid:12) x= √ y =

  4 2 / x
x5(cid:12)
(cid:12) (cid:12) (cid:12) √ = y 2 3 , y > 1 .
x= y
Finalment, si y > 2,
f (y) 2/y3 8
Y
f (y|Y > 2) = = = .
Y P(Y > 2) ∞ 2/u3du y3
(cid:114)2
(b) En aquest segon cas, X ∼ Unif[−1,1] i, per tant, f (x) = 1/2 si x ∈ [−1,1].
X
La variable aleat`oria Y = g(X) pren valors ⩾ 0. Por tant, F (y) = P(Y ⩽ y) = 0 si y < 0.
Y √
D’altra banda, si y ⩾ 0 l’equaci´o y = g(x) t´e una u´nica soluci´o x = y. Aix´ı, si y ⩾ 0, llavors
 √ √
y 1 1+ y
F (y) = P(Y ⩽ y) = P(X ⩽ √ y) = √ y f (x)dx =   (cid:119) −1 2 dx = 2 0 ⩽ y < 1 .
Y (cid:119) X
−1   (cid:119) 1 1 dx = 1, y ⩾ 1
−1 2
La funci´o F (y) presenta en y = 0 una discontinu¨ıtat de salt. Aix´ı, Y ´es una variable mixta que
Y
no t´e densitat ordin`aria. La probabilitat de que la variable Y prengui el valor 0 ´es P(Y = 0) =
F (0)−F (0−) = 1/2. (Alternativament, P(Y = 0) = P(X ⩽ 0) = 1/2.)
Y Y
Podem calcular E[Y] usant el teorema de la esperan¸ca:
∞ 1 1 1 1 1
E[Y] = g(x)f (x)dx = g(x)dx = x2dx = .
(cid:119) X (cid:119) (cid:119)
−∞ 2 −1 2 0 6
3. Considerem la variable aleat`oria bidimensional que t´e com a funci´o de densitat conjunta f (x,y) =
XY
k(2−2y−x) en el recinte delimitat per les rectes x = 0, y = 0, i x+2y = 2, i val 0 a la resta del pla.
(a) Calculeu la constant k.
(b) Calculeu les funcions de densitat marginal f (x) i f (y).
X Y
(c) Calculeu P(X < Y) (3 punts)
Resoluci´o
(a) Cal exigir que la probabilitat total sigui 1. Doncs,
2 2−x 2 (x−2)2 2
dx 2 (2−2y−x)dy = dx =
(cid:119) (cid:119) (cid:119)
0 0 0 4 3
i per tant k = 3/2.
2

(b) Si observem el c`alcul anterior, ja sabem que f (x) = 3(x−2)2 en l’interval [0,2] Per tant ara
X 8
| hem de calcular |        | f Y (y). | Fem:     |            |            |        |          |     |
| --------------- | ------ | -------- | -------- | ---------- | ---------- | ------ | -------- | --- |
|                 |        |          |          | 3 2−2y     |            |        | 3        |     |
|                 |        |          | f (y) =  | (2−2y−x)dx |            | =      | (2−2y)2. |     |
|                 |        |          | Y        | (cid:119)  |            |        |          |     |
|                 |        |          |          | 2 0        |            |        | 4        |     |
| i aquesta       | ´es la | densitat | marginal | de la y en | l’interval | [0,1]. |          |     |
(c) Primer calculem el punt d’intersecci´o de les rectes x+2y = 2 i y = x, que do´na el (2/3,2/3).
| Aleshores | fem | la integral |                   |     |     |               |     |        |
| --------- | --- | ----------- | ----------------- | --- | --- | ------------- | --- | ------ |
|           |     | 3           | 2 2−x             |     |     | 3 2 4−12x+9x2 |     | 1      |
|           |     |             | 3 dx 2 (2−2y−x)dy |     | =   | 3             |     | dx = . |
|           |     | (cid:119)   | (cid:119)         |     |     | (cid:119)     |     |        |
|           |     | 2           | 0 x               |     |     | 2 0           | 4   | 3      |
3
