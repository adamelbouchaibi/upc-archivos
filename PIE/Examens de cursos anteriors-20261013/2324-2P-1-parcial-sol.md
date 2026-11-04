|            |     | Enginyeria |     |     | de           | Telecomunicacio´ |                |     | (GRETST) |     |        |        |
| ---------- | --- | ---------- | --- | --- | ------------ | ---------------- | -------------- | --- | -------- | --- | ------ | ------ |
|            |     |            |     |     | Probabilitat |                  | i Estad´ıstica |     |          |     |        |        |
| 19 d’abril | de  | 2024       |     |     |              | Examen           | parcial        |     |          |     | Temps: | 1h 30m |
1. Per una gran ciutat corren tres tipus de mascotes: 60% gats, 30% gossos i 10% brontarocs.
(a) Sabem que un 10% dels gats, un 80% dels gossos, i un 100% de brontarocs porten collar. Ens
trobem una mascota que porta collar. Quina ´es la probabilitat que sigui un brontaroc? I la
| probabilitat |     | que | sigui | un gos | o un | brontaroc? |     |     |     |     |     |     |
| ------------ | --- | --- | ----- | ------ | ---- | ---------- | --- | --- | --- | --- | --- | --- |
(b) Unfot`ografsurtalcarreramblaintenci´odefotografiarmascotes. Quina´eslaprobabilitatqueles
dues primeres mascotes que fotografi¨ı siguin gats? Sabent que almenys una de les dues primeres
mascotes fotografiades ´es un gat, quina ´es la probabilitat que ho siguin les dues?
(c) Un altre dia, el fot`ograf fa fotos fins que fotografia un gat amb collar. Quin ´es el nombre esperat
de fotos que fa aquell dia? (Recordem que el 10% dels gats porten collar.)
Resoluci´o
Denotem per Ga, Go, i B els esdeveniments “la mascota que ens trobem´es un gat”, “´es un gos”, i “´es
un brontaroc”, respectivament. Aleshores, P(Ga) = 0.6, P(Go) = 0.3, i P(B) = 0.1.
(a) Sigui C l’esdeveniment “la mascota porta collar”. Llavors, P(C|Ga) = 0.1, P(C|Go) = 0.8,
P(C|B)
i = 1. Aleshores, si la mascota que trobem porta collar, la probabilitat que sigui un
| brontaroc |     | val |     |     |     |     |     |     |     |     |     |     |
| --------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
P(C|B)P(B)
|     |     |     | P(B|C) | =   |     |     |     |     |     |     |     |     |
| --- | --- | --- | ------ | --- | --- | --- | --- | --- | --- | --- | --- | --- |
P(C|Ga)P(Ga)+P(C|Go)P(Go)+P(C|B)P(B)
|     |     |     |     |     |                       | 1·0.1 |     |     | 1   |       |     |     |
| --- | --- | --- | --- | --- | --------------------- | ----- | --- | --- | --- | ----- | --- | --- |
|     |     |     |     | =   |                       |       |     |     | = = | 0.25. |     |     |
|     |     |     |     |     | 0.1·0.6+0.8·0.3+1·0.1 |       |     |     | 4   |       |     |     |
An`alogament,
P(C|Go)P(Go)
|     |     |     | P(Go|C) |     | =   |     |     |     |     |     |     |     |
| --- | --- | --- | ------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
P(C|Ga)P(Ga)+P(C|Go)P(Go)+P(C|B)P(B)
|     |     |     |     |     |                       | 0.8·0.3 |     |     | 3   |      |     |     |
| --- | --- | --- | --- | --- | --------------------- | ------- | --- | --- | --- | ---- | --- | --- |
|     |     |     |     |     | =                     |         |     |     | = = | 0.6, |     |     |
|     |     |     |     |     | 0.1·0.6+0.8·0.3+1·0.1 |         |     |     | 5   |      |     |     |
i, per tant, si la mascota porta collar, la probabilitat que sigui un gos o un brontaroc val
|     |     |     | P(Go∪B|C) |     |     | = P(Go|C)+P(B|C) |     |     | = 0.25+0.6 | =   | 0.85. |     |
| --- | --- | --- | --------- | --- | --- | ---------------- | --- | --- | ---------- | --- | ----- | --- |
P(Ga)2
(b) La probabilitat que les dues primeres mascotes siguin gats val = 0.36.
Sigui X el nombre de gats en les dues primeres mascotes. Si almenys una de les dues primeres
mascotes fotografiades ´es un gat, la probabilitat que ho siguin les dues val
|     |     |       |     |      | P(X = | 2,X ⩾ | 1)    | P(X = | 2)   | 0.62     | 3           |     |
| --- | --- | ----- | --- | ---- | ----- | ----- | ----- | ----- | ---- | -------- | ----------- | --- |
|     | P(X |       | ⩾   |      |       |       |       |       |      |          |             |     |
|     |     | = 2|X |     | 1) = |       |       | =     |       | =    |          | = ≈ 0.4286. |     |
|     |     |       |     |      | P(X   | ⩾ 1)  | 1−P(X |       | = 0) | 1−(0.4)2 | 7           |     |
(c) Si N ´es el nombre de fotos fins que es fotografia un gat amb collar, N ∼ Ge(p) amb p =
| P(Ga∩C) |     | P(C|Ga)P(Ga) |     |     |         |     | E[N]  |     |            |          |     |     |
| ------- | --- | ------------ | --- | --- | ------- | --- | ----- | --- | ---------- | -------- | --- | --- |
|         |     | =            |     |     | = 0.06. | Per | tant, | =   | 1/p = 50/3 | ≈ 16.67. |     |     |
1

2. (a) Sigui X una variable aleat`oria uniforme en l’interval [−1,1]. Calculeu la funci´o de densitat f (y)
Y
i l’esperan¸ca E[Y] de la variable Y = g(X), obtinguda de X amb la transformaci´o
(cid:40)
4−x2, −2 ⩽ x ⩽ 2
g(x) = .
0, altrament
(b) Sigui ara X una variable discreta que pren els valors -2, -1, 1, 2, i 3 de manera que, per aquests
valors, P(X = k) = a|k|. Calculeu el valor de la constant a i la funci´o de distribuci´o F (y) de la
Y
variable Y = g(X), on g(x) ´es la mateixa funci´o de l’apartat anterior.
(c) Siguin Z i T variables aleat`ories conjuntament cont´ınues tals que
3
f (z,t) = z, 0 < z < 1, 0 < t < 2z,
ZT
2
i f (z,t) = 0 altrament. Determineu la densitat marginal f (t), indicant l’interval on aquesta
Z,T T
densitat no val 0. Calculeu tamb´e P(T > Z).
Resoluci´o
(a) En l’interval [−1,1] on la variable X pren valors, la funci´o g(x) est`a definida com g(x) = 4−x2,
´es mon`otona a trossos, cont´ınua i derivable. Aix´ı, la variable Y = g(X) tamb´e ser`a cont´ınua i
podrem trobar f (y) amb el teorema del canvi de variable.
Y
√ √
Si 0 < y < 4, l’equaci´o y = g(x) t´e dues solucions, x = − 4−y i x = + 4−y. D’altra banda
1 2
g′(x) = −2x. Aix´ı, si 0 < y < 4,
√ √
f (y) = (cid:88) f X (x) = f X (x 1 ) + f X (x 2 ) = f X (− √ 4−y) + f X ( √ 4−y) .
Y |g′(x)| |g′(x )| |g′(x )| 2 4−y 2 4−y
x 1 2
g(x)=y
La densitat de X ´es f (x) = 1/2 quan −1 ⩽ x ⩽ 1. Aix´ı, si 0 < y < 3, la densitat val 0, mentre
X √ √
que, si 3 < y < 4, aleshores 0 < 4−y < 1 i f (± 4−y) = 1/2. Per tant,
X
1
f (y) = √ , 3 < y < 4.
Y
2 4−y
Aplicant el teorema de l’esperan¸ca,
∞ 1 1 1 11
E[Y] = E[g(X)] = g(x)f (x)dx = (4−x2)dx = 4− = .
(cid:119) X (cid:119)
−∞ −1 2 3 3
Nota La densitat f (y) tamb´e es pot obtenir calculant pr`eviament la funci´o de distribuci´o
Y
F (y). En efecte, com que la variable Y pren valors entre 0 i 4, F (y) = 0 si y < 0 i F (y) = 1
Y Y Y
si y ⩾ 4. Si 0 ⩽ y < 4, tenim:
(cid:112) (cid:112) (cid:112)
F (y) = P(Y ⩽ y) = P(X ⩽ − 4−y)+P(X ⩾ 4−y) = 2P(X ⩾ 4−y).
Y
√
La probabilitat anterior val 0 si 0 ⩽ y < 3, ja que 4−y ⩾ 1 i X nom´es pren valors entre -1 i
1, mentre que si 3 ⩽ y < 4, aleshores
1 1 (cid:112) 1(cid:112)
F (y) = 2 f (x)dx = 2· (1− 4−y) = 1− 4−y.
Y (cid:119)√ X
4−y 2 2
Derivant F (y) obtenim novament l’expressi´o de f (y).
Y Y
(b) Com que (cid:80) P(X=k) = 1, s’ha de complir a(2+1+1+2+3) = 1, d’on a = 1/9.
k
D’altra banda, la variable Y pren nom´es els valors 0 i 3,
2 2 3 7
P(Y=0) = P(X=−2)+P(X=2)+P(X=3) = + + = ,
9 9 9 9
1 1 2
P(Y=3) = P(X=−1)+P(X=1) = + = .
9 9 9
Per tant, 
0, y < 0,


F (y) = 7/9, 0 ⩽ y < 3,
Y

1, y ⩾ 3.
2

| (c) La densitat | marginal |     | de la | variable T | val |     |     |     |     |     |     |     |
| --------------- | -------- | --- | ----- | ---------- | --- | --- | --- | --- | --- | --- | --- | --- |
|                 |          |     | ∞     |            |     | 1 3 | 3   | 3   |     |     |     |     |
t2,
|     |     | f (t) | =         | f (z,t)dz | =         | zdz | = − |     | 0   | < t < 2. |     |     |
| --- | --- | ----- | --------- | --------- | --------- | --- | --- | --- | --- | -------- | --- | --- |
|     |     | T     | (cid:119) | ZT        | (cid:119) | 2   | 4   | 16  |     |          |     |     |
|     |     |       | −∞        |           | t/2       |     |     |     |     |          |     |     |
Ara calculem P(T > Z). Sigui D = {(z,t) ∈ R2 | t > z} la regi´o corresponent a aquest
R2
esdeveniment i S = {(z,t) ∈ | 0 < z < 1, 0 < t < 2z} la regi´o on f (z,t) no ´es 0. Aleshores,
ZT
|        |     |         |      |           |          |           | 3   |           | 1 2z      | 3    | 1 3         | 1   |
| ------ | --- | ------- | ---- | --------- | -------- | --------- | --- | --------- | --------- | ---- | ----------- | --- |
| P(T>Z) |     | P((Z,T) |      |           |          |           |     |           |           |      | z2          |     |
|        | =   |         | ∈ D) | = dzdtf   | ZT (z,t) | = dzdt    | z   | =         | dz        | dt z | = dz        | = . |
|        |     |         |      | (cid:120) |          | (cid:120) | 2   | (cid:119) | (cid:119) | 2    | (cid:119) 2 | 2   |
|        |     |         |      |           |          |           |     | 0         | z         |      | 0           |     |
|        |     |         |      | D         |          | D∩S       |     |           |           |      |             |     |
3
