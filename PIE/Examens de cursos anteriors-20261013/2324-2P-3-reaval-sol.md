Enginyeria de Telecomunicaci´o (GRETST) • Probabilitat i Estad´ıstica
| 3   | juliol 2024 |     |     |     |     | Examen | de  | reavaluaci´o |     |     |     |     | Temps: 3h |
| --- | ----------- | --- | --- | --- | --- | ------ | --- | ------------ | --- | --- | --- | --- | --------- |
Notes provisionals: 10 de juliol, Atenea Revisi´o d’examen: 12 de juliol, 11:00 hores
| Tots   | els problemes   | tenen | el                 | mateix | pes |     |     |     |     |     |     |     |     |
| ------ | --------------- | ----- | ------------------ | ------ | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1. Les | dues qu¨estions |       | s´on independents. |        |     |     |     |     |     |     |     |     |     |
(a) Llancemunamonedajusta3vegadesi, acontinuaci´o, tiremundauequilibrattantesvegadescom
P(B).
cares han sortit. Diem B a l’esdeveniment «no ha sortit la cara ‘sis’ del dau». Calculeu
Si B ha succe¨ıt, quant val la probabilitat que hagi sortit almenys una cara en els llanc¸aments de
|     | la moneda? |     |     |     |     |     |     |     |     |     |     |     |     |
| --- | ---------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(b) Siguin A, B, C tres esdeveniments tals que A´es independent de B, de C, i de B∩C. Demostreu
|     | que A ´es | independent |     | de B∪C. |     |     |     |     |     |     |     |     |     |
| --- | --------- | ----------- | --- | ------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Resoluci´o
(a) Sigui A l’esdeveniment «surten k cares en els 3 llan¸caments de la moneda». Per tant,
k
  !
|     |     |     |     |     |     |     | 3   | 1   |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     | P(A |     |     | ⩽   | ⩽   |     |     |     |
|     |     |     |     |     |     | k ) | =   | ,   | 0 k | 3.  |     |     |     |
|     |     |     |     |     |     |     | k   | 23  |     |     |     |     |     |
Aleshores, si B ´es l’esdeveniment «no surt la cara ‘sis’ en cap de les tirades del dau», P(B|A ) =
k
(5/6)k,
|     | i   | tenim |     |     |     |     |     |     |     |     |     |     |     |
| --- | --- | ----- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
3
|     |     |     | P(B) |     | XP(B|A |     | )P(A |     |     |     |     |     |     |
| --- | --- | --- | ---- | --- | ------ | --- | ---- | --- | --- | --- | --- | --- | --- |
|     |     |     |      | =   |        |     | k k  | )   |     |     |     |     |     |
k=0
|     |     |     |     |     |                      |   ! |     | !   |                    |   !  |                      | !!  |     |
| --- | --- | --- | --- | --- | -------------------- | --- | --- | --- | ------------------ | ---- | -------------------- | --- | --- |
|     |     |     |     |     | 1                    | 3   | 5   | 3   | (cid:18)5(cid:19)2 | 3    | (cid:18)5(cid:19)3 3 |     |     |
|     |     |     |     | =   | 1·                   |     | +   | +   |                    | +    |                      |     |     |
|     |     |     |     |     | 23                   | 0   | 6   | 1   | 6                  | 2    | 6 3                  |     |     |
|     |     |     |     |     | 1+15/6+75/36+125/216 |     |     |     |                    | 1331 |                      |     |     |
|     |     |     |     | =   |                      |     |     |     | =                  |      | ≈ 0.7703.            |     |     |
|     |     |     |     |     |                      |     | 8   |     |                    | 1728 |                      |     |     |
Si no ha sortit la cara “sis’, la probabilitat que en els llanc¸aments de la moneda hagi sortit
|     | almenys | una cara | val |       |       |     |      |     |     |      |      |           |     |
| --- | ------- | -------- | --- | ----- | ----- | --- | ---- | --- | --- | ---- | ---- | --------- | --- |
|     |         |          |     |       | P(B|A |     | )P(A | )   |     | 1/23 | 1115 |           |     |
|     |         | 1−P(A    |     | |B) = | 1−    |     | 0    | 0 = | 1−  |      | =    | ≈ 0.8377. |     |
0
|     |     |     |     |     |     | P(B) |     |     | 1331/1728 |     | 1331 |     |     |
| --- | --- | --- | --- | --- | --- | ---- | --- | --- | --------- | --- | ---- | --- | --- |
(b) Tenim
|     |     |     | P(A∩(B∪C)) |     |     | P((A∩B)∪(A∩C)) |     |     |     |     |     |     |     |
| --- | --- | --- | ---------- | --- | --- | -------------- | --- | --- | --- | --- | --- | --- | --- |
=
= P(A∩B)+P(A∩C)−P(A∩B∩C)
= P(A)P(B)+P(A)P(C)−P(A)P(B∩C)
P(A)(P(B)+P(C)−P(B∩C))
=
= P(A)P(B∪C).
Aix´ı, doncs, com que es compleix P(A ∩ (B ∪ C)) = P(A)P(B ∪ C), podem afirmar que els
|     | esdeveniments |     | A i B∪C | s´on | independents. |     |     |     |     |     |     |     |     |
| --- | ------------- | --- | ------- | ---- | ------------- | --- | --- | --- | --- | --- | --- | --- | --- |
1

x+1
2. Considerem una variable aleat`oria X amb funci´o de densitat f (x) = en l’interval [−1,1].
|     |     |     |     |     |     |     |     |     |     | X   | 2   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
X2.
(a) Calculeu les funcions de distribuci´o i de densitat de la variable Y =
X3.
| (b) Calculeu |     | la densitat | de     | la variable |     | Z = |     |     |     |     |     |     |     |
| ------------ | --- | ----------- | ------ | ----------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|              |     | P(Y         | 1      |             |     |     |     |     |     |     |     |     |     |
| (c) Calculeu |     |             | > |Z > | 0).         |     |     |     |     |     |     |     |     |     |
4
(d) Digueu per a quins valors de a les variables Y i Y+aZ s´on incorrelades.
Resoluci´o
(a) Com que X pren valors en [−1,1], la variable aleat`oria Y = X2 pren valors en [0,1]. Per tant, si
|     |     |     |     | P(Y | ⩽   |     | ⩾   |     |     |     | P(Y ⩽ |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ----- | --- | --- |
y < 0, llavors F Y (y) = y) = 0, i si y 1, aleshores F Y (y) = y) = 1.
⩽
| Si     | 0 y | < 1,  |                  |      |       |          |     |      |             |       |             |     |      |
| ------ | --- | ----- | ---------------- | ---- | ----- | -------- | --- | ---- | ----------- | ----- | ----------- | --- | ---- |
|        |     |       |                  |      |       |          |     |      | √           |       | √           |     |      |
|        |     |       |                  |      | √     |          | √   |      | y           |       | y           | x+1 | √    |
|        | F   | (y) = | P(Y ⩽            | y) = | P(−   | y ⩽ X    | ⩽   | y) = | f           | (x)dx | =           | dx  | = y. |
|        |     | Y     |                  |      |       |          |     |      | (cid:119) √ | X     | (cid:119) √ |     |      |
|        |     |       |                  |      |       |          |     |      | − y         |       | − y         | 2   |      |
| Aix´ı, | si  | 0 < y | < 1, la densitat |      | de la | variable | Y   | ´es  |             |       |             |     |      |
1
|     |     |                 |     |     |     | f (y) | =   | F′ (y) | = √ | ,   |     |     |     |
| --- | --- | --------------- | --- | --- | --- | ----- | --- | ------ | --- | --- | --- | --- | --- |
|     |     |                 |     |     |     | Y     |     | Y      | 2   | y   |     |     |     |
| i f | (y) | = 0, altrament. |     |     |     |       |     |        |     |     |     |     |     |
Y
(b) La funci´o g(x) = x3 ´es mon`otona creixent i derivable, amb derivada g′(x) = 3x2. L’equaci´o
√
z = g(x) t´e soluci´o u´nica x = 3 z. Aix´ı, la densitat de la variable Z = X3 ve donada per
√
|     |     |       | (x)(cid:12) |          |     |          |     | (cid:18) |       | (cid:19) |          |        |       |
| --- | --- | ----- | ----------- | -------- | --- | -------- | --- | -------- | ----- | -------- | -------- | ------ | ----- |
|     |     |       | f           | (cid:12) |     | 3 z+1    |     | 1 1      |       | 1        |          |        |       |
|     |     | f (z) | = X         |          | =   | √        | =   | √        | + √   |          | , −1 < z | < 1, z | ̸= 0. |
|     |     | Z     |             | (cid:12) |     |          |     |          |       |          |          |        |       |
|     |     |       | |g ′(x)|    | (cid:12) | √   | 6( 3 z)2 |     | 6 3      | z ( 3 | z)2      |          |        |       |
x=3z
| (c) Expressant |          | Y   | i Z a partir | de            | X, tenim |        |     |     |     |        |              |     |     |
| -------------- | -------- | --- | ------------ | ------------- | -------- | ------ | --- | --- | --- | ------ | ------------ | --- | --- |
|                | (cid:18) |     |              | (cid:19) P(X2 |          | 1/4,X3 |     |     | P(X |        | 1 (x+1)/2dx  |     |     |
|                |          |     | 1            |               | >        |        | >   | 0)  |     | > 1/2) | (cid:114)1/2 |     | 7   |
|                | P        | Y > | |Z > 0       | =             |          |        |     | =   |     |        | =            |     | = . |
|                |          |     |              |               | P(X3     |        |     |     | P(X |        | 1            |     |     |
|                |          |     | 4            |               |          | >      | 0)  |     |     | > 0)   | (x+1)/2dx    |     | 12  |
(cid:114)0
(d) Hem de trobar els valors de a per als que Cov[Y,Y +aZ] = 0. Tenim
Cov[Y,Y +aZ] = E[Y(Y +aZ)]−E[Y]E[Y +aZ] = E[Y2]+aE[YZ]−(E[Y])2−aE[Y]E[Z]
E[X4]+aE[X5]−(E[X2])2−aE[X2]E[X3].
=
| D’altra |     | banda, | aplicant | el teorema |     | de l’esperanc¸a, |       |     |           |      |     |     |     |
| ------- | --- | ------ | -------- | ---------- | --- | ---------------- | ----- | --- | --------- | ---- | --- | --- | --- |
|         |     |        |          |            |     | 1                | x3+x2 |     | 1         |      | 1   |     |     |
|         |     |        |          | E[X2]      |     |                  |       |     |           | x2dx |     |     |     |
|         |     |        |          |            |     | =                |       | dx  | =         |      | = , |     |     |
|         |     |        |          |            |     | (cid:119)        | 2     |     | (cid:119) |      | 3   |     |     |
|         |     |        |          |            |     | −1               |       |     | 0         |      |     |     |     |
|         |     |        |          |            |     | 1                | x4+x3 |     | 1         |      | 1   |     |     |
|         |     |        |          | E[X3]      |     | =                |       | dx  | =         | x4dx | = , |     |     |
|         |     |        |          |            |     | (cid:119)        |       |     | (cid:119) |      |     |     |     |
|         |     |        |          |            |     | −1               | 2     |     | 0         |      | 5   |     |     |
x5+x4
|     |     |     |     |       |     | 1           |       |     | 1           |      | 1   |     |     |
| --- | --- | --- | --- | ----- | --- | ----------- | ----- | --- | ----------- | ---- | --- | --- | --- |
|     |     |     |     | E[X4] |     | =           |       | dx  | =           | x4dx | = , |     |     |
|     |     |     |     |       |     | (cid:119)   | 2     |     | (cid:119)   |      | 5   |     |     |
|     |     |     |     |       |     | −1          |       |     | 0           |      |     |     |     |
|     |     |     |     |       |     | 1           | x6+x5 |     | 1           |      | 1   |     |     |
|     |     |     |     | E[X5] |     |             |       |     |             | x6dx |     |     |     |
|     |     |     |     |       |     | = (cid:119) |       | dx  | = (cid:119) |      | = . |     |     |
|     |     |     |     |       |     | −1          | 2     |     | 0           |      | 7   |     |     |
Per tant,
|     |     |     |         |      |     | 1   | a   | 1    | a 4 | 8a  | 28+24a |     |     |
| --- | --- | --- | ------- | ---- | --- | --- | --- | ---- | --- | --- | ------ | --- | --- |
|     |     |     | Cov[Y,Y | +aZ] | =   | +   | −   | −    | =   | +   | =      | ,   |     |
|     |     |     |         |      |     | 5   | 7   | 9 15 | 45  | 105 | 315    |     |     |
d’on dedu¨ım que les variables aleat`ories Y i Y +aZ s´on incorrelades si i nom´es si a = −7/6.
2

3. Siguin X i Y variables aleat`ories exponencials de par`ametre 1 i independents, i siguin
√ q
U = XY , V = X/Y .
.
(a) Trobeu la funci´o de densitat conjunta de U i V, indicant la regi´o on no s’anulla.
(b) Determineu la densitat marginal de la variable V.
(c) Sigui A l’esdeveniment X ⩾ kY, on k > 0 ´es una constant. Representeu-lo en l’espai (x,y) i
calculeu la seva probabilitat utilitzant f (x,y). Tot seguit representeu A en l’espai (u,v) i
XY
calculeu de nou la seva probabilitat utilitzant f (u,v).
UV
Resoluci´o
(a) ComquelesvariablesX iY s´onexponencialsdepar`ametreλ = 1iindependents, lasevadensitat
conjunta ´es f (x,y) = f (x)f (y) = e−(x+y) si x,y ⩾ 0.
XY X Y
√ p
El sistema associat a la transformaci´o que defineix U i V, {u = xy, v = x/y}, t´e per a
u,v > 0 una u´nica soluci´o x = uv, y = u/v, i defineix una aplicaci´o bijectiva de Q = {(x,y) ∈
R2: x > 0,y > 0} en Q′ = {(u,v) ∈ R2: u > 0,v > 0}.
D’altra banda,
(cid:12) (cid:12)
(cid:12) 1x−1/2y1/2 1x1/2y−1/2 (cid:12) 1 1 1
J(x,y) = (cid:12) (cid:12) 2 2 (cid:12) (cid:12) = − y−1− y−1 = − .
(cid:12) 1x−1/2y−1/2 −1x1/2y−3/2 (cid:12) 4 4 2y
(cid:12) 2 2 (cid:12)
Aix´ı, si u > 0 i v > 0,
f(x,y) (cid:12) 2u
f UV (u,v) = (cid:12) (cid:12) = e−u(v+1/v).
|J(x,y)|(cid:12) v
(x=uv,y=u/v)
(b) La densitat marginal de V val
∞ ∞ 2u
f (v) = f (u,v)du = e−u(v+1/v)du
V (cid:119) UV (cid:119)
−∞ 0 v
2 ∞ 2 1 2v
= u(v+1/v)e−u(v+1/v)du = · = , v ⩾ 0,
v(v+1/v) (cid:119) 0 v(v+1/v) (v+1/v) (v2+1)2
on el valor de la u´ltima integral correspon a l’esperanc¸a d’una variable aleat`oria exponencial de
par`ametre λ = v+1/v.
(c) La probabilitat de l’esdeveniment A ´es P(A) = P(X ⩾ kY) = P((X,Y) ∈ S), on S = {(x,y) ∈
R2: x ⩾ ky}. Per tant,
∞ (cid:18) ∞ (cid:19) ∞ 1
P(A) = f (x,y)dxdy = e−y e−xdx dy = e−(k+1)ydy = .
(cid:120) XY (cid:119) (cid:119) (cid:119)
0 ky 0 k+1
S
√
Equivalentment, A´es l’esdeveniment V ⩾ k i correspon en el pla (u,v) a la regi´o S′ = {(u,v) ∈
√
R2: v ⩾ k}. Aix´ı,
P(A) = P((U,V) ∈ S′) = f (u,v)dudv
(cid:120) UV
S′
∞ (cid:16) ∞ (cid:17) ∞ ∞ 2v ∞ 1 1
= (cid:119)√ k (cid:119) 0 f UV (u,v)du dv = (cid:119)√ k f V (v)dv = (cid:119)√ k (v2+1)2 dv = (cid:119) k+1 t2 dt = k+1 .
3

4. Es tenen dues poblacions independents caracteritzades per variables poblacionals X i Y, respectiva-
ment, que so´n gaussianes tals que E[X] = 0, E[Y] = 1, i Var[X] = Var[Y] = θ, on θ > 0 ´es un
par`ametre desconegut.
Apartird’unamostraaleat`oria(X ,...,X ;Y ,...,Y ),obteniul’estimadordem`aximaversemblanc¸a
1 n 1 m
de θ. Determineu si aquest estimador ´es o no esbiaixat, i calculeu el seu error quadr`atic mitj`a.
[Indicaci´o: si Z ∼ N(0,1), aleshores Var[Z2] = 2.]
Resoluci´o
Com que X ∼ N(0,θ) i Y ∼ N(1,θ), les seves densitats s´on
1 1
f (x;θ) = √ e−x2/2θ, f (x;θ) = √ e−(y−1)2/2θ,
X Y
2πθ 2πθ
i la funci´o de versemblanc¸a relativa a la mostra ´es
n m
Y Y
L(θ;x ,...,x ,y ,...,y ) = f (x ;θ) f (y ;θ)
1 n 1 m X i Y j
i=1 j=1
1 Pn i=1 x2 i +Pm j=1 (y j −1)2!
= exp − .
(2πθ)(n+m)/2 2θ
Ometent per simplicitat la depend`encia en x ,...,x ,y ,...,y , el seu logaritme ´es:
1 n 1 m
 
ℓ(θ) = − n+ 2 m log(2π)− n+ 2 m logθ− 2 1 θ  X n x2 i + X m (y j −1)2 .
i=1 j=1
Per tal de maximitzar el seu valor en busquem els punts cr´ıtics resolent ℓ′(θ) = 0:
 
ℓ′(θ) = − n+ 2θ m + 2 1 θ2  X n x2 i + X m (y j −1)2  = 0,
i=1 j=1
 
n m
que t´e una u´nica soluci´o θ∗ =  X x2 i + X (y j −1)2 /(n+m).
i=1 j=1
En aquest punt ℓ(θ) assoleix un m`axim absolut; aix`o es pot comprovar veient que ℓ′′(θ∗) < 0, o que
ℓ(θ) tendeix a −∞ tant quan θ → 0 com quan θ → +∞.
Aix´ı, l’estimador de m`axima versemblanc¸a, Θb, del par`ametre θ ´es:
 
Θb = n+ 1 m  X n X i 2+ X m (Y j −1)2 .
i=1 j=1
L’estimador no ´es esbiaixat ja que la seva esperanc¸a val
 
E h Θb i = n+ 1 m  X n E h X i 2 i + X m E h (Y j −1)2 i  = nVar[X n ] + + m mVar[Y] = n n θ+ + m m θ = θ.
i=1 j=1
L’error quadr`atic mitj`a de Θb ´es:
 
E (cid:20)(cid:16) Θb −θ (cid:17)2 (cid:21) = Var h Θb i = (n+ 1 m)2  X n Var h X i 2 i + X m Var h (Y j −1)2 i 
i=1 j=1
nVar (cid:2) X2(cid:3) +mVar (cid:2) (Y−1)2(cid:3) n2θ2+m2θ2 2θ2
= = = .
n+m (n+m)2 n+m
√
En aquest c`alcul s’ha usat que la variable Z = X/ θ ´es normal est`andard, i, d’acord amb la indicaci´o,
√
Var[Z2] = 2. Per tant, Var[X2] = Var[θZ2] = θ2Var[Z2] = 2θ2. An`alogament amb (Y−1)/ θ.
4
