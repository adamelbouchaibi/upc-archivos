Enginyeria de Telecomunicaci´o (GRETST) • Probabilitat i Estad´ıstica
| 7 gener | 2025 |     |     |     |     |     | Examen | final |     |     |     |     | Temps: | 3h  |
| ------- | ---- | --- | --- | --- | --- | --- | ------ | ----- | --- | --- | --- | --- | ------ | --- |
.
Notes provisionals: 17 de gener, Atenea Les dates de revisi´o i allegacions s’anunciaran amb les notes
| provisionals. |     |     |     |     |     |     |     |     |     | Tots els | problemes | tenen | el mateix | pes |
| ------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | -------- | --------- | ----- | --------- | --- |
1. L’urna A cont´e 2 boles blanques i 3 boles negres, mentre que l’urna B cont´e 4 boles blanques i 3 boles
negres.
(a) S’extreu alhora i a l’atzar una bola de cada urna i s’intercanvien (´es a dir, la bola extreta de A
s’introdueix a B, i l’extreta de B s’introdueix a A). Despr´es s’extreuen dues boles de B. Calculeu
la probabilitat que aquestes dues u´ltimes boles extretes de B siguin blanques. Si aquestes dues
u´ltimes boles extretes de B s´on blanques, quina ´es la probabilitat que les boles intercanviades
|     | siguin negres? |     |     |     |     |     |     |     |     |     |     |     |     |     |
| --- | -------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(b) Amb la composici´o inicial de l’urna B anem extraient boles una a una i sense reposici´o fins que
surtunabolablanca. SiguiX elnombred’extraccionsquefem. Calculeulafunci´odeprobabilitat
i l’esperan¸ca de la variable aleat`oria X. Quan val l’esperan¸ca de X si sabem que la primera bola
|     | extreta | ha estat | negra? |     |     |     |     |     |     |     |     |     |     |     |
| --- | ------- | -------- | ------ | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Resoluci´o
(a) Tenint en compte el color de les boles intercanviades, podem considerar la partici´o definida pels
esdeveniments C bb : «les dues boles s´on blanques», C bn : «la bola de A´es blanca i l’altra´es negra»,
C :«laboladeA´esnegrail’altra´esblanca»,iC :«lesduesboless´onnegres». Lesprobabilitats
|     | nb          |        |     |     |     |     |     | nn  |     |     |     |     |     |     |
| --- | ----------- | ------ | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     | respectives | valen: |     |     |     |     |     |     |     |     |     |     |     |     |
|     |             | 2 4    | 8   |     |     | 2   | 3 6 |     |     | 3 4 | 12  |     | 3 3 | 9   |
P(C bb ) = · = , P(C bn ) = · = , P(C nb ) = · = , P(C nn ) = · = .
|     |     | 5 7 | 35  |     |     | 5   | 7 35 |     |     | 5 7 | 35  |     | 5 7 | 35  |
| --- | --- | --- | --- | --- | --- | --- | ---- | --- | --- | --- | --- | --- | --- | --- |
i. SiD´esl’esdeveniment«lesduesbolesextretesdel’urnaB s´onblanques»,aplicantelteorema
|     | de  | la probabilitat |       | total, | tenim                          |     |                                |         |                                |       |                                |         |           |     |
| --- | --- | --------------- | ----- | ------ | ------------------------------ | --- | ------------------------------ | ------- | ------------------------------ | ----- | ------------------------------ | ------- | --------- | --- |
|     |     | P(D) =          | P(D|C | )P(C   | )+P(D|C                        |     | )P(C                           | )+P(D|C |                                | )P(C  |                                | )+P(D|C | )P(C      | )   |
|     |     |                 |       | bb     | bb                             |     | bn                             | bn      |                                | nb    | nb                             |         | nn        | nn  |
|     |     |                 |       |        | (cid:0)4(cid:1)(cid:0)3(cid:1) |     | (cid:0)5(cid:1)(cid:0)2(cid:1) |         | (cid:0)3(cid:1)(cid:0)4(cid:1) |       | (cid:0)4(cid:1)(cid:0)3(cid:1) |         |           |     |
|     |     |                 |       |        |                                | 8   |                                | 6       |                                | 12    |                                | 9       |           |     |
|     |     |                 |       |        | = 2                            | 0 · | + 2                            | 0 ·     | + 2                            | 0 ·   | + 2                            | 0 ·     |           |     |
|     |     |                 |       |        | (cid:0)7(cid:1)                |     | (cid:0)7(cid:1)                |         | (cid:0)7(cid:1)                |       | (cid:0)7(cid:1)                |         |           |     |
|     |     |                 |       |        |                                | 35  |                                | 35      |                                | 35    |                                | 35      |           |     |
|     |     |                 |       |        | 2                              |     | 2                              |         |                                | 2     |                                | 2       |           |     |
|     |     |                 |       |        | 6                              | 8   | 10 6                           | 3       | 12                             | 6 9   | 198                            | 66      |           |     |
|     |     |                 |       |        | = ·                            | +   | ·                              | +       | · +                            | ·     | =                              | =       | ≈ 0.2694. |     |
|     |     |                 |       |        | 21                             | 35  | 21 35                          | 21      | 35                             | 21 35 | 735                            | 245     |           |     |
ii. Silesduesbolesextretesdel’urnaB s´onblanques,laprobabilitatquelesbolesintercanviades
|     | hagin | estat | negres | val |       |     |      |             |     |     |     |           |     |     |
| --- | ----- | ----- | ------ | --- | ----- | --- | ---- | ----------- | --- | --- | --- | --------- | --- | --- |
|     |       |       |        |     | P(D|C |     | )P(C | ) 6/21·9/35 |     |     | 54  | 3         |     |     |
|     |       |       | P(C    | |D) | =     | nn  | nn   | =           |     | =   | =   | ≈ 0.2727. |     |     |
nn
|     |     |     |     |     |     | P(D) |     |     | 198/735 | 198 |     | 11  |     |     |
| --- | --- | --- | --- | --- | --- | ---- | --- | --- | ------- | --- | --- | --- | --- | --- |
(b) Com que l’urna B cont´e 4 boles blanques i 3 boles negres, la variable X pot prendre els valors 1,
|     | 2, 3, i 4. |     |     |     |     |     |     |     |     |     |     |     |     |     |
| --- | ---------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |            | ⩽ ⩽ |     |     |     |     |     |     |     |     |     |     |     |     |
Per a 1 i 4, denotem per N i B als esdeveniments «la bola de la i-`esima extracci´o´es negra»
|     |     |     |     |     | i   | i   |     |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
i «la bola de la i-`esima extracci´o ´es blanca», respectivament. La funci´o de probabilitat de la
|     | variable | X ´es: |     |     |     |     |     |     |     |     |     |     |     |     |
| --- | -------- | ------ | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
4
|     | P(X | = 1) = | P(B ) | = ; |     |     |     |     |     |     |     |     |     |     |
| --- | --- | ------ | ----- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
1
7
|     |     |        |       |        |       |        |          | 3   | 4 2 |     |     |     |     |     |
| --- | --- | ------ | ----- | ------ | ----- | ------ | -------- | --- | --- | --- | --- | --- | --- | --- |
|     | P(X | = 2) = | P(N 1 | ∩B 2 ) | = P(N | 1 )P(B | 2 |N 1 ) | = · | =   | ;   |     |     |     |     |
|     |     |        |       |        |       |        |          | 7   | 6 7 |     |     |     |     |     |
|     |     |        |       |        |       |        |          |     |     |     | 3   | 2 4 | 4   |     |
P(X = 3) = P(N 1 ∩N 2 ∩B 3 ) = P(N 1 )P(N 2 |N 1 )P(B 3 |N 1 ∩N 2 ) = · · = ;
|     |     |     |     |     |     |     |     |     |     |     | 7   | 6 5 | 35  |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
P(X = 4) = P(N ∩N ∩N ∩B ) = P(N )P(N |N )P(N |N ∩N )P(B |N ∩N ∩N )
|     |     |     | 1   | 2   | 3   | 4   | 1   | 2   | 1   | 3   | 1 2 | 4   | 1 2 | 3   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     | 3 2 | 1   | 1   |     |     |     |     |     |     |     |     |     |
|     |     | =   | · · | ·1  | = . |     |     |     |     |     |     |     |     |     |
|     |     |     | 7 6 | 5   | 35  |     |     |     |     |     |     |     |     |     |
1

| Per tant, l’esperanc¸a | de X | val |     |     |     |
| ---------------------- | ---- | --- | --- | --- | --- |
4
|     |      | X        | 4 4      | 12 4 8  |        |
| --- | ---- | -------- | -------- | ------- | ------ |
|     | E[X] | = kP(X = | k) = + + | + =     | = 1.6. |
|     |      |          | 7 7      | 35 35 5 |        |
k=1
Si la primera bola extreta ha estat blanca (´es a dir, si ha succe¨ıt B ), aleshores E[X|B ] = 1.
1 1
| D’altra banda, | E[X] = E[X|B | ]P(B )+E[X|N | ]P(N   | ), ´es a dir, |     |
| -------------- | ------------ | ------------ | ------ | ------------- | --- |
|                |              | 1 1          | 1 1    |               |     |
|                |              | 8            | 4      | 3             |     |
|                |              | =            | +E[X|N | ] ,           |     |
|                |              | 5            | 7 1    | 7             |     |
d’on obtenim que si la primera bola extreta ha estat negra, l’esperanc¸a de X val E[X|N 1 ] =
12/5 = 2.4.
2

2. En l’`atom d’hidrogen amb el nivell d’energia m´es baix, la posici´o de l’electr´o respecte del nucli de
l’`atom segueix un model probabil´ıstic. La dist`ancia r entre l’electr´o i el centre del nucli ve donada per
una variable aleat`oria R amb densitat f (r) = 0 si r < 0, i f (r) = cr2e−2r/a0 si r ⩾ 0, on a ´es una
|                  |       |     |     |     | R   |     |     | R   |     |     |     | 0   |
| ---------------- | ----- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| constant f´ısica | fixa. |     |     |     |     |     |     |     |     |     |     |     |
(a) Quin ´es el conjunt Ω ⊆ R de valors que pot prendre la variable aleat`oria R?
R
(b) Trobeu el valor que ha de tenir la constant c en termes de a per tal que f sigui una funci´o
|     |     |     |     |     |     |     |     |     | 0   |     | R   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
de densitat. [Indicaci´o: el c`alcul de c es pot fer directament, per`o us pot ser u´til la f´ormula
| +∞  | tne−tdt | = n!] |     |     |     |     |     |     |     |     |     |     |
| --- | ------- | ----- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(cid:114)0
(c) Quina´esladist`anciaesperadar = E[R]entrel’electr´oielcentredelnucli? Quina´eslavari`ancia
0
| d’aquesta | dist`ancia? |     |     |     |     |     |     |     |     |     |     |     |
| --------- | ----------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Resoluci´o
(a) Com que la densitat de probabilitat ´es positiva per r ⩾ 0, el conjunt de valors que pot prendre
| R ´es | Ω = | [0,+∞). |     |     |     |     |     |     |     |     |     |     |
| ----- | --- | ------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
R
(b) Fem servir que la integral d’una densitat de probabilitat sempre ha de donar 1. Calculant trobem
que
|     |     | +∞  |     |     | +∞  |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
cr2e−2r/a0dr
|     |     | (cid:119) | f R (r)dr |     | = (cid:119) |                     |          |     |                    |         |        |     |
| --- | --- | --------- | --------- | --- | ----------- | ------------------- | -------- | --- | ------------------ | ------- | ------ | --- |
|     |     | −∞        |           |     | 0           |                     |          |     |                    |         |        |     |
|     |     |           |           |     |             | (cid:18)2r(cid:19)2 |          |     | (cid:18)2r(cid:19) |         |        |     |
|     |     |           |           |     | a3 +∞       |                     |          |     |                    | a3      | a3     |     |
|     |     |           |           |     | = c 0       |                     | e−2r/a0d |     |                    | = c 02! | = c 0. |     |
(cid:119)
|           |     |         |             |     | 8 0         | a   |           |     | a   | 8   | 4   |     |
| --------- | --- | ------- | ----------- | --- | ----------- | --- | --------- | --- | --- | --- | --- | --- |
|           |     |         |             |     |             |     | 0         |     | 0   |     |     |     |
| Per tant, | per | tal que | la integral |     | sigui igual | a   | 1 cal que |     |     |     |     |     |
4
c = .
a3
0
| (c) Com | en l’apartat | anterior, |           | calculem: |             |     |              |             |                     |          |                    |     |
| ------- | ------------ | --------- | --------- | --------- | ----------- | --- | ------------ | ----------- | ------------------- | -------- | ------------------ | --- |
|         |              |           |           | +∞        | 4           |     | 4            | +∞          |                     |          |                    |     |
|         |              | E[R]      | =         | r         | r2e−2r/a0dr |     | =            | r3e−2r/a0dr |                     |          |                    |     |
|         |              |           | (cid:119) | a3        |             |     | a3 (cid:119) |             |                     |          |                    |     |
|         |              |           |           | 0         |             |     |              | 0           |                     |          |                    |     |
|         |              |           |           |           | 0           |     | 0            |             |                     |          |                    |     |
|         |              |           |           |           |             |     | a4           |             | (cid:18)2r(cid:19)3 |          | (cid:18)2r(cid:19) |     |
|         |              |           |           |           |             |     | 4            | +∞          |                     |          |                    |     |
|         |              |           |           |           |             |     | = 0          |             |                     | e−2r/a0d |                    |     |
|         |              |           |           |           |             |     | a3           | (cid:119)   |                     |          |                    |     |
|         |              |           |           |           |             |     | 16           | 0           | a                   |          | a                  |     |
|         |              |           |           |           |             |     | 0            |             | 0                   |          | 0                  |     |
|         |              |           |           |           |             |     | a 0          | 3           |                     |          |                    |     |
|         |              |           |           |           |             |     | = 3!         | = a         | .                   |          |                    |     |
0
|            |     |                |           |     |                  |     | 4            | 2           |                     |          |                    |     |
| ---------- | --- | -------------- | --------- | --- | ---------------- | --- | ------------ | ----------- | ------------------- | -------- | ------------------ | --- |
| Per trobar |     | la vari`ancia, | fem       | un  | c`alcul similar: |     |              |             |                     |          |                    |     |
|            |     |                |           | +∞  | 4                |     | 4            | +∞          |                     |          |                    |     |
|            |     | E[R2]          | =         | r2  | r2e−2r/a0dr      |     | =            | r4e−2r/a0dr |                     |          |                    |     |
|            |     |                | (cid:119) |     | a3               |     | a3 (cid:119) |             |                     |          |                    |     |
|            |     |                |           | 0   |                  |     |              | 0           |                     |          |                    |     |
|            |     |                |           |     | 0                |     | 0            |             |                     |          |                    |     |
|            |     |                |           |     |                  |     |              |             | (cid:18)2r(cid:19)4 |          | (cid:18)2r(cid:19) |     |
|            |     |                |           |     |                  |     | 4 a5         | +∞          |                     |          |                    |     |
|            |     |                |           |     |                  |     | =            | 0           |                     | e−2r/a0d |                    |     |
(cid:119)
|     |     |     |     |     |     |     | a3 32 | 0   | a   |     | a   |     |
| --- | --- | --- | --- | --- | --- | --- | ----- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     |     | 0     |     | 0   |     | 0   |     |
a2
|             |     |        |               |        |               |     | 04! | 3a2. |     |     |     |     |
| ----------- | --- | ------ | ------------- | ------ | ------------- | --- | --- | ---- | --- | --- | --- | --- |
|             |     |        |               |        |               |     | =   | =    |     |     |     |     |
|             |     |        |               |        |               |     | 8   |      | 0   |     |     |     |
| Per acabar, |     | trobem | la vari`ancia |        | fent servir   | que |     |      |     |     |     |     |
|             |     |        |               |        |               |     |     |      | 9   | 3   |     |     |
|             |     |        |               |        | E[R2]−(E[R])2 |     |     | 3a2− | a2  | a2. |     |     |
|             |     |        |               | Var[R] | =             |     | =   |      |     | =   |     |     |
|             |     |        |               |        |               |     |     | 0    | 4 0 | 4 0 |     |     |
3

3. Considereu la variable aleat`oria bidimensional (X,Y), uniforme en el triangle delimitat per les rectes:
| x = 0, y     | = 0, x+y | = 1.  |     |     |     |     |     |     |     |
| ------------ | -------- | ----- | --- | --- | --- | --- | --- | --- | --- |
| (a) Calculeu | P(X      | < Y). |     |     |     |     |     |     |     |
(b) Calculeu la funci´o de densitat de la variable Z = X +Y. Calculeu la seva esperanc¸a.
| (c) Calculeu | la  | funci´o | de densitat |     | de la variable | U   | = min(X,Y). |     |     |
| ------------ | --- | ------- | ----------- | --- | -------------- | --- | ----------- | --- | --- |
Resoluci´o
(a) Com que la recta x = y talla el triangle en dues parts iguals, tenim que P(X < Y) = 0.5.
(b) Calculem la funci´o de distribuci´o de Z. Clarament, si z ⩽ 0, F (z) = 0, i si z ⩾ 1, tenim que
Z
| F   | (z) = 1. | Si z est`a | entre | 0 i | 1, tenim: |     |     |     |     |
| --- | -------- | ---------- | ----- | --- | --------- | --- | --- | --- | --- |
z
|     |     |     |     |     |           | ⩽   |          | ⩽     |     |
| --- | --- | --- | --- | --- | --------- | --- | -------- | ----- | --- |
|     |     |     |     | F   | (z) = P(X | +Y  | z) = P(Y | z−X), |     |
Z
z2/2,
´es a dir el triangle petit que hi ha per sota de la recta x+y = z. La seva `area ´es per`o com
que la densitat de (X,Y) ´es 2, tenim que F (z) = z2 per a 0 < z < 1. Aix´ı doncs, la densitat ´es
Z
zero excepte a l’interval [0,1], on ´es la funci´o f (z) = 2z. L’esperan¸ca ´es
Z
2
1
|     |     |     |     |     |     | z·2zdz    | =   | .   |     |
| --- | --- | --- | --- | --- | --- | --------- | --- | --- | --- |
|     |     |     |     |     |     | (cid:119) | 3   |     |     |
0
(c) Un altre cop usem la funci´o de distribuci´o F (u), i observem que ´es zero per u < 0, i molt
U
important, tenim que F (u) = 1 sempre que u ⩾ 1/2, perqu`e una de les dues variables X o Y ´es
U
| sempre | menor | que | 1/2. | Aleshores, | per          | u ∈ [0,1/2], | tenim    | que   |       |
| ------ | ----- | --- | ---- | ---------- | ------------ | ------------ | -------- | ----- | ----- |
|        |       |     |      | F (u)      | = P[min(X,Y) | ⩽            | u] = P[X | ⩽ u∪Y | ⩽ u]. |
U
Aquestrecinte´estoteltriangleexcepteuntrianglepetit, ambv`ertexs(u,u), (u,1−u)i(1−u,u).
(1−2u)2/2.
L’`area del recinte ´es l’`area del triangle, 1/2, menys la del triangle petit Per tant,
|     |     |     |     |     |     |   (1−2u)2 | !   |     |     |
| --- | --- | --- | --- | --- | --- | --------- | --- | --- | --- |
1
|     |     |     |     | F   | (u) = 2 | −   |     | = 4u−4u2. |     |
| --- | --- | --- | --- | --- | ------- | --- | --- | --------- | --- |
U
|     |     |     |     |     |     | 2   | 2   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
I per tant, la funci´o de densitat ´es zero excepte en l’interval [0,1/2], on val f U (u) = 4−8u.
4

4. Les qu¨estions segu¨ents son independents (s’han d’entregar per separat).
λ2
(a) Unapoblaci´osegueixladistribuci´odelavariablealeat`oriaX ambdensitatf (x;λ) = xe−λx/2,
X
4
x ⩾ 0, on λ ´es un par`ametre desconegut. Donada una mostra X ,...,X de la nostra poblaci´o,
|     |     |     |     |     |     |     |     |     | 1   |     | n   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
doneu un estimador λb del para`metre mitjanc¸ant el m`etode de la m`axima versemblan¸ca.
(b) En els 380 partits de lliga s’han produ¨ıt 160 victo`ries de l’equip de casa. Trobeu un interval de
confian¸ca al 95% per a la probabilitat de que guanyi l’equip de casa en un partit de lliga.
(c) La mesura d’una determinada magnitud correspon a una variable aleat`oria X gaussiana. En cinc
mesures independents s’han obtingut els valors 2.8, 1.6, 2.1, 3.4, i 1.7. En principi, hauria de ser
E[X] = 2. Formuleu un test de cua dreta, basat en el valor P, per acceptar o rebutjar aquesta
hip`otesi. Quin seria el resultat del test si es fixa una significaci´o del 10%?
[Indicaci´o: Si F (x) denota la funci´o de distribuci´o d’una variable t de Student amb k graus de
k
llibertat, aleshores F (1) ≈ 0.818, F (2) ≈ 0.949, F (1) ≈ 0.813, F (2) ≈ 0.942.]
|     |     |     | 5   |     | 5   |     | 4   |     |     | 4   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Resoluci´o
| (a) La funci´o | de logversemblan¸ca |          |        | ´es            |                  |      |        |     |      |         |     |
| -------------- | ------------------- | -------- | ------ | -------------- | ---------------- | ---- | ------ | --- | ---- | ------- | --- |
|                |                     |          |        |                |                  |      |        |     |      |         | !   |
|                |                     |          |        |                |                  | n    |        | n   | λ2   |         |     |
|                |                     |          |        |                | X                |      |        | X   |      | e−λxj/2 |     |
|                |                     | L(x      | ,...,x | ;λ)            | =                | logf | (x ;λ) | =   | log  | x       |     |
|                |                     |          | 1      | n              |                  |      | X j    |     | 4    | j       |     |
|                |                     |          |        |                | j=1              |      |        | j=1 |      |         |     |
|                |                     |          |        |                |                  |      |        | n   |      |         | n   |
|                |                     |          |        |                |                  |      |        | X   |      | λ       | X   |
|                |                     |          |        |                | = 2nlogλ−2nlog2+ |      |        |     | logx | −       | x . |
|                |                     |          |        |                |                  |      |        |     |      | j 2     | j   |
|                |                     |          |        |                |                  |      |        | j=1 |      |         | j=1 |
| La seva        | derivada            | respecte |        | del par`ametre |                  | λ    | ´es    |     |      |         |     |
|                |                     |          |        |                |                  | ∂L   | 2n 1   | n   |      |         |     |
X
|     |     |     |     |     |     | =   | −   | x . |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     | ∂λ  | λ 2 | j   |     |     |     |
j=1
L’estimador λb que busquem ´es el que maximitza la logversemblan¸ca, per aix`o el trobem igualant
E´s
| la derivada | anterior | a   | zero. | a   | dir, | tenim | que |     |     |     |     |
| ----------- | -------- | --- | ----- | --- | ---- | ----- | --- | --- | --- | --- | --- |
4n
|     |     |     |     |     |     | λb  | = Pn | .   |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | ---- | --- | --- | --- | --- |
X
|     |     |     |     |     |     |     | j=1 | j   |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(b) Tenim que pˆ = 160/380 = 0.4211. Fent servir les f´ormules de l’interval de confianc¸a per a p,
| tenim | que l’interval | ´es |     |     |     |     |     |     |     |     |     |
| ----- | -------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
s
pˆ(1−pˆ)
|     |     |     |     | pˆ±z |     |     | = 0.4211±0.0496, |     |     |     |     |
| --- | --- | --- | --- | ---- | --- | --- | ---------------- | --- | --- | --- | --- |
◦
n
| ´es a dir | [0.3715,0.4707], |     | fent | servir | z   | = 1.96 | com correspon |     | al 95%. |     |     |
| --------- | ---------------- | --- | ---- | ------ | --- | ------ | ------------- | --- | ------- | --- | --- |
◦
(c) La mostra ´es de mida n = 5. Els valors presos per la mitjana mostral X i la desviaci´o t´ıpica
n
| mostral | σ han | estat |     |     |     |     |     |     |     |     |     |
| ------- | ----- | ----- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
bn
2.8+1.6+2.1+3.4+1.7
|     |     |     |     | x = |     |     |     |     | = 2.32 |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ------ | --- | --- |
5
i
s
(2.8−x)2+(1.6−x)2+(2.1−x)2+(3.4−x)2+(1.7−x)2
|     | s = |     |     |     |     |     |     |     |     |     | ≈ 0.766, |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | -------- |
4
respectivament.
.
Formulem un test per contrastar la hip`otesi nulla H 0 := {E[X] = 2} amb la alternativa H a :=
| {E[X] | > 2}. Sabem | que | si  | E[X] | = 2, | la variable |       |     |     |     |     |
| ----- | ----------- | --- | --- | ---- | ---- | ----------- | ----- | --- | --- | --- | --- |
|       |             |     |     |      |      |             | √ X   | −2  |     |     |     |
|       |             |     |     |      |      | T           | = n n |     |     |     |     |
σ
bn
´es t de Student amb 4 graus de llibertat. D’altra banda, el valor pres per T ha estat t∗ =
| √   |     | √   |     |     |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
n(x − 2)/s = 5(2.32 − 2)/0.766 ≈ 0.934. Aix´ı, el valor P que s’obt´e ´es P(T > t∗) =
(t∗) .
1−F 4 > 1−F 4 (1) ≈ 1−0.813 = 0.187. Amb aquest valor, donem per bona la hip`otesi nul la
H .
0
Amb una significaci´o del 10%, el llindar de decisi´o correspon al valor cr´ıtic t tal que P(T > t ) =
c c
.
0.1. Com que P(T > t∗) > 0.187, concloem que t∗ < t , i tampoc rebutgem la hip`otesi nul la.
c
5
