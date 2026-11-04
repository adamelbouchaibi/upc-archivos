Enginyeria de Telecomunicaci´o (GRETST) • Probabilitat i Estad´ıstica
| 17 juny | 2025 |     |     |     | Examen | final |     |     |     | Temps: |     | 2h 15min |
| ------- | ---- | --- | --- | --- | ------ | ----- | --- | --- | --- | ------ | --- | -------- |
Notes provisionals: 24 juny 2025 Revisi´o d’examen: 25 de juny, 12:00 a 13:30
| No es pot | usar calculadora |     |     |     |     |     |     | Els | problemes | tenen | el mateix | pes |
| --------- | ---------------- | --- | --- | --- | --- | --- | --- | --- | --------- | ----- | --------- | --- |
1. Els conjunts de s´ımbols d’entrada i de sortida d’un canal de comunicaci´o s´on {a,b} i {0,1,r}, respec-
tivament. En cada transmissi´o, la probabilitat d’enviar el s´ımbol a ´es la mateixa que la d’enviar el
s´ımbol b. Sabem que P(rebre 0|s’envia a) = P(rebre 1|s’envia b) = 1− α, on 0 < α < 1. Sabem
| tamb´e que | P(rebre | r|s’envia |     | a) = α/2 | i P(rebre | r|s’envia | b) = α/3. |     |     |     |     |     |
| ---------- | ------- | --------- | --- | -------- | --------- | --------- | --------- | --- | --- | --- | --- | --- |
(a) Si s’ha rebut el s´ımbol r, calculeu les probabilitats d’haver enviat a i d’haver enviat b, respecti-
vament
(b) Si s’han fet n transmissions independents, calculeu el nombre esperat de zeros que cont´e la
| sequ¨`encia |     | rebuda. |     |     |     |     |     |     |     |     |     |     |
| ----------- | --- | ------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Resoluci´o
| (a) Si | s’ha rebut | r, la  | probabilitat          | d’haver    | enviat | a val: |               |     |         |     |     |     |
| ------ | ---------- | ------ | --------------------- | ---------- | ------ | ------ | ------------- | --- | ------- | --- | --- | --- |
|        |            |        |                       | P(r|a)P(a) |        |        | P(r|a)        |     |         | α/2 | 3   |     |
|        |            | P(a|r) | =                     |            |        | =      |               |     | =       |     | = , |     |
|        |            |        | P(r|a)P(a)+P(r|b)P(b) |            |        |        | P(r|a)+P(r|b) |     | α/2+α/3 |     | 5   |     |
| i,     | per tant,  |        |                       |            |        |        |               |     |         |     |     |     |
2
|     |     |     |     |     | P(b|r) | = 1−P(a|r) | =   | .   |     |     |     |     |
| --- | --- | --- | --- | --- | ------ | ---------- | --- | --- | --- | --- | --- | --- |
5
(b) La probabilitat de rebre 0 si s’envia a val P(0|a) = 1−α. D’altra banda, la probabilitat de rebre
| 0 si | s’envia | b val |     |     |     |     |     |     |     |     |     |     |
| ---- | ------- | ----- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|      |         |       |     |     |     |     |     |     |     |     | α   | 2   |
P(0|b) = 1−(P(rebre 1|s’envia b)+P(rebre r|s’envia b)) = 1−(1−α)− = α.
|        |                 |      |                         |         |     |     |          |     |          |        | 3   | 3   |
| ------ | --------------- | ---- | ----------------------- | ------- | --- | --- | -------- | --- | -------- | ------ | --- | --- |
| Aix´ı, | la probabilitat |      | de                      | rebre 0 | val |     |          |     |          |        |     |     |
|        |                 |      |                         |         |     |     | (cid:18) |     | (cid:19) |        |     |     |
|        |                 |      |                         |         |     |     | 1        | 2   | 1        |        |     |     |
|        |                 | P(0) | = P(0|a)P(a)+P(0|b)P(b) |         |     | =   | (1−α)+   |     | α =      | (3−α). |     |     |
|        |                 |      |                         |         |     |     | 2        | 3   | 6        |        |     |     |
El nombre X de zeros rebuts en una sequ¨`encia de n transmissions independents ´es una variable
| Bin(n,p | =   | P(0)). | Per tant, |     |     |     |     |     |     |     |     |     |
| ------- | --- | ------ | --------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
n
|     |     |     |     |     | E[X] | = np = | (3−α). |     |     |     |     |     |
| --- | --- | --- | --- | --- | ---- | ------ | ------ | --- | --- | --- | --- | --- |
6
1

| 2. Sigui | X ∼ | Unif(0,a). |     |     |     |     |     |     |     |     |     |
| -------- | --- | ---------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(a) Calculeu la funci´o de distribuci´o de Y = X2, i representeu-la gr`aficament.
| (b) | Calculeu | la           | funci´o | de densitat |     | de Y. |     |     |     |     |     |
| --- | -------- | ------------ | ------- | ----------- | --- | ----- | --- | --- | --- | --- | --- |
| (c) | Calculeu | l’esperanc¸a |         | de          | Y.  |       |     |     |     |     |     |
Resoluci´o
(a) La densitat de X ´es constant, f (x) = 1/a en [0,a]. Per tant la seva funci´o de distribuci´o ´es
X
|     |     |     |     |     |     |     |     |     | ⩽ ⩽ |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
F (x) = 0 si x < 0, F (x) = x/a si 0 x a, F (x) = 1 si x > a.
|     |     |     | X   |     |     |      | X   |     |     | X   |     |
| --- | --- | --- | --- | --- | --- | ---- | --- | --- | --- | --- | --- |
|     |     |     |     |     | ⩽   | P(X2 | ⩽   |     |     |     | ⩾   |
Amb aix`o F (y) = P(Y y) = y), que val zero si y < 0, i, si y 0, es pot expressar
|     | √   |       | Y √ |      | √       |     |       |     |     |     |     |
| --- | --- | ----- | --- | ---- | ------- | --- | ----- | --- | --- | --- | --- |
|     | P(− | y ⩽ X | ⩽   | y) = | F ( y). | Per | tant, |     |     |     |     |
X
√
F (y) = 0 si y < 0, F (y) = y/a si 0 ⩽ y ⩽ a2, F (y) = 1 si y > a2.
|     |     | Y   |     |     |     | Y   |     |     |     | Y   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
F′
| (b) | Derivant | obtenim |     | f Y (y) | =   | (y), o | sigui |     |     |     |     |
| --- | -------- | ------- | --- | ------- | --- | ------ | ----- | --- | --- | --- | --- |
Y
√
a2,
|     |     |     |     | f Y (y) | = 1/2a | y   | si 0 < | y < | f Y (y) = | 0 altrament. |     |
| --- | --- | --- | --- | ------- | ------ | --- | ------ | --- | --------- | ------------ | --- |
(c) Pel teorema de l’esperanc¸a E[Y] = E[X2] = dxf (x)x2 = a dx x2 = a2 .
|     |     |     |     |     |     |     |     | (cid:114)R X | (cid:114)0 | a   | 3   |
| --- | --- | --- | --- | --- | --- | --- | --- | ------------ | ---------- | --- | --- |
2

3. La densitat conjunta de les variables aleat`ories cont´ınues X i Y ´es:
a2
f (x,y) = e−ax, x > 0, −x < y < x,
XY
2
on a > 0 ´es un par`ametre.
(a) Determineu les densitats marginals de X i de Y, i la densitat condicionada f (y|X = x),
Y|X
indicant en cada cas el domini de validesa.
(b) Calculeu el coeficient de correlaci´o entre X i Y. S´on les variables X i Y independents?
Resoluci´o
(a) Dibuixant la regi´o on f t´e el seu suport es determinen les integrals a calcular. Les densitats
XY
marginals s´on:
∞ a2 x
f (x) = dyf (x,y) = e−ax dy = a2xe−ax, x > 0;
X (cid:119) XY (cid:119)
−∞ 2 −x
∞ ∞ a2 a
f (y) = dxf (x,y) = dx e−ax = e−a|y|, −∞ < y < ∞.
Y (cid:119) XY (cid:119)
−∞ |y| 2 2
La densitat condicionada f (y|X = x) est`a ben definida quan x > 0, i val
Y|X
f (x,y) a2 e−ax 1
f (y|X = x) = XY = 2 = , −x < y < x.
Y|X f (x) a2xe−ax 2x
X
(b) Calculem primer la covari`ancia de X i Y: Cov(X,Y) = E(XY) − E(X)E(Y). Mitjan¸cant el
teorema de l’esperan¸ca i el teorema de Fubini tenim
+∞ a2 x
E(XY) = dxdyf (x,y)xy = dx e−axx dyy,
(cid:120) XY (cid:119) (cid:119)
0 2 −x
R2
.
pero` aquesta integral ´es nulla perqu`e ho ´es la integral respecte a y.
D’altra banda, tamb´e E(Y) = 0, perqu`e la densitat de Y ´es una funci´o parella.
En conclusi´o, la covari`ancia ´es zero, i per tant tamb´e el coeficient de correlaci´o: ρ = 0.
XY
Tanmateix, X i Y no s´on independents, ja que `obviament f (x,y) ̸= f (x)f (y).
XY X Y
3

4. Un model estad´ıstic est`a descrit per una variable aleat`oria X amb funci´o de densitat
 2
 √ e−x2/θ, si x ⩾ 0,
f (x) = πθ
X
0,
altrament,
on θ > 0 ´es un par`ametre.
Determineu l’estimador de m`axima versemblan¸ca del par`ametre θ. Demostreu que es tracta d’un
estimador no esbiaixat i calculeu el seu error quadr`atic mitj`a.
[Indicaci´o: Podeu utilitzar E[X2n] = (θ/2)n(2n−1)!!, on (2n−1)!! = (2n−1)(2n−3)···3·1.]
Resoluci´o
Com que la densitat de la variable X ´es
2
f (x|θ) = √ e−x2/θ, x > 0,
X
πθ
donats els valors x ,...,x presos per les variables X ,...,X de la mostra aleat`oria, el logaritme de
1 n 1 n
la funci´o de versemblan¸ca ´es
n
X
L (θ) ≡ L (x ,...,x ;θ) = logf (x |θ)
n n 1 n X i
i=1
= X n log2− 1 logπ− 1 logθ− x2 i ! = nlog2− n logπ− n logθ− X n x2 i .
2 2 a 2 2 θ
i=1 i=1
Plantejant l’equaci´o
∂L n (θ) = − n + 1 X n x2 = 0
∂θ 2θ θ2 i
i=1
obtenim el valor θ∗ = (cid:0) 2Pn x2(cid:1) /n que maximitza L (θ). Per tant, l’estimador buscat ´es
i=1 i n
2
(cid:0) X2+···+X2(cid:1)
Θbn = 1 n .
n
L’esperanc¸a de l’estimador val
E h Θbn i = E "
n
2 X n X
i
2 # =
n
2 X n E[X
i
2] = 2E[X2] = θ,
i=1 i=1
on s’ha usat la indicaci´o amb n = 1,´es a dir, E[X2] = θ/2. Aix´ı, doncs, l’estimador Θbn ´es no esbiaixat.
(cid:20)(cid:16) (cid:17)2 (cid:21)
En ser l’estimador no esbiaixat, el seu error quadr`atic mitj`a, E Θbn −θ , coincideix amb la seva
vari`ancia:
Var h Θbn i = Var "
n
2 X n X
i
2 # =
n
4
2
X n Var[X
i
2] =
n
4 Var[X2]
i=1 i=1
!
4 (cid:16) (cid:17) 4 3θ2 θ2 2θ2
= E[X4]−E[X2]2 = − = .
n n 4 4 n
(En la segona igualtat s’ha tingut en compte que les variables aleat`ories X2, 1 ⩽ i ⩽ n, s´on indepen-
i
dents, i en la quarta s’ha usat la indicaci´o amb n = 2, ´es a dir, E[X4] = 3θ2/4.)
4
