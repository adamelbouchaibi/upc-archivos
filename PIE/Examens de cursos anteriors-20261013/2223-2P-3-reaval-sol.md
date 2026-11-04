Enginyeria de Telecomunicacio´ (GRETST)
Probabilitat i Estad´ıstica
3 de juliol de 2023 Examen de reavaluaci´o Temps: 3h
Notes provisionals: 10 de juliol Revisi´o d’examen: 11 de juliol, 11:00–12:00, despatx C3-112
1. Un component electr`onic es produeix en dues plantes diferents, A i B; la planta A fa el 70% de la
1 1
producci´o. Laprobabilitatqueuncomponentsiguidefectu´osval enlaplantaAi enlaplantaB.
10 15
Cada planta empaqueta els components en caixes de 10 unitats.
(a) Si agafem una caixa a l’atzar del total de la producci´o, quina ´es la probabilitat que tingui com a
molt 2 unitats defectuoses?
(b) Si la caixa triada cont´e exactament 2 unitats defectuoses, quina ´es la probabilitat que provingui
de la planta A? Compareu amb la probabilitat a priori i digueu si la variaci´o ´es raonable.
(c) Anem comprovant caixes de la planta B fins que en trobem una amb 3 o m´es components
defectuosos. Quina ´es la probabilitat que haguem de mirar m´es de 10 caixes? Quin ´es el nombre
mitj`a de caixes que cal comprovar? (2.6 punts)
Resoluci´o
El nombre d’unitats defectuoses en una caixa de la planta A ´es la variable X , binomial amb n = 10
A
1 1
i p = . En el cas de la planta B ´es X , binomial amb n = 10 i p = . Les probabilitats que una
B
10 15
caixa provingui de cada planta s´on p = 0.7 i p = 0.3. Sigui X el nombre d’unitats defectuoses a la
A B
caixa triada.
(a) La probabilitat que es demana val
P(X ⩽ 2) = P(X ⩽ 2)p +P(X ⩽ 2)p
A A B B
(cid:32) (cid:33)
(cid:18)
9
(cid:19)10 (cid:18)
9
(cid:19)9
1
(cid:18)
10
(cid:19)(cid:18)
9
(cid:19)8(cid:18)
1
(cid:19)2
= +10 + 0.7
10 10 10 2 10 10
(cid:32) (cid:33)
(cid:18)
14
(cid:19)10 (cid:18)
14
(cid:19)9
1
(cid:18)
10
(cid:19)(cid:18)
14
(cid:19)8(cid:18)
1
(cid:19)2
+ +10 + 0.3
15 15 15 2 15 15
= 0.9298·0.7+0.9751·0.3 = 0.9434.
(b) Aplicant la f´ormula de Bayes:
P(X = 2)p
P(A|X = 2) = A A
P(X = 2)p +P(X = 2)p
A A B B
(cid:0)10(cid:1) ( 9 )8( 1 )20.7
= 2 10 10 = 0.7969.
(cid:0)10(cid:1) ( 9 )8( 1 )20.7+ (cid:0)10(cid:1) (14)8( 1 )20.3
2 10 10 2 15 15
A priori P(A) = p = 0.7. Com que els defectes s´on m´es probables en A, la probabilitat ha
A
augmentat ja que 2 ´es un valor alt tenint en compte que E[X ] = 1 i E[X ] = 0.67.
A B
(c) El nombre N de caixes comprovades ´es una variable geom`etrica de par`ametre p = P(X ⩾ 3) =
B
1−P(X ⩽ 2) = 1−0.9751 = 0.0249. Per tant, P(N > 10) = (1−p)10 = 0.975110 = 0.7771. El
B
nombre mitj`a de caixes que cal comprovar ´es E[N] = 1/p = 40.16.
1

2. Anem a la parada de taxis. La probabilitat que hi hagi un taxi disponible ´es 2/3. Si no, arribar`a un
taxi en un temps distribu¨ıt uniformement entre 0 i 10 minuts. Calculeu la funci´o de distribuci´o del
temps d’espera T i dibuixeu-ne la gr`afica. De quin tipus ´es la variable T? Calculeu el valor mitj`a
| d’aquest | temps d’espera. |     |     |     |     |     |     |     | (2.2 punts) |
| -------- | --------------- | --- | --- | --- | --- | --- | --- | --- | ----------- |
Resoluci´o
La variable aleat`oria T que dona el temps d’espera (en minuts) pren valors positius, i, per tant,
| F (t) = | 0 si t < 0. |     |     |     |     |     |     |     |     |
| ------- | ----------- | --- | --- | --- | --- | --- | --- | --- | --- |
T
⩾
Sigui t 0 i designem per A l’esdeveniment “hi ha un taxi a la parada”. Aplicant la f´ormula de la
| probabilitat | total | tenim |     |     |     |     |     |     |     |
| ------------ | ----- | ----- | --- | --- | --- | --- | --- | --- | --- |
|              |       |       |     |     |     |     |     | 2   | 1   |
F (t) = P(T ⩽ t) = P(T ⩽ t|A)P(A)+P(T ⩽ t|A)P(A) = 1· +P(T ⩽ t|A)· .
T
|     |     |     |     |     |     |     |     | 3   | 3   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Si succeeix A, aleshores el temps d’espera es distribueix uniformement entre 0 i 10 minuts, de manera
| P(T | ⩽      |      | ⩽    | ⩽ P(T ⩽ |          | ⩾        |     |     |     |
| --- | ------ | ---- | ---- | ------- | -------- | -------- | --- | --- | --- |
| que | t|A) = | t/10 | si 0 | t 10 i  | t|A) = 1 | si t 10. |     |     |     |
En resum, F (t) = 0 si t < 0; F (t) = 2/3+t/30 si 0 ⩽ t < 10; i F (t) = 1 si t ⩾ 10.
|     | T   |     |     | T   |     |     | T   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
1
2/3
F T (t)
|     | 0   |     |     | 10  | t   |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
La variable T ´es mixta, ja que F ´es de classe C1 a trossos amb una discontinu¨ıtat de salt.
T
L’esperanc¸a del temps d’espera la podem obtenir de manera semblant a abans com
|            |       |                    |       |                |          |            | 2      | 1 5 |     |
| ---------- | ----- | ------------------ | ----- | -------------- | -------- | ---------- | ------ | --- | --- |
|            |       | E(T)               | = E(T | |A)P(A)+E(T    | |A)P(A)  | =          | 0· +5· | = , |     |
|            |       |                    |       |                |          |            | 3      | 3 3 |     |
| ja que E(T | |A) = | 5 ´es l’esperan¸ca |       | d’una variable | uniforme | en [0,10]. |        |     |     |
2

3. Siguin X i Y variables aleat`ories independents tals que X ´es de tipus gamma amb densitat de proba-
bilitat f (x) = λ2xe−λx, x > 0, i Y ´es uniforme en l’interval [0,1].
X
(a) Calculeu la probabilitat que X i Y prenguin simult`aniament un valor superior a 1/λ.
(b) Si Z = XY i T = X(1−Y), determineu la densitat conjunta f (z,t) i les densitats marginals
ZT
f (z) i f (t). De quin tipus s´on les variables aleat`ories Z i T? S´on independents?
Z T
[Indicaci´o: Justifiqueu que la regi´o on f (z,t) > 0 ´es z > 0, t > 0.] (2.6 punts)
ZT
Resoluci´o
(a) Com que X i Y s´on variables independents, tenim:
P(X > 1/λ,Y > 1/λ) = P(X > 1/λ)P(Y > 1/λ). (1)
Si 0 < λ ⩽ 1, aleshores 1/λ ⩾ 1 i P(Y > 1/λ) = 0, i, per tant, l’expressi´o (1) val 0. Si λ > 1,
llavors 1/λ < 1 i P(Y > 1/λ) = 1−1/λ. Ara, l’expressi´o (1) val
(cid:18) (cid:19) (cid:18) (cid:19) (cid:18) (cid:19)
1 ∞ 1 ∞ 1 2
P(X > 1/λ,Y > 1/λ) = 1− λ2xe−λxdx = 1− ue−udu = 1− .
(cid:119) (cid:119)
λ 1/λ λ 1 λ e
(b) La densitat conjunta de X i Y ´es
f (x,y) = f (x)f (y) = λ2xe−λx, (x,y) ∈ Q,
XY X Y
on Q = {(x,y) ∈ R2 | x > 0, 0 < y < 1}. La transformaci´o ϕ(x,y) = (xy,x(1−y)) aplica la regi´o
Q en la regi´o ϕ(Q) = {(z,t) ∈ R2 | z > 0, t > 0}, i, resolent el sistema {z = xy,t = x(1−y)},
veiem que cada punt (z,t) ∈ ϕ(Q) ´es imatge de l’u´nic punt (x = z+t,y = z/(z+t)) ∈ Q.
D’altra banda, el jacobi`a de la transformaci´o ´es
(cid:12) (cid:12)
(cid:12) y x (cid:12)
J(x,y) = (cid:12) (cid:12) = −x.
(cid:12) 1−y −x (cid:12)
Aix´ı, aplicant el teorema del canvi de variable,
(cid:12)
f ZT (z,t) =
f
XY
(x,y)(cid:12)
(cid:12) = λ2e−λ(z+t), z > 0, t > 0.
|J(x,y)| (cid:12)
(x=z+t,y=z/(z+t))
D’aquestresultatesdespr`enimmediatamentquelesvariablesZ iT s´onexponencialsdepar`ametre
λ, i independents. En efecte,
∞ ∞
f (z) = f (z,t)dt = λe−λz λe−λtdt = λe−λz, z > 0,
Z (cid:119) ZT (cid:119)
−∞ 0
i, an`alogament f (t) = λe−λt, si t > 0. Es compleix, doncs, f (z,t) = f (z)f (t), per a tot
T ZT Z T
(z,t) ∈ R2.
Nota. Observeu que ϕ(x,0) = (0,x). Aix´ı, la semirecta (x,0), x > 0, de la frontera de Q queda
transformada en la semirecta (0,t), t > 0, del pla z,t. D’altra banda, ϕ(x,1) = (x,0), i, per tant,
la semirecta (x,1), x > 0, de la frontera de Q queda transformada en la semirecta (z,0), z > 0,
del pla z,t. Finalment, observeu que els punts (0,y), 0 < y < 1, de la frontera de Q s’apliquen
sobre l’origen (0,0) del pla z,t.
3

4. La intensitat d’un senyal es representa amb un valor en l’interval [0,1] que es pot modelar amb una
(a+1)(a+2)(1−x)xa,
variable aleat`oria X de densitat f(x) = 0 < x < 1, on a > −1´es un par`ametre.
(a) Volem estimar el valor del par`ametre a i disposem d’una mostra de mida n = 5 amb valors
x = 0.88, x = 0.89, x = 0.72, x = 0.36, x = 0.46. Utilitzeu el m`etode dels moments per
|     | 1   | 2   | 3   |     | 4   | 5   |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
a obtenir l’estimador (cid:98)M a , i utilitzeu-lo per a calcular l’estimaci´o de a corresponent a la mostra
donada.
(b) Utilitzeu el m`etode de m`axima versemblan¸ca per a obtenir l’estimador a del par`ametre a a
(cid:98)ML
partir d’una mostra qualsevol de mida n. Apliqueu la f´ormula obtinguda a la mostra donada a
|     | l’apartat | anterior. |     |     |     |     |     |     |     |     |     | (2.6 punts) |
| --- | --------- | --------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ----------- |
Resoluci´o
| (a) | L’esperanc¸a | de X val |     |     |     |     |     |     |     |     |     |     |
| --- | ------------ | -------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
1
|     | E(X) |              |           | x(1−x)xadx |     |     |     |     |     |     |     |     |
| --- | ---- | ------------ | --------- | ---------- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |      | = (a+1)(a+2) | (cid:119) |            |     |     |     |     |     |     |     |     |
0
|     |     |     |     |     |     |     |     |     | (cid:18) | 1   | 1 (cid:19) | a+1 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | -------- | --- | ---------- | --- |
1 (xa+1−xa+2)dx
|     |     | = (a+1)(a+2) |           |     |     | = (a+1)(a+2) |     |     |     | −   |     | = . |
| --- | --- | ------------ | --------- | --- | --- | ------------ | --- | --- | --- | --- | --- | --- |
|     |     |              | (cid:119) |     |     |              |     |     | a+2 |     | a+3 | a+3 |
0
En el m`etode dels moments igualem el primer moment mostral a l’esperanc¸a de la variable,
|     | X = (a+1)/(a+3). |     | A¨ıllant | a s’obt´e | l’estimador |     |     |     |     |     |     |     |
| --- | ---------------- | --- | -------- | --------- | ----------- | --- | --- | --- | --- | --- | --- | --- |
n
|     |     |     |     |     |     | 3X  | −1  |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
n
|     |     |     |     |     | a         | =   | .   |     |     |     |     |     |
| --- | --- | --- | --- | --- | --------- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     | (cid:98)M | 1−X |     |     |     |     |     |     |
n
(cid:80)
Amb la mostra donada, el valor observat de la mitjana mostral X ´es x = ( x )/5 = 0.662,
|     |         |                |             |     |                  |     |     |     | n      |     | i   | i   |
| --- | ------- | -------------- | ----------- | --- | ---------------- | --- | --- | --- | ------ | --- | --- | --- |
|     | d’on el | valor pres per | l’estimador | ´es | a = (3x−1)/(1−x) |     |     | =   | 2.917. |     |     |     |
(cid:98)M
| (b) | El logaritme | de la | funci´o de versemblan¸ca |     | ´es      |     |     |     |     |     |     |     |
| --- | ------------ | ----- | ------------------------ | --- | -------- | --- | --- | --- | --- | --- | --- | --- |
|     |              |       | n                        |     |          | n   |     |     |     |     |     |     |
|     |              |       | (cid:88)                 |     | (cid:88) |     |     |     |     |     |     |     |
L(x ,...,x ;a) = lnf(x |a) = (ln(a+1)+ln(a+2)+ln(1−x )+alnx )
|     |     | 1 n |                      | i   |     |     |          |        |     |          | i   | i   |
| --- | --- | --- | -------------------- | --- | --- | --- | -------- | ------ | --- | -------- | --- | --- |
|     |     |     | i=1                  |     | i=1 |     |          |        |     |          |     |     |
|     |     |     |                      |     |     |     | n        |        |     | n        |     |     |
|     |     |     |                      |     |     |     | (cid:88) |        |     | (cid:88) |     |     |
|     |     |     | = nln(a+1)+nln(a+2)+ |     |     |     |          | ln(1−x | )+a | lnx      |     |     |
|     |     |     |                      |     |     |     |          |        | i   |          | i   |     |
|     |     |     |                      |     |     |     | i=1      |        |     | i=1      |     |     |
∂L
|     | L’estimador | s’obt´e | amb la condici´o |     | = 0: |     |     |     |     |     |     |     |
| --- | ----------- | ------- | ---------------- | --- | ---- | --- | --- | --- | --- | --- | --- | --- |
∂a
|     |     |     |     |     | n   | n (cid:88) |     |      |     |     |     |     |
| --- | --- | --- | --- | --- | --- | ---------- | --- | ---- | --- | --- | --- | --- |
|     |     |     |     |     | +   | +          | lnx | = 0, |     |     |     |     |
i
a+1 a+2
i
´es a dir, 2a+3+(a2+3a+2)( (cid:80) lnx )/n = 0. Designant ( (cid:80) lnx )/n per u, ens queda l’equaci´o
|     |             |                    |     | i   | i    |         |          | i   | i   |     |     |     |
| --- | ----------- | ------------------ | --- | --- | ---- | ------- | -------- | --- | --- | --- | --- | --- |
|     | quadr`atica | ua2+(2+3u)a+(3+2u) |     |     | = 0, | que t´e | soluci´o |     |     |     |     |     |
√
|     |     |     |     |     | −(2+3u)− |     | 4+u2 |     |     |     |     |     |
| --- | --- | --- | --- | --- | -------- | --- | ---- | --- | --- | --- | --- | --- |
|     |     |     |     | a   | =        |     |      | .   |     |     |     |     |
2u
(cid:80)n
Com que u ´es el valor observat de la variable aleat`oria U = ( lnX )/n, l’expressi´o de
|     |             |            |               |     |                |     |       |     |     | i=1 | i   |     |
| --- | ----------- | ---------- | ------------- | --- | -------------- | --- | ----- | --- | --- | --- | --- | --- |
|     | l’estimador | de m`axima | versemblan¸ca |     | del par`ametre |     | a ´es |     |     |     |     |     |
√
|     |     |     |     |            | −(2+3U)− |     | 4+U2 |     |     |     |     |     |
| --- | --- | --- | --- | ---------- | -------- | --- | ---- | --- | --- | --- | --- | --- |
|     |     |     |     | a          | =        |     |      |     | .   |     |     |     |
|     |     |     |     | (cid:98)ML |          | 2U  |      |     |     |     |     |     |
(cid:80)5
|     | Per a la | nostra mostra, | u = ( | lnx | )/5 | = −0.4742 | i   | a =        | 2.776. |     |     |     |
| --- | -------- | -------------- | ----- | --- | --- | --------- | --- | ---------- | ------ | --- | --- | --- |
|     |          |                |       | i=1 | i   |           |     | (cid:98)ML |        |     |     |     |
(L’equaci´o de segon grau tenia una soluci´o corresponent al signe m´es davant l’arrel. Aquesta
|     | soluci´o | dona valors | a < −1.) |     |     |     |     |     |     |     |     |     |
| --- | -------- | ----------- | -------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
4
