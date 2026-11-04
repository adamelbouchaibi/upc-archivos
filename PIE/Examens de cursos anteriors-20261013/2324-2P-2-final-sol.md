Enginyeria de Telecomunicaci´o (GRETST) • Probabilitat i Estad´ıstica
| 13 juny | 2024 |     |     |     |     | Examen |     | final |     |     |     |     | Temps: 3h |
| ------- | ---- | --- | --- | --- | --- | ------ | --- | ----- | --- | --- | --- | --- | --------- |
Notes provisionals: 21 de juny, Atenea Revisi´o d’examen: 25 de juny de 11:00 a 13:00
| Tots els | problemes | tenen | el mateix | pes |     |     |     |     |     |     |     |     |     |
| -------- | --------- | ----- | --------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
.
1. L’administraci´o d’un pa´ıs colonitzat organitza un refer`endum sobre la installaci´o d’una base militar
.
estrangera. A la sortida dels collegis electorals una empresa de sondeigs demana (an`onimament) als
| ciutadans | qu`e | han votat. |     |     |     |     |     |     |     |     |     |     |     |
| --------- | ---- | ---------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Segons refer`endums previs similars, se sap que, quan se’ls enquesta, els que voten S´I diuen la veritat
un 90% de les vegades, mentre que els que voten NO diuen la veritat un 30% de les vegades.
(a) L’empresa de sondeigs fa pu´blic que el 78% dels enquestats afirma haver votat S´I. ¿Quin percen-
S´I
tatge de vots podem esperar que hi hagi quan es faci l’escrutini de les votacions?
| Un cop | fet l’escrutini |     | s’obt´e un | 40% | de vots | afirmatius. |     |     |     |     |     |     |     |
| ------ | --------------- | --- | ---------- | --- | ------- | ----------- | --- | --- | --- | --- | --- | --- | --- |
|        |                 |     |            | S´I |         |             |     |     |     |     |     |     | S´I |
(b) Si un ciutad`a ha contestat al sondeig, quina ´es la probabilitat que hagi votat a l’urna?
(c) Considerem una urna amb moltes paperetes. Quina ´es la probabilitat que, de les 10 primeres
S´I?
| paperetes |     | escrutades, | almenys |     | 3 siguin |     |     |     |     |     |     |     |     |
| --------- | --- | ----------- | ------- | --- | -------- | --- | --- | --- | --- | --- | --- | --- | --- |
(d) En la mateixa urna, quin ´es el nombre esperat de paperetes que cal escrutar fins que s’obtenen
20 S´I?
Nota: en tot el problema estem suposant que els u´nics vots possibles s´on S´I/NO.
Resoluci´o
(a) Sigui p = P(votar S´I) la proporci´o de vots afirmatius despr´es de l’escrutini, de manera que 1−p
|     |     |     |     |     |     |     | P(dir | S´I|votar | S´I) |     | P(dir | S´I|votar |     |
| --- | --- | --- | --- | --- | --- | --- | ----- | --------- | ---- | --- | ----- | --------- | --- |
´es la proporci´o de vots negatius. Com que = 0.9 i NO) = 0.7,
| per          | la f´ormula | de          | la probabilitat |           | total     |             |             |            |           |         |            |           |     |
| ------------ | ----------- | ----------- | --------------- | --------- | --------- | ----------- | ----------- | ---------- | --------- | ------- | ---------- | --------- | --- |
|              |             | P(dir       | S´I) P(dir      | S´I|votar |           | S´I)P(votar |             | S´I)+P(dir | S´I|votar |         | NO)P(votar |           |     |
|              |             |             | =               |           |           |             |             |            |           |         |            | NO),      |     |
| tenim        | que         | 0.78 =      | 0.9p+0.7(1−p),  |           | d’on      | s’obt´e     | que         | p =        | 0.4.      |         |            |           |     |
| (b) Aplicant |             | la f´ormula | de Bayes        |           |           |             |             |            |           |         |            |           |     |
|              |             |             |                 | P(dir     | S´I|votar |             | S´I)P(votar |            | S´I)      | 0.9·0.4 | 6          |           |     |
|              |             | P(votar     | S´I|dir S´I)    | =         |           |             |             |            |           | =       | =          | ≈ 0.4615. |     |
|              |             |             |                 |           |           | P(dir       | S´I)        |            |           | 0.78    | 13         |           |     |
(Observaci´o: el 0.78 del denominador es pot calcular, per`o precisament ´es el percentatge de
l’apartat anterior, ja que el 40% de vots afirmatius ´es el que s’ha obtingut a l’apartat anterior.)
(c) L’extracci´o d’una papereta de l’urna ´es un experiment de Bernouilli on la probabilitat de S´I
´es p = 0.4. Assumint que el nombre de paperetes que s’escruten ´es molt gran, l’extracci´o de
cadascuna d’elles ´es independent, i per tant el nombre de paperetes afirmatives d’entre les 10
primeres escrutades segueix una distribuci´o binomial Binom(n = 10,p = 0.4). Anomenant S el
S´I
| nombre |     | de en                  | 10 extraccions, |     |     |     |          |          |          |           |          |           |           |
| ------ | --- | ---------------------- | --------------- | --- | --- | --- | -------- | -------- | -------- | --------- | -------- | --------- | --------- |
|        |     |                        |                 |     |     |     | (cid:18) | (cid:19) | (cid:18) | (cid:19)  | (cid:18) | (cid:19)  |           |
|        |     |                        |                 |     |     |     |          | 10       |          | 10        |          | 10        |           |
| P(S⩾3) |     | 1−P(S=0)−P(S=1)−P(S=2) |                 |     |     |     |          | 0.610−   |          | 0.4·0.69− |          | 0.42·0.68 |           |
|        |     | =                      |                 |     |     | =   | 1−       |          |          |           |          |           | ≈ 0.8327. |
|        |     |                        |                 |     |     |     |          | 0        |          | 1         |          | 2         |           |
(d) Amb la mateixa suposici´o que a l’apartat anterior, ara ens demanen quantes repeticions de
l’experiment de Bernouilli cal fer fins assolir 20 `exits. Aquest nombre segueix una distribuci´o
binomial negativa BinNeg(r = 20,p = 0.4), l’esperan¸ca de la qual ´es r/p = 50.
1

2. Sigui X una variable aleat`oria cont´ınua amb funci´o de densitat
(cid:40)
aex, si x < 0
f (x) =
X
ae−λx, si x > 0
on λ > 0 ´es un par`ametre i a una constant apropiada.
(a) Determineu el valor de a (en funcio´ de λ) i obteniu la funci´o de distribuci´o de X.
(b) Calculeu l’esperan¸ca de X.
(c) Sabent que |X| > t, calculeu la probabilitat que X > 0.
Interpreteu el resultat quan t → +∞ (en funci´o de si λ es m´es gran o m´es petit que 1).
Resoluci´o
(a) Com que la densitat ha d’estar normalitzada s’ha de complir
(cid:18) (cid:19)
∞ 0 ∞ 1
1 = f (x) dx = aex dx+ ae−λx dx = a 1+ ,
(cid:119) X (cid:119) (cid:119)
−∞ −∞ 0 λ
d’on
λ
a = .
λ+1
x
La funci´o de distribuci´o de X val F (x) = f (u)du. Per tant, si x < 0,
X (cid:114)−∞ X
λ x λ
F (x) = eudu = ex,
X (cid:119)
λ+1 −∞ λ+1
mentre que, si x ⩾ 0,
λ x λ 1−e−λx 1
F (x) = F (0)+ e−λudu = + = 1− e−λx.
X X (cid:119)
λ+1 0 λ+1 λ+1 λ+1
(b) L’esperanc¸a de X val
(cid:18) (cid:19)
∞ λ 0 ∞
E[X] = xf (x) dx = xex dx+ xe−λx dx
(cid:119) X (cid:119) (cid:119)
−∞ λ+1 −∞ 0
(cid:18) (cid:19)
λ 1 1
= −1+ = −1+ .
λ+1 λ2 λ
(Les integrals es poden calcular integrant per parts o, m´es r`apidament, utilitzant la transformada
de Laplace.)
(c) Si t < 0, l’esdeveniment |X|>t ´es segur, de manera que
1
P(X>0||X|>t) = P(X>0) = 1−F (0) = .
X
λ+1
Suposem ara t ⩾ 0. Tenim
P(X>0 i |X|>t) P(X>t)
P(X>0||X|>t) = = .
P(|X|>t) P(X<−t)+P(X>t)
Com que P(X>t) = 1−F (t) = 1 e−λt i P(X<−t) = F (−t) = λ e−t, obtenim
X λ+1 X λ+1
1 e−λt
1
P(X>0||X|>t) = λ+1 = .
λ e−t+ 1 e−λt λe(λ−1)t+1
λ+1 λ+1
El l´ımit quan t → +∞ d’aquesta expressi´o ´es

1, λ<1


1/2, λ=1


0, λ>1
Podem interpretar-ho aix´ı. La densitat de X, quan λ < 1, no ´es sim`etrica, sin´o que es concentra
enelsxpositius, demaneraquesit´esmoltgranelcondicionamentfaquelaprincipalcontribuci´o
dels valors de X sigui en els positius i la probabilitat que X sigui positiva´es gran. Un raonament
an`aleg es t´e quan λ > 1, cas en qu`e la densitat es concentra en els x negatius.
2

3. La densitat conjunta de les variables aleat`ories X i Y ´es f (x,y) = 30(1−x)y2 per als (x,y) perta-
XY
.
nyents a l’interior de la regi´o triangular de v`ertexs (0,0), (1,1), i (1,−1), i ´es nulla altrament.
(a) Determineu les densitats marginals de X i de Y. Proveu que aquestes variables s´on incorrelades.
S´on independents?
Considereu ara les noves variables Z = 1−X i T = Y2.
(b) Determineu la densitat conjunta f (z,t) i les densitats marginals f (z) i f (t).
ZT Z T
[Indicaci´o: comproveu que la regi´o on f (z,t) > 0 ´es 0 < z < 1, 0 < t < (1−z)2.]
ZT
(c) Calculeuladensitatcondicionadaf (t|Z=z)iobteniuelmillorestimadorenmitjanaquadr`atica
T|Z
de T donada Z.
Resoluci´o
(a) Les densitats marginals de les variables aleat`ories X i Y s´on
∞ x
f (x) = f (x,y)dy = 30(1−x) y2dy = 20(1−x)x3, 0 < x < 1;
X (cid:119) XY (cid:119)
−∞ −x

1
 30y2 (1−x)dx = 15y2(1+y)2, −1 < y < 0
∞  (cid:119)
f (y) = f (x,y)dx = −y
Y (cid:119) XY
−∞   30y2 1 (1−x)dx = 15y2(1−y)2, 0 < y < 1
(cid:119)
y
D’altra banda,
∞ ∞ 1 (cid:16) x (cid:17)
E[XY] = xyf (x,y)dxdy = 30 x(1−x) y3dy dx = 0,
(cid:119) (cid:119) XY (cid:119) (cid:119)
−∞ −∞ 0 −x
ja que la integral respecte de y val 0. An`alogament,
∞ ∞ 1 (cid:16) x (cid:17)
E[Y] = yf (x,y)dxdy = 30 (1−x) y3dy dx = 0.
(cid:119) (cid:119) XY (cid:119) (cid:119)
−∞ −∞ 0 −x
Per tant,
Cov[X,Y] = E[XY]−E[X]E[Y] = 0.
Les variables X i Y s´on, doncs, incorrelades, per`o no s´on independents, ja que f (x)f (y) ̸=
X Y
f (x,y).
XY
(b) L’aplicaci´oϕ(x,y) = (1−x,y2)transformalaregi´otriangularS definidapelsv`ertexs(0,0), (1,1),
i (1,−1) en la regi´o S′ = {(z,t) ∈ R2: 0 ⩽ z ⩽ 1,0 ⩽ t ⩽ (1−z)2}, de manera que cada punt
√ √
(z,t) de l’interior de S ´es imatge dels punts (x ,y ) = (1−z, t) i (x ,y ) = (1−z,− t). (Els
1 1 2 2
punts de la frontera de S que estan sobre les rectes y = x i y = −x s’apliquen sobre punts de la
par`abola t = (1−z)2, el punts de la frontera de S que verifiquen x = 1 tenen les seves imatges
en la recta z = 0, i els punts de S que verifiquen y = 0 s’apliquen sobre punts de l’eix t = 0.)
El jacobi`a de la transformaci´o val
(cid:12) (cid:12)
(cid:12)−1 0(cid:12)
J(x,y) = (cid:12) (cid:12) = −2y
(cid:12) 0 2y(cid:12)
Per tant, si 0 < z < 1 i 0 < t < (1−z)2,
f (x ,y ) f (x ,y ) 30zt 30zt √
f (z,t) = XY 1 1 + XY 2 2 = √ + √ = 30z t.
ZT
|J(x 1 ,y 1 )| |J(x 2 ,y 2 )| 2 t 2 t
La densitat de la variable Z ´es
(cid:34) (cid:35)t=(1−z)2
∞ (1−z)2√ t3/2
f (z) = f (z,t)dt = 30z tdt = 30z = 20z(1−z)3, 0 < z < 1,
Z (cid:119) ZT (cid:119)
−∞ 0 3/2
t=0
i la de la variable T ´es
√
∞
√
1−
√
t
√ (cid:20) z2(cid:21)z=1− t √ √
f (t) = f (z,t)dz = 30 t zdz = 30 t = 15 t(1− t)2, 0 < t < 1.
T (cid:119) ZT (cid:119)
−∞ 0 2
z=0
(c) Si 0 < z < 1,
√ √
f (z,t) 30z t 3 t
f (t|Z = z) = ZT = = , 0 < t < (1−z)2.
T|Z f (z) 20z(1−z)3 2(1−z)3
Z
Aix´ı,
∞ 3 (1−z)2 3
E[T |Z = z] = tf (t|Z = z)dt = t3/2dt = (1−z)2,
(cid:119) −∞ T|Z 2(1−z)3 (cid:119) 0 5
i el millor estimador en mitjana quadr`atica de T donada Z ´es T(cid:98) = E[T |Z] = (3/5)(1−Z)2.
3

4. Sigui X una variable aleat`oria de Rayleigh amb densitat de probabilitat
x
f(x) = e−x2/(2a), x ⩾ 0,
a
on a > 0 ´es un par`ametre.
(a) Donada una mostra aleat`oria (X
1
,...,X
n
), determineu l’estimador A(cid:98) de m`axima versemblan¸ca
de a. Digueu si A(cid:98)´es o no esbiaixat, i calculeu el seu error quadr`atic mitj`a.
[Indicaci´o: us pot ser u´til
+∞ x2k+1e−x2
dx = k!/2.]
(cid:119)
0
(b) Usant A(cid:98), dedu¨ıu l’expressi´o d’un interval del 90% de confianc¸a per al par`ametre a.
[Indicaci´o: assumint que n ´es gran, la variable normalitzada de A(cid:98) es comporta com una normal;
justifiqueu-ho.]
Resoluci´o
(a) D’acord amb l’enunciat, la densitat de la variable poblacional X ´es f(x|a) = (x/a)e−x2/(2a)
si x ⩾ 0. Per tant, si {X = x ,...,X = x } ´es la mostra observada, aleshores la funci´o de
1 1 n n
versemblan¸ca ´es
n (cid:32) n (cid:33)
ℓ (x ,...,x ;a) = (cid:89) f(x |a) = x 1 ···x n exp − 1 (cid:88) x2 .
n 1 n i an 2a i
i=1 i=1
Ometent la depend`encia en x ,...,x i operant amb el logaritme neperi`a de ℓ (a), tenim:
1 n n
n n
(cid:88) 1 (cid:88)
L (a) = logℓ (a) = logx −nloga− x2.
n n i 2a i
i=1 i=1
Resolent l’equaci´o L′ (a) = −n/a+(1/2a2) (cid:80)n x2 = 0 obtenim el valor a∗ = (cid:0)(cid:80)n x2(cid:1) /(2n),
n i=1 i i=1 i
que maximitza L (a). Per tant, l’estimador de m`axima versemblanc¸a del par`ametre a ´es
n
n
1 (cid:88)
A(cid:98)= X2.
2n i
i=1
(Observeu que A(cid:98)´es la mitjana mostral de les variables X2/2,...,X2/2.)
1 n
Per calcular l’esperanc¸a de A(cid:98), calculem primer E[X2]. Tenim
E[X2] = ∞ x2f(x)dx = ∞ x3 e−x2/(2a)dx = 4a ∞ u3e−u2 du = 2a,
(cid:119) (cid:119) (cid:119)
√−∞ 0 a 0
on s’ha fet el canvi x/ 2a = u i s’ha usat la indicaci´o amb k = 1. Aix´ı,
(cid:104) (cid:105) 1 (cid:88) n E[X2]
E A(cid:98) = E[X2] = = a,
2n i 2
i=1
i l’estimador ´es no esbiaixat.
(cid:104) (cid:105)
Com que l’estimador ´es no esbiaixat, el seu error quadr`atic mitj`a coincideix amb Var A(cid:98) . Usant
la indicacio´ amb k = 3 obtenim E[X4],
E[X4] = ∞ x4f(x)dx = ∞ x5 e−x2/(2a)dx = 8a2 ∞ u5e−u2 du = 8a2,
(cid:119) (cid:119) (cid:119)
−∞ 0 a 0
i, per tant, Var[X2] = E[X4]−(E[X2])2 = 4a2. Aix´ı,
(cid:104) (cid:105) 1 (cid:88) n Var[X2] a2
Var A(cid:98) = Var[X2] = = .
4n2 i 4n n
i=1
(b) La variable aleat`oria A(cid:98) ´es una mitjana mostral i pel teorema del l´ımit central podem assumir
que, si n ´es gran, aleshores l’estad´ıstic
(cid:104) (cid:105)
A(cid:98)−E A(cid:98) √ A(cid:98)−a
= n
(cid:114)
(cid:104) (cid:105) a
Var A(cid:98)
es comporta com una variable normal est`andard. Si z = F−1(0.95) = Q (0.95) ≈ 1.645, llavors
c Z Z
(cid:32) (cid:33)
P −z
c
⩽
√
n
A(cid:98)−a
⩽ z
c
= P
(cid:18)
−√
az
c ⩽ A(cid:98)−a ⩽ √
az
c
(cid:19)
≈ 0.90.
a n n
Reescrivint adequadament les dues desigualtats, obtenim l’interval de confian¸ca
(cid:32) (cid:33)
A(cid:98) A(cid:98)
P √ ⩽ a ⩽ √ ≈ 0.90.
1+1.645/ n 1−1.645/ n
4
