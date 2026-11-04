Enginyeria de Telecomunicaci´o (GRETST)
Probabilitat i Estad´ıstica
19 de gener de 2022 Examen Final Temps: 3h
Notes finals provisionals: Atenea, 24 de gener, tarda. Visualitzaci´o dels examens: 25 gener, tarda.
.
Allegacions: fins el 26 de gener, 18:00. Els problemes tenen el mateix pes.
1. A un node de comunicacions hi arriben missatges de dos tipus, A, B, provinents de tres emissors
distints E , E i E . Sabem que la probabilitat que un missatge rebut sigui de tipus A val 2/3. Sabem
1 2 3
tamb´e que si el missatge rebut ´es de tipus A, aleshores pot provenir equiprobablement de qualsevol
dels tres emissors, mentre que si ´es de tipus B, aleshores la probabilitat que provingui de E val 1/2 i
1
la probabilitat que provingui de E ´es el doble de la que provingui de E .
2 3
(a) Demostreu que les probabilitats p , p , i p , que un missatge rebut provingui de E , E , i E ,
1 2 3 1 2 3
respectivament, valen p = 7/18, p = 1/3, i p = 5/18. Si sabem que un missatge rebut prov´e
1 2 3
de E , determineu, per a cada i = 1,2,3, la probabilitat que sigui de tipus A o de tipus B.
i
(b) Considerem ara una sequ¨`encia de n missatges rebuts en el node de comunicacions i sigui X el
i
nombre de missatges, d’aquests n, enviats per E (i = 1,2,3).
i
i. Quin tipus de variable aleat`oria ´es cada X ? Quan val el nombre esperat de missatges
i
provinents de cada E ?
i
ii. Quan val la probabilitat P(X
1
= n
1
,X
2
= n
2
,X
3
= n
3
), 0 n
1
,n
2
,n
3
n, n
1
+n
2
+n
3
= n.
≤ ≤
Si n = 4, calculeu P(X
1
X
2
X
3
).
≥ ≥
(c) Sigui N el nombre de missatges consecutius provinents de E o E fins que arriba el primer
1 2
missatge de E
3
. Calculeu P(N = n) i E(N).
Resoluci´o:
(a) Pel Teorema de la Probabilitat Total, P(E
i
) = P(E
i
A)P(A)+P(E
i
B)P(B). Aix´ı,
| |
1 2 1 1 7
p
1
= P(E
1
) = + = ;
3 · 3 2 · 3 18
1 2 1 1 1
p
2
= P(E
2
) = + = ;
3 · 3 3 · 3 3
1 2 1 1 5
p
3
= P(E
3
) = + = .
3 · 3 6 · 3 18
Per tant,
P(E
1
A)P(A) 2/9 4 3
P(A E
1
) = | = = , P(B E
1
) = 1 P(A E
1
) = .
| P(E
1
) 7/18 7 | − | 7
P(E
2
A)P(A) 2/9 2 1
P(A E
2
) = | = = , P(B E
2
) = 1 P(A E
2
) = .
| P(E
2
) 1/3 3 | − | 3
P(E
3
A)P(A) 2/9 4 1
P(A E
3
) = | = = , P(B E
3
) = 1 P(A E
3
) = .
| P(E
3
) 5/18 5 | − | 5
(b) Sigui p
1
= P(E
1
), p
2
= P(E
2
) i p
3
= P(E
3
),
i. La variable aleat`oria X
i
segueix una distribuci´o Bin(n,p
i
), i = 1,2,3. Per tant, E(X
i
) = np
i
,
´es dir, E(X
1
) = 7n/18, E(X
2
) = n/3 i E(X
3
) = 5n/18.
ii. La probabilitat P(X
1
= n
1
,X
2
= n
2
,X
3
= n
3
) val
n!
P(X
1
= n
1
,X
2
= n
2
,X
3
= n
3
) =
n !n !n !
pn
1
1pn
2
2pn
3
3.
1 2 3
1

Aix´ı,
P(X
1
X
2
X
3
) = P(X
1
= 4,X
2
= 0,X
3
= 0)+P(X
1
= 3,X
2
= 1,X
3
= 0)
≥ ≥
+P(X
1
= 2,X
2
= 2,X
3
= 0)+P(X
1
= 2,X
2
= 1,X
3
= 1)
4! 4! 4! 4!
= p4p0p0+ p3p1p0+ p2p2p0+ p2p p
4!0!0! 1 2 3 3!1!0! 1 2 3 2!2!0! 1 2 3 2!1!1! 1 2 3
4 3 2 2 3
7 7 1 7 1 7 1 5
= +4 +6 +12
18 18 3 18 3 18 3 18
! " ! " ! " ! " ! " ! " ! "! "
38857
= 0.3702.
104976 ≈
(c) Si N ´es el nombre de missatges consecutius provinents de E o E fins que arriba el primer
1 2
missatge de E
3
, llavors P(N = n) = (1 p
3
)np
3
, n 0. Observeu que X = N +1 ´es una variable
− ≥
Ge(p
3
). Per tant, E(N) = E(X) 1 = 1/p
3
1 = 18/5 1 = 13/5 = 2,6.
− − −
2. La funci´o densitat de probabilitat d’una variable aleat`oria cont´ınua X ´es
0, x < 0
f (x) = ,
X 4
# xe 2x/a, x 0
$a2 − ≥
on a > 0 ´es una constant.
%
(a) Determineu la funci´o de distribuci´o de probabilitat, l’esperan¸ca i la vari`ancia de X.
[Indicaci´o. xe
−
x = (
−
1
−
x)e
−
x;
0
∞xke
−
xdx = k!]
(b) Calculeu P(X
&
> x X a) per a
&
tot x R. Determineu la densitat de X condicionada per
| ≥ ∈
X a.
≥
(c) Si Y = e X/a, calculeu la densitat de la variable Y i l’esperan¸ca de 1 Y2.
−
−
Resoluci´o:
(a) Si x 0, la funci´o de distribuci´o de la variable X ´es:
≥
x x 4
F (x) = f (t)dt = te 2t/adt
X X a2 −
'0 '0
2x/a 2x
= ue udu = ( 1 u)e u 2x/a = 1 1+ e 2x/a.
− − −
− − 0 − a
'0 ! "
( )
Per a x < 0, F (x) = 0.
X
L’esperan¸ca i vari`ancia de X valen
4 a
E(X) = ∞ xf
X
(x)dx = ∞
a2
x2e
−
2x/adx =
2
∞ t2e
−
tdt = a.
' '0 '0
−∞
Var(X) = ∞ x2f (x)dx a2
X
−
'
−∞
4 a2 3a2 a2
= ∞ x3e 2x/adx a2 = ∞ t3e tdt a2 = a2 = .
− −
a2 − 4 − 2 − 2
'0 '0
(b) La probabilitat P(X > x X a) val 1 si x < a i, si x a,
| ≥ ≥
P(X > x X a) =
P(X > x)
=
1
−
F
X
(x)
=
1
−
F
X
(x)
=
1
e2 1+
2x
e − 2x/a.
| ≥ P(X
≥
a) 1
−
F
X
(a) 3e
−
2 3
!
a
"
La densitat de X condicionada per X a val
≥
d
f (x X a) = F (x X a)
X X
| ≥ dx | ≥
d f (x) 4e2
= (1 P(X > x X a)) = X = xe
−
2x/a, x > a.
dx − | ≥ P(X a) 3a2
≥
2

(c) La funci´o g(x) = e x/a ´es mon`otona decreixent amb derivada g (x) = (1/a)e x/a. D’altra
− ′ −
−
banda, l’equaci´o y = g(x) no t´e soluci´o si y < 0, mentre que si y > 0, la soluci´o u´nica ´es
x = alny. Per tant, f (y) = 0 si y < 0 i si y > 0, aleshores
Y
−
(4/a2)xe 2x/a
−
f (x) = 4ylny, 0 < y < 1
f Y (y) = X = # (1/a)e − x/a * −
| g ′ (x) |* * x= − alny + + $0, * * * x= − alny y > 1
* *
*
+
A la Figura 1 es representa f
Y
(y) per+ %a 0 < y < 1.
f (y)
1.5 Y
1.0
0.5
y
0.2 0.4 0.6 0.8 1.0
Figura 1: La densitat f (y).
Y
L’esperan¸ca de la variable 1 Y2 val E(1 Y2) = 1 E(Y2) i, usant el teorema de l’esperan¸ca,
− − −
tenim
4
1
−
E(Y2) = 1
−
∞ g(x)2f
X
(x)dx = 1
−
∞ e
−
2x/a
a2
xe
−
2x/adx
' '0
−∞
4 1 3
= 1 ∞ xe 4x/adx = 1 ∞ ue udu = .
− −
− a2 − 4 4
'0 '0
3. Sigui a > 1 i (X,Y) una variable aleat`oria bidimensional tal que la funci´o de densitat conjunta de X
i Y ´es
K(x y)a 1, si 0 < y < x < 1
−
f(x,y) = − ,
,0, altrament
on K ´es una contant.
(a) Demostreu que K = a(a+1) i calculeu les funcions de densitat marginals de X i de Y, E[X],
E[Y], i P( X Y > 1/2).
| − |
(b) Considereu les variables Z = X +Y, T = X Y. Calculeu la funci´o de densitat conjunta f(z,t)
−
de Z i T. S´on Z i T variables aleat`orias incorrelades?
(c) A partir d’una mostra de mida n de la variable X de l’apartat (a), trobeu l’estimador de m`axima
versemblan¸ca del par`ametre a.
(d) En una mostra de mida 100 de la variable aleat`oria W = logX, on X ´es la variable de l’apartat
(a), hem trobat el valor 0.412 per la mitjana mostral. Sabent que la desviaci´o t´ıpica de W val
−
0.4, determineu un interval de confian¸ca del 99% pel par`ametre a.
[Indicaci´o: Si Z N(0,1), aleshores F (2.326) 0.990 i F (2.576) 0.995.]
Z Z
∼ ≈ ≈
Resoluci´o.
(a) Sabemos que f(x,y)dxdy = 1. Ahora bien, la funci´on de densidad s´olo es distinta de cero
R2
en el tri´angulo formado por las rectas x = y, y = 0 y x = 1, con lo que
&&
1 1 K 1 K
1 = K (x y)a 1dxdy = (1 y)ady = ,
−
− a − a(a+1)
'0 'y '0
3

| y, por tanto, |     | K = | a(a+1). |     |     |     |     |     |     |     |     |
| ------------- | --- | --- | ------- | --- | --- | --- | --- | --- | --- | --- | --- |
Para calcular las funciones de densidad marginales vemos que f(x) = 0 para cualquier x [0,1].
∕∈
| Por otro | lado, | para | cada 0 < | x < 1 | se tiene |     |     |     |     |     |     |
| -------- | ----- | ---- | -------- | ----- | -------- | --- | --- | --- | --- | --- | --- |
x
|     |     |     |        |          |     |     |     | y)a | 1dy (a+1)xa. |     |     |
| --- | --- | --- | ------ | -------- | --- | --- | --- | --- | ------------ | --- | --- |
|     |     |     | f(x) = | f(x,y)dy |     | = K | (x  | −   | =            |     |     |
−
|     |     |     |     | 'R  |     | '0  |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
En el caso de Y, vemos que de nuevo f(y) = 0 si y / [0,1], mientras que para 0 < y < 1 se tiene
∈
1
|                |     |      |          |          |     |      | y)a | 1dx |           |     | y)a. |
| -------------- | --- | ---- | -------- | -------- | --- | ---- | --- | --- | --------- | --- | ---- |
|                |     | f(y) | =        | f(x,y)dx | =   | K (x |     | −   | = (a+1)(1 |     |      |
|                |     |      |          |          |     |      | −   |     |           | −   |      |
|                |     |      | 'R       |          |     | 'y   |     |     |           |     |      |
| Las esperanzas |     | de   | X y de Y | valen:   |     |      |     |     |           |     |      |
|                |     |      |          |          |     |      |     | 1   | a+1       |     |      |
xa+1dx
|     |     |     | E[X] = | xf(x)dx |     | = (a+1) |     |     | =   | ;   |     |
| --- | --- | --- | ------ | ------- | --- | ------- | --- | --- | --- | --- | --- |
a+2
'0
'R
1
|     |     |     | E[Y] = | yf(y)dy |     | = (a+1) |     | y(1 | y)ady |     |     |
| --- | --- | --- | ------ | ------- | --- | ------- | --- | --- | ----- | --- | --- |
−
|     |     |     |     | 'R    |     |          | '0   |        |         |       |     |
| --- | --- | --- | --- | ----- | --- | -------- | ---- | ------ | ------- | ----- | --- |
|     |     |     |     |       |     | 1        |      |        | 1       |       |     |
|     |     |     | =   | (a+1) |     | (y       | 1)(1 | y)ady+ | (1      | y)ady |     |
|     |     |     |     |       |     | −        | −    |        |         | −     |     |
|     |     |     |     |       | !'0 |          |      |        | '0      |       | "   |
|     |     |     |     |       |     | 1        |      | 1      |         |       |     |
|     |     |     | =   | (a+1) |     | (1 y)ady |      | (1     | y)a+1dy |       |     |
|     |     |     |     |       |     | −        | −    |        | −       |       |     |
|     |     |     |     |       | !'0 |          |      | '0     |         | "     |     |
|     |     |     |     |       |     | 1        | 1    |        | 1       |       |     |
|     |     |     | =   | (a+1) |     |          |      | =      | .       |       |     |
|     |     |     |     |       | a+1 | −        | a+2  | a+2    |         |       |     |
|     |     |     |     |       | !   |          | "    |        |         |       |     |
Por u´ltimo, teniendo en cuenta que x > y, y que x < 1, vemos que x y = x y, y
|     |     |     |        |        |     |     |            |     |     | | − | | − |
| --- | --- | --- | ------ | ------ | --- | --- | ---------- | --- | --- | --- | --- |
|     |     |     | P( x y | > 1/2) | =   |     | f(x,y)dxdy |     |     |     |     |
|     |     |     | | −    | |      |     |     |            |     |     |     |     |
'x y>1/2
−
1/2 1
|     |     |     |     |     |     |     |        |     | y)a 1dxdy |     |     |
| --- | --- | --- | --- | --- | --- | --- | ------ | --- | --------- | --- | --- |
|     |     |     |     |     | =   | K   |        | (x  |           |     |     |
|     |     |     |     |     |     |     |        |     | − −       |     |     |
|     |     |     |     |     |     | '0  | 'y+1/2 |     |           |     |     |
1/2
|     |     |     |     |     |     |       |     |     | y)a (1/2)a)dy |     |     |
| --- | --- | --- | --- | --- | --- | ----- | --- | --- | ------------- | --- | --- |
|     |     |     |     |     | =   | (a+1) |     | ((1 |               |     |     |
|     |     |     |     |     |     |       |     | −   | −             |     |     |
'0
a+2
|     |     |     |     |     | =   | 1   | .   |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
− 2a+1
| (b) El cambio | de  | variable | tiene | como inversa |     |     |     |     |     |     |     |
| ------------- | --- | -------- | ----- | ------------ | --- | --- | --- | --- | --- | --- | --- |
Z +T
X =
2
|     |     |     |     |     |     |     | Z   | T   |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     | Y = | −   |     |     |     |     |
2
|     |     |     | ∂(x,y) | 1.  |     |     |     |     |     |     |     |
| --- | --- | --- | ------ | --- | --- | --- | --- | --- | --- | --- | --- |
cuyo jacobiano es = Por otro lado, la funci´on de densidad ser´a distinta de cero en la
|     |     |     | ∂(y,z) −2 |     |     |     |     |     |     |     |     |
| --- | --- | --- | --------- | --- | --- | --- | --- | --- | --- | --- | --- |
regi´on T ′ imagen del tri´angulo T por el cambio de variable. Al ser lineal, manda rectas en rectas,
la recta x = 1 en la recta z+t = 2, la y = 0 en la z = t, mientras que la recta x = y en la recta
| t = 0. | con lo | que |     |     |     |     |     |     |     |     |     |
| ------ | ------ | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
K
|     |     |        |          |        |     |      | ta 1, |        |        |       |       |
| --- | --- | ------ | -------- | ------ | --- | ---- | ----- | ------ | ------ | ----- | ----- |
|     |     |        |          | ∂(x,y) |     |      | −     | 0 <    | t < 1; | t < z | < 2 t |
|     |     | f(z,t) | = f(x,y) |        |     | =    | 2     |        |        |       | −     |
|     |     |        |          | ∂(z,t) |     | #    |       |        |        |       |       |
|     |     |        |          | *      |     | * 0, |       | resto. |        |       |       |
|     |     |        |          | *      |     | * $  |       |        |        |       |       |
|     |     |        |          | *      |     | *    |       |        |        |       |       |
|     |     |        |          | *      |     | *    |       |        |        |       |       |
Para ver si Z y T son incorreladas, debemos%calcular la covarianza. Por un lado
|     |     |     |      |     |           |      | a+1 |     | 1   |     |     |
| --- | --- | --- | ---- | --- | --------- | ---- | --- | --- | --- | --- | --- |
|     |     |     | E[Z] | =   | E[X]+E[Y] |      | =   | +   | =   | 1   |     |
|     |     |     |      |     |           |      | a+2 |     | a+2 |     |     |
|     |     |     |      |     |           |      | a+1 |     | 1   | a   |     |
|     |     |     | E[T] | =   | E[X]      | E[Y] | =   |     | =   |     |     |
|     |     |     |      |     |           | −    | a+2 | −   | a+2 | a+2 |     |
4

| Por | otro lado |       |     |     |              |     |     |     |     |         |     |     |
| --- | --------- | ----- | --- | --- | ------------ | --- | --- | --- | --- | ------- | --- | --- |
|     |           |       |     |     |              |     |     | K   | 1 2 | t       |     |     |
|     |           |       |     |     |              |     |     |     | −   | ztadzdt |     |     |
|     |           | E[ZT] |     | =   | ztf(z,t)dzdt |     | =   |     |     |         |     |     |
2
|     |     |     |     | ''R2 |     |     |     | '0     | 't  |     |     |     |
| --- | --- | --- | --- | ---- | --- | --- | --- | ------ | --- | --- | --- | --- |
|     |     |     |     |      | 1   |     |     | a(a+1) |     | a   |     |     |
t)tadt
|     |                      |     |     | = K      | (1  |         | =        | a   |     | =   |     |     |
| --- | -------------------- | --- | --- | -------- | --- | ------- | -------- | --- | --- | --- | --- | --- |
|     |                      |     |     |          |     |         |          |     | a+2 | a+2 |     |     |
|     |                      |     |     |          | '0  | −       |          | −   |     |     |     |     |
| con | lo que la covarianza |     |     |          |     |         |          |     |     |     |     |     |
|     |                      |     |     | Cov(Z,T) |     | = E[ZT] | E[Z]E[T] |     | = 0 |     |     |     |
−
| y por | tanto son incorreladas. |     |     |     |     |     |     |     |     |     |     |     |
| ----- | ----------------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(c) El estimador de m´axima verosimilitud para el parametro a viene de maximizar la funci´on
|     |     |     |     |     |     | n   |     |     |     |     | n   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(a+1)Xa
|           | L = log(f(a,X |      | ,...,X      | ))  | = log  |     |         | =   | nlog(a+1)+a |     | log(X | ).  |
| --------- | ------------- | ---- | ----------- | --- | ------ | --- | ------- | --- | ----------- | --- | ----- | --- |
|           |               |      | 1           | n   |        |     |         | i   |             |     |       | i   |
|           |               |      |             |     |        | -   |         | /   |             |     |       |     |
|           |               |      |             |     |        | i=1 |         |     |             |     | i=1   |     |
|           |               |      |             |     |        | .   |         |     |             |     | 0     |     |
| Derivando | respecto      | de a | e igualando |     | a cero | se  | obtiene |     |             |     |       |     |
n
n
|     |     |     |     |     | 0 = |     | + log(X |     | ),  |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | ------- | --- | --- | --- | --- | --- |
i
a+1
i=1
0
| con | lo que el estimador |     | para | el par´ametro |     | a queda |     |     |     |     |     |     |
| --- | ------------------- | --- | ---- | ------------- | --- | ------- | --- | --- | --- | --- | --- | --- |
|     |                     |     |      |               |     |         | n   |     | 1   |     |     |     |
|     |                     |     |      | a =           | 1   |         |     | =   | 1   |     |     |     |
n
|     |     |     |     |     | − − |     | log(X | ) − | − W |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | ----- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     | i=1 | i     |     |     |     |     |     |
dondelasvariablesaleatoriasW = logX1sonindependienteseid´enticamentedistribuidasycomo
|     |     |     |     | i   |     | i   |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
2
| de costumbre, | W   | es su | media. |     |     |     |     |     |     |     |     |     |
| ------------- | --- | ----- | ------ | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(d) Aunque la distribuci´on no es normal, al ser el taman˜o de la muestra muy grande podemos aplicar
2
el teorema central del l´ımite y suponer que W sigue una distribuci´on normal. Su esperanza es la
| misma | que la de | W que | es  |     |     |     |     |     |     |     |     |     |
| ----- | --------- | ----- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
i
2
1
log(x)xadx.
|     |     |     | E[W i ] | =   | logxf(x)dx |     | = (a+1) |     |     |     |     |     |
| --- | --- | --- | ------- | --- | ---------- | --- | ------- | --- | --- | --- | --- | --- |
|     |     |     |         | 'R  |            |     |         | '0  |     |     |     |     |
|     |     |     |         |     |            |     |         | v   |     | v   |     |     |
Haciendo el cambio de variable log(x) = v , x = e−a+ 1, dx = 1 e−a+ 1dv, queda
|     |     |     |         |      |     | −a+1 |     |      |     | −a+1 |     |     |
| --- | --- | --- | ------- | ---- | --- | ---- | --- | ---- | --- | ---- | --- | --- |
|     |     |     |         |      | 1   |      |     | Γ(2) |     | 1    |     |     |
|     |     |     |         |      |     | ∞    | vdv |      |     |      |     |     |
|     |     |     | E[W i ] | =    |     | ve   | − = |      | =   | .    |     |     |
|     |     |     |         | −a+1 |     |      |     | −a+1 |     | −a+1 |     |     |
'0
|     |     |     | W+  | 1   | W+  | 1   |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Por tanto la variable V = a+1 = a+1 sigue una distribuci´on N(0,1). El cuantil z =
|        |            |     | 0.4/√100 |     | 0.04  |     |        |     |      |     |     | 0.995 |
| ------ | ---------- | --- | -------- | --- | ----- | --- | ------ | --- | ---- | --- | --- | ----- |
| 2.576, | con lo que |     | !        |     | !     |     |        |     |      |     |     |       |
|        |            |     |          | P(  | 2.576 | V   | 2.576) | =   | 0.99 |     |     |       |
|        |            |     |          |     | −     | ≤   | ≤      |     |      |     |     |       |
Es decir
1
|     |     |     |     | W   | 0.10304 |       |     | W   | +0.10304 |     |     |     |
| --- | --- | --- | --- | --- | ------- | ----- | --- | --- | -------- | --- | --- | --- |
|     |     |     | −   | −   |         | ≤ a+1 | ≤   | −   |          |     |     |     |
y teniendo en cuenta que la m2edia muestral es W = 0.2412, despejando a queda el intervalo
−
|     |     |     |     |     | a   | [0.9422,2.237]. |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --------------- | --- | --- | --- | --- | --- | --- |
∈
5
