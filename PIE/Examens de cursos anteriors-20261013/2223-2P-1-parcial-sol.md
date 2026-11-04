|            |     | Enginyeria |     | de           | Telecomunicacio´ |        |                |     | (GRETST) |        |     |        |
| ---------- | --- | ---------- | --- | ------------ | ---------------- | ------ | -------------- | --- | -------- | ------ | --- | ------ |
|            |     |            |     | Probabilitat |                  |        | i Estad´ıstica |     |          |        |     |        |
| 14 d’abril |     | de 2023    |     |              |                  | Examen | parcial        |     |          | Temps: |     | 1h 30m |
1. En un territori hi ha una carretera R1 que va de A a B, una carretera R2 de B a C, i una
carretera R3 de A a C. Cadascuna de les tres carreteres pot estar bloquejada per la neu
| amb probabilitat |     | p,  | independentment |     |     | de les | altres. |     |     |     |     |     |
| ---------------- | --- | --- | --------------- | --- | --- | ------ | ------- | --- | --- | --- | --- | --- |
Si es pot viatjar de A a C, quina´es la probabilitat que la carretera R1 estigui bloquejada?
[2 pt]
Resoluci´o
Sigui R l’esdeveniment “la carretera Ri esta` oberta”; `obviament P(R ) = 1−p. I sigui
|     | i   |     |     |     |     |     |     |     |     | i   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
AC l’esdeveniment “es pot viatjar de A a C”, que significa que o b´e R1 i R2 estan obertes,
P(R
| o b´e R3 | est`a | oberta. | Ens | demanen | calcular |     | |AC). |     |     |     |     |     |
| -------- | ----- | ------- | --- | ------- | -------- | --- | ----- | --- | --- | --- | --- | --- |
1
|     |     |     |     |     |     |     |     | P(AC|R | )P(R |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | ------ | ---- | --- | --- | --- |
)
Podem utilitzar la fo´rmula de Bayes: P(R |AC) = 1 1 . Calculem doncs:
|     |       |          |     |               |     | 1     |          | P(AC)   |         |     |      |     |
| --- | ----- | -------- | --- | ------------- | --- | ----- | -------- | ------- | ------- | --- | ---- | --- |
|     | P(AC) | = P((R   |     | ∩R )∪R        | )   | = P(R | ∩R )+P(R |         | )−P(R   | ∩R  | ∩R ) |     |
|     |       |          | 1   | 2             | 3   |       | 1 2      |         | 3       | 1 2 | 3    |     |
|     |       |          |     |               |     |       |          | (cid:0) | (cid:1) |     |      |     |
|     |       | = (1−p)2 |     | +(1−p)−(1−p)3 |     |       | = (1−p)  | 1+p−p2  |         | .   |      |     |
D’altrabandasiR1est`atalladal’u´nicamaneradepoderferelviatge´esperR3, demanera
P(AC|R
| que |     | ) = 1−p. | Finalment, |     | la  | probabilitat | demanada |     | ´es |     |     |     |
| --- | --- | -------- | ---------- | --- | --- | ------------ | -------- | --- | --- | --- | --- | --- |
1
|     |     |      | P(AC|R |       | )P(R | )   | (1−p)p        |     |     | p      |     |     |
| --- | --- | ---- | ------ | ----- | ---- | --- | ------------- | --- | --- | ------ | --- | --- |
|     | P(R |      |        |       | 1    | 1   |               |     |     |        |     |     |
|     |     | |AC) | =      |       |      | =   |               |     |     | =      | .   |     |
|     |     | 1    |        | P(AC) |      |     | (1−p)(1+p−p2) |     |     | 1+p−p2 |     |     |

2. (a) Sigui X una variable aleato`ria i a ∈ R. Proveu que V[X+a] = V[X].
(b) Si X ´es una variable geom`etrica de par`ametre p, i Y = X −1, calculeu l’esperan¸ca i
| la  | varia`ncia | de Y. |     |     |     |     |     |     |     |     |     |
| --- | ---------- | ----- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(c) En un pa´ıs s’imposa una peculiar pol´ıtica de natalitat: cada fam´ılia va tenint fills fins
que t´e un fill mascle, moment en qu`e s’aturen. Siguin F i M les variables aleato`ries
que indiquen respectivament el nombre de fills femelles o mascles en una fam´ılia.
| Proveu |     | que tenen la | mateixa | esperan¸ca, |     | per`o diferent | varia`ncia. |     |     |     |     |
| ------ | --- | ------------ | ------- | ----------- | --- | -------------- | ----------- | --- | --- | --- | --- |
[3’5 pt]
Resoluci´o
|            |     | (cid:20) (cid:16) |     | (cid:17)2  | (cid:21) | (cid:20) (cid:16) | (cid:17)2 | (cid:21) |       |        |         |
| ---------- | --- | ----------------- | --- | ---------- | -------- | ----------------- | --------- | -------- | ----- | ------ | ------- |
| V[X+a]     |     | E (X+a)−E[X+a]    |     |            |          | E −E[X]           |           |          | V[X], |        |         |
| (a)        |     | =                 |     |            | =        | X                 |           | =        |       | on hem | usat la |
| definicio´ |     | de la varia`ncia  | i   | que E[X+a] | =        | E[X]+a.           |           |          |       |        |         |
(b) Com que coneixem els par`ametres ba`sics d’una variable geom`etrica, E(Y) = E[X −
|     | E[X]−1 |          | iaplicanttamb´el’apartatanteriorV[Y] |     |     |     |     |     | V[X] | (1−p)/p2. |     |
| --- | ------ | -------- | ------------------------------------ | --- | --- | --- | --- | --- | ---- | --------- | --- |
| 1]  | =      | = 1/p−1, |                                      |     |     |     |     |     | =    | =         |     |
(c) Per resoldre aquest problema interpretem que les probabilitats d’un fill femella o
mascle so´n 1/2, que els embarassos es poden repetir sense l´ımit, i que no hi ha
bessons. Llavors el nombre de femelles en una fam´ılia ´es una unitat menys que el
nombre d’intents fins tenir un fill mascle, per tant F = X −1, on X ´es geom`etrica
| de                                     | par`ametre | p = 1/2. |     |     |     |       |     |        |              |     |      |
| -------------------------------------- | ---------- | -------- | --- | --- | --- | ----- | --- | ------ | ------------ | --- | ---- |
|                                        |            |          |     |     |     | E[F]  |     | 1iV[F] | (1/2)/(1/2)2 |     |      |
| Aplicantelresultatdel’apartatanterior, |            |          |     |     |     | = 2−1 | =   |        | =            |     | = 2, |
P(M=0)
D’altra banda el nombre de mascles en una fam´ılia pot ser 1 o 0, amb = 0,
de manera que M = 1 amb probabilitat 1. Per tant E[M] = 1 i V[M] = 0.

3. La durada X, en minuts, d’una trucada telef`onica segueix una llei exponencial amb valor
mitja` 5.
(a) Quina´eslaprobabilitatquelatrucadanosuperielsdeuminutssabentque´essuperior
E[X|X
a cinc minuts? Trobeu la funcio´ de densitat f (x|X > 5) i calculeu > 5].
X
(b) El cost Y = g(X) d’una trucada dep`en de la seva durada X d’acord amb la funcio´

|     |     |     |     |     |     | 0, |     | x < 2 |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | ----- | --- | --- |
 
|     |     |     |     |     | g(x) | =   | x/2, | 2 ≤ x | ≤ 4 |     |
| --- | --- | --- | --- | --- | ---- | --- | ---- | ----- | --- | --- |
 
|     |     |     |     |     |     | 2, |     | x > 4 |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | ----- | --- | --- |
Calculeu la funcio´ de distribucio´ de Y i representeu-la gr`aficament. De quin tipus ´es
| la  | variable | Y?  |     |     |     |     |     |     |     |     |
| --- | -------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Quina ´es la probabilitat que la trucada sigui gratu¨ıta? I que la trucada tingui el cost
ma`xim?
E[Y].
(c) Calculeu
|          |         |     | (cid:82) |     | eax(ax−1).] |     |     |     |     |     |
| -------- | ------- | --- | -------- | --- | ----------- | --- | --- | --- | --- | --- |
| [4’5 pt] | [Ajuda: |     | xeaxdx   | =   |             |     |     |     |     |     |
a2
Resoluci´o
(a) La probabilitat que la trucada no superi els deu minuts sabent que ´es superior a cinc
| minuts |     | ve donada | per    |     |      |       |         |     |          |     |
| ------ | --- | --------- | ------ | --- | ---- | ----- | ------- | --- | -------- | --- |
|        |     |           |        |     |      | P(5 < | X ≤ 10) |     | F (10)−F | (5) |
|        |     | P(X       |        |     |      |       |         |     | X        | X   |
|        |     |           | ≤ 10|X | >   | 5) = |       |         | =   |          |     |
|        |     |           |        |     |      | P(X   | > 5)    |     | 1−F      | (5) |
X
(1−e−2)−(1−e−1)
|     |     |     |     |     | =   |     |     |     | = 1−e−1 | ≈ 0.6321. |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ------- | --------- |
e−1
Tamb´e podem fer aquest c`alcul usant la propietat de no memo`ria de la variable
aleato`ria exponencial. En efecte, f (x|X > 5) = f (x−5), ´es a dir,
|     |     |     |     |     |     | X   |     |     | X   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
1
e−(x−5)/5,
|     |           |     |        | f   | (x|X | > 5)        | =    |        | x >      | 5,        |
| --- | --------- | --- | ------ | --- | ---- | ----------- | ---- | ------ | -------- | --------- |
|     |           |     |        | X   |      |             | 5    |        |          |           |
| i,  | per tant, |     |        |     |      |             |      |        |          |           |
|     |           |     |        |     |      | (cid:90) 10 |      |        | (cid:90) | 10        |
|     |           | P(X | ≤ 10|X | >   | 5) = | f           | (x|X | > 5)dx | =        | f (x−5)dx |
|     |           |     |        |     |      | X           |      |        |          | X         |
|     |           |     |        |     |      | −∞          |      |        |          | −∞        |
(cid:90)
5
1−e−1.
|     |     |     |     |     | =   | f   | (u)du | = F | (5) = |     |
| --- | --- | --- | --- | --- | --- | --- | ----- | --- | ----- | --- |
|     |     |     |     |     |     | X   |       |     | X     |     |
−∞
A m´es,
|     |     |     |       |        | (cid:90) ∞ |         |     |      | (cid:90) ∞ |            |
| --- | --- | --- | ----- | ------ | ---------- | ------- | --- | ---- | ---------- | ---------- |
|     |     |     | E[X|X | > 5] = |            | xf (x|X | >   | 5)dx | =          | xf (x−5)dx |
|     |     |     |       |        |            | X       |     |      |            | X          |
|     |     |     |       |        | −∞         |         |     |      | −∞         |            |
(cid:90) ∞
|     |     |     |     | =   |     | (5+u)f | (u)du | =   | 5+E[X] | = 10. |
| --- | --- | --- | --- | --- | --- | ------ | ----- | --- | ------ | ----- |
X
−∞
(El resultat E[X|X > 5] = 5+E[X] es dedueix tamb´e de la propietat de no memo`ria
| de  | la variable |     | X.) |     |     |     |     |     |     |     |
| --- | ----------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |

(b) Donada la funci´o g(x) de l’enunciat, la funcio´ de distribuci´o de la nova variable
| aleato`ria | Y = | g(X) val |     |     |     |     |     |     |     |
| ---------- | --- | -------- | --- | --- | --- | --- | --- | --- | --- |

|     |     |     |     | 0,  |     |     |     |     | y < 0 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ----- |
 

|     |     |     |  P(X | <   | 2) = | F (2) | = 1−e−2/5, |     | 0 ≤ y < 1 |
| --- | --- | --- | ------ | --- | ---- | ----- | ---------- | --- | --------- |
X
|     | F (y) | = P(Y ≤ y) | =   |     |     |     |     |     |     |
| --- | ----- | ---------- | --- | --- | --- | --- | --- | --- | --- |
Y
|     |     |     |     | P(X < | 2y) = | F (2y) | = 1−e−2y/5, |     | 1 ≤ y < 2 |
| --- | --- | --- | --- | ----- | ----- | ------ | ----------- | --- | --------- |
|     |     |     |   |       |       | X      |             |     |           |


|       |           |          | 1, |     |     |     |     |     | y ≥ 2 |
| ----- | --------- | -------- | --- | --- | --- | --- | --- | --- | ----- |
| Vegeu | la figura | adjunta. |     |     |     |     |     |     |       |
FY(y)
1.0
0.8
0.6
1−e−2y/5
0.4
0.2
y
|     |     | -1     |     | 1          | 2               |     | 3   | 4   |     |
| --- | --- | ------ | --- | ---------- | --------------- | --- | --- | --- | --- |
|     |     | Figura | 1:  | La funci´o | de distribuci´o |     | F   | (y) |     |
Y
Com que F (y) ´es discont´ınua en els punts y = 0 i y = 2, la variable Y ´es de tipus
Y
| mixt. | A m´es, |          |       |      |               |     |           |         |           |
| ----- | ------- | -------- | ----- | ---- | ------------- | --- | --------- | ------- | --------- |
|       | P(Y     | = 0) = F | (0)−F | (0−) | = 1−e−2/5     |     | ≈ 0.3297, |         |           |
|       |         |          | Y     | Y    |               |     |           |         |           |
|       | P(Y     | = 2) = F | (2)−F | (2−) | = 1−(1−e−4/5) |     |           | = e−4/5 | ≈ 0.4493. |
|       |         |          | Y     | Y    |               |     |           |         |           |
P(Y P(Y
Observeu que = 0) ´es la probabilitat que la trucada sigui gratu¨ıta i = 2)
| ´es la    | probabilitat | que la           | trucada | tingui | el cost | m`axim. |     |     |     |
| --------- | ------------ | ---------------- | ------- | ------ | ------- | ------- | --- | --- | --- |
| (c) Usant | el teorema   | de l’esperanc¸a, |         |        |         |         |     |     |     |
(cid:90) ∞
|     | E[Y] | = g(x)f |     | (x)dx |     |     |     |     |     |
| --- | ---- | ------- | --- | ----- | --- | --- | --- | --- | --- |
X
−∞
|     |     | (cid:90) ∞ |          |     |         | (cid:90) 4 |        |         | (cid:90) ∞ |
| --- | --- | ---------- | -------- | --- | ------- | ---------- | ------ | ------- | ---------- |
|     |     |            | 1        |     | 1       |            |        | 2       |            |
|     |     | = g(x)     | e−x/5dx  |     | =       | xe−x/5dx+  |        |         | e−x/5dx    |
|     |     |            | 5        |     | 10      |            |        | 5       |            |
|     |     | 0          |          |     |         | 2          |        |         | 4          |
|     |     | 35e−2/5    | −45e−4/5 |     |         |            | 7e−2/5 | −5e−4/5 |            |
|     |     | =          |          |     | +2e−4/5 | =          |        |         | ≈ 1.2228   |
|     |     |            | 10       |     |         |            |        | 2       |            |
