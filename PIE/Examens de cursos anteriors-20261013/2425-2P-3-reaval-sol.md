Enginyeria de Telecomunicaci´o (GRETST) • Probabilitat i Estad´ıstica
| 4 juliol 2025 |     |     |     | Examen |     | de reavaluaci´o |     |     |     |     | Temps: | 2h 30m |
| ------------- | --- | --- | --- | ------ | --- | --------------- | --- | --- | --- | --- | ------ | ------ |
Notes provisionals: 9 de juliol (tarda), Atenea Revisi´o d’examen: 10 de juliol, 11:00 hores
| No es pot usar | calculadora |     |     |     |     |     |     |     | Els problemes | tenen | el mateix | pes |
| -------------- | ----------- | --- | --- | --- | --- | --- | --- | --- | ------------- | ----- | --------- | --- |
1. Es tenen dues urnes amb m boles cadascuna. Inicialment, l’urna de l’esquerra cont´e m boles blanques,
mentre que l’urna de la dreta cont´e m−1 boles blanques i una de negra. A intervals regulars, s’extreu
a l’atzar una bola de cada urna i cadascuna es diposita a l’urna contr`aria.
(a) Determineu la probabilitat que, en n moviments, la bola negra canvi¨ı d’urna exactament k
vegades.
(b) Si despr´es d’efectuar 4 moviments les urnes tornen a l’estat inicial, quina ´es la probabilitat que
| la bola | negra | hagi canviat |     | exactament |     | dues | vegades | d’urna? |     |     |     |     |
| ------- | ----- | ------------ | --- | ---------- | --- | ---- | ------- | ------- | --- | --- | --- | --- |
Resoluci´o
(a) La probabilitat que, en un moviment donat, la bola negra canvi¨ı d’urna ´es igual a la probabilitat
d’escollir la bola negra a l’urna on es troba, ´es a dir, p = 1/m, independentment de quina sigui
aquestaurna,jaqueambduestenenelmateixnombredeboles. Definimcom´eshabitualq = 1−p.
Tamb´e s’observa que els esdeveniments corresponents al fet que la bola negra canvi¨ı d’urna en
diferents moviments s´on independents. Aix´ı, si denotem per A n,k l’esdeveniment “la bola negra
canvia k vegades d’urna en n moviments”, per a 0 ⩽ k ⩽ n, tenim que
|     |     |     |     | !   |     | !(cid:18) |                                   |     |   ! |          |     |     |
| --- | --- | --- | --- | --- | --- | --------- | --------------------------------- | --- | --- | -------- | --- | --- |
|     |     |     | n   |     |     | n         | 1 (cid:19)k(cid:18)m−1(cid:19)n−k |     | n   | (m−1)n−k |     |     |
pkqn−k
|     |     | P(A n,k | ) = |     | =   |     |     |     | =   |     | .   |     |
| --- | --- | ------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |         | k   |     |     | k   | m   | m   | k   | mn  |     |     |
(Observeu que si N ´es el nombre de vegades que la bola negra canvia d’urna en n moviments,
aleshores N ´es una variable aleat`oria binomial de par`ametres n i p = 1/m.)
(b) Sabem que ha tingut lloc un nombre parell de canvis de la bola negra en 4 moviments, ´es a dir,
ha succe¨ıt A 4,0 ∪A 4,2 ∪A 4,4 . Aleshores, la probabilitat que demana l’enunciat ´es
|     |     |     |     |     |     |     |     | P(A | )   |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
4,2
|     |     | P(A | | A | ∪A  | ∪A  | ) = |     |       |       | =   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | ----- | ----- | --- | --- | --- |
|     |     |     | 4,2 | 4,0 | 4,2 | 4,4 | P(A | )+P(A | )+P(A | )   |     |     |
|     |     |     |     |     |     |     |     | 4,0   | 4,2   | 4,4 |     |     |
(cid:0)4(cid:1)(m−1)2
6(m−1)2
|     |     |     |                       |     | 2                     | m4  |                 |                    |     |     |     |     |
| --- | --- | --- | --------------------- | --- | --------------------- | --- | --------------- | ------------------ | --- | --- | --- | --- |
|     |     |     | =                     |     |                       |     |                 | =                  |     |     | .   |     |
|     |     |     | (cid:0)4(cid:1)(m−1)4 |     | (cid:0)4(cid:1)(m−1)2 |     | (cid:0)4(cid:1) | 1 (m−1)4+6(m−1)2+1 |     |     |     |     |
|     |     |     |                       |     | +                     |     | +               |                    |     |     |     |     |
|     |     |     | 0                     | m4  | 2                     | m4  | 4               | m4                 |     |     |     |     |
1

2. Sigui X una variable aleat`oria cont´ınua amb funci´o de densitat de probabilitat
2 (cid:18) x(cid:19)
 1− , si 0 ⩽ x ⩽ a
f (x) = a a
X
0, en cas contrari,
on a > 0 ´es un par`ametre.
(a) Calculeu l’esperan¸ca i la vari`ancia de X.
(b) Sigui Y = X/(a−X). Calculeu la funci´o de densitat f (y).
Y
[Indicaci´o: dibuixeu la funci´o g(x) que transforma X en Y.]
(c) Utilitzant el teorema de l’esperanc¸a, calculeu E[Y].
Resoluci´o
(a) L’esperanc¸a de X val
∞ a 2 (cid:18) x(cid:19) 1 " u2 u3 #u=1 a
E[X] = xf (x)dx = x 1− dx = 2a u(1−u)du = 2a − = .
(cid:119) X (cid:119) (cid:119)
−∞ 0 a a 0 2 3 3
u=0
Pel que fa al c`alcul de la vari`ancia, determinem primer
h i ∞ a 2 (cid:18) x(cid:19) 1
E X2 = x2f (x)dx = x2 1− dx = 2a2 u2(1−u)du
(cid:119) X (cid:119) (cid:119)
−∞ 0 a a 0
" #u=1
u3 u4 a2
= 2a2 − = ,
3 4 6
u=0
h i a2
d’on Var(X) = E X2 −E[X]2 = .
18
(b) La funci´o g(x) = x/(a−x) estableix una transformaci´o bijectiva entre l’interval (0,a) i la semi-
recta (0,∞). Concretament, per a y > 0, la antiimatge de y ´es x = g−1(y) = ay/(1+y). A
m´es,
a (1+y)2
g′(x) = = .
(a−x)2 a
Aleshores, per a y > 0,
f (x) (cid:18) ay (cid:19) a 2 (cid:18) y (cid:19) a 2
X
f (y) = = f = 1− = .
Y |g′(x)| X 1+y (1+y)2 a 1+y (1+y)2 (1+y)3
(c) Utilitzant ara el teorema de la esperanc¸a,
∞ a x 2 (cid:18) x(cid:19) 2 a
E[Y] = g(x)f (x)dx = · 1− dx = xdx = 1.
(cid:119) −∞ X (cid:119) 0 a−x a a a2 (cid:119) 0
2

3. Siguin X i Y dues variables aleat`ories amb densitat conjunta
( 6y si 0 ⩽ x ⩽ 1, 0 ⩽ y ⩽ x,
f (x,y) =
XY
0 en cas contrari.
(a) Comproveuquef (x,y)´esunadensitatbidimensionaldeprobabilitatidetermineulesdensitats
XY
marginals de X i de Y.
(b) Calculeu la densitat de Y condicionada per X. Determineu l’estimaci´o `optima en mitjana
quadr`atica de Y donada X.
(c) Calculeu la densitat conjunta de les variables Z i T, on Z = XY i T = Y.
(Indiqueu, en cada cas, els dominis de validesa.)
Resoluci´o
(a) Lafunci´of (x,y)´esnonegativaperatot(x,y) ∈ R. Percomprovarque´esunadensitatnom´es
XY
cal veure que
" #1
+∞ +∞ 1(cid:16) x (cid:17) 1 x2 x3
f (x,y)dxdy = 6 ydy dx = 6 dx = 6 = 1.
(cid:119) (cid:119) XY (cid:119) (cid:119) (cid:119)
−∞ −∞ 0 0 0 2 6
0
La variable X pren valors a l’interval [0,1], i, per tant,
+∞ x
f (x) = f (x,y)dy = 6ydy = 3x2, 0 ⩽ x ⩽ 1.
X (cid:119) XY (cid:119)
−∞ 0
Similarment, la variable Y tamb´e pren valors a l’interval [0,1], i tenim:
+∞ 1
f (y) = f (x,y)dx = 6ydx = 6y(1−y), 0 ⩽ y ⩽ 1.
Y (cid:119) XY (cid:119)
−∞ y
(b) LadensitatdeY condicionadaperX = xest`abendefinidasi0 < x ⩽ 1(l’intervalonf (x) ̸= 0),
X
i tenim:
f (x,y) 2y
f (y|X = x) = XY = , 0 ⩽ y ⩽ x.
Y|X f (x) x2
X
L’estimaci´o `optima demanada ve donada per les esperan¸ca condicionada E[Y |X]. Aleshores,
∞ x 2y2 2x
E[Y |X = x] = yf (y|X = x)dy = dy = ,
(cid:119) −∞ Y|X (cid:119) 0 x2 3
i, per tant, E[Y |X] = 2X/3.
(c) Utilitzant la transformaci´o g(x,y) = (z,t) = (xy,y), podrem calcular la densitat conjunta de les
variables (Z,T) = g(X,Y) per la f´ormula del canvi de variable.
La transformaci´o ´es bijectiva (tret del conjunt donat per y = 0 que t´e probabilitat 0). El
determinant jacobi`a ´es:
(cid:12) (cid:12)
(cid:12)y x(cid:12)
J(x,y) = (cid:12) (cid:12) = y = t,
(cid:12)0 1(cid:12)
(cid:12) (cid:12)
i la transformaci´o inversa ve donada per (x,y) = (z/t,t).
La regio´ triangular 0 < y ⩽ x ⩽ 1 es transforma en 0 < t ⩽ z/t ⩽ 1, que equival a 0 < t2 ⩽ z ⩽ t.
Sigui T aquesta regi´o transformada. Aleshores,
f (z/t,t) 6t
XY
f (z,t) = = = 6, (z,t) ∈ T,
ZT
|J(z/t,t)| t
´es a dir, la variable bidimensional (Z,T) ´es uniforme en T.
3

4. Una variable aleat`oria X ´es tal que E[Xn] = 2θn/(n+2), on θ > 0 ´es un par`ametre desconegut.
(a) A partir d’una mostra aleat`oria de mida n de X, determineu l’estimador Θbn de θ obtingut amb
el m`etode dels moments. Calculeu el biaix i l’error quadr`atic mitj`a de Θbn .
(b) Justifiqueu que per a n = 50, l’estimador Θbn es pot aproximar b´e per una variable aleat`oria
normal. Useu Θb50 per a determinar un interval de confian¸ca per a θ amb nivell de confianc¸a del
95%.
Resoluci´o
(a) Sigui (X 1 ,...,X n ) la mostra aleat`oria. Com que el model estad´ıstic dep`en d’un sol par`ametre,
el m`etode dels moments utilitza una sola equaci´o: es pren el primer moment de X com a funci´o
de θ, E[X] = 2θ/3, i se substitueixen pel primer moment mostral (la mitjana mostral X ) i
n
| l’estimador | Θbn de θ: | X = | 2Θbn /3. | Per tant, |     |     |     |     |
| ----------- | --------- | --- | -------- | --------- | --- | --- | --- | --- |
n
3
|     |     |     |     |     | Θbn = | X n . |     |     |
| --- | --- | --- | --- | --- | ----- | ----- | --- | --- |
2
|     |     |     |     | h   | i   | (cid:20)3 | (cid:21) 3 |     |
| --- | --- | --- | --- | --- | --- | --------- | ---------- | --- |
L’estimador Θbn ´es no esbiaixat ja que E Θbn = E X = E[X] = θ.
|     |     |     |     |     |     | 2 n | 2   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
Per a calcular l’error quadr`atic mitj`a de Θbn necessitarem la vari`ancia de X:
|     |     |        |     | h      | i      | θ2  | 4θ2 | θ2  |
| --- | --- | ------ | --- | ------ | ------ | --- | --- | --- |
|     |     | Var(X) |     | = E X2 | −E[X]2 | =   | −   | = . |
|     |     |        |     |        |        | 2   | 9   | 18  |
Com que Θbn ´es no esbiaixat, el seu error quadr`atic coincideix amb la vari`ancia:
|     |     |     | h     | i     | (cid:20)3 | (cid:21) | 9Var[X] | θ2  |
| --- | --- | --- | ----- | ----- | --------- | -------- | ------- | --- |
|     |     | E2  | = Var | Θbn = | Var       | X =      |         | = . |
n
|     |     |     |     |     | 2   |     | 4n  | 8n  |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
(b) El teorema del l´ımit central afirma que, per a n prou gran, la mitjana mostral es comporta com
una variable normal. Aix`o tamb´e passa amb Θbn , ja que ´es mu´ltiple de la mitjana mostral.
θ2/400.
Per a n = 50, la variable aleat`oria Θb50 t´e esperan¸ca θ i vari`ancia Per tant, la variable
estandarditzada
|     |     |     |     |     | Θb50 | −θ  |     |     |
| --- | --- | --- | --- | --- | ---- | --- | --- | --- |
θ/20
| es comporta | aproximadament |     | com | una normal | N(0,1). |     |     |     |
| ----------- | -------------- | --- | --- | ---------- | ------- | --- | --- | --- |
Usant el valor cr´ıtic Q(0.975) = 1.960 de la taula de valors de la normal est`andard tenim:
|     |     |     |     |     |     |     | !   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
Θb50 −θ
|     |     |     |          | ⩽   |     | ⩽     |         |     |
| --- | --- | --- | -------- | --- | --- | ----- | ------- | --- |
|     |     |     | P −1.960 |     |     | 1.960 | ≈ 0.95. |     |
θ/20
|     |     |     |     |     |     |     |     | ⩽ ⩽ |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
Les desigualtats interiors d’aquesta f´ormula equivalen a −0.098θ Θb50 −θ 0.098θ, i a¨ıllant-ne
| θ tamb´e | equivalen a |     |         |      |     |         |      |     |
| -------- | ----------- | --- | ------- | ---- | --- | ------- | ---- | --- |
|          |             |     |         | 1    |     | 1       |      |     |
|          |             |     |         |      | ⩽   | ⩽       |      |     |
|          |             |     |         | Θb50 | θ   |         | Θb50 | ,   |
|          |             |     | 1+0.098 |      |     | 1−0.098 |      |     |
que´es l’interval de confianc¸a demanat per a θ. Fent les operacions de divisi´o,´es aproximadament
|     |     |     |     |           | ⩽   | ⩽         |     |     |
| --- | --- | --- | --- | --------- | --- | --------- | --- | --- |
|     |     |     |     | 0.911Θb50 | θ   | 1.109Θb50 | .   |     |
4
