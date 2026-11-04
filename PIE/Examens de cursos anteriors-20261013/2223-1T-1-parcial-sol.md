|     |             |     | Enginyeria |      |     | de           | Telecomunicacio´ |        |                | (GRETST) |     |        |     |        |
| --- | ----------- | --- | ---------- | ---- | --- | ------------ | ---------------- | ------ | -------------- | -------- | --- | ------ | --- | ------ |
|     |             |     |            |      |     | Probabilitat |                  |        | i Estad´ıstica |          |     |        |     |        |
| 11  | de novembre |     | de         | 2022 |     |              |                  | Examen |                | parcial  |     | Temps: |     | 1h 50m |
1. En cert tipus de coets el combustible circula per un conjunt de tubs acoblats amb cert tipus d’a-
nell. En el llanc¸ament del coet, cada anell, independentment dels altres, pot estar estressat amb
probabilitat α = 0.05. La probabilitat que un anell estressat provoqui una fuita de combustible
|     | val | β = | 0.6. El | nombre | d’anells |     | ´es 10. |     |     |     |     |     |     |     |
| --- | --- | --- | ------- | ------ | -------- | --- | ------- | --- | --- | --- | --- | --- | --- | --- |
(a) Calculeu la probabilitat que hi hagi m´es de dos anells estressats.
(b) Calculeu el nombre mitj`a de llan¸caments fins que hi ha m´es d’un anell estressat. Quina ´es
|     |     | la probabilitat |     |     | que aix`o | passi | abans | del sis`e | llan¸cament? |     |     |     |     |     |
| --- | --- | --------------- | --- | --- | --------- | ----- | ----- | --------- | ------------ | --- | --- | --- | --- | --- |
(c) Quina ´es la probabilitat que hi hagi alguna fuita si el nombre d’anells estressats ´es k?
|     | (d) | Quina | ´es | la probabilitat |     | que | hi  | hagi alguna | fuita? |     |     |     |     |     |
| --- | --- | ----- | --- | --------------- | --- | --- | --- | ----------- | ------ | --- | --- | --- | --- | --- |
(e) Sabem que hi ha hagut una fuita en l’`area que ocupen dos anells. Quina ´es la probabilitat
que els dos estigu´essin estressats? Compareu-la amb la probabilitat a priori
Resoluci´o.
(a) El nombre X d’anells estressats ´es una variable binomial amb n = 10 i p = 0.05, q = 1−p =
0.95.
(cid:18) n (cid:19)
|     |     | P(X |      | 1−P(X |     | 0)−P(X |     | 1)−P(X |     | 1−qn−npqn−1− |     |     | p2qn−2 |     |
| --- | --- | --- | ---- | ----- | --- | ------ | --- | ------ | --- | ------------ | --- | --- | ------ | --- |
|     |     |     | > 2) | =     |     | =      |     | =      |     | = 2) =       |     |     |        |     |
2
|     |     |     |     |     |     | = 1−0.5987−0.3151−0.07463 |     |     |     | =   | 0.0115. |     |     |     |
| --- | --- | --- | --- | --- | --- | ------------------------- | --- | --- | --- | --- | ------- | --- | --- | --- |
|     |     |     |     |     |     |                           |     |     |     |     | P(X     |     | P(X |     |
(b) La probabilitat que hi hagi m´es d’un anell estressat val 1 − = 0) − = 1) =
1−0.9510−10·0.05·0.959 = 0.08613. En nombre de llanc¸aments, N, fins que aix`o passa ´es una
variable geom`etrica de par`ametre p = 0.08613. El seu valor mitj`a ´es 1/p = 11.6. P(N ≤ 5) =
1−(1−p)5
|     |     |     | =   | 0.3626. |     |     |     |     |     |     |     |     |     |     |
| --- | --- | --- | --- | ------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(c) Si X = k, el nombre de fuites, F, ´es binomial amb n = k, p = 0.6.
|     | P(F |          |     | 1−P(F=0|X=k) |     |     |     |            |     |           |     |          |          |          |
| --- | --- | -------- | --- | ------------ | --- | --- | --- | ---------- | --- | --------- | --- | -------- | -------- | -------- |
|     |     | ≥ 1|X=k) |     | =            |     |     |     | = 1−(1−p)k |     | = 1−0.4k. |     |          |          |          |
|     |     |          |     |              |     |     |     | n          |     |           |     | n        | (cid:18) | (cid:19) |
|     |     |          |     |              |     |     |     | (cid:88)   |     |           |     | (cid:88) | n        |          |
(d) P(alguna fuita) = 1−P(F=0) = 1− P(F=0|X=k)P(X=k) = 1− 0.4k αk(1−
k
|     |     |     |          |          |          |     |     | k=0 |     |     |     | k=0 |     |     |
| --- | --- | --- | -------- | -------- | -------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     | 10       | (cid:18) | (cid:19) |     |     |     |     |     |     |     |     |     |
|     |     |     | (cid:88) | 10       |          |     |     |     |     |     |     |     |     |     |
α)n−k = 1− (0.4α)k(1−α)10−k = 1−(0.4α+1−α)10 = 1−0.9710 = 0.2625.
k
k=0
(Alternativament, la probabilitat que un anell doni lloc a una fuita val αβ = 0.03. El nombre
de fuites ´es binomial amb n = 10, p = 0.03 i 1−P(F=0) = 1−(1−p)10 = ...).
(d) Anomenem S , i = 1,2 l’esdeveniment “anell i estressat” i B l’esdeveniment “hi ha alguna
i
|     |         | E´sP(B|S |     |      | 1−(1−β)2 |     |     | 0.84,P(B|S |     | P(B|S    |          | 0.6,P(B|S |     |            |
| --- | ------- | -------- | --- | ---- | -------- | --- | --- | ---------- | --- | -------- | -------- | --------- | --- | ---------- |
|     | fuita”. |          |     | 1 ,S | 2 ) =    |     |     | =          | 1   | ,S 2 ) = | 1 ,S 2 ) | = β =     |     | 1 ,S 2 ) = |
0; P(S ,S ) = α2 = 0.0025, P(S ,S ) = P(S ,S ) = α(1−α) = 0.0475.
|     |     | 1      | 2   |       |       |     | 1 2  | 1       | 2   |        |            |     |      |     |
| --- | --- | ------ | --- | ----- | ----- | --- | ---- | ------- | --- | ------ | ---------- | --- | ---- | --- |
|     | Per | Bayes, |     |       |       |     |      |         |     |        |            |     |      |     |
|     |     |        |     |       |       |     |      | P(B|S   |     | )P(S   |            |     |      |     |
|     |     |        |     |       |       |     |      |         | 1   | ,S 2 1 | ,S 2 )     |     |      |     |
|     |     | P(S    | ,S  | |B) = |       |     |      |         |     |        |            |     |      |     |
|     |     |        | 1 2 |       | P(B|S |     | )P(S | )+P(B|S |     | )P(S   | ,S2)+P(B|S |     | )P(S |     |
|     |     |        |     |       |       | ,S  |      | ,S      |     | ,S     |            | ,S  | ,S   | )   |
|     |     |        |     |       |       | 1   | 2    | 1 2     | 1   | 2 1    |            | 1 2 | 1    | 2   |
0.84·0.0025
|     |     |     |     |     |     | =   |     |     |     | =   | 0.03553. |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | -------- | --- | --- | --- |
0.84·0.0025+2·0.6·0.0475
E´s
una probabilitat petita per`o la probabilitat a priori ´es P(S ,S ) = 0.0025, encara m´es petita.
|     |     |     |     |     |     |     |     |     |     |     | 1 2 |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Aix´ı, saber que hi ha hagut alguna fuita fa augmentar aquesta probabilitat.
1

2. Un sistema transforma l’entrada x en la sortida g(x), on

x+1, si x < −1,


g(x) = 0, si −1 ≤ x ≤ 1,

x−1, si x > 1.
1/2
Sigui X una variable aleat`oria cont´ınua amb densitat f (x) = , i sigui Y = g(X).
X (1+|x|)2
(a) Calculeu la funci´o de distribuci´o F (x).
X
(b) Calculeu P(Y = 0) i la funci´o de distribuci´o F (y).
Y
(c) Sabent ara que Y ̸= 0, calculeu la funci´o de distribuci´o condicionada de Y, i si t´e sentit,
calculeu tamb´e la funci´o de densitat condicionada.
Resoluci´o.
(a) La funci´o de distribuci´o de la variable aleat`oria X val
(cid:90) x 1/2 1/2
 dt = , si x < 0,
(cid:90) x    −∞ (1−t)2 1−x
F (x) = f (t)dt =
X X
−∞   (cid:90) ∞ 1/2 1/2
 1− dt = 1− , si x ≥ 0.
(1+t)2 1+x
x
(b) Observeu que {Y = 0} = {−1 ≤ X ≤ 1}. Per tant,
(cid:90) 1 (cid:90) 1 1/2 1
P(Y = 0) = P(−1 ≤ X ≤ 1) = f (x)dx = 2 dx = .
X (1+x)2 2
−1 0
D’altra banda,
 (cid:90) y−1 1/2 1/2
  P(X ≤ y−1) = dt = , si y < 0,
  (1−t)2 2−y
 −∞
F (y) = P(Y ≤ y) =
Y
 (cid:90) +∞ 1/2 1/2
   P(X ≤ y+1) = 1− dt = 1− , si y ≥ 0.
 (1+t)2 2+y
y+1
(c) La funci´o de distribuci´o de Y, condicionada per Y ̸= 0, ´es
F (y| Y ̸= 0) = P(Y ≤ y| Y ̸= 0)
Y
P(Y
≤ y)
P({Y ≤ y}∩{Y ̸= 0})     P(Y ̸= 0) , si y < 0,
= =
P(Y ̸= 0)  P(Y ≤ y)−P(Y = 0)
  , si y ≥ 0.
 P(Y ̸= 0)
Donat que segons el primer apartat, P(Y = 0) = P(Y ̸= 0) = 1/2,
 1
   2F Y (y) = 2−y , si y < 0,
F (y| Y ̸= 0) =
Y (cid:18) (cid:19)
1 1

 2 F
Y
(y)− = 1− , si y ≥ 0.
2 2+y
2

Com que F (y| Y ̸= 0) es una funci´on cont´ınua i amb derivada cont´ınua, existeix la funci´o
Y
de densitat
 1
  , si y < 0,
(2−y)2
F′
|     |     | f (y| Y | ̸= 0) | = (y| Y ̸= 0) = |     |
| --- | --- | ------- | ----- | --------------- | --- |
|     |     | Y       |       | Y               | 1   |

  , si y ≥ 0,
(2+y)2
1
| ´es a dir, | f (y| | Y ̸= 0) = |          | .   |     |
| ---------- | ----- | --------- | -------- | --- | --- |
|            | Y     |           | (2+|y|)2 |     |     |
3
