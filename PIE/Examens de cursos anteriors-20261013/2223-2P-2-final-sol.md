|           |     | Enginyeria |     |     | de Telecomunicacio´ |        |                |       | (GRETST) |     |     |        |     |
| --------- | --- | ---------- | --- | --- | ------------------- | ------ | -------------- | ----- | -------- | --- | --- | ------ | --- |
|           |     |            |     |     | Probabilitat        |        | i Estad´ıstica |       |          |     |     |        |     |
| 2 de juny | de  | 2023       |     |     |                     | Examen |                | final |          |     |     | Temps: | 3h  |
Notes finals provisionals: 9 de juny Revisi´o d’examen: 12 de juny, de 10:30 a 13:00
1. Els conjunts de s´ımbols d’entrada i de sortida d’un canal de comunicaci´o s´on {a,b} i {0,1}, res-
|     |     |     | P(rebre |     |     |     | P(rebre |     |     |     |     |     |     |
| --- | --- | --- | ------- | --- | --- | --- | ------- | --- | --- | --- | --- | --- | --- |
pectivament. Sabem que 0|s’envia a) = 1|s’envia b) = 4/5. Sabem tamb´e que la
probabilitat de tenir a l’entrada del canal el s´ımbol a val el doble que la probabilitat de tenir-hi b.
Per tal de transmetre un determinat s´ımbol x ∈ {a,b}, aquest s’envia (de forma independent) n
vegades consecutives i s’observa la sequ¨`encia bin`aria B rebuda a la sortida del canal.
(a) Calculeu la probabilitat que s’hagi transm`es el s´ımbol a si B cont´e exactament k uns.
| (b) Calculeu |     | el nombre | esperat | d’uns | que | cont´e | la sequ¨`encia |     | B.  |     |     |     |     |
| ------------ | --- | --------- | ------- | ----- | --- | ------ | -------------- | --- | --- | --- | --- | --- | --- |
(c) En aquest apartat, n = 3. Per tal de decidir quin s´ımbol s’ha transm`es s’aplica la regla de decisi´o
segu¨ent: si B cont´e m´es zeros que uns es decideix que el s´ımbol transm`es ´es a; altrament, es
decideix b. Calculeu la probabilitat de decidir err`oniament. (2,5 punts)
Resoluci´o
| NoteuqueP(rebre |     |           |     | 1−P(rebre |     |           |     |           | An`alogament,P(rebre |     |     |           |      |
| --------------- | --- | --------- | --- | --------- | --- | --------- | --- | --------- | -------------------- | --- | --- | --------- | ---- |
|                 |     | 1|s’envia |     | a) =      |     | 0|s’envia |     | a) = 1/5. |                      |     |     | 0|s’envia | b) = |
1−P(rebre 1|s’envia b) = 1/5. Noteu tamb´e que P(a) = 2P(b) i, per tant, P(a) = 2/3 i P(b) = 1/3
| (ja que | P(a)+P(b) | =   | 1). |     |     |     |     |     |     |     |     |     |     |
| ------- | --------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(a) Diem X a la variable aleat`oria que compta el nombre d’uns en la sequ¨`encia B rebuda. Noteu que
X condicionada per “es transmet el s´ımbol a” ´es binomial de par`ametres n i 1/5. An`alogament,
X condicionada per “es transmet el s´ımbol b” ´es binomial de par`ametres n i 4/5. Per tant,
|      |          | P(X |          | P(X k|a)P(a)+P(X              |                     |               |     | k|b)P(b)                      |                     |             |           |     |     |
| ---- | -------- | --- | -------- | ----------------------------- | ------------------- | ------------- | --- | ----------------------------- | ------------------- | ----------- | --------- | --- | --- |
|      |          | =   | k) =     | =                             |                     |               | =   |                               |                     |             |           |     |     |
|      |          |     |          | 2 (cid:18) n (cid:19)(cid:18) | 1 (cid:19)k(cid:18) | 4 (cid:19)n−k | 1   | (cid:18) n (cid:19)(cid:18) 4 | (cid:19)k(cid:18) 1 | (cid:19)n−k |           |     |     |
|      |          |     | =        |                               |                     |               | +   |                               |                     | , k =       | 0,1,...,n |     | (1) |
|      |          |     |          | 3 k                           | 5                   | 5             | 3   | k 5                           | 5                   |             |           |     |     |
| Ara, | aplicant | la  | f´ormula | de Bayes:                     |                     |               |     |                               |                     |             |           |     |     |
|      |          |     |          |                               | P(X =               | k|a)P(a)      |     | 2·4n−k                        |                     |             |           |     |     |
P(a|X
|                  |     |     |         | = k) =                |       |      | =   |        |     | , k = 0,1,...,n. |     |     |     |
| ---------------- | --- | --- | ------- | --------------------- | ----- | ---- | --- | ------ | --- | ---------------- | --- | --- | --- |
|                  |     |     |         |                       | P(X   | = k) |     | 2·4n−k | +4k |                  |     |     |     |
| (b) Condicionant |     | pel | s´ımbol | transm`es,            | tenim |      |     |        |     |                  |     |     |     |
|                  |     |     |         |                       |       |      |     |        | n 2 | 4n 1 2n          |     |     |     |
|                  |     |     | E[X]    | E[X|a]P(a)+E[X|b]P(b) |       |      |     |        |     |                  |     |     |     |
|                  |     |     |         | =                     |       |      |     | =      | · + | · =              | .   |     |     |
|                  |     |     |         |                       |       |      |     |        | 5 3 | 5 3 5            |     |     |     |
Observaci´o: La probabilitat de rebre 1 en cada enviament del s´ımbol que s’est`a transmetent val
|     |     |     |     |     |     |     | 1   | 2 4 | 1 2 |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
P(rebre
|     |     |     |     |     |     | 1)  | = · | + · | =   | .   |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     |     | 5   | 3 5 | 3 5 |     |     |     |     |
E[X]
Encara que = 2n/5, la variable X no ´es binomial de par`ametres n i 2/5. En efecte, si ho
fos, i, per exemple, n = 3, tindr´ıem P(X = 0) = (3/5)3 = 27/125. En canvi, per a n = 3 i k = 0,
l’expressi´o (1) d´ona P(X = 0) = (2/3)(4/5)3+(1/3)(1/5)3 = 43/125. (El que passa ´es que X no
´es binomial perqu`e els bits de la sequ¨`encia B rebuda no s´on independents.)
(c) Si es transmet a es decidir`a err`oniament si el nombre d’uns que cont´e la sequ¨`encia B ´es dos o
tres. En canvi, si es transmet b tindrem error quan el nombre d’uns a B ´es zero o un.
P((cid:15))
Condicionant pels s´ımbols d’entrada, podem calcular la probabilitat de decidir err`oniament
com:
P((cid:15)) P((cid:15)|a)P(a)+P((cid:15)|b)P(b) P(X 2|a)P(a)+P(X 1|b)P(b)
|     | =   |          |                  |                            |          | =                          | ≥        |                           |           | ≤                         |                            |          |     |
| --- | --- | -------- | ---------------- | -------------------------- | -------- | -------------------------- | -------- | ------------------------- | --------- | ------------------------- | -------------------------- | -------- | --- |
|     |     | (cid:32) |                  |                            |          |                            | (cid:33) | (cid:32)                  |           |                           |                            | (cid:33) |     |
|     |     | (cid:18) | (cid:19)(cid:18) | (cid:19)2(cid:18) (cid:19) | (cid:18) | (cid:19)(cid:18) (cid:19)3 |          | (cid:18) (cid:19)(cid:18) | (cid:19)3 | (cid:18) (cid:19)(cid:18) | (cid:19)(cid:18) (cid:19)2 |          |     |
|     |     | 2        | 3 1              | 4                          | 3        | 1                          |          | 1 3                       | 1         | 3 4                       | 1                          | 13       |     |
|     | =   |          |                  |                            | +        |                            | +        |                           |           | +                         |                            | =        | .   |
|     |     | 3        | 2 5              | 5                          | 3        | 5                          |          | 3 0                       | 5         | 1 5                       | 5                          | 125      |     |

2. La funci´o de densitat de probabilitat d’una variable aleat`oria cont´ınua X val f (x) = 0 si x < 0,
X
|     | x/a2 |     |     |     | a2/x3 |     |     |     |     |     |     |     |     |
| --- | ---- | --- | --- | --- | ----- | --- | --- | --- | --- | --- | --- | --- | --- |
f X (x) = si 0 ≤ x ≤ a, i f X (x) = si x > a, on a > 0 ´es un par`ametre.
(a) Determineu la funci´o de distribuci´o de probabilitat de X i calculeu E(X). Qu`e podeu dir sobre
la vari`ancia de X? Obteniu la funci´o de densitat condicionada f (x|X>a).
X
(b) Considereu la variable U = g(X), on g(x) = 1 si |x−a| ≤ a/2 i g(x) = 0 altrament. Calculeu
|     | P(U = 0). |     |     |     |     |     |     |     |     |     |     |     |     |
| --- | --------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
√
(c) Determineu la funci´o de densitat de probabilitat de la variable Y = + X.
(d) A partir d’una mostra Y ,...,Y de la variable Y, trobeu l’estimador pel m`etode dels moments
|     |                |     |     | 1   | n   |     |     |     |     |     |     |     |           |
| --- | -------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --------- |
|     | del par`ametre |     | a.  |     |     |     |     |     |     |     |     |     | (3 punts) |
Resoluci´o
(a) La funci´o de distribuci´o de probabilitat de X ´es F (x) = x f (u)du.
|     |     |     |     |     |     |     |     | X   |     | X   |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(cid:114)−∞
(cid:136)
|     | Si x | ≤ 0, clarament |     | F   | (x) = 0. |     |     |     |     |     |     |     |     |
| --- | ---- | -------------- | --- | --- | -------- | --- | --- | --- | --- | --- | --- | --- | --- |
X
|     |                  |     |              |     |       | x         | u    | x2         |             |     |     |     |     |
| --- | ---------------- | --- | ------------ | --- | ----- | --------- | ---- | ---------- | ----------- | --- | --- | --- | --- |
|     | (cid:136) Si 0 < | x ≤ | a, aleshores |     | F (x) | =         | du = | .          |             |     |     |     |     |
|     |                  |     |              |     | X     | (cid:119) |      |            |             |     |     |     |     |
|     |                  |     |              |     |       | 0         | a2   | 2a2        |             |     |     |     |     |
|     |                  |     |              |     | x     | a2        | 1    | (cid:18) 1 | a2 (cid:19) | a2  |     |     |     |
(cid:136)
|     | Si x | > a, F | (x) | = F (a)+ |           | du  | = + | −   | =   | 1−  | .   |     |     |
| --- | ---- | ------ | --- | -------- | --------- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |      |        | X   | X        | (cid:119) | u3  | 2   | 2   | 2x2 | 2x2 |     |     |     |
a
|     | L’esperanc¸a | de  | X val |           |          |     |           |       |           |     |      |     |     |
| --- | ------------ | --- | ----- | --------- | -------- | --- | --------- | ----- | --------- | --- | ---- | --- | --- |
|     |              |     |       | ∞         |          |     | a x2      |       | ∞ a2      | a   | 4a   |     |     |
|     |              |     | E[X]  | =         | xf (x)dx |     | =         | dx+   | dx        | =   | +a = | .   |     |
|     |              |     |       | (cid:119) | X        |     | (cid:119) |       | (cid:119) |     |      |     |     |
|     |              |     |       | −∞        |          |     | 0 a2      |       | a x2      | 3   | 3    |     |     |
|     |              |     |       |           |          |     |           | E[X2] |           | x2f |      |     |     |
La vari`ancia de X no existeix perqu`e no existeix = X (x)dx, ja que la integral
(cid:114)R
|     | +∞ a2/xdx |     |     |     |     |     |     |     |     |     |     |     |     |
| --- | --------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
´es divergent.
(cid:114)a
A l’u´ltim,
|     |     |     |     |         |        | f (x) | f   | (x) | 2a2 |     |          |     |     |
| --- | --- | --- | --- | ------- | ------ | ----- | --- | --- | --- | --- | -------- | --- | --- |
|     |     |     |     |         |        | X     |     | X   |     |     |          |     |     |
|     |     |     | f X | (x|X>a) | =      |       | =   |     | =   | per | a x > a. |     |     |
|     |     |     |     |         | P(X>a) |       | 1−F | (a) | x3  |     |          |     |     |
X
| (b) | U = 0 sii | |X−a| | > a/2 | sii X | < a/2 | o X | > 3a/2. | Per tant |     |     |     |     |     |
| --- | --------- | ----- | ----- | ----- | ----- | --- | ------- | -------- | --- | --- | --- | --- | --- |
P(U=0) = P(X<a/2)+P(X>3a/2) = F (a/2)+1−F (3a/2) = 1/8+2/9 = 25/72.
|     |     |     |     |     |     |     | X   |     | X   |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
√
(c) Si y > 0, l’equaci´o y = h(x) = + x t´e soluci´o u´nica x = y2. Per tant, aplicant el teorema del
|     | canvi de | variable, | tenim |       |                   |            |       |      |         |     |       |     |     |
| --- | -------- | --------- | ----- | ----- | ----------------- | ---------- | ----- | ---- | ------- | --- | ----- | --- | --- |
|     |          |           |       |       |                   |            |       |      | 2y3    |     | √     |     |     |
|     |          |           |       |       |                   |            |       |      |  ,     | 0 < | y < a |     |     |
|     |          |           |       |       | f ( x )           | (cid:12)   |       |      |   a 2 |     |       |     |     |
|     |          |           |       |       | X                 | (cid:12)   |       | (y2) |         |     |       |     |     |
|     |          |           | f     | (y) = |                   | (cid:12)   | = 2yf | =    |         |     |       |     |     |
|     |          |           |       | Y     | | h (cid:48)( x ) | | (cid:12) | X     |      | 2 a 2   |     | √     |     |     |
|     |          |           |       |       |                   | x=y2       |       |      |        |     |       |     |     |
|     |          |           |       |       |                   |            |       |      |   ,   | y > | a     |     |     |
y5
(d) A fi de trobar l’estimador del par`ametre a a partir d’una mostra Y ,...,Y , hem de con`eixer el
1 n
primer moment m = E[Y]. Usant, per exemple, el teorema de l’esperan¸ca,
1
|     |                 |     |             |       |           |           |           |     |           |     | √   | √   | √    |
| --- | --------------- | --- | ----------- | ----- | --------- | --------- | --------- | --- | --------- | --- | --- | --- | ---- |
|     |                 |     |             |       |           | 1         | a         |     | +∞        |     | 2 a | 2 a | 16 a |
|     | m = E[Y]        | =   | h(x)f       | (x)dx | =         |           | x3/2dx+a2 |     | x−5/2dx   | =   | +   | =   | .    |
|     | 1               |     | (cid:119)   | X     |           | (cid:119) |           |     | (cid:119) |     |     |     |      |
|     |                 |     | R           |       |           | a2        | 0         |     | a         |     | 5   | 3   | 15   |
|     |                 |     |             |       | (cid:0)15 | (cid:1)2  |           |     |           |     |     |     |      |
|     | D’aqu´ı obtenim |     | la relaci´o | a     | = m       | .         |           |     |           |     |     |     |      |
1
16
Reempla¸cant-hi a per l’estimador buscat a, i m pel primer moment mostral, Y , obtenim
|     |     |     |     |     |     |     | (cid:98) 1  |           |     |     |     | n   |     |
| --- | --- | --- | --- | --- | --- | --- | ----------- | --------- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     |     | (cid:18) 15 | (cid:19)2 |     |     |     |     |     |
|     |     |     |     |     |     |     | a =         | Y         | .   |     |     |     |     |
|     |     |     |     |     |     |     | (cid:98) 16 | n         |     |     |     |     |     |

3. Siguin X,S variables aleat`ories independents tals que X ∼ N(0,1) i S ´es discreta i pren els valors ±1
| de manera  | equiprobable. |     | Sigui   | Y = | SX. |     |     |     |     |     |     |
| ---------- | ------------- | --- | ------- | --- | --- | --- | --- | --- | --- | --- | --- |
| (a) Proveu | que           | Y ∼ | N(0,1). |     |     |     |     |     |     |     |     |
(Indicaci´o: calculeu F (y) tot usant la f´ormula de la probabilitat total condicionant pels valors
Y
| S   | = ±1.) |     |     |     |     |     |     |     |     |     |     |
| --- | ------ | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(b) Demostreu que P(X+Y=0) = 1/2. Dedu¨ıu-ne que (X,Y) no ´es una variable bidimensional
| cont´ınua, | i   | que X | +Y no | ´es una | variable | aleat`oria | gaussiana. |     |     |     |     |
| ---------- | --- | ----- | ----- | ------- | -------- | ---------- | ---------- | --- | --- | --- | --- |
(c) Proveu que X,Y s´on variables gaussianes incorrelades per`o no s´on independents. (2,5 punts)
Resoluci´o
(a) Provarem que Y ∼ N(0,1) demostrant que t´e la mateixa funci´o de distribuci´o que X. Calculem:
|     |     |       | P(Y |      | P(Y≤y|S=−1)P(S=−1)+P(Y≤y|S=1)P(S=1) |     |     |     |     |     |     |
| --- | --- | ----- | --- | ---- | ----------------------------------- | --- | --- | --- | --- | --- | --- |
|     |     | F (y) | =   | ≤ y) | =                                   |     |     |     |     |     |     |
Y
|     |     |     | = P(−X≤y|S= |     | −1)P(S=−1)+P(X≤y|S=1)P(S=1) |     |     |     |     |     |     |
| --- | --- | --- | ----------- | --- | --------------------------- | --- | --- | --- | --- | --- | --- |
1
|     |     |     | (cid:0)P(X |     | −y)+P(X | (cid:1) | P(X |     |          |      |     |
| --- | --- | --- | ---------- | --- | ------- | ------- | --- | --- | -------- | ---- | --- |
|     |     |     | =          | ≥   |         | ≤ y)    | =   | ≤   | y) = F X | (y), |     |
2
on hem usat la f´ormula de la probabilitat total condicionant per S = ±1, que X i S s´on variables
|     |     |     |     | P(X∈A|S∈B) |     | P(X∈A)), |     |     |     |     |     |
| --- | --- | --- | --- | ---------- | --- | -------- | --- | --- | --- | --- | --- |
independents (per tant = i que, per la simetria de la densitat normal
| est`andard, |     | P(X≥−y) | =   | P(X≤y). |     |     |     |     |     |     |     |
| ----------- | --- | ------- | --- | ------- | --- | --- | --- | --- | --- | --- | --- |
(b) Com que Y = SX, si S = −1, llavors X +Y = 0, mentre que si S = 1, aleshores X +Y = 2X.
| Per | tant,    |     |                                         |     |     |     |     |     |     |     |     |
| --- | -------- | --- | --------------------------------------- | --- | --- | --- | --- | --- | --- | --- | --- |
|     | P(X+Y=0) |     | P(X+Y=0|S=−1)P(S=−1)+P(X+Y=0|S=1)P(S=1) |     |     |     |     |     |     |     |     |
=
|     |     |     |                                        |     |     |     |     |     |     | 1        | 1 1 |
| --- | --- | --- | -------------------------------------- | --- | --- | --- | --- | --- | --- | -------- | --- |
|     |     |     | = P(0=0|S=−1)P(S=−1)+P(2X=0|S=1)P(S=1) |     |     |     |     |     |     | = 1· +0· | = , |
|     |     |     |                                        |     |     |     |     |     |     | 2        | 2 2 |
on hem tornat a usar la f´ormula de la probabilitat total, hem tingut en compte que X i S s´on
| independents, |     | i que | P(X=0) | =   | 0 per | ser X una | variable | cont´ınua. |     |     |     |
| ------------- | --- | ----- | ------ | --- | ----- | --------- | -------- | ---------- | --- | --- | --- |
(Alternativament: X+Y = X(1+S), de manera que X+Y = 0 ⇐⇒ (X = 0 o S = −1). Per
|      | P(X+Y=0) |     | P(X=0)+P(S=−1)−P(X=0 |     |     |     |         |     |             |     |     |
| ---- | -------- | --- | -------------------- | --- | --- | --- | ------- | --- | ----------- | --- | --- |
| tant |          |     | =                    |     |     |     | i S=−1) |     | = 0+1/2−0.) |     |     |
R2
La variable bidimensional (X,Y) no pot ser cont´ınua. En efecte, si B = {(x,y) ∈ | x+y = 0},
llavors P(X+Y=0) = P((X,Y) ∈ B); com que el conjunt B t´e a`rea nul . la, si (X,Y) admet´es una
| funci´o | de densitat |     | la seva | integral | sobre | B valdria | zero. |     |     |     |     |
| ------- | ----------- | --- | ------- | -------- | ----- | --------- | ----- | --- | --- | --- | --- |
Pel mateix motiu, si Z = X+Y fos una variable gaussiana (i per tant cont´ınua) tamb´e haur´ıem
P(Z=0)
| de           | tenir |              | = 0.     |      |                |     |     |        |             |      |     |
| ------------ | ----- | ------------ | -------- | ---- | -------------- | --- | --- | ------ | ----------- | ---- | --- |
| (c) Calculem | la    | covari`ancia |          | de X | i Y:           |     |     |        |             |      |     |
|              |       |              | Cov[X,Y] | =    | E[XY]−E[X]E[Y] |     | =   | E[SX2] | = E[S]E[X2] | = 0, |     |
on hem usat E[X] = E[Y] = 0, que S i X s´on independents, i E[S] = 0. Aix´ı, les variables
| gaussianes |     | X i Y | s´on incorrelades. |     |     |     |     |     |     |     |     |
| ---------- | --- | ----- | ------------------ | --- | --- | --- | --- | --- | --- | --- | --- |
Tanmateix, X i Y no poden ser independents, ja que, si ho fossin, X +Y seria gaussiana i ja
| hem | vist que | no  | ho ´es. |     |     |     |     |     |     |     |     |
| --- | -------- | --- | ------- | --- | --- | --- | --- | --- | --- | --- | --- |
Observeu que els resultats d’aquest exercici no contradiuen la proposici´o estudiada en el curs: “si dues
variables aleat`ories conjuntament gaussianes s´on incorrelades, aleshores s´on independents‘”, ja que les
variables X i Y del problema, tot i ser gaussianes, no ho s´on conjuntament.

4. Una mostra de les edats de 100 defuncions produ¨ıdes en un cert territori ha donat una mitjana de
| 71.8 anys. | Assumim |     | que la desviaci´o | est`andard | val | σ = 8.9 | anys. |     |     |
| ---------- | ------- | --- | ----------------- | ---------- | --- | ------- | ----- | --- | --- |
(a) Determineu un interval del 95% de confian¸ca per a l’edat de defunci´o mitjana.
(b) Podr´ıemafirmarquel’edatdedefunci´omitjana´esdem´esde70anys? Utilitzeuuntestd’hip`otesi
amb nivell de significaci´o del 5%, aix´ı com el valor P. A quina conclusi´o arribar´ıem si el nivell de
| significaci´o |     | fos de | l’1%? |     |     |     |     |     |     |
| ------------- | --- | ------ | ----- | --- | --- | --- | --- | --- | --- |
(c) En lloc d’assumir que σ = 8.9, ara suposem que el valor 8.9 correspon a la desviaci´o calculada a
partirdelamostra. Comcanviarienelsc`alculsdel’apartat(a)? Perqu`el’intervalques’obtindria
| ´es | molt similar, |     | per`o una mica | m´es | ample? |     |     |     | (2 punts) |
| --- | ------------- | --- | -------------- | ---- | ------ | --- | --- | --- | --------- |
Resoluci´o
Com que la mida de la mostra ´es gran, suposem que la poblaci´o ´es gaussiana N(µ,σ=8.9).
√
(a) SiX ´eslavariablepoblacional,aleshoresZ = (X n −µ)/(σ/ n) ∼ N(0,1),il’intervaldeconfian¸ca
√
de nivell c ´es de la forma X ±z σ/ n, on z = F−1((1+c)/2). En el nostre cas, x = 71.8,
|     |     |     |     | n   | ◦   | ◦ Z |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
σ = 8.9, n = 100, i z = F−1(0.975) = 1.960. Per tant, l’interval determinat a partir de la mostra
|     |     |     | ◦ Z |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
´es
|     |     |     | (cid:18)   |     |              |     | (cid:19)   |         |     |
| --- | --- | --- | ---------- | --- | ------------ | --- | ---------- | ------- | --- |
|     |     |     |            |     | 8.9          | 8.9 |            |         |     |
|     |     |     | 71.8−1.960 |     | , 71.8−1.960 |     | = (70.056, | 73.544) |     |
|     |     |     |            |     | 10           | 10  |            |         |     |
(b) Si µ = 70, confrontem la hip`otesi H : µ = µ amb H : µ > µ . L’estad´ıstic de test ´es la
|     | 0   |     |     |     | √0  | 0   | 1   | 0   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
normal est`andard Z = (X −µ )/(σ/ n), essent n = 100. Amb les dades donades el valor de Z
0
| ´es | z = 2.022. |     |     |     |     |     |     |     |     |
| --- | ---------- | --- | --- | --- | --- | --- | --- | --- | --- |
Amb un nivell de significaci´o α = 0.05 la regi´o cr´ıtica ´es Z > Q (0.95) = 1.645, de manera que
Z
| rebutgem |     | la hip`otesi | i concloem | que | µ > 70. |     |     |     |     |
| -------- | --- | ------------ | ---------- | --- | ------- | --- | --- | --- | --- |
El valor P del test ´es P(Z>z) = 1−F (z) = 0.0216, que tamb´e suggereix rebutjar la hip`otesi
Z
.
nulla. (Del formulari veiem que si z > 1.960, aleshores F (z) > 0.975, i, per tant, el valor P del
Z
| test | ´es menor | que | 0.025.) |     |     |     |     |     |     |
| ---- | --------- | --- | ------- | --- | --- | --- | --- | --- | --- |
Amb un nivell de significaci´o α = 0.01 la regi´o cr´ıtica ´es Z > Q (0.99) = 2.326, de manera que
Z
| ara | no rebutjar´ıem |     | la hip`otesi | nulla. | .   |     |     |     |     |
| --- | --------------- | --- | ------------ | ------ | --- | --- | --- | --- | --- |
(c) Si el valor 8.9 correspon a la desviaci´o calculada a partir de la mostra, l’interval de confian¸ca per
√
l’esperanc¸a poblacional el determinar´ıem usant l’estad´ıstic T = (X −µ)/(σˆ / n) ∼ t . Com
|     |     |     |     |     |     |     |     | n n | n−1 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
que n = 100, la distribuci´o t de Student amb 99 graus de llibertat ´es molt aproximadament la
distribuci´o normal est`andard, amb la qual cosa l’interval determinat a partir de la mostra ser`a
F−1
aproximadament el mateix. De totes maneres, el valor cr´ıtic t = ((1+c)/2) ser`a una mica
|     |     |     |     |     |     |     | ◦   | tn−1 |     |
| --- | --- | --- | --- | --- | --- | --- | --- | ---- | --- |
m´es gran que z = F−1((1+c)/2), i obtindrem un interval una mica m´es ample.
◦ Z
