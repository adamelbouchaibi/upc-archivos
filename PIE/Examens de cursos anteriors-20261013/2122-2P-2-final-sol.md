|            |         | Enginyeria |     |     | de           | Telecomunicaci´o |        |              |     | (GRETST) |     |     |     |           |
| ---------- | ------- | ---------- | --- | --- | ------------ | ---------------- | ------ | ------------ | --- | -------- | --- | --- | --- | --------- |
|            |         |            |     |     | Probabilitat |                  | i      | Estad´ıstica |     |          |     |     |     |           |
| 31 de maig | de 2022 |            |     |     |              |                  | Examen | final        |     |          |     |     |     | Temps: 3h |
Notes finals provisionals: 9 de juny. Visualitzaci´o dels ex`amens: 10 de juny.
| Allegacions: . | 10–12 | de  | juny. |     |     |     |     |     |     |     |     |     |     |     |
| -------------- | ----- | --- | ----- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
1. (a) Un metge dubta entre tres possibles malalties mu´tuament excloents, A, B i C, que pot patir un
pacient. La probabilitat de patir la malaltia A ´es el triple de les de B i C, que s´on iguals. Se sap
queelpacientsamblamalaltiaAdonenpositiud’uncertmarcadorsanguiniambunaprobabilitat
de 0’3; aquesta probabilitat ´es de 0’6 en el cas de la malaltia B, i de 0’5 en la malaltia C.
El pacient ha donat positiu d’aquest marcador. Quina ´es la malaltia m´es probable que pateix?
(b) Elnombred’accidentsenunmesenunaf`abricasegueixunalleidePoissonambpar`ametreα = 2.
|     | i. Quina | ´es | la probabilitat |     | que | en un | mes | hi hagi | algun | accident? |     |     |     |     |
| --- | -------- | --- | --------------- | --- | --- | ----- | --- | ------- | ----- | --------- | --- | --- | --- | --- |
ii. Quina ´es la probabilitat que hi hagi quatre accidents en dos mesos?
iii. Quin ´es el nombre mitj`a d’accidents produ¨ıts en els mesos en qu`e hi ha accidents?
|     |     |     |     |     |     |     |     |     |     |     |     |     |     | (2,5 punts) |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ----------- |
Resoluci´o:
(a) Les probabilitats de patir les malalties A, B i C s´on P(A) = 0,6 i P(B) = P(C) = 0,2.
Si P denota l’esdeveniment “el marcador d´ona positiu”, llavors, aplicant la f´ormula de Bayes,
tenim
|     |     |     |     |     |      |            |     | P(P     | A)P(A)     |     |        |     |     |     |
| --- | --- | --- | --- | --- | ---- | ---------- | --- | ------- | ---------- | --- | ------ | --- | --- | --- |
|     |     |     |     | P(A | P) = |            |     |         | |          |     |        |     |     |     |
|     |     |     |     | |   | P(P  | A)P(A)+P(P |     |         | B)P(B)+P(P |     | C)P(C) |     |     |     |
|     |     |     |     |     |      | |          |     |         | |          |     | |      |     |     |     |
|     |     |     |     |     |      |            | 0,3 | 0,6     |            |     | 9      |     |     |     |
|     |     |     |     |     | =    |            |     | ·       |            | =   | ,      |     |     |     |
|     |     |     |     |     | 0,3  | 0,6+0,6    |     | 0,2+0,5 | 0,2        | 20  |        |     |     |     |
|     |     |     |     |     |      | ·          |     | ·       | ·          |     |        |     |     |     |
i, an`alogament, P(B P) = 6/20, i P(B P) = 5/20. Per tant, la malaltia m´es probable ´es la
|     |     |     |     | |   |     |     | |   |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
malaltia A.
(b) Sigi X Po(α = 2) la variable aleat`oria que compta el nombre d’accidents en un mes. Aleshores,
∼
i. La probabilitat que en un mes hi hagi algun accident val P(X 1) = 1 P(X = 0) =
|     |     |     |       |     |        |     |     |     |     |     |     | ≥   |     | −   |
| --- | --- | --- | ----- | --- | ------ | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     | 1   | e α | = 1 e | 2   | 0,865. |     |     |     |     |     |     |     |     |     |
|     |     | −   |       | −   |        |     |     |     |     |     |     |     |     |     |
|     | −   |     | −     | ≈   |        |     |     |     |     |     |     |     |     |     |
ii. La variable Y que compta el nombre d’accidents en dos mesos segueix una llei Po(4). Per
|     | tant, | P(Y | = 4) | = e 4 | 44/4! | = e | 4 32/3 | 0,195. |     |     |     |     |     |     |
| --- | ----- | --- | ---- | ----- | ----- | --- | ------ | ------ | --- | --- | --- | --- | --- | --- |
|     |       |     |      | −     |       | −   |        |        |     |     |     |     |     |     |
|     |       |     |      |       | ·     |     | ·      | ≈      |     |     |     |     |     |     |
Alternativament, si posem Y = X +X , on les variables X ,X Po(2) s´on independents
|     |     |     |     |     |     |     | 1   | 2   |     |     | 1 2 | ∼   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
i representen el nombre d’accidents en el primer i segon mes, respectivament, llavors
|     |     |     | P(Y = | 4) = | P(X   | = 0,X | = 4)+P(X   |       | = 1,X | =   | 3)+P(X | =    | 2,X | = 2) |
| --- | --- | --- | ----- | ---- | ----- | ----- | ---------- | ----- | ----- | --- | ------ | ---- | --- | ---- |
|     |     |     |       |      | 1     |       | 2          |       | 1     | 2   |        | 1    |     | 2    |
|     |     |     |       | +P(X | 1     | = 3,X | 2 = 1)+P(X | 1     | = 4,X | 2 = | 0)     |      |     |      |
|     |     |     |       |      |       | 20    | 24         |       | 21    | 23  |        | 22   | 22  |      |
|     |     |     |       |      | 2     |       | 2          | 2     |       | 2   | 2      |      | 2   |      |
|     |     |     |       | =    | 2 e − | e     | − +2       | e −   | e −   | +   | e −    | e −  |     |      |
|     |     |     |       |      | ·     | 0! ·  | 4!         | ·     | 1! ·  | 3!  | ·      | 2! · | 2!  |      |
|     |     |     |       |      |       | 4 16  |            | 32    |       |     |        |      |     |      |
|     |     |     |       | =    | e 3   | +     | +4         | = e 4 | .     |     |        |      |     |      |
|     |     |     |       |      | −     |       |            | −     |       |     |        |      |     |      |
|     |     |     |       |      |       | 3     | 3          |       | 3     |     |        |      |     |      |
|     |     |     |       |      | !     |       | "          |       |       |     |        |      |     |      |
iii. La funci´o de probabilitat de X, condicionada a que en el mes hi ha hagut algun accident,
´es P(X = k X 1) = P(X = k)/P(X 1), k 1. Per tant, el nombre mitj`a d’accidents
|     |           |     | |      | ≥     |         |       |           | ≥    | ≥   |     |      |     |     |       |
| --- | --------- | --- | ------ | ----- | ------- | ----- | --------- | ---- | --- | --- | ---- | --- | --- | ----- |
|     | produ¨ıts |     | en els | mesos | en qu`e | hi ha | accidents | val  |     |     |      |     |     |       |
|     |           |     |        |       |         | 1     |           |      |     | 1   |      |     | 2   |       |
|     |           |     | E(X X  | 1)    | =       |       | kP(X      | = k) | =   |     | E(X) | =   |     | 2,31. |
|     |           |     |        |       |         | 2     |           |      |     | 2   |      |     | 2   |       |
|     |           |     | |      | ≥     | 1       | e     |           |      | 1   | e   |      | 1   | e   | ≈     |
|     |           |     |        |       | −       | −     | k 1       |      | −   | −   |      | −   | −   |       |
#≥
1

2. La funci´o de densitat de probabilitat d’una variable aleat`oria cont´ınua X val f (x) = λe λ(x a) si
X − −
x a, on a > 0 ´es un par`ametre, i f (x) = 0 altrament.
X
≥
(a) Determineu la funci´o de distribuci´o de probabilitat de X i calculeu E(X) i Var(X).
(b) Considereu la variable U = g(X), on g(x) = x 2a si x 2a i g(x) = 0 altrament. Calculeu
− ≥
P(U = 0).
(c) Determineu les funcions de distribuci´o i de densitat de probabilitat de la variable Y = X 2a .
| − |
(d) En aquest apartat λ = 1/4. En una mostra de mida 400 de la variable X s’ha observat una
mitjana mostral de valor 4,703. Determineu un interval de confian¸ca del 99% per al par`ametre a.
[Indicaci´o: SiF (z)´eslafunci´odedistribuci´od’unavariableN(0,1),aleshoresF (1,960) 0,975;
Z Z
≈
F (2,576) 0,995; F (2,326) 0,990.]
Z Z
≈ ≈
(3 punts)
Resoluci´o:
x
(a) La funci´o de distribuci´o de probabilitat de X val F (x) = f (u)du. Per tant, F (x) = 0 si
X X X
x < a, i si x a, llavors −∞
≥ $
x x a
F (x) = λe λ(x a)dx = − λe λudu = 1 e λ(x a).
X − − − − −
−
%a %0
L’esperan¸ca de X val
1
E(X) = ∞ xf
X
(x)dx = ∞ xλe
−
λ(x
−
a)dx = ∞ (a+u)λe
−
λudu = a+ .
λ
% %a %0
−∞
Finalment,
2 2
1 1 1
Var(X) = ∞ x a f (x)dx = ∞ u λe λudu = .
− − λ X − λ − λ2
% ! " %0 ! "
−∞
(b) D’acord amb la definici´o de g(x) tenim
P(U = 0) = P(g(X) = 0) = P(X < 2a) = F
X
(2a) = 1 e
−
λa.
−
(c) La variable aleat`oria Y = X 2a pren valors no negatius i, per tant, F (y) = 0 si y < 0. Si
Y
| − |
y 0, llavors
≥
F
Y
(y) = P(Y y) = P(2a y X 2a+y) = F
X
(2a+y) F
X
(2a y).
≤ − ≤ ≤ − −
Si 0 y < a, llavors F (2a+y) = 1 e λ(a+y) i F (2a y) = 1 e λ(a y), i, per tant, F (y) =
X − X − − Y
≤ − − −
e λ(a y) e λ(a+y). Altrament, si y a, aleshores F (2a+y) = 1 e λ(a+y), F (2a y) = 0
− − − X − X
− ≥ − −
perqu`e 2a y a, i F (y) = 1 e λ(a+y).
Y −
− ≤ −
Derivant F (y) respecte de y trobem la funci´o densitat de probabilitat f (y). Per tant, si y < 0,
Y Y
llavors f (y) = 0. Si 0 < y < a, aleshores f (y) = λ(e λ(a y) +e λ(a+y)). Finalment, si y > a,
Y y − − −
f (y) = λe λ(a+y).
Y −
(d) LamitjanamostralX
n
t´eesperan¸caE(X
n
) = E(X) = a+1/λivari`anciaVar(X
n
) = Var(X)/n =
1/(nλ2). Per tant, si n ´es gran, la distribuci´o de l’estad´ıstic
X a 1/λ
√n n − −
1/λ
´es aproximadament N(0,1). Si z
α/2
´es el valor cr´ıtic tal que si Z N(0,1), llavors P(Z > z
α/2
) =
∼
α/2, aleshores
X a 1/λ
P z α/2 √n n − − z α/2 1 α,
− ≤ 1/λ ≤ ≈ −
! "
2

´es a dir,
1 z 1 z
α/2 α/2
P X n 1+ a X n 1 1 α.
− λ √n ≤ ≤ − λ − √n ≈ −
! ! " ! ""
En el nostre cas, λ = 1/4, n = 400, x = 4,703, i z = 2,576. Aix´ı, l’interval obtingut ´es
α/2
2,576 2,576
4,703 4 1+ ; 4,703 4 1 = (0,188 ; 1,218).
− 20 − − 20
! ! " ! ""
3. Siguin X i Y variables aleat`ories cont´ınues independents tals que X Exp(λ) i Y Exp(1), amb
∼ ∼
0 < λ < 1.
(a) Calculeu la probabilitat P(X > Y).
(b) Sigui Z = X +Y i T = λX +Y.
i. Calculeu la densitat conjunta f (z,t) i comproveu que la regi´o on aquesta densitat ´es no
ZT
nul . la ´es (z,t) R 2 : z 0, λz t z .
{ ∈ ≥ ≤ ≤ }
ii. Determineu les densitats marginals de les variables aleat`ories Z i T.
iii. Determineu el millor estimador Z = g(T), en mitjana quadr`atica, de Z donada T.
(2,5 punts)
&
Resoluci´o.
(a) Com que les variables aleat`ories X i Y s´on independents, la seva funci´o de densitat conjunta ´es
f (x,y) = f (x)f (y). Per tant, f (x,y) = λe λx y si x,y > 0, i f (x,y) = 0 altrament.
XY X Y XY − − XY
Si D = (x,y) R 2 : x > y , aleshores,
{ ∈ }
P(X > Y) = f
XY
(x,y)dxdy
%%D
= ∞ ∞ f (x,y)dx dy = ∞ e y ∞ λe λxdx dy
XY − −
%0 !%y " %0 !%y "
1 1
= ∞ e (λ+1)ydy = ∞ (λ+1)e (λ+1)ydy = .
− −
λ+1 λ+1
%0 %0
(b) El valor absolut del jacobi`a de la transformaci´o definida pel sistema z = x+y,t = λx+y val
{ }
1 1
J(x,y) = det = 1 λ.
| | | λ 1 | −
! "
El sistema t´e soluci´o u´nica (x = (z t)/(1 λ) i y = (t λz)/(1 λ)) i la imatge de la regi´o
− − − −
Q = (x,y) R 2 : x,y > 0 ´es la regi´o Q ′ = (z,t) R 2 : z > 0, λz < t < z . Per tant,
{ ∈ } { ∈ }
1 λ
f (z,t) = f (x,y) = e t, (z,t) Q.
ZT 1 λ XY |(z,t) 1 λ − ∈ ′
− −
(c) LadensitatmarginaldelavariableZ valf Z (z) = ∞ f ZT (z,t)dt. Clarament, siz < 0, aleshores
f (z) = 0. D’altra banda, si z > 0, llavors −∞
Z
$
λ z λ
f (z) = e tdt = (e λz e z).
Z − − −
1 λ 1 λ −
−
%λz
−
La densitat marginal de T val f T (t) = ∞ f ZT (z,t)dz. Si t < 0, aleshores f T (t) = 0 i si t > 0,
llavors −∞
$ λe t t/λ
f (t) = − dz = te t.
T −
1 λ
−
%t
3

| La  | densitat | condicionada |     |     | f   | (z T | = t) est`a | definida | si  | t > 0 i | val |     |     |     |
| --- | -------- | ------------ | --- | --- | --- | ---- | ---------- | -------- | --- | ------- | --- | --- | --- | --- |
ZT
|     |     |     |     |      | |      | |   |       |         |     |     |     |     |       |     |
| --- | --- | --- | --- | ---- | ------ | --- | ----- | ------- | --- | --- | --- | --- | ----- | --- |
|     |     |     |     |      |        | f   | (z,t) | λe t/(1 | λ)  |     | 1   |     | t     |     |
|     |     |     | f   | (z T | = t) = | ZT  | =     | −       | −   | =   | ,   | t < | z < . |     |
Z T
|     |     |     | |   | |   |     | f   | (t) |     | te t | t/λ | t   |     | λ   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ---- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     | T   |     |     | −    |     | −   |     |     |     |
Aix´ı doncs, la variable Z condicionada per T = t ´es uniforme a l’interval [t,t/λ] i, per tant,
E(Z T = t) = (t + t/λ)/2 = (λ + 1)t/(2λ). La millor estimaci´o en mitjana quadr`atica de Z
|
| donada |     | T ´es: |     |     |     |     |     |     |     |     |     |     |     |     |
| ------ | --- | ------ | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
λ+1
|     |     |     |     |     |     |     | Z = E(Z | T)  | =   | T.  |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | ------- | --- | --- | --- | --- | --- | --- | --- |
2λ
|
&
4. Apartird’unamostra(X ,...,X )d’unavariablepoblacionalX ambdensitatdeprobabilitatf (x) =
|     |     |     |     | 1   | n   |     |     |     |     |     |     |     | X   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
λ2xe λx
− six > 0, determineul’estimadordem`aximaversemblan¸cadelpar`ametreθ = 1/λicomproveu
que coincideix amb l’estimador obtingut amb el m`etode dels moments. E´s un estimador no esbiaixat?
| Calculeu | la vari`ancia |     | de  | l’estimador. |     |     |     |     |     |     |     |     |           |     |
| -------- | ------------- | --- | --- | ------------ | --- | --- | --- | --- | --- | --- | --- | --- | --------- | --- |
|          |               |     |     |              |     |     |     |     |     |     |     |     | (2 punts) |     |
Resoluci´o.
La variable X ´es una variable Gamma de forma 2 i escala 1/λ, amb densitat de probabilitat
1
|     |     |     |     |     |         | λ2xe | λx  |     | x/θ, |     |     |     |     |     |
| --- | --- | --- | --- | --- | ------- | ---- | --- | --- | ---- | --- | --- | --- | --- | --- |
|     |     |     |     |     | f X (x) | =    | −   | =   | xe − | x > | 0.  |     |     |     |
θ2
Si X 1 = x 1 ,...,X n = x n ´es la mostra observada, aleshores la funci´o de versemblan¸ca ´es
| {   |     |     |     | }   |     |     |     |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
n
|     |     |     |     |     |     |     |     |     |     | 1   |     |     | ( n )/θ. |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | -------- | --- |
l (x ,...,x ;θ) = f (x ,...,x θ) = f (x θ) = x x e i=1 xi (1)
|     | n   | 1   | n   |     | X 1 |     | n   |     | X i | 2n  | 1   | n − |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     |     | |   |     | |   | θ   | ··· |     |     |     |
|     |     |     |     |     |     |     |     | i=1 |     |     |     |     | !   |     |
'
Ometent la depend`encia en x 1 ,...,x n i operant amb el logaritme neperi`a de la versemblan¸ca tenim
|     |     |     |     |     |     | n   |     |     |     | n   |     |     | n   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
1
|          |            | L (θ) | =   | logl | (θ) = | logf   | (x  | θ) = | 2nlogθ+ |     | logx |     | x . | (2) |
| -------- | ---------- | ----- | --- | ---- | ----- | ------ | --- | ---- | ------- | --- | ---- | --- | --- | --- |
|          |            | n     |     | n    |       |        | X i |      |         |     |      | i   | i   |     |
|          |            |       |     |      |       |        | |   |      | −       |     |      | − θ |     |     |
|          |            |       |     |      |       | i=1    |     |      |         | i=1 |      |     | i=1 |     |
|          |            |       |     |      |       | #      |     |      |         | #   |      |     | #   |     |
| Resolent | l’equaci´o |       |     |      |       |        |     |      |         |     |      |     |     |     |
|          |            |       |     |      |       | ∂L (θ) | 2n  |      | 1 n     |     |      |     |     |     |
n
|     |     |     |     |     |     |     | =   | +   | x    | = 0 |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ---- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     | ∂θ  | −   | θ   | θ2 i |     |     |     |     |     |
i=1
#
| obtenim | el valor |     |     |     |     |     |     |     |     |     |     |     |     |     |
| ------- | -------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
n
1
|     |     |     |     |     |     |     | θ = |     | x   |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     |     | ∗   | 2n  | i   |     |     |     |     |     |
i=1
#
que maximitza (2) i, per tant, (1). L’estimador de m`axima versemblan¸ca del par`ametre θ ´es doncs
|     |     |     |     |     |     |     | X   | 1 + | +X n |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ---- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     | Θ   | =   | ··· |      |     |     |     |     | (3) |
n
2n
| Si apliquem | el  | m`etode | dels | moments, |     | hem& | de plantejar |     | l’equaci´o |     |     |     |     |     |
| ----------- | --- | ------- | ---- | -------- | --- | ---- | ------------ | --- | ---------- | --- | --- | --- | --- | --- |
|             |     |         |      |          |     |      | x            | +   | +x         |     |     |     |     |     |
|             |     |         |      |          |     |      |              | 1   | n          |     |     |     |     |     |
|             |     |         |      |          |     | E(X) | =            | ··· | .          |     |     |     |     |     |
n
L’esperan¸ca de X val ∞λ2x2e λxdx = 2/λ = 2θ. Substituint a l’equaci´o anterior obtenim que el
|     |     |     |     | 0   | −   |     |     |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
valor estimat de θ ´es θ = (x + +x )/(2n). Aix´ı, l’estimador obtingut ´es novament (3).
|           |      |           | ∗ $ | 1        | ··· | n   |     |      |     |     |     |     |     |     |
| --------- | ---- | --------- | --- | -------- | --- | --- | --- | ---- | --- | --- | --- | --- | --- | --- |
| Es tracta | d’un | estimador |     | centrat, |     |     |     |      |     |     |     |     |     |     |
|           |      |           |     |          |     |     | 1   |      | 2θ  |     |     |     |     |     |
|           |      |           |     |          |     | E(Θ | ) = | E(X) | = = | θ,  |     |     |     |     |
n
|           |            |     |     |     |     |     | 2   |     | 2   |     |     |     |     |     |
| --------- | ---------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| i la seva | vari`ancia |     | val |     |     |     |     |     |     |     |     |     |     |     |
&
|     |     |     |       |     |         | X   | + +X |     | Var(X) |     | 2θ2 | θ2  |     |     |
| --- | --- | --- | ----- | --- | ------- | --- | ---- | --- | ------ | --- | --- | --- | --- | --- |
|     |     |     |       |     |         |     | 1    | n   |        |     |     |     |     |     |
|     |     |     | Var(Θ |     | ) = Var |     | ···  |     | =      | =   | =   | .   |     |     |
|     |     |     |       | n   |         |     | 2n   |     | 4n     |     | 4n  | 2n  |     |     |
|     |     |     |       |     |         | !   |      |     | "      |     |     |     |     |     |
(Els valors E(X) = 2θ i V&ar(X) = 2θ2 es poden obtenir per c`alcul directe a partir de f (x), o b´e
X
observant que la densitat Gamma de forma 2 i escala 1/λ ´es la d’una suma de dues variables Exp(λ),
independents.)
4
