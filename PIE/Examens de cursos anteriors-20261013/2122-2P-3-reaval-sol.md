|       |         |      | Enginyeria |     |              | de Telecomunicaci´o |     |                 |     | (GRETST) |     |     |     |        |     |
| ----- | ------- | ---- | ---------- | --- | ------------ | ------------------- | --- | --------------- | --- | -------- | --- | --- | --- | ------ | --- |
|       |         |      |            |     | Probabilitat |                     | i   | Estad´ıstica    |     |          |     |     |     |        |     |
| 28 de | juny de | 2022 |            |     |              | Examen              |     | de reavaluaci´o |     |          |     |     |     | Temps: | 3h  |
Notes finals provisionals: 6 de juliol. Revisi´o d’examen: s’anunciar`a amb la publicaci´o de les notes.
| 1. Els | apartats | s´on | exercicis | independents. |     |     |     |     |     |     |     |     |     |     |     |
| ------ | -------- | ---- | --------- | ------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(a) El temari d’un examen consta de 14 temes. El dia de l’examen el professor proposa dos d’aquests
temes, i l’alumne n’ha de triar un. Si l’alumne havia estudiat 5 temes, quina ´es la probabilitat
|     | que | li toqui | algun | dels | que havia | estudiat? |     |     |     |     |     |     |     |     |     |
| --- | --- | -------- | ----- | ---- | --------- | --------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(b) Llancem una moneda justa 2 vegades i, a continuaci´o, llancem un dau just tantes vegades com
cares han sortit en el llan¸cament de la moneda. Calculeu l’esperan¸ca del nombre de vegades que
|     | ha sortit | la  | cara | sis del | dau. |     |     |     |     |     |     |     |     | (2 punts) |     |
| --- | --------- | --- | ---- | ------- | ---- | --- | --- | --- | --- | --- | --- | --- | --- | --------- | --- |
Resoluci´o.
(a) La probabilitat que entre els dos temes triats pel professor n’hi hagi algun dels estudiats per
l’alumne ´es la complement`aria de la probabilitat que entre els dos temes triats pel professor no
|     | n’hi | hagi | cap dels | estudiats, |     | ´es a dir, |     |     |     |     |     |     |     |     |     |
| --- | ---- | ---- | -------- | ---------- | --- | ---------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
9
|     |     |     |     |     |     |     |     | 36  | 55  |        |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ------ | --- | --- | --- | --- | --- |
|     |     |     |     |     |     | 1 2 | =   | 1   | =   | 0,604. |     |     |     |     |     |
14
|     |     |     |     |     |     | −   |     | − 91 | 91  | ≈   |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | ---- | --- | --- | --- | --- | --- | --- | --- |
!2"
! "
(b) Sigui X el nombre de cares en els 2 llan¸caments de la moneda i sigui Y el nombre de vegades que
surt la cara sis del dau. Aleshores, X Bin(2,1/2) i si X = k, llavors Y Bin(k,1/6). Per tant,
|     |     |       |      |       |     |           | ∼   |     |     |     |     | ∼   |     |     |     |
| --- | --- | ----- | ---- | ----- | --- | --------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     | P(X | = k,Y | = n) | = P(Y | = n | X = k)P(X | =   | k)  |     |     |     |     |     |     |     |
|
|     |        |      |       |       |     | n k         | n   |     | 2   |      | 5k n   |     |      |     |     |
| --- | ------ | ---- | ----- | ----- | --- | ----------- | --- | --- | --- | ---- | ------ | --- | ---- | --- | --- |
|     |        |      |       | k     | 1   | 5 −         |     | 2 1 |     | k    | 2      |     |      |     |     |
|     |        |      |       | =     |     |             |     |     | =   |      | − ,    | 0   | k 2, | 0 n | k.  |
|     |        |      |       | n     | 6   | 6           | ·   | k 2 |     | n    | k 4 6k | ≤   | ≤    | ≤   | ≤   |
|     |        |      |       | #     | $#  | $ # $       | #   | $#  | $   | # $# | $ ·    |     |      |     |     |
|     | Aix´ı, | si p | = P(X | = k,Y | =   | n), obtenim |     |     |     |      |        |     |      |     |     |
kn
|     |     |     |        | 1   |        | 5      | 1   |     |        | 25  | 5      |        | 1   |     |     |
| --- | --- | --- | ------ | --- | ------ | ------ | --- | --- | ------ | --- | ------ | ------ | --- | --- | --- |
|     |     |     | p 00 = | ,   | p 10 = | , p 11 | =   | ,   | p 20 = | ,   | p 21 = | , p 22 | =   | ,   |     |
|     |     |     |        | 4   |        | 12     | 12  |     |        | 144 | 72     |        | 144 |     |     |
i, per tant,
|     |     |     |     |     |       |        |     |     | 1   | 5   | 25 121  |     |     |     |     |
| --- | --- | --- | --- | --- | ----- | ------ | --- | --- | --- | --- | ------- | --- | --- | --- | --- |
|     |     |     |     |     | P(Y = | 0) = p | +p  | +p  | = + | +   | =       | ,   |     |     |     |
|     |     |     |     |     |       | 00     | 10  | 20  | 4   | 12  | 144 144 |     |     |     |     |
|     |     |     |     |     |       |        |     | 1   | 5   | 11  |         |     |     |     |     |
|     |     |     |     |     | P(Y = | 1) = p | +p  | =   | +   | = , |         |     |     |     |     |
|     |     |     |     |     |       | 11     | 21  |     |     |     |         |     |     |     |     |
|     |     |     |     |     |       |        |     | 12  | 72  | 72  |         |     |     |     |     |
1
|     |     |     |     |     | P(Y = | 2) = p 22 | =   | .   |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | ----- | --------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
144
Llavors, l’esperan¸ca de la variable Y val E(Y) = P(Y = 1)+2P(Y = 2) = 1/6.
Tamb´e podem calcular E(Y) com E(Y) = E(E(Y X)), on E(Y X = k) = k/6, ja que Y
|     |     |     |     |     |     |     |     |     | |   |     | |   |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
2 k
condicionada per X = k ´es una variable Bin(k,1/6) . Aleshores, E (Y) = P(X = k) =
k=0 6
|     | 0+  | 1 1 + | 2 1 | = 1. |     |     |     |     |     |     |     |     |     |     |     |
| --- | --- | ----- | --- | ---- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     | 6 2   | 6 4 | 6    |     |     |     |     |     |     |     |     |     |     |     |
|     |     | ·     | ·   |      |     |     |     |     |     |     |     | %   |     |     |     |
Alternativament, observeu que si Y ´es el nombre de vegades que ha sortit la cara i, 1 i 6,
i
|     |     |     |     |     |     |     |     |     |     |     |     |     |     | ≤   | ≤   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
aleshores X = Y + +Y . Aix´ı, E(X) = E(Y )+ +E(Y ), i com que E(X) = 2 1/2 = 1, i
|     |     |       |       | 1          | 6   |        |      | 1        |     | 6    |     |     |     |     |     |
| --- | --- | ----- | ----- | ---------- | --- | ------ | ---- | -------- | --- | ---- | --- | --- | --- | --- | --- |
|     |     |       |       | ···        |     |        |      |          | ··· |      |     |     |     | ·   |     |
|     | E(Y | ) =   | = E(Y | ), obtenim |     | 6E(Y ) | = 1, | d’on E(Y | ) = | 1/6. |     |     |     |     |     |
|     |     | 1 ··· |       | 6          |     | 6      |      |          | 6   |      |     |     |     |     |     |
2. Una f`abrica produeix una barreja de xips de dos tipus: bons i dolents, en proporcions 1 p i p,
−
respectivament. El temps de vida dels bons es descriu amb una variable exponencial de par`ametre α 1 ,
mentre que el dels dolents ´es una exponencial de par`ametre α , amb α α .
|     |     |     |     |     |     |     |     |     |     | 2   | 2   | 1   |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
≫
1

(a) Agafem un xip a l’atzar. Quina ´es la probabilitat que funcioni durant almenys un temps t?
(b) Per tal d’eliminar els xips dolents de la producci´o, es fa la prova segu¨ent. Es posa a funcionar
un xip durant un temps t . Si passat aquest temps encara funciona, s’envia al client; si no, es
c
descarta. Calculeu la probabilitat que un xip enviat al client sigui bo.
(c) En el sup`osit que 1/α = 10.000 hores, α = 1000α i p = 0.1, calculeu el temps t necessari per
1 2 1 c
tal d’assegurar que la probabilitat calculada a l’apartat anterior sigui almenys 0,99.
Si un xip que passa la prova´es dolent, quant val l’esperan¸ca del seu temps de vida des de l’instant
en qu`e el client el posa en funcionament? (3 punts)
Resoluci´o.
(a) Diem B a l’esdeveniment “el xip triat ´es bo” i D a l’esdeveniment “el xip triat ´es dolen”. Si T
denota el temps de vida del xip que hem triat a l’atzar, aleshores
P(T > t) = P(T > t B)(1 p)+P(T > t D)p = e
−
α1t(1 p)+e
−
α2tp.
| − | −
(b) La probabilitat que, si el temps de vida del xip supera t , el xip sigui bo ´es:
c
P(T > t
c
B)P(B) e
−
α1tc(1 p) 1
P(B
|
T > t
c
) =
P(T >
|
t
c
)
=
e
−
α1tc(1
−
p)+
−
e
−
α2tcp
=
1+e
−
(α2
−
α1)tcp/(1
−
p)
.
(c) Si volem que la probabilitat P(B T > t
c
) sigui almenys 0,99, tenim
|
1
0,99,
1+e (α2 α1)tcp/(1 p) ≥
− −
−
´es a dir,
100 1 p
e − (α2 − α1)tc 1 − ,
≤ 99 − · p
# $
i, per tant,
1 1 1 p 1 1 1 p
t ln − ln − .
c
≥ −α α 99 · p ≈ −α 99 · p
2 − 1 # $ 2 # $
En particular, si 1/α = 10.000 hores, α = 1000α i p = 0,1,
1 2 1
1
t c ! 10 ln 24,0 hores.
11 ≈
# $
Si un xip dolent passa la prova, aleshores, per la propietat sense mem`oria de les variables expo-
nencials,l’esperan¸cadelseutempsdevidadesdel’instantenqu`eelclientelposaenfuncionament
´es 1/α = 10 hores.
2
3. Sigui X una variable aleat`oria cont´ınua amb densitat de probabilitat
0, x < 0
f X (x) = & 1 (ln(x) θ)2 ,
' e− 2σ −2 , x > 0
( x√2πσ2
'
on θ R and σ > 0 s´on par`ametres. )
∈
(a) Determineu la funci´o densitat de probabilitat de Y = ln(X) i digueu quin tipus de variable
aleat`oria ´es Y.
(b) A partir d’una mostra (X ,...,X ) de la variable poblacional X, i suposant σ conegut, deter-
1 n
mineu l’estimador de m`axima versemblan¸ca del par`ametre θ. E´s un estimador no esbiaixat?
Calculeu la vari`ancia de l’estimador. (2 punts)
Resoluci´o.
2

(a) La funci´o g(x) = ln(x) ´es, per a x > 0, mon`otona creixent i derivable, amb derivada g (x) = 1/x,
′
i l’equaci´o y = ln(x) t´e, per a tot y R, soluci´o u´nica x = ey. Aix´ı, pel teorema del canvi de
∈
variable,
f Y (y) = f X (x) = 1 e− (y 2 − σ θ 2 )2 , < y < .
|
g
′
(x)
|*x=ey
√2πσ2 −∞ ∞
*
*
Per tant, la variable aleat`oria Y ´es*normal, Y N(θ,σ2).
∼
(b) Si X = x ,...,X = x ´es la mostra observada, aleshores la funci´o de versemblan¸ca ´es
1 1 n n
{ }
n
l (x ,...,x ;θ) = f (x ,...,x θ) = f (x θ)
n 1 n X 1 n X i
| |
i=1
+
=
1
e−2σ
1
2
n
i=1
(ln(xi)
−
θ)2
. (1)
x x (2π)n/2σn
1 n !
···
Ometent la depend`encia en x ,...,x i operant amb el logaritme neperi`a de la versemblan¸ca
1 n
tenim
n n
n 1
L (θ) = ln(2π) nlnσ ln(x ) (ln(x ) θ)2 (2)
n −2 − − i − 2σ2 i −
i=1 i=1
, ,
Resolent l’equaci´o
n
∂L (θ) 1
n
= (ln(x ) θ) = 0
∂θ σ2 i −
i=1
,
obtenim el valor estimat
n
1
θ = ln(x )
∗ i
n
i=1
,
que maximitza (2) i, per tant, (1). L’estimador de m`axima versemblan¸ca del par`ametre θ ´es
doncs
ln(X )+ +ln(X )
1 n
Θ = ···
n
n
Es tracta d’un estimador centrat, j-a que
ln(X
1
)+ +ln(X
n
) nE(ln(X))
E(Θ n ) = E ··· = = E(U) = θ,
n n
# $
-
i la seva vari`ancia val
ln(X )+ +ln(X ) nVar(ln(X)) Var(U) σ2
1 n
Var(Θ ) = Var ··· = = = .
n n n2 n n
# $
-
4. L’instant d’arribada d’un missatge a un node de comunicacions ´es una variable aleat`oria X que es
distribueix uniformement entre 1 i 2 segons. Si el missatge arriba al cap de x (1,2) segons, llavors el
∈
temps de processament en el node ´es una variable aleat`oria Y, exponencial de valor mitj`a 1/x segons.
(a) Determineu la funci´o de densitat de probabilitat conjunta de les variables X i Y i dibuixeu la
.
regi´o on f (x,y) ´es no nulla. Calculeu la funci´o de densitat de probabilitat de Y.
XY
[Ajut: xe xdx = (1+x)e x.]
− −
−
(b) Calcule
.
u E(Y X) i E(Y). Calculeu l’esperan¸ca del temps Z transcorregut des de l’instant inicial
|
0 fins que el missatge surt del node de comunicacions.
(c) Si Z ´es la variable aleat`oria de l’apartat anterior i T = Y, calculeu la densitat conjunta de Z i T
.
i dibuixeu la regi´o on f (z,t) ´es no nulla. Determineu la densitat marginal f (t). (3 punts)
ZT T
Resoluci´o.
3

(a) D’acord amb l’enunciat, la variable aleat`oria Y condicionada per X = x ´es exponencial de
par`ametre x. Per tant, f (y X = x) = xe xy si y > 0, i f (y X = x) = 0 si y < 0.
Y X − Y X
| | | |
Aleshores, com que f (x) = 1 si 1 < x < 2, i f (x) = 0 altrament, tenim
X X
f (x,y) = f (y X = x)f (x) = xe xy, 1 < x < 2, y > 0.
XY Y X X −
| |
La densitat marginal de Y la podem calcular com f Y (y) = ∞ f XY (x,y) dx. Aix´ı, si y < 0,
llavors f (y) = 0, mentre que si y > 0, llavors −∞
Y
.
2 1 2y (1+y)e y (1+2y)e 2y
f Y (y) = xe − xydx = y2 ue − udu = − − y2 − .
/1 /y
(b) D’acord amb l’enunciat E(Y X = x) = 1/x. Per tant,
|
2 1
∞
E(Y) = E(E(Y X)) = E(Y X = x)f
X
(x)dx = dx = ln(2).
| | x
/ /1
−∞
Com que Z = X +Y, tenim
3
E(Z) = E(X)+E(Y) = +ln(2).
2
(c) El valor absolut del jacobi`a de la transformaci´o definida pel sistema z = x+y,t = y val
{ }
1 1
J(x,y) = det = 1.
| | | 0 1 |
# $
El sistema t´e soluci´o u´nica x = z t,y = t , i la imatge de la regi´o Q = (x,y) R 2 : 1 < x <
{ − } { ∈
2, y > 0 ´es la regi´o Q ′ = (z,t) R 2 : t > 0, t+1 < z < t+2 . Per tant,
} { ∈ }
f (z,t) = f (z t,t) = (z t)e (z t)t, (z,t) Q.
ZT XY − − ′
− − ∈
La densitat marginal f (t) val
T
t+2 2 (1+t)e t (1+2t)e 2t
f T (t) = (z − t)e − (z − t)tdz = ue − utdx = − − t2 − .
/t+1 /1
Observeu que f (t) = f (t), d’acord amb el fet que T = Y.
T Y
4
