Enginyeria de Telecomunicaci´o (GRETST)
Probabilitat i Estad´ıstica. Grup 10
20 d’abril de 2022 Examen parcial Temps: 1h 50m
Notes provisionals: Atenea, 2 de maig. Els problemes tenen el mateix pes.
Revisi´o: 4 de maig, de 11:30 a 13:00, ed. C3, despatx 112.
1. Tenim dos daus equilibrats i un dau carregat per al qual P(2) = P(3) = P(4) = P(5) = P(6) i
P(1) = 3P(2). Seleccionem a l’atzar un dels tres daus i el llancem repetidament fins que la cara
“1” surt per primer cop. Diem N al nombre de llan¸caments efectuats.
(a) Calculeu P(N = n) i E(N).
(b) Si ha succe¨ıt N > 4, quan val la probabilitat que el dau seleccionat sigui el carregat.
(c) Volem decidir si el dau que s’ha seleccionat ´es el carregat. Ho fem d’acord amb l’estrat`egia
segu¨ent: si N ha pres un valor menor o igual a 4, decidim que el dau ´es el carregat;
altrament, si N > 4, decidim que el dau ´es equilibrat. Calculeu la probabilitat de decidir
err`oniament.
Resoluci´o.
(a) Siguin D i D els esdeveniments “hem seleccionat el dau carregat” i “hem seleccionat un
C E
dels daus equilibrats”, respectivament. Aleshores, aplicant el teorema de la probabilitat
total, tenim:
1 2
P(N = n) = P(N = n D
C
)+ P(N = n D
E
).
3 | 3 |
Pel dau carregat, la probabilitat d’obtenir la cara “1” val 3/8 i la probabilitat d’obtenir
una de les altres cinc cares ´es 1/8. Per tant, si hem seleccionat el dau carregat, N ´es una
variablealeat`oriageom`etricadepar`ametre3/8. Encanvi,sieldauseleccionat´esequilibrat,
N ´es una variable aleat`oria geom`etrica de par`ametre 1/6. Per tant,
1 5 n − 1 3 2 5 n − 1 1 5n − 1 2 5n − 1
P(N = n) = + = + · , n = 1,2,3,...
3 8 · 8 3 6 · 6 8n 3 6n
! " ! " ·
An`alogament,
1 2 1 8 2 44
E(N) = E(N D
C
)+ E(N D
E
) = + 6 = .
3 | 3 | 3 · 3 3 · 9
(b) Tenim
∞ ∞ 5 n − 1 3 3 (5/8)4 5 4
P(N > 4 D
C
) = P(N = n D
C
) = = = ,
| | 8 · 8 8 · 1 5/8 8
n=5 n=5! " − ! "
# #
i, an`alogament, P(N > 4
|
D E ) = ∞n=5 P(N = n
|
D E ) = (5/6)4. Per tant,
$ P(N > 4 D
C
)(1/3)
P(D
C
N > 4) = |
| P(N > 4 D
C
)(1/3)+P(N > 4 D
E
)(2/3)
| |
(5/8)4 81
= = 0,137.
(5/8)4+2(5/6)4 593 ≈
1

(c) Sigui P(!) la probabilitat de decidir err`oniament. Aleshores,
1 2
P(!) = P(! D
C
)+ P(! D
E
)
3 | 3 |
1 2
= P(N > 4 D
C
)+ P(N 4 D
E
)
3 | 3 ≤ |
4
1 5 2
= + (1 P(N > 4 D
E
))
3 · 8 3 − |
! "
4 4
1 5 2 5 394177
= + 1 = 0,396.
3 · 8 3 · − 6 995328 ≈
% &
! " ! "
2. Sigui X una variable aleat`oria cont´ınua amb funci´o densitat de probabilitat
0, x < 1
−
f (x) = 1+x, 1 x 0 .
X '
− ≤ ≤
( )e µx, x > 0
−
(a) Calculeu el valor de la constant µ(i determineu la funci´o de distribuci´o de probabilitat
*
F (x).
X
(b) Calculeu la densitat condicionada f (x X 0) i determineu E(X X 0).
X
| ≥ | ≥
(c) Determineu la densitat i l’esperan¸ca de la variable Y = e X .
−| |
Resoluci´o.
(a) La constant µ queda determinada per la condici´o ∞ f X (x)dx = 1. Per tant, com que
−∞
0 + 1 1
∞ f (x)dx = (1+x)dx+ ∞ e µxdx = + ,
X −
2 µ
, , 1 ,0
−∞ −
tenim que µ = 2.
x 1
F (x) = (1+u)du = (1+x)2;
X
2
, 1
−
i si x 0, aleshores
≥
x 1 1 1
F (x) = F (0)+ e 2udu = dx = + 1 e 2x = 1 e 2x.
X X − − −
2 2 − − 2
,0
- .
(b) La densitat condicionada f (x X 0) val
X
| ≥
0, x < 0
P(X 0 X = x)f
X
(x)
f (x X 0) = ≥ | = ,
X ' f (x)
| ≥ P(X ≥ 0) ( ) P(X X 0) = 2e − 2x, x > 0
≥
i, per tant, E(X X 0) = 1/2. (
*
| ≥
(c) La variable Y = e X pren valors en (0,1]. Si 0 < y < 1, l’equaci´o y = g(x) = e x t´e
−| | −| |
solucions x = lny i x = lny. D’altra banda, g (x) = ex si x < 0 i g (x) = e x si
1 2 ′ ′ −
− −
x > 0. Per tant, g (x ) = g (x ) = y. Aleshores, si 0 < y < 1,
′ 1 ′ 2
| | | |
f (x ) f (x )
X 1 X 2
f (y) = +
Y
g (x ) g (x )
| ′ 1 |/x1=lny | ′ 2 |/x2= lny
/ / −
/ /
/ y, / 0 < y < e 1
−
f (lny)+e2lny
X
= = ' ,
y ( ( ) 1+lny +y, e − 1 < y < 1
y
(
(
*
2

ja que si 0 < y < e 1, aleshores < lny < 1 y, per tant, f (lny) = 0; mentre que si
|     |     | −   | −∞  |     | −   |     | X   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
1
| e − < y | < 1, | llavors 1 < lny | < 0 | i f X (lny) | = 1+lny. |     |     |     |     |
| ------- | ---- | --------------- | --- | ----------- | -------- | --- | --- | --- | --- |
−
L’esperan¸ca de Y la podem calcular aplicant el teorema de l’esperan¸ca:
|      |     |           |     | 0          |     |      |      | 1 1 | 3+e |
| ---- | --- | --------- | --- | ---------- | --- | ---- | ---- | --- | --- |
|      |     | ∞ x       |     | ex(1+x)dx+ |     | ∞ xe | 2xdx |     |     |
| E(Y) | =   | e f (x)dx | =   |            |     | e    |      | = + | = . |
|      |     | −| | X    |     |            |     | −    | −    | e 3 | 3e  |
|      |     |           |     | 1          |     | ,0   |      |     |     |
|      | ,   | −∞        |     | , −        |     |      |      |     |     |
3
