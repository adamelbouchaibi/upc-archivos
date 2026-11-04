Enginyeria de Telecomunicaci´o (GRETST)
Probabilitat i Estad´ıstica
12 de Novembre de 2020 Examen parcial Temps: 1h 50m
Notes provisionals: Atenea, 20 de novembre. Els problemes tenen el mateix pes.
Revisi´o: 23 de novembre, de 16:00 a 18:00, ed. C3, despatx 112.
1. (a) Un dau equilibrat t´e les seves cares numerades 1,1,2,4,4,4. Si el llancem 3 vegades,
calculeu la probabilitat d’obtenir el mateix resultat en els tres llan¸caments.
(b) Una bossa cont´e dos daus equilibrats: un de normal (amb les cares 1,2,3,4,5,6) i un altre
amb les cares 1,1,2,4,4,4. N’escollim un a l’atzar i el llancem tres vegades. Per casualitat,
els tres llan¸caments donen el mateix resultat.
i. Calculeu la probabilitat de que el dau que hem llan¸cat sigui el normal.
ii. Si a m´es sabem que la suma de punts obtinguda ha estat senar, torneu a calcular la
probabilitat de que el dau escollit sigui el normal.
(c) Els jugadors J i J juguen el segu¨ent joc: es llan¸ca el dau que t´e les cares 1,1,2,4,4,4
1 2
fins que surt 1 o 2. Si surt 1 abans que 2 guanya J ; altrament, si surt 2 abans que 1
1
guanya J . Calculeu la probabilitat de guanyar que t´e cada jugador i el nombre esperat
2
de llan¸caments fins que el joc acaba.
Resoluci´o.
(a) Sigui A l’esdeveniment “els tres llan¸caments donen el mateix resultat”. Si llancem el dau
amb cares 1,1,2,4,4,4, la probabilitat Pr(A) val
1 3 1 3 1 3 1
Pr(A) = Pr(111)+Pr(222)+Pr(444) = + + = .
3 6 2 6
! " ! " ! "
(b.i) Diguem N a l’esdeveniment “el dau escollit ´es el normal” i sigui A l’esdeveniment “els
tres llan¸caments donen el mateix resultat”. Usant la f´ormula de Bayes tenim
Pr(A N)Pr(N) 6(1/6)3(1/2) 1
Pr(N A) = | = = .
| Pr(A N)Pr(N)+Pr(A N)Pr(N) 6(1/6)3(1/2)+(1/6)(1/2) 7
| |
(b.ii) Sigui B l’esdeveniment “els tres llan¸caments donen el mateix resultat i la puntuaci´o
obtinguda ´es senar”. Ara,
Pr(B N)Pr(N) 3(1/6)3(1/2) 3
Pr(N B) = | = = .
| Pr(B N)Pr(N)+Pr(B N)Pr(N) 3(1/6)3(1/2)+(1/3)3(1/2) 11
| |
(b) Condicionant pel resultat del primer llan¸cament, la probabilitat Pr(J ) que guanyi J val
1 1
1 1 1 1 1
Pr(J ) = Pr(J 1) +Pr(J 2) +Pr(J 4) = +Pr(J ) .
1 1 1 1 1
| · 3 | · 6 | · 2 3 · 2
Per tant, Pr(J ) = 2/3 i Pr(J ) = 1 Pr(J ) = 1/3.
1 2 1
−
El nombre N de llan¸caments del dau fins que acaba la partida´es una variable geom`etrica
de par`ametre p = Pr(1)+Pr(2) = 1/2. Per tant, E(N) = 1/p = 2.
1

2. SiguiX unavariablealeat`oriacont´ınuaambfunci´odedensitatf (x) = x 1 /4si x 1 α
X
|           |             |     |        |              |     |            |     |     |     | | − | | | − | | ≤ |
| --------- | ----------- | --- | ------ | ------------ | --- | ---------- | --- | --- | --- | --- | ----- | --- |
| i f (x) = | 0 altrament |     | (α ´es | una constant |     | positiva). |     |     |     |     |       |     |
X
(a) Dibuixeu la gr`afica de la densitat f (x) i indiqueu el valor de E(X). Demostreu que
X
| α = | 2.  |     |     |     |     |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(b) Determineu la funci´o de distribuci´o F (x) i dibuixeu la seva gr`afica.
X
| (c) Calculeu | la  | densitat | f   | (x X | > 0) i | dibuixeu | la  | seva gr`afica. |     |     |     |     |
| ------------ | --- | -------- | --- | ---- | ------ | -------- | --- | -------------- | --- | --- | --- | --- |
|              |     |          |     | X |  |        |          |     |                |     |     |     |     |
(d) Si Y = (X 1)2, calculeu la funci´o de densitat de Y i la seva esperan¸ca.
−
Resoluci´o.
(a) Com que la funci´o f (x) t´e simetria parella respecte al punt x = 1, ´es a dir f (1 x) =
|     |     |     | X   |     |     |     |     |     |     |     | X   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
−
f (1+x), el valor mitj`a de la variable X ´es E(X) = 1. Vegeu la Figura 1.
X
f (x)
X
x
|     |     |     | Figura | 1:  | La funci´o | f   | (x) amb | α = | 2.  |     |     |     |
| --- | --- | --- | ------ | --- | ---------- | --- | ------- | --- | --- | --- | --- | --- |
X
El valor de la constant α s’obt´e de la igualtat 1 = f (x)dx = α2/4 i resulta ser
∞ X
−∞
| α = | 2.  |     |     |     |     |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
#
| (b) La | funci´o de | distribuci´o |     | ´es: |     |     |     |     |     |     |      |     |
| ------ | ---------- | ------------ | --- | ---- | --- | --- | --- | --- | --- | --- | ---- | --- |
|        |            |              |     |      |     | 0   |     |     |     |     | (x < | 1), |
−
|     |     |     |     |     |     |     | x 1 u |     | 1 (1 | x)2 |     |     |
| --- | --- | --- | --- | --- | --- | --- | ----- | --- | ---- | --- | --- | --- |
%
|       |        |     |     |         |     |            | −   | du = | −   |     | ( 1 x | < 1), |
| ----- | ------ | --- | --- | ------- | --- | ---------- | --- | ---- | --- | --- | ----- | ----- |
|       |        |     |     | x       |     | &&&&&&&&&' | 4   |      | 2 − | 8   | − ≤   |       |
|       |        |     |     |         |     | $          | 1   |      |     |     |       |       |
| F (x) | = Pr(X | x)  | =   | f (u)du | =   | −          |     |      |     |     |       |       |
| X     |        |     |     | X       |     |            | x   |      |     | 1)2 |       |       |
|       |        | ≤   |     |         |     | 1          |     | u 1  | 1   | (x  |       |       |
|       |        |     | $−  | ∞       |     |            | +   | − du | = + | −   | ( 1 x | < 3), |
|       |        |     |     |         |     | 2          | $1  | 4    | 2   | 8   | ≤     |       |
&&&&&&&&&(
|     |     |     |     |     |     | 1   |     |     |     |     | (x 3). |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ------ | --- |
≥
| Vegeu | la Figura |     | 2.  |     |     |     |     |     |     |     |     |     |
| ----- | --------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(c) Tenim
|            |     |        |     |      |      |     |         |      | 3 5  |         |     |     |
| ---------- | --- | ------ | --- | ---- | ---- | --- | ------- | ---- | ---- | ------- | --- | --- |
|            |     |        |     | Pr(X | > 0) | = 1 | F X (0) | = 1  | = .  |         |     |     |
|            |     |        |     |      |      | −   |         | −    | 8 8  |         |     |     |
| Aleshores, |     | si x > | 0,  |      |      |     |         |      |      |         |     |     |
|            |     |        |     |      |      |     |         | 2 2x |      |         |     |     |
|            |     |        |     |      |      |     |         | −    | (0 < | x < 1), |     |     |
5
|     |     |     |        |        | f    | (x) | %       |      |      |         |     |     |
| --- | --- | --- | ------ | ------ | ---- | --- | ------- | ---- | ---- | ------- | --- | --- |
|     |     |     |        |        |      | X   | &&&&&&' | 2x 2 |      |         |     |     |
|     |     |     | f X (x | X > 0) | =    |     | =       |      |      |         |     |     |
|     |     |     | |      |        | Pr(X | >   | 0)      | −    | (1 < | x < 3), |     |     |
5
|       |           |     |     |     |     |     |         | 0   | (x  | 3). |     |     |
| ----- | --------- | --- | --- | --- | --- | --- | ------- | --- | --- | --- | --- | --- |
|       |           |     |     |     |     |     | &&&&&&( |     | ≥   |     |     |     |
| Vegeu | la Figura |     | 3.  |     |     |     |         |     |     |     |     |     |
2

F (x)
X
x
|     |     |     |     | Figura | 2: La | funci´o | F (x). |     |     |     |     |
| --- | --- | --- | --- | ------ | ----- | ------- | ------ | --- | --- | --- | --- |
X
|     |     |     |     |     | f X (x | X > 0) |     |     |     |     |     |
| --- | --- | --- | --- | --- | ------ | ------ | --- | --- | --- | --- | --- |
|
x
|     |     |     | Figura | 3:  | La funci´o | f   | (x X > | 0). |     |     |     |
| --- | --- | --- | ------ | --- | ---------- | --- | ------ | --- | --- | --- | --- |
X |
|     |           | Y g(X) |     | g(x) | (x  | 1)2. | y <              |     | y   | g(x) (x | 1)2    |
| --- | --------- | ------ | --- | ---- | --- | ---- | ---------------- | --- | --- | ------- | ------ |
| (d) | Tenim que | =      |     | on   | =   |      | Si 0, l’equaci´o |     | =   | =       | no t´e |
|     |           |        |     |      |     | −    |                  |     |     | −       |        |
soluci´o i, per tant, f (y) = 0. Si y > 0, aleshores l’equaci´o t´e dues solucions x = 1 √y
|     |     |     | Y   |     |     |     |     |     |     | 1   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
−
|     | i x = 1+√y. | Per | tant, |     |     |     |     |     |     |     |     |
| --- | ----------- | --- | ----- | --- | --- | --- | --- | --- | --- | --- | --- |
2
|     |     |     |     |       | f X (x 1 | )   | f X (x | 2 ) |     |     |     |
| --- | --- | --- | --- | ----- | -------- | --- | ------ | --- | --- | --- | --- |
|     |     |     | f   | (y) = |          |     | +      |     | .   |     |     |
Y
|     |     |     |     |     | g (x 1 | )      | g (x   | 2 )       |     |     |     |
| --- | --- | --- | --- | --- | ------ | ------ | ------ | --------- | --- | --- | --- |
|     |     |     |     |     | | ′    | ) x1=1 | √y | ′ | ) x2=1+√y |     |     |     |
|     |     |     |     |     |        | ) −    |        | )         |     |     |     |
|     |     |     |     |     |        | )      |        | )         |     |     |     |
|     |     |     |     |     |        | )f     |        | √y/)      |     |     |     |
Si0 < y < 4, llavorsf (1 √y) = (1+√y) = 4i g (1 √y) = g (1+√y) =
|     | •            |              |           | X          | −   | X        |       |         | | ′ − | | | ′ | |   |
| --- | ------------ | ------------ | --------- | ---------- | --- | -------- | ----- | ------- | ----- | ----- | --- |
|     | 2√y.         | Per tant,    | f Y       | (y) = 1/4. |     |          |       |         |       |       |     |
|     | Si y         | > 4, llavors | f X       | (1 √y)     | = f | X (1+√y) | = 0 i | f Y (y) | = 0.  |       |     |
|     | •            |              |           | −          |     |          |       |         |       |       |     |
|     | Aix´ı doncs, | Y            | Unif[0,4] | i E(Y)     | =   | 2.       |       |         |       |       |     |
∼
3
