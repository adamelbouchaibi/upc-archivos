|     |          |     | Enginyeria |     |     | de           | Telecomunicaci´o |        |                |       | (GRETST) |     |           |
| --- | -------- | --- | ---------- | --- | --- | ------------ | ---------------- | ------ | -------------- | ----- | -------- | --- | --------- |
|     |          |     |            |     |     | Probabilitat |                  |        | i Estad´ıstica |       |          |     |           |
| 8   | de gener | de  | 2021       |     |     |              |                  | Examen |                | Final |          |     | Temps: 3h |
Notes provisionals: Atenea, 18 de gener. Els problemes tenen el mateix pes.
| Revisi´o: |     | pendent | de  | concretar. |     |     |     |     |     |     |     |     |     |
| --------- | --- | ------- | --- | ---------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
1. (Els daus de Sicherman) Els daus de Sicherman s´on un parell de daus de sis cares per`o amb una
numeraci´o diferent de la convencional. Si els anomenem A i B, els valors de les puntuacions s´on:
|     |     |     |     |     |     | dau A: | 1 2 | 2 3 3 | 4   | dau B: | 1 3 4 5 | 6 8 |     |
| --- | --- | --- | --- | --- | --- | ------ | --- | ----- | --- | ------ | ------- | --- | --- |
Malgrat aix`o, tenen la propietat que, quan els tirem junts, la suma dels daus de Sicherman t´e la
|     | mateixa |     | distribuci´o |     | que dos | daus | ordinaris. |     |     |     |     |     |     |
| --- | ------- | --- | ------------ | --- | ------- | ---- | ---------- | --- | --- | --- | --- | --- | --- |
Llancem el parell de daus i denotem per X , X les variables aleat`ories que indiquen el resultat
|     |     |          |      |       |       |     |     | A    | B   |     |     |     |     |
| --- | --- | -------- | ---- | ----- | ----- | --- | --- | ---- | --- | --- | --- | --- | --- |
|     | de  | cadascun | dels | daus. | Sigui | X S | = X | A +X | B . |     |     |     |     |
(a) Representeu gr`aficament la funci´o de distribuci´o F XA i calculeu les esperances de X A , X B
|     |     | i X | . E´s | cert que | Var(X |     | +X  | ) = Var(X | )+Var(X |     | )?  |     |     |
| --- | --- | --- | ----- | -------- | ----- | --- | --- | --------- | ------- | --- | --- | --- | --- |
|     |     | S   |       |          |       | A   | B   |           | A       |     | B   |     |     |
(b) Llancem successivament el parell de daus fins que X > X . Quin ´es el nombre esperat de
|     |     |              |     |     |          |     |     |     |     |     | A B |     |     |
| --- | --- | ------------ | --- | --- | -------- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     | llan¸caments |     | que | cal fer? |     |     |     |     |     |     |     |     |
(c) Calculeu P(X = k X = 10), aix´ı com l’esperan¸ca condicionada E(X X = 10).
|     |     |     |     | A   |     | S   |     |     |     |     |     | A   | S   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     | |   |     |     |     |     |     |     | |   |     |
(d) Ens proporcionen un parell de daus de Sicherman. Els llancem 100 vegades i obtenim que
X = X en 10 ocasions. Doneu un interval de confian¸ca, amb nivell de confian¸ca del
|     |     | A   | B   |     |     |     |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
95%, per a la probabilitat que X = X . Vist el resultat, podem acceptar que els daus s´on
|     |     |     |     |     |     |     |     | A   | B   |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
justos?
[Indicaci´o. Si Z N(0,1), aleshores F (1645) 0950, F ( 1960) 0025 i P( 2241 <
|     |     |     |         |        | ∼   |     |     | Z   | ′   | ≈   | ′ Z | − ′ ≈ ′ | − ′ |
| --- | --- | --- | ------- | ------ | --- | --- | --- | --- | --- | --- | --- | ------- | --- |
|     |     | Z < | 2241) ′ | 0975.] | ′   |     |     |     |     |     |     |         |     |
≈
Resoluci´o:
(a) Calculem primer la funci´o de massa de probabilitat de X , que ´es P(X =1) = 1/6,
|     |     |     |     |     |     |     |     |     |     |     |     | A   | A   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
P(X A =2) = 2/6, P(X A =) = 2/6, P(X A =4) = 1/6. La funci´o de distribuci´o ´es cons-
tant a trossos i cont´ınua per la dreta, amb discontinu¨ıtats en els valors anteriors de X de
A
magnitud la probabilitat elemental corresponent. Aix´ı s’obt´e la gr`afica:
|     |     | 1   |     |     |     |     |     |     | 1   |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
5/6
•
3/6
•
|     |     |     |     |     | 1/6 | •   |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
0
|     |     |     |     | •   |     |     |     |     |     | x   |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     | 1   |     | 2   | 3   |     | 4   |     |     |     |     |
Les6caresdeldauAs´onequiprobables,ipertantE(X ) = 1(1+2+2+3+3+4) = 15 = 5.
|     |     |     |     |     |     |     |     |     |     |     | A   | 6   | 6 2 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Tamb´e podem obrar m´es formalment usant la funci´o de probabilitat de X i aplicant la
A
|     |     | definici´o | E(X | A   | ) = | P(X | A =k)k. |     |     |     |     |     |     |
| --- | --- | ---------- | --- | --- | --- | --- | ------- | --- | --- | --- | --- | --- | --- |
k
|     |     |           |     |             |     |      |     |     | 1(1+3+4+5+6+8) |     |     | 27 9. |     |
| --- | --- | --------- | --- | ----------- | --- | ---- | --- | --- | -------------- | --- | --- | ----- | --- |
|     |     | El mateix |     | procediment |     | dona | E(X | ) = |                |     |     | = =   |     |
|     |     |           |     |             | !   |      |     | B   | 6              |     |     | 6 2   |     |
Finalment, per linealitat E(X ) = E(X +X ) = E(X )+E(X ) = 7.
|     |     |     |     |     |     |     | S   |     | A   | B   | A   | B   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
La igualtat Var(X +X ) = Var(X )+Var(X ) ´es certa perqu`e les variables X i X
|     |     |      |               |     | A   | B   |     | A   |     | B   |     |     | A B |
| --- | --- | ---- | ------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     | s´on | independents. |     |     |     |     |     |     |     |     |     |     |
1

(b) Primer calcularem P(X >X ). Una manera simple ´es treballar amb l’espai mostral dels
A B
36 resultats (equiprobables) possibles del llan¸cament del parell de daus, i veure en quants
d’aquests X > X . Com que al dau A hi ha cares amb valors repetits, les distingim
A B
amb un sub´ındex. Aix´ı Ω = 1,2 ,2 ,3 ,3 ,4 , Ω = 1,3,4,5,6,8 , Ω = Ω Ω , i
A 1 2 1 2 B A B
{ } { } ×
els “casos favorables” s´on sis: (2 ,1), (2 ,1), (3 ,1), (3 ,1), (4,1), (4,3). D’aqu´ı obtenim
1 2 1 2
P(X >X ) = 6 = 1.
A B 36 6
(Alternativament, podem fer el c`alcul usant la f´ormula de la probabilitat total.)
Dit aix`o, ens demanen que repetim el llan¸cament dels daus fins que es produeixi aquest
esdeveniment. El nombre de vegades que cal fer-lo es descriu per una llei geom`etrica de
par`ametre p = 1/6, i l’esperan¸ca d’aquesta llei ´es 1/p, o sigui que el nombre esperat de
llan¸caments ´es 6.
(c) En aquest cas podem analitzar l’esdeveniment X = 10 tamb´e en termes dels casos en qu`e
S
es produeix: ´es el subconjunt de Ω format pels tres esdeveniments elementals (2 ,8), (2 ,8)
1 2
i (4,6). Per tant en aquest sup`osit els u´nics valors que pot prendre la variable X s´on 2
A
i 4, i comptant els “casos favorables” obtenim la funci´o de probabilitat condicionada:
2 1
P(X =2 X =10) = , P(X =4 X =10) = .
A S A S
| 3 | 3
(Alternativament, podem fer el c`alcul usant la definici´o de la probabilitat condicionada.)
Ara estem en condicions de calcular l’esperan¸ca condicionada:
2 1 8
E(X X =10) = P(X =k X =10)k = 2+ 4 = .
A S A S
| | 3 · 3 · 3
k
"
(d) Utilitzarem la f´ormula que dona un interval de confian¸ca per a proporcions.
Pr`eviament observem que, si els daus fossin justos, la probabilitat que X = X en un
A B
llan¸cament ´es p = P(X =X ) = 4 = 1 = 01111....
A B 36 9 ′
Sota la hip`otesi que n, np i n(1 p) siguin prou grans, un interval de confian¸ca aproximat
−
pˆ(1 pˆ)
peralpar`ametrep´espˆ z − , ambpˆl’estad´ısticquedonalaproporci´odecasos, iz
c c
± n
#
el valor que fa P( z Z z ) = c, amb Z normal est`andard. Per a c = 095, z 1960.
z c ′ c ′
− ≤ ≤ ≈
En el llan¸cament repetit (n = 100) obtenim una proporci´o de pˆ= 10/100 = 01 resultats
′
favorables. Pertantl’intervaldeconfian¸caobtingutperl’experiment´es0 ′ 1 ± 1 ′ 96 0 ′ 1 1 0· 0 0 ′ 9 =
0 ′ 1 1 ′ 96 0 ′ 03 = 0 ′ 1 0 ′ 0588, amb l´ımits de confian¸ca 0’0412 i 0’1588. $
± · ±
Com que 0’1111 es troba en aquest interval, podr´ıem pensar que els daus s´on justos.
Observaci´o L’interval de confian¸ca aproximat anterior requereix que n sigui for¸ca gran.
Quan n ´es menys gran hi ha una f´ormula m´es precisa per a l’interval de confian¸ca, a
saber, 1+ 1 zc 2 pˆ+ 2 z n c 2 ± z c pˆ(1 n − pˆ) + 4 z n c 2 2 , que haur´ıem pogut utilitzar en cas de disposar
n % $ &
de calculadora.
2. (a) Trobeu el valor de la constant c per tal que
x2/c, x [ 3,6]
f (x) = ∈ −
X
'0, altrament
sigui una funci´o de densitat. Doneu la funci´o de distribuci´o de la variable X i calculeu
P( 3 < X < 3), P(3 < X < 6), P(X > 0), P(X > 3 X > 0).
− |
Calculeu la desviaci´o t´ıpica de X.
(b) Trobeu la funci´o de densitat de la variable Y = (12 X)/3 i calculeu E[Y Y < 4].
− |
Expresseu la vari`ancia de Y en termes de la de X.
2

(c) Trobeu la funci´o de distribuci´o de la variable Z = X2 i dedu¨ıu la funci´o de densitat de Z.
Resoluci´o:
6
(a) El valor de la constant c s’obt´e de fer f (x)dx = 1.
3 X
−
1 6 ( 1
1 = x2dx = 81 = c = 81.
c c · ⇒
) 3
−
La funci´o de distribuci´o de X ´es
0, x < 3
−
* 1 x 1 x3 x3 1
F (x) = + t2dt = +9 = + , 3 x < 6 .
X + + + + , 81 ) − 3 81 % 3 & 35 32 − ≤
1, x 6
+ ≥
+
+
+
+
Les probabilitats dem-anades valen:
33 1 ( 3)3 1 2
P( 3 < X < 3) = F (3) F ( 3) = + − + = ,
− X − X − 35 32 − 35 32 9
% & % &
63 1 33 1 7
P(3 < X < 6) = F (6) F (3) = + + = ,
X − X 35 32 − 35 32 9
% & % &
1 8
P(X > 0) = 1 F (0) = 1 = ,
X
− − 9 9
P(X > 3) 7/9 7
P(X > 3 X > 0) = = = .
| P(X > 0) 8/9 8
Calculem la vari`ancia de X,
6 1 6 64 34 15
E[X] = xf (x)dx = x3dx = − = ,
X 81 34 4 4
) − 3 ) − 3 ·
6 1 6 65+35 99
E[X2] = x2f (x)dx = x4dx = = ,
X 81 34 5 5
) − 3 ) − 3 ·
99 225 459
Var[X] = E[X2] E2[X] = = = 5.7375
− 5 − 16 80
Per tant, σ = Var[X] 2.3953.
X
≈
(b) La funci´o y = g(x) = (12 x)/3 ´es injectiva i la funci´o de densitat de la variable Y ´es
.
−
1 1 1
f (y) = f (x) = (12 3y)2
Y X
g (x) 81 − 1/3
′
| | |− |
1
(4 y)2, 2 y 5
= 3 − ≤ ≤
*
+ , 0, altrament
+
L’espan¸ca de la variable Y cond-icionada per Y < 4 ´es
4 4 f (y) 1 4
E[Y Y < 4] = yf (y Y < 4)dy = y Y dy = y(4 y)2dy
Y
| | P(Y < 4) 3P(Y < 4) −
)2 )2 )2
3

Calculem
4 1 4 1 8
P(Y < 4) = f (y)dy = (4 y)2dy = (4 y)3 2 = .
Y 3 − 9 − 4 9
)2 )2
/
Per tant, /
3 4 3 y4 8y3 4 5
E[Y Y < 4] = (y3 8y2+16y)dy = +8y2 = .
| 8 − 8 4 − 3 2
)2 % &/2
/
/
La vari`ancia de Y ´es, /
1
Var[Y] = Var[(12 X)/3] = Var[X] < Var[X].
− 9
(c) La funci´o z = x2 per x ( 3,6) ´es bivaluada per x < 3 i el seu recorregut ´es z [0,9),
∈ − | | ∈
mentre que per x [3,6) ´es univaluada amb recorregut z [9,36).
∈ ∈
Busquem la funci´o de distribuci´o de la variable Z = X2,
0, z < 0
* √z
+ + + P( | X | ≤ √z) = f X (x)dx, z ∈ [0,9)
F Z (z) = P(Z z) = + + + ) − √z
≤ + + √z
+
,P( 3 < X < √z) = f (x)dx, z [9,36)
X
− ∈
+ + + 1, z 36 ) − 3
+ + ≥
+
+
+
+
- 0, z < 0
* 1 √z 2
+ x2dx = z3/2, z [0,9)
+ +81 35 ∈
= + + + ) − √z
+
+ + + 1 √z 1
, x2dx = (z3/2+33), z [9,36)
81 35 ∈
+ + ) − 3
+ + 1, z 36
+ + ≥
+
+
+
+
Aleshores, la funci´o densitat d-e Z s’obt´e com,
1
√z, z [0,9)
81 ∈
dF (z) *
f (z) = Z = + 1
Z dz + + + +162 √z, z ∈ [9,36)
,
0, altrament
+
+
+
+
+
-
3. La funci´o de densitat conjunta de les variables aleat`ories X i Y ´es
3
f (x,y) = xy, si 0 < x < 2, 0 < y < x2,
XY
16
i f (x,y) = 0, altrament.
XY
(a) Determineu les densitats marginals f (x) i f (y), indicant els dominis on s´on diferent de
X Y
zero.
(b) Calculeu la densitat condicionada f (y X = x) i doneu el millor estimador (no lineal)
Y X
| |
en mitjana quadr`atica de la variable Y donada X.
4

(c) Si
Y
√X,
|     |     |     |     |     |     | Z = |     | T = |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
X
(√ indical’arrelquadradapositiva),determineuladensitatconjuntaf (z,t),especificant
ZT
E(Z2T).
|     | el domini | on  | ´es diferent |     | de zero. | Calculeu | tamb´e |     |     |     |     |     |
| --- | --------- | --- | ------------ | --- | -------- | -------- | ------ | --- | --- | --- | --- | --- |
1
Considereu ara una variable aleat`oria U amb densitat de probabilitat f (u) = u(1/θ) 1 si
|     |     |     |     |     |     |     |     |     |     |     | U   | −   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
θ
0 < u < 1, f (u) = 0 altrament, i on θ > 0 ´es un par`ametre desconegut.
U
E´s
(d) Determineu l’estimador de m`axima versemblan¸ca de θ. aquest estimador esbiaixat?
Resoluci´o.
| (a) | La densitat | marginal |     | de         | X val |     |      |     |        |      |       |      |
| --- | ----------- | -------- | --- | ---------- | ----- | --- | ---- | --- | ------ | ---- | ----- | ---- |
|     |             |          |     |            |       | x2  |      |     |        | y=x2 |       |      |
|     |             |          |     |            |       |     | 3    | 3   | y2     | 3    |       |      |
|     |             |          | ∞   |            |       |     |      |     |        |      | x5,   |      |
|     | f X         | (x) =    | f   | XY (x,y)dy |       | =   | xydy | = x |        | =    | 0 < x | < 2. |
|     |             |          |     |            |       |     | 16   | 16  | 2      | 32   |       |      |
|     |             |          |     |            |       | )0  |      |     | 0 1y=0 |      |       |      |
) −∞
|     | (Si x | (0,2), | llavors | f (x) | = 0.) |     |     |     |     |     |     |     |
| --- | ----- | ------ | ------- | ----- | ----- | --- | --- | --- | --- | --- | --- | --- |
X
∕∈
|     | Pel que | fa a | la densitat | de  | Y tenim |     |     |      |     |     |     |     |
| --- | ------- | ---- | ----------- | --- | ------- | --- | --- | ---- | --- | --- | --- | --- |
|     |         |      |             |     |         | 2 3 |     | 3 x2 | x=2 | 3   |     |     |
∞
|     | f (y) | =      | f       | (x,y)dx | =     | xydx | =   | y    |       | = y(4 | y), 0 < | y < 4. |
| --- | ----- | ------ | ------- | ------- | ----- | ---- | --- | ---- | ----- | ----- | ------- | ------ |
|     | Y     |        | XY      |         |       | 16   |     | 16 2 |       | 32    | −       |        |
|     |       |        |         |         | )√y   |      |     |      | 1x=√y |       |         |        |
|     |       | ) −∞   |         |         |       |      |     | 0    |       |       |         |        |
|     | (Si y | (0,4), | llavors | f (y)   | = 0.) |      |     |      |       |       |         |        |
|     | ∕∈    |        |         | Y       |       |      |     |      |       |       |         |        |
(b) Ladensitatcondicionadaf (y X = x)est`adefinidanom´essi0 < x < 2,que´esl’interval
|     |     |     |     |     | Y X | |   |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|
|     | on f X (x) | > 0. | Aleshores, |     |     |     |     |     |     |     |     |     |
| --- | ---------- | ---- | ---------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
2y
x2
|     |     |     |     |      |     | f    | (x,y) |     | ,   | 0 < y < |     |     |
| --- | --- | --- | --- | ---- | --- | ---- | ----- | --- | --- | ------- | --- | --- |
|     |     |     |     | f (y | X = | x) = | XY    | =   | x4  |         |     |     |
Y X
|     |     |     |     | |   | |   |     | f (x) | *   |     |           |     |     |
| --- | --- | --- | --- | --- | --- | --- | ----- | --- | --- | --------- | --- | --- |
|     |     |     |     |     |     |     | X     |     | 0,  | altrament |     |     |
,
Llavors,
-
x2
|     |     |     |     |     |      |      |      |          |     | 2y2 | 2   |     |
| --- | --- | --- | --- | --- | ---- | ---- | ---- | -------- | --- | --- | --- | --- |
|     |     |     |     |     |      | ∞    |      |          |     |     | x2. |     |
|     |     |     | E(Y | X = | x) = | yf Y | X (y | X = x)dy | =   | dy  | =   |     |
|     |     |     | |   |     |      |      | |    |          |     | x4  | 3   |     |
|     |     |     |     |     | )    |      | |    |          | )0  |     |     |     |
−∞
Per tant, el millor estimador en mitjana quadr`atica de la variable Y donada X ´es
2
|     |     |     |     |     |     | Yˆ  |     | X2.  |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | ---- | --- | --- | --- | --- |
|     |     |     |     |     |     | =   | E(Y | X) = |     |     |     |     |
|     |     |     |     |     |     |     | |   | 3    |     |     |     |     |
z2,
(c) Si z > 0 i t > 0, el sistema z = g(x,y) = √x, t = h(x,y) = y/x t´e soluci´o u´nica x =
|     |          |             |     |       | {              |     |     |     |     | }   |     |     |
| --- | -------- | ----------- | --- | ----- | -------------- | --- | --- | --- | --- | --- | --- | --- |
|     | y = z2t. | El jacobi`a |     | de la | transformaci´o |     | val |     |     |     |     |     |
1
0
|     |     |     |     |     |        |     | 2√x  |     | 1    |     |     |     |
| --- | --- | --- | --- | --- | ------ | --- | ---- | --- | ---- | --- | --- | --- |
|     |     |     |     |     | J(x,y) | =   | /    | / = |      | .   |     |     |
|     |     |     |     |     |        |     | / y  | 1 / | 2x√x |     |     |     |
|     |     |     |     |     |        |     | / −  | /   |      |     |     |     |
|     |     |     |     |     |        |     | /    | /   |      |     |     |     |
|     |     |     |     |     |        |     | / x2 | x / |      |     |     |     |
|     |     |     |     |     |        |     | /    | /   |      |     |     |     |
D’altra banda, la regi´o imatge de S /= (x,y) / 2 : 0 < x < 2, 0 < y < x2 ´es
|     |     |     |     |     |     |     | /   | ∈/ R |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | ---- | --- | --- | --- | --- |
|     |     |     |     |     |     |     | {   |      |     |     |     | }   |
S = (z,t) R 2 : 0 < z < √2, 0 < t < z2 . Per tant, si (z,t) S , aleshores
|     | ′ { | ∈   |     |       |      |       | }   |     |     | ∈ ′   |      |     |
| --- | --- | --- | --- | ----- | ---- | ----- | --- | --- | --- | ----- | ---- | --- |
|     |     |     |     |       | f XY | (x,y) |     |     |     | 3 3   |      |     |
|     |     |     | f   | (z,t) | =    |       |     | =   | 2z3 | z4t = | z7t. |     |
ZT
|     |     |     |     |     | J(x,y) |     |               |     | ·   | 16 8 |     |     |
| --- | --- | --- | --- | --- | ------ | --- | ------------- | --- | --- | ---- | --- | --- |
|     |     |     |     |     | |      | |   | /(x=z2,y=z2t) |     |     |      |     |     |
/
/
Com que Z2T = Y tenim que E(Z2T) = E(Y) = 2, per la simetria de la densitat f (y). El
|     |         |           |            |      |        |             | /   |          |      |          |         | Y   |
| --- | ------- | --------- | ---------- | ---- | ------ | ----------- | --- | -------- | ---- | -------- | ------- | --- |
|     | c`alcul | d’aquesta | esperan¸ca |      | usant  | la densitat |     | conjunta | de Z | i T ´es: |         |     |
|     |         |           |            |      |        |             |     | 3        | √2   | z2       |         |     |
|     |         | E(Z2T)    |            | ∞    | ∞ z2tf |             |     |          | z9   | t2dt     |         |     |
|     |         |           |            | =    |        | (z,t)dzdt   |     | =        |      |          | dz = 2. |     |
|     |         |           |            |      |        | ZT          |     | 8        |      |          |         |     |
|     |         |           |            |      |        |             |     | )0       |      | 2 )0     | 3       |     |
|     |         |           |            | ) −∞ | ) −∞   |             |     |          |      |          |         |     |
5

| (d) La funci´o | de  | versemblan¸ca |     | ´es |     |     |     |     |     |     |     |
| -------------- | --- | ------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
n
1
|     |     | f   | (u ,...,u | θ) = | f   | (u  | θ) = | (u  | u )(1/θ) | 1,  |     |
| --- | --- | --- | --------- | ---- | --- | --- | ---- | --- | -------- | --- | --- |
|     |     | U   | 1         | n    |     | U i |      | 1   | n        | −   |     |
|     |     |     |           | |    |     | |   |      | θn  | ···      |     |     |
4 i=1
| i el seu | logaritme | neperi`a |     | ´es |     |     |     |     |     |     |     |
| -------- | --------- | -------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
n
1
|     |     |     |     | L n (θ) = | nlogθ+ |     | 1    | logu | i . |     |     |
| --- | --- | --- | --- | --------- | ------ | --- | ---- | ---- | --- | --- | --- |
|     |     |     |     | −         |        |     | θ −  |      |     |     |     |
|     |     |     |     |           |        | %   | &i=1 |      |     |     |     |
"
| Derivant | i igualant | a   | zero | tenim |      |      |     |     |     |     |     |
| -------- | ---------- | --- | ---- | ----- | ---- | ---- | --- | --- | --- | --- | --- |
|          |            |     |      |       | n 1  | n    |     |     |     |     |     |
|          |            |     |      |       |      | logu | =   | 0,  |     |     |     |
|          |            |     |      | −θ    | − θ2 |      | i   |     |     |     |     |
i=1
"
| d’on obtenim |     |     |     |     |     |     |      |     |     |     |     |
| ------------ | --- | --- | --- | --- | --- | --- | ---- | --- | --- | --- | --- |
|              |     |     |     |     |     | n   | logu |     |     |     |     |
i
|     |     |     |     |     | θ = | i=1 |     | .   |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     | ∗   |     | n   |     |     |     |     |
−
!
(Observeuquelogu i < 0,jaque0 < u i < 1.) Pertant,l’estimadordem`aximaversemblan¸ca
´es
|             |     |               |     |         | logU | +     | +logU  |     |     |        |      |
| ----------- | --- | ------------- | --- | ------- | ---- | ----- | ------ | --- | --- | ------ | ---- |
|             |     |               |     | Θ =     |      | 1     |        | n   | .   |        |      |
|             |     |               |     | n       |      | ···   |        |     |     |        |      |
|             |     |               |     |         | −    |       | n      |     |     |        |      |
| L’estimador | ´es | no esbiaixat, |     | ja5que  |      |       |        |     |     |        |      |
|             |     |               |     |         | 1    |       | 1      |     | 1   |        |      |
|             |     |               |     |         |      |       | u(1/θ) | 1   | ∞   | (1/θ)v |      |
|             | E   | Θ n =         | E(  | logU) = | (    | logu) |        | − = | v   | e −    | = θ, |
|             |     |               | −   |         | −    |       | θ      |     | θ   |        |      |
|             |     |               |     |         | )0   |       |        |     | )0  |        |      |
6 7
| on en | el penu´lt5im | pas | s’ha | fet el canvi | v = | logu. |     |     |     |     |     |
| ----- | ------------- | --- | ---- | ------------ | --- | ----- | --- | --- | --- | --- | --- |
−
6
