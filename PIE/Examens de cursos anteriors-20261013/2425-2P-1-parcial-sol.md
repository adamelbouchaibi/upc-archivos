Enginyeria de Telecomunicaci´o (GRETST) • Probabilitat i Estad´ıstica
| 7 abril 2025 |     |     |     |     | Examen |     | parcial |     |     |     |           | Temps:          | 1h 45min |
| ------------ | --- | --- | --- | --- | ------ | --- | ------- | --- | --- | --- | --------- | --------------- | -------- |
|              |     |     |     |     |        |     |         |     |     | Els | problemes | tenen el mateix | pes      |
1.
Enunaxarxadecomunicacions,tresnodesA,BiCintentenestablirconnexi´o,demaneraindependent,
amb un node central. La probabilitat d’aconseguir-ho ´es 5/6 per a A, 3/4 per a B i 2/3 per a C. Sigui
| N el nombre  | total | de connexions |     | establertes. |     |       |              |     |     |     |     |     |     |
| ------------ | ----- | ------------- | --- | ------------ | --- | ----- | ------------ | --- | --- | --- | --- | --- | --- |
| (a) Calculeu | les   | probabilitats |     | P(N=k)       |     | per a | k = 0,1,2,3. |     |     |     |     |     |     |
(b) Si N = 2, quant val la probabilitat que el node A hagi establert connexi´o?
| (c) Determineu   |     | el nombre | esperat   |     | de connexions |     | establertes. |     |     |     |     |     |     |
| ---------------- | --- | --------- | --------- | --- | ------------- | --- | ------------ | --- | --- | --- | --- | --- | --- |
| (NOTA: Expresseu |     | els       | resultats | en  | forma         | de  | fraccions.)  |     |     |     |     |     |     |
Resoluci´o
Sigui X l’esdeveniment “el node X estableix connexi´o”, on X ´es A, B, o C, i sigui N el nombre total
| de connexions       | establertes. |     |        |           |                         |           |                  |     |      |     |     |          |     |
| ------------------- | ------------ | --- | ------ | --------- | ----------------------- | --------- | ---------------- | --- | ---- | --- | --- | -------- | --- |
| (a) La probabilitat |              | que | cap    | node      | hagi                    | establert | connexi´o        |     | val: |     |     |          |     |
|                     |              |     |        |           |                         |           |                  |     |      | 1   | 1 1 | 1        |     |
|                     |              |     |        |           | (cid:16)                |           | (cid:17)         |     |      |     |     |          |     |
|                     |              | P(N | =      | 0) = P    | A∩B∩C                   |           | = P(A)P(B)P(C)   |     |      | =   | · · | = .      |     |
|                     |              |     |        |           |                         |           |                  |     |      | 6   | 4 3 | 72       |     |
| La probabilitat     |              | que | s’hagi | establert |                         | una       | u´nica connexi´o |     | ´es: |     |     |          |     |
|                     |              |     |        |           | (cid:16)                |           |                  |     |      |     |     | (cid:17) |     |
|                     |              | P(N | =      | 1) = P    | (A∩B∩C)∪(A∩B∩C)∪(A∩B∩C) |           |                  |     |      |     |     |          |     |
= P(A)P(B)P(C)+P(A)P(B)P(C)+P(A)P(B)P(C)
|     |     |     |     | 5   | 1   | 1   | 1 3 1 | 1   | 1 2 | 10  | 5   |     |     |
| --- | --- | --- | --- | --- | --- | --- | ----- | --- | --- | --- | --- | --- | --- |
|     |     |     |     | =   | · · | +   | · ·   | +   | · · | =   | = . |     |     |
|     |     |     |     | 6   | 4   | 3   | 6 4 3 | 6   | 4 3 | 72  | 36  |     |     |
Calculem ara la probabilitat que s’hagin establert exactament dues connexions.
|     |     |     |     |        | (cid:16)                |     |     |     |     |     |     | (cid:17) |     |
| --- | --- | --- | --- | ------ | ----------------------- | --- | --- | --- | --- | --- | --- | -------- | --- |
|     |     | P(N | =   | 2) = P | (A∩B∩C)∪(A∩B∩C)∪(A∩B∩C) |     |     |     |     |     |     |          |     |
= P(A)P(B)P(C)+P(A)P(B)P(C)+P(A)P(B)P(C)
|            |     |                 |      | 5          | 3        | 1     | 5 1 2          | 1   | 3 2       | 31   |     |       |     |
| ---------- | --- | --------------- | ---- | ---------- | -------- | ----- | -------------- | --- | --------- | ---- | --- | ----- | --- |
|            |     |                 |      | =          | · ·      | +     | · ·            | +   | · ·       | = .  |     |       |     |
|            |     |                 |      | 6          | 4        | 3     | 6 4 3          | 6   | 4 3       | 72   |     |       |     |
| Finalment, |     | la probabilitat |      | que        | els tres | nodes | s’hagin        |     | connectat | ´es: |     |       |     |
|            |     |                 |      |            |          |       |                |     |           | 5 3  | 2   | 30 5  |     |
|            |     | P(N             | = 3) | = P(A∩B∩C) |          |       | = P(A)P(B)P(C) |     |           | = ·  | · = | = .   |     |
|            |     |                 |      |            |          |       |                |     |           | 6 4  | 3   | 72 12 |     |
(b) Si s’han establert dues connexions, la probabilitat que A s’hagi connectat val:
|               |     |         |               | P(A∩{N            |             | =    | 2})  |     |     |             |       |     |     |
| ------------- | --- | ------- | ------------- | ----------------- | ----------- | ---- | ---- | --- | --- | ----------- | ----- | --- | --- |
|               |     | P(A|N   | =             | 2) =              |             |      |      |     |     |             |       |     |     |
|               |     |         |               |                   | P(N         | = 2) |      |     |     |             |       |     |     |
|               |     |         |               | P(A∩B∩C)+P(A∩B∩C) |             |      |      |     |     | 15/72+10/72 |       | 25  |     |
|               |     |         |               | =                 |             |      |      |     |     | =           |       | = . |     |
|               |     |         |               |                   |             | P(N  | = 2) |     |     |             | 31/72 | 31  |     |
| (c) El nombre |     | esperat | de connexions |                   | establertes |      | ´es: |     |     |             |       |     |     |
3
|     |     |     |      |     | X    |     |        | 10  | 62  | 90 162 | 9    |     |     |
| --- | --- | --- | ---- | --- | ---- | --- | ------ | --- | --- | ------ | ---- | --- | --- |
|     |     |     | E(N) | =   | kP(N |     | = k) = | +   | +   | =      | =    | .   |     |
|     |     |     |      |     |      |     |        | 72  | 72  | 72     | 72 4 |     |     |
k=0
1

σ2,
2. Sigui X una variable aleat`oria gaussiana d’esperanc¸a m i vari`ancia i considereu la variable Y =
| g(X), on | la funci´o | g(x) | ´es: |     |     |     |       |     |     |     |     |     |     |     |     |
| -------- | ---------- | ---- | ---- | --- | --- | --- | ----- | --- | --- | --- | --- | --- | --- | --- | --- |
|          |            |      |      |     |     |     | ( x2, |     | ⩾   |     |     |     |     |     |     |
|          |            |      |      |     |     |     |       | si  | x   | 0   |     |     |     |     |     |
g(x) =
−x2,
|     |     |     |     |     |     |     |     | si  | x < | 0   |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(a) Dibuixeu la gr`afica de g(x) i determineu la funci´o de densitat de Y.
| Quant        | val | E(Y)         | en el | cas que | m        | = 0?       |     |      |     |     |     |     |     |     |     |
| ------------ | --- | ------------ | ----- | ------- | -------- | ---------- | --- | ---- | --- | --- | --- | --- | --- | --- | --- |
| (b) Calculeu |     | l’esperan¸ca |       | de la   | variable | aleat`oria |     | |Y|. |     |     |     |     |     |     |     |
(Indicaci´o: expresseu |Y| com a funci´o de X i apliqueu-hi el teorema de l’esperan¸ca; el c`alcul es
| pot       | completar |      | sense | haver | de calcular |          | cap integral.) |     |     |     |     |     |     |     |     |
| --------- | --------- | ---- | ----- | ----- | ----------- | -------- | -------------- | --- | --- | --- | --- | --- | --- | --- | --- |
| (c) Sigui | h(x)      | = x2 | si x  | ⩾ 0 i | h(x)        | = 0 si x | < 0.           |     |     |     |     |     |     |     |     |
Si Z = h(X), determineu P(Z=0), expressant el resultat en termes de la funci´o d’error erf.
Resoluci´o
(a) La funci´o g(x) ´es estrictament creixent i derivable, i l’u´nica solucio´ de
√
|            |     |     |      |       | g−1(y), |     |        |     |     |      |     |      | y   |     |     |
| ---------- | --- | --- | ---- | ----- | ------- | --- | ------ | --- | --- | ---- | --- | ---- | --- | --- | --- |
| l’equaci´o |     | y = | g(x) | ´es x | =       | ´es | a dir, | x = | +   | y si | y > | 0, i |     |     |     |
√
| x = | − −y | si y | < 0. |     |     |     |     |     |     |     |     |     |     |     |     |
| --- | ---- | ---- | ---- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
y = g(x)
| D’altra | banda, |     | g′(x) | = 2x | si x > | 0, i g′(x) | =   | −2x si | x < | 0. Per | tant, |     |     |     |     |
| ------- | ------ | --- | ----- | ---- | ------ | ---------- | --- | ------ | --- | ------ | ----- | --- | --- | --- | --- |
q
|          |      |         |         |        | |g′(x)| |     |           |     |        |            |     |     |     | x   |     |
| -------- | ---- | ------- | ------- | ------ | ------- | --- | --------- | --- | ------ | ---------- | --- | --- | --- | --- | --- |
|          |      |         |         |        |         | = 2 | |y|,      |     |        |            |     |     |     |     |     |
| tant     | si y | > 0 com | si      | y < 0. |         |     |           |     |        |            |     |     |     |     |     |
| Apliquem |      | ara el  | teorema | del    | canvi   | de  | variable. | Si  | y > 0, | aleshores, |     |     |     |     |     |
√
|         |        |               |              |       |          | (x)(cid:12)    |       |          |              |     | y−m)2 | !        |     |           |     |
| ------- | ------ | ------------- | ------------ | ----- | -------- | -------------- | ----- | -------- | ------------ | --- | ----- | -------- | --- | --------- | --- |
|         |        |               |              |       | f        |                |       | 1        |              |     | (     |          |     |           |     |
|         |        |               |              | f (y) | =        | X (cid:12)     | =     | √        | exp          | −   |       |          | .   |           |     |
|         |        |               |              | Y     |          | (cid:12)       |       |          |              |     |       |          |     |           |     |
|         |        |               |              |       | |g       | ′(x)| (cid:12) | √     | 2 2πyσ   |              |     | 2σ2   |          |     |           |     |
|         |        |               |              |       |          | x=             | y     |          |              |     |       |          |     |           |     |
| En      | canvi, | si y <        | 0, aleshores |       |          |                |       |          |              |     |       |          |     |           |     |
|         |        |               |              |       |          |                |       | √        |              | !   |       |          |     |   p       | !   |
|         |        | f (x)(cid:12) |              |       |          | 1              |       | (−       | −y−m)2       |     |       | 1        |     | ( |y|+m)2 |     |
|         |        | X             | (cid:12)     |       |          |                |       |          |              |     |       |          |     |           |     |
| f Y (y) | =      |               | (cid:12)     | =     | √        |                | exp − |          |              |     | =     |          | exp | −         | .   |
|         |        | |g ′(x)|      | (cid:12) √   |       | 2 −2πyσ  |                |       |          | 2σ2          |     | 2     | p 2π|y|σ |     | 2σ2       |     |
|         |        |               | x=−          | −y    |          |                |       |          |              |     |       |          |     |           |     |
| Si m    | = 0,   | la densitat   |              | de la | variable | Y              | ´es:  |          |              |     |       |          |     |           |     |
|         |        |               |              |       |          | 1              |       | (cid:18) | |y| (cid:19) |     |       |          |     |           |     |
|         |        |               |              | f (y) | =        |                | exp   | −        | ,            | −∞  | < y   | < ∞.     |     |           |     |
|         |        |               |              | Y     |          | p              |       |          |              |     |       |          |     |           |     |
|         |        |               |              |       |          | 2 2π|y|σ       |       | 2σ2      |              |     |       |          |     |           |     |
L’esperanc¸a es calcula amb la integral E(Y) = dyf (y)y, que ´es absolutament convergent
|     |     |     |     |     |     |     |     | (cid:114)R | Y   |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | ---------- | --- | --- | --- | --- | --- | --- | --- |
+∞
perqu`e la integral dye−ayy1/2 ´es convergent si a > 0. Com que la densitat f (y) ´es parella
|     |     |     | (cid:114)0 |     |     |     |     |     |     |     |     |     |     | Y   |     |
| --- | --- | --- | ---------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
en aquest cas, l’integrand f Y (y)y ´es imparell, d’on dedu¨ım que E(Y) = 0.
(b) Tenim |Y| = |g(X)| = X2. Aplicant la f´ormula Var(X) = E(X2)−E(X)2,
∞
|     |     | E(|Y|) |     | =         | dxf | (x)x2 | = E(X2) | =   | Var(X)+(E(X))2 |     |     | = σ2+m2. |     |     |     |
| --- | --- | ------ | --- | --------- | --- | ----- | ------- | --- | -------------- | --- | --- | -------- | --- | --- | --- |
|     |     |        |     | (cid:119) |     | X     |         |     |                |     |     |          |     |     |     |
−∞
(c) D’acord amb l’expressi´o de h(x), la probabilitat P(Z=0) ´es igual a:
z
|        |     |        |     |       |     | (cid:18) | (cid:18)−m(cid:19)(cid:19) |     |     | (cid:18) | (cid:18) | (cid:19)(cid:19) |     |     |     |
| ------ | --- | ------ | --- | ----- | --- | -------- | -------------------------- | --- | --- | -------- | -------- | ---------------- | --- | --- | --- |
|        |     |        |     |       |     | 1        |                            |     | 1   |          |          | m                |     |     |     |
| P(Z=0) | =   | P(X⩽0) | =   | F (0) | =   | 1+erf    | √                          |     | =   | 1−erf    | √        |                  | .   |     |     |
X
|     |     |     |     |     |     | 2   |     | 2σ  | 2   |     |     | 2σ  |     | z = | h(x) |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ---- |
x
2
