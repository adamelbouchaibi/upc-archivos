Enginyeria de Telecomunicaci´o
Probabilitat i Estad´ıstica (GRETST)
10 de gener de 2024 Examen final Temps: 3 h
Notes provisionals: 18 de gener, Atenea
1. En l’urna A hi ha 3 boles blanques i 7 de vermelles. A l’urna B hi ha 8 boles blanques i 2 de vermelles.
(a) Triem una urna aleat`oriament i traiem dues boles. Quina ´es la probabilitat de que siguin dues
blanques?
(b) Ja hem tret les dues boles d’una urna aleat`oria i han sortit dues boles blanques. Quina ´es la
probabilitat de que les haguem tret de l’urna A?
(c) Finalment traiem una bola de cada urna, i ara ens han sortit una blanca i una vermella. Quina
´es la probabilitat de que la bola blanca vingui de l’urna A? (2 punts)
Resoluci´o.
(a) La probabilitat que les dues boles extretes siguin blanques val
P(2 blanques) = P(2 blanques A)P(A)+P(2 blanques B)P(B)
| |
3 7 8 2
1 1 3 28 31
= 2 0 + 2 0 = + = .
2 10 10 2 45 45 90
󰀣󰀃 󰀄2󰀃 󰀄 󰀃 󰀄2󰀃 󰀄󰀤 󰀕 󰀖
󰀃 󰀄 󰀃 󰀄
(b) Aplicant la f´ormula de Bayes tenim:
P(2 blanques A)P(A) 3/90 3
P(A 2 blanques) = | = = .
| P(2 blanques) 31/90 31
(c) Si traiem una bola de cada urna, la probabilitat que una sigui blanca i l’altra vermella ´es
P(una blanca, una vermella) = P(blanca de A, vermella de B)+P(vermella de A, blanca de B)
3 2 7 8 31
= + = .
10 · 10 10 · 10 50
Aleshores, la probabilitat de que la bola blanca vingui de l’urna A ´es
P(blanca de A, vermella de B) 3/50 3
P(blanca de A una blanca, una vermella) = = = .
| P(una blanca, una vermella) 31/50 31
2. El consum mensual d’aigua d’una llar segueix una distribuci´o normal amb mitjana µ = 10 m3 i
desviaci´o t´ıpica σ = 2 m3. La quantitat a pagar cada mes dep`en del consum. Hi ha una tarifa m´ınima
de 10 euros fins a 8 m3, i es paga 2 euros per cada metre cu´bic addicional fins als 12 m3. Per sobre
d’aquest consum, el preu ´es 3 euros per metre cu´bic.
(a) Quina ´es la probabilitat que la factura estigui entre 12 i 16 euros?
(b) Descriviu la variable aleat`oria U corresponent a la factura mensual. E´s una variable aleat`oria
cont´ınua? Determineu-ne l’esperan¸ca (3 punts)
Resoluci´o.
Sigui X la variable aleat`oria que d´ona el consum mensual. Aleshores, X N(µ,σ) amb µ = 10 m3 i
∼
σ = 2 m3.
1

(a) D’acord amb l’enunciat, la factura mensual estar`a entre 12 i 16 euros si i nom´es si succeeix
9 < X 󰃑 11, i la probabilitat d’aquest esdeveniment val
9 10 X µ 11 10
P(9 < X 󰃑 11) = P − < − 󰃑 − = P( 0.5 < Z 󰃑 0.5)
2 σ 2 −
󰀕 󰀖
= F (0.5) F ( 0.5) = 2F (0.5) 1 = 2 0.691 1 0.382.
Z Z Z
− − − · − ≈
(b) La variable U corresponent a la factura mensual ´es U = g(X), amb
10, x 󰃑 8
g(x) = 󰀻 2x 6, 8 < x 󰃑 12 .
−
󰁁
󰀿3x 18, x > 12
−
󰁁
󰀽
Aquesta variable aleat`oria no ´es cont´ınua perqu`e P(U = 10) > 0.
Finalment, pel teorema de l’esperan¸ca,
8 12
E[U] =
󵁍
∞ g(x)f
X
(x)dx =
󵁍
10f
X
(x)dx+
󵁍
(2x 6)f
X
(x)dx+
󵁍
∞(3x 18)f
X
(x)dx
8 − 12 −
−∞ −∞
1 1
= 10 − f (z)dz+ (4z+14)f (z)dz+ ∞(6z+12)f (z)dz
󵁍 Z 󵁍 Z 󵁍 Z
1 1
−∞ −
= 10F ( 1)+14(F (1) F ( 1))+6 ∞zf (z)dz+12(1 F (1))
Z Z Z 󵁍 Z Z
− − − 1 −
= 10(1 F (1))+14(2F (1) 1)+12(1 F (1))+6 ∞zf (z)dz
Z Z Z 󵁍 Z
− − − 1
6e 1/2
−
= 8+6F (1)+ = 8+6 0.841+1.452 14.50,
Z
√2π · ≈
1
on hem fet el canvi z = (x µ)/σ, ´es a dir, x = 2z+10, i hem tingut en compte que zf(z)dz = 0
− 󵁈 1
i que −
1 1 e 1/2
∞zf (z)dz = ∞ ze z2/2dz = e z2/2 ∞ = − .
󵁍 Z 󵁍 − −
1 1 √2π √2π − 1 √2π
󰁫 󰁬
3. Siguin X i Y variables aleat`ories independents i uniformes a l’interval [0,2], i sigui Z = Y/X.
(a) Determineu la funci´o de densitat f (z) calculant pr`eviament la funci´o de distribuci´o F (z).
Z Z
(b) Considereu el canvi Z = Y/X, T = X. Determineu la densitat conjunta de les variables Z i T, i,
a partir d’ella, obteniu les densitats marginals de Z i de T. Comproveu que el resultat obtingut
per a f (z) coincideix amb el de l’apartat anterior. Qu`e podeu dir sobre la densitat de T?
Z
[Indicaci´o: Proveu que f (z,t) > 0 si 0 < t < 2, 0 < z < 2/t.]
ZT
(c) Determineu la densitat condicionada f
ZT
(z T = t) i l’esperan¸ca condicionada E[Z T].
| | |
(3 punts)
Resoluci´o.
(a) La densitat conjunta de les variables X i Y ´es
1
f XY (x,y) = f X (x)f Y (y) = , 0 󰃑 x,y 󰃑 2.
4
La variable Z = Y/X pren valors no negatius i, per tant, F (z) = 0 si z < 0.
Z
Sigui z 󰃍 0 i considerem les regions S z = (x,y) R 2: y 󰃑 zx i Q = (x,y) R 2: 0 󰃑 x,y 󰃑 2 .
{ ∈ } { ∈ }
Aleshores,
1 a(S Q)
z
F Z (z) = P(Z 󰃑 z) = P(Y 󰃑 zX) = 󵁎 f XY (x,y)dxdy = 󵁎 dxdy = ∩ .
4 4
Sz Sz Q
∩
La regi´o S ´es el semipl`a que queda a la dreta de la recta y = zx i Q ´es el quadrat [0,2] [0,2]. Per
z
×
tant, si 0 󰃑 z < 1, S Z Q ´es el triangle de v`ertexs (0,0),(2,0),(2,2z) que t´e `area 2z, mentre que si
∩
2

z 1, S Q = Q T , on T ´es ara el triangle de v`ertexs (0,0),(2/z),(2/z,2), i a(S Q) = 4 2/z.
|        | 󰃍   | z      | z   |     | z   |     |     |     |     |     |     | z   |     |
| ------ | --- | ------ | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|        |     | ∩      | \   |     |     |     |     |     |     |     |     | ∩   | −   |
| Aix´ı, | si  | z 󰃍 0, |     |     |     |     |     |     |     |     |     |     |     |
z
|     |     |     |     |     |     |     |     |     | ,   | 0 󰃑 z | < 1 |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ----- | --- | --- | --- |
|     |     |     |     |     |     | a(S | Q)  | 2   |     |       |     |     |     |
z
|     |     |     |     |     | F Z (z) = |     | ∩   | = 󰀻 |     |     | .   |     |     |
| --- | --- | --- | --- | --- | --------- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     |           |     | 4   |     | 1   |     |     |     |     |
|     |     |     |     |     |           |     |     | 󰁁 1 | ,   | z 1 |     |     |     |
|     |     |     |     |     |           |     |     | 󰀿   |     | 󰃍   |     |     |     |
− 2z
󰁁
| La  | densitat | de la | variable | Z   | ´es |     |     | 󰀽   |     |     |     |     |     |
| --- | -------- | ----- | -------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
1
|     |     |     |     |     |     |     |     | ,   | 0   | < z < | 1   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ----- | --- | --- | --- |
2
|     |     |     |     |     | f (z) | = F | (z) | = 󰀻 |     |     | .   |     |     |
| --- | --- | --- | --- | --- | ----- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     | Z     |     | Z′  |     |     |     |     |     |     |
󰁁 1
|     |     |     |     |     |     |     |     | 󰁁 󰀿 | , z | > 1 |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
2z2
󰁁
󰁁
󰀽
(b) La transformaci´o definida per les equacions z = y/x, t = x aplica l’interior de la regi´o Q en
|     |     |     |     |     |     |     |     | {   |     | }   |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Q = (z,t) 2: 0 < t < 2, 0 < z < 2/t . (En efecte, si 0 < x < 2, aleshores 0 < t < 2, i si
|     | ′   |     | R   |     |     |     |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     | {   | ∈   |     |     |     |     | }   |     |     |     |     |     |     |
0 < y < 2, llavors 0 < z < 2/t, ja que z = y/x = y/t.) A m´es, cada punt (z,t) Q ´es imatge de
′
∈
| l’u´nic | punt | (x = | t,y = | zt) | Q, i el | jacobi`a | val |     |     |     |     |     |     |
| ------- | ---- | ---- | ----- | --- | ------- | -------- | --- | --- | --- | --- | --- | --- | --- |
∈
y/x2
|     |     |     |     |     |     |        |     |     | 1/x | 1   |     |     |     |
| --- | --- | --- | --- | --- | --- | ------ | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     | J(x,y) | = − |     | =   | .   |     |     |     |
|     |     |     |     |     |     |        |     | 1   | 0   |     |     |     |     |
−x
|     |       |          |     |     |     |     | 󰀏   |     | 󰀏   |     |     |     |     |
| --- | ----- | -------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |       |          |     |     |     |     | 󰀏   |     | 󰀏   |     |     |     |     |
|     |       |          |     |     |     |     | 󰀏   |     | 󰀏   |     |     |     |     |
| Per | tant, | si (z,t) | Q   | ,   |     |     |     |     |     |     |     |     |     |
|     |       |          | ′   |     |     |     | 󰀏   |     | 󰀏   |     |     |     |     |
∈
|     |     |     |     |     |         |     | f (x,y) |     |     | 1/4 | t   |     |     |
| --- | --- | --- | --- | --- | ------- | --- | ------- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     | f (z,t) | =   | XY      |     |     | =   | = . |     |     |
ZT
|     |     |     |     |     |     |     | J(x,y) |             |     | 1/t | 4   |     |     |
| --- | --- | --- | --- | --- | --- | --- | ------ | ----------- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     |     | |      | | 󰀏x=t,y=zt |     |     |     |     |     |
󰀏
󰀏
La densitat marginal de Z ´es f (z) = ∞ f (z,󰀏t)dt. Com que Q tamb´e es pot expressar com
|     |     |     |     |     | Z   | 󵁈   |     | ZT  |     |     | ′   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
−∞
(z.t) R 2: 0 < z < 1, 0 < t < 2 (z.t) R 2: z 󰃍 1, 0 < t < 2/z , obtenim, per a z > 0,
| {   | ∈   |     |     |     | }∪{ |     | ∈   |        |     |         | }   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | ------ | --- | ------- | --- | --- | --- |
|     |     |     |     |     |     |     | 2 t | 1      |     |         |     |     |     |
|     |     |     |     |     |     |     | 󵁍   | dt = , |     | 0 < z < | 1   |     |     |
|     |     |     |     |     |     |     | 4   | 2      |     |         |     |     |     |
0
|     |     |     |     |     | f Z (z) | = 󰀻 |     |       |     |       | .   |     |     |
| --- | --- | --- | --- | --- | ------- | --- | --- | ----- | --- | ----- | --- | --- | --- |
|     |     |     |     |     |         |     |     | t     | 1   |       |     |     |     |
|     |     |     |     |     |         | 󰁁 󰁁 | 2/z |       |     |       |     |     |     |
|     |     |     |     |     |         | 󰀿󵁍  |     | dt =  | ,   | z > 1 |     |     |     |
|     |     |     |     |     |         |     |     | 4 2z2 |     |       |     |     |     |
0
󰁁
| Aix´ı,  | tornem | a      | obtenir | el resultat | de  | l’a󰀽partat 󰁁 |     | anterior. |     |     |     |     |     |
| ------- | ------ | ------ | ------- | ----------- | --- | ------------ | --- | --------- | --- | --- | --- | --- | --- |
| D’altra |        | banda, | si 0 <  | t < 2,      |     |              |     |           |     |     |     |     |     |
|         |        |        |         |             |     |              |     |           | t   | 2/t | 1   |     |     |
∞
|     |     |     |     |     | f T (t) | = 󵁍 | f ZT | (z,t)dz | = 󵁍 | dz  | = . |     |     |
| --- | --- | --- | --- | --- | ------- | --- | ---- | ------- | --- | --- | --- | --- | --- |
|     |     |     |     |     |         |     |      |         | 4   | 0   | 2   |     |     |
−∞
La variable T ´es uniforme en [0,2], consequ¨entment amb el fet que T = X.
(c) Si 0 < t < 2, la densitat condicionada f (z T = t) est`a ben definida i val
ZT
|     |     |     |     |     |        |      | |       | |   |     |     |            |     |     |
| --- | --- | --- | --- | --- | ------ | ---- | ------- | --- | --- | --- | ---------- | --- | --- |
|     |     |     |     |     |        |      | f (z,t) | t/4 |     | t   |            |     |     |
|     |     |     |     | f   | (z T = | t) = | ZT      | =   | =   | , 0 | < z < 2/t. |     |     |
ZT
|     |     |     |     | |   | |   |     | f (t) | 1/2 |     | 2   |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | ----- | --- | --- | --- | --- | --- | --- |
T
La variable Z condicionada per T = t ´es uniforme a l’interval [0,2/t], i, per tant, E[Z T = t] = 1/t,
|
| ´es | a dir | E[Z T] | = 1/T. |     |     |     |     |     |     |     |     |     |     |
| --- | ----- | ------ | ------ | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|
| 4. Les | dues | qu¨estions | s´on | independents. |     |     |     |     |     |     |     |     |     |
| ------ | ---- | ---------- | ---- | ------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(a) A partir d’una mostra aleat`oria X ,...,X , determineu l’estimador Θ de m`axima versemblan¸ca
|     |     |     |     |     |     | 1   |     | n   |     |     | n   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
de la vari`ancia θ d’una poblaci´o gaussiana d’esperan¸ca µ coneguda. Demostreu que Θ ´es no
n
esbiaixat i calculeu el seu error quadr`atic mitj`a. [Indicaci´o: E[(X 󰁥µ)4] = 3θ2.]
−
󰁥
(b) Sospitem que una moneda no ´es justa. La tirem 1000 vegades i ens surten 683 cares. Trobeu un
interval de confian¸ca al 95% per a la probabilitat de treure cara. Feu tamb´e un test d’hip`otesi
bilateral que accepti o refusi la hip`otesi de que la probabilitat de treure cara ´es 0.6. Podem
|     | assegurar | que | la  | moneda | no ´es | justa? |     |     |     |     |     |     | (2 punts) |
| --- | --------- | --- | --- | ------ | ------ | ------ | --- | --- | --- | --- | --- | --- | --------- |
3

Resoluci´o.
(a) La densitat de probabilitat de la variable poblacional X ´es
1
f (x θ) = e (x µ)2/(2θ), < x < .
X − −
| √2πθ −∞ ∞
Donats els valors x ,...x presos per la mostra, el logaritme de la funci´o de versemblan¸ca ´es
1 n
n n 1 1 (x µ)2
i
L (θ) = logf (x θ) = log(2π) logθ −
n X i
| −2 − 2 − 2θ
i=1 i=1󰀕 󰀖
󰁛 󰁛
n n n (x µ)2
i
= log(2π) logθ − .
−2 − 2 − 2θ
i=1
󰁛
Aix´ı, plantejant l’equaci´o
n
n 1
L (θ) = + (x µ)2 = 0
′n −2θ 2θ2 i −
i=1
󰁛
obtenim el valor θ = n (x µ)2 /n que maximitza L (θ). Per tant,
∗ i=1 i − n
󰀃󰁓 󰀄(X µ)2+ +(X µ)2
1 n
Θ = − ··· − .
n
n
L’estimador obtingut ´es la mitjan󰁥a mostral de les variables (X i µ)2, 1 󰃑 i 󰃑 n. Aquest resultat ´es
−
consequ¨ent amb el fet que θ = E[(X µ)2]. Es tracta doncs d’un estimador no esbiaixat i consistent.
−
En efecte, E[Θ
n
] = E[(X µ)2] = θ i l’error quadr`atic val
−
󰁥 E (Θ n θ)2 = Var[Θ n ] =
Var[(X
−
µ)2]
=
E[(X
−
µ
0
)4]
−
θ2
=
2θ2
.
− n n n
󰁫 󰁬
(En la deducci´o ant󰁥erior s’ha tingut󰁥en compte que, d’acord amb la indicaci´o, E[(X µ)4] = 3θ2.)
−
(b) El valor estimat de la probabilitat de cara p ´es la frequ¨`encia relativa pˆ= 683/1000 = 0.683. Sigui
z l’argument tal que F (z ) = 0.975, ´es a dir, z 1.960. Aleshores, l’interval de confian¸ca al 95%
c Z c c
≈
per al par`ametre p ´es
pˆ(1 pˆ) pˆ(1 pˆ)
pˆ z − , pˆ+z −
c c
− n n
󰀣 󰁵 󰁵 󰀤
0.683(1 0.683) 0.683(1 0.683)
= 0.683 1.960 − , 0.683+1.960 − = (0.654, 0.712).
− 1000 1000
󰀣 󰁵 󰁵 󰀤
.
Ara volem contrastar la hip`otesi nulla H := p = p = 0.6 amb la hip`otesi alternativa H := p =
0 0 0
{ } { ∕
0.6 . Si H ´es certa, l’estad´ıstic
0
}
pˆ p pˆ 0.6
0
Z = − = −
p (1 p )/n 0.6(1 0.6)/1000
0 0
− −
´es comporta aproximadament com󰁳una normal est`an󰁳dard. El valor pres per Z ha estat
0.683 0.6
z ∗ = − 5.358.
0.6(1 0.6)/1000 ≈
−
Aix´ı, el valor P del test ´es 2P(Z 󰃍 z ∗ )󰁳= 2P(Z 󰃍 5.358) < 2P(Z > 3.090) 0.002. Aquest valor P
. ≈
tant petit ens fa rebutjar la hip`otesi nulla.
.
Si la hip`otesi nulla hagu´es estat p = 0.5, el valor z hauria sigut
∗
0.683 0.5
z ∗ = − 11.574,
0.5(1 0.5)/1000 ≈
−
encara molt m´es extrem. No podem ac󰁳ceptar que la moneda sigui justa. (Aquesta conclusi´o tamb´e la
obtenim a partir de l’interval de confian¸ca calculat abans.)
4
