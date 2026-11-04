|              | Enginyeria |     | de           | Telecomunicacio´ |        |                |     | (GRETST) |     |           |
| ------------ | ---------- | --- | ------------ | ---------------- | ------ | -------------- | --- | -------- | --- | --------- |
|              |            |     | Probabilitat |                  |        | i Estad´ıstica |     |          |     |           |
| 31 d’octubre | de 2024    |     |              |                  | Examen | parcial        |     |          |     | Temps: 2h |
1. Tenim n parells de sabates marcats amb nu´meros de 1 a n. Les dues sabates de cada parell tenen el
| mateix nu´mero | i cada | parell t´e | un nu´mero |     | diferent. |     |     |     |     |     |
| -------------- | ------ | ---------- | ---------- | --- | --------- | --- | --- | --- | --- | --- |
(a) Si aparellem cada sabata del peu dret amb una sabata del peu esquerre, de quantes maneres
| diferents | les podem | aparellar? |     |     |     |     |     |     |     |     |
| --------- | --------- | ---------- | --- | --- | --- | --- | --- | --- | --- | --- |
(b) Suposem que tots els aparellaments s´on igualment probables. Quina ´es la probabilitat que com
a molt ens quedin dos parells en qu`e els nu´meros no coincideixen? (3 punts)
Resoluci´o
(a) Com que nom´es ens interessa saber quines parelles de sabates ens surten, podem imaginar que
col • loquem les sabates del peu esquerra en fila de la 1 a la n, i que anem situant les sabates
del peu dret al costat de les anteriors a l’atzar. Per tant, el nombre d’aparellaments diferents
E´s
´es el mateix que el nombre de permutacions de les n sabates del peu dret. a dir, tenim n!
| aparellaments | diferents. |     |     |     |     |     |     |     |     |     |
| ------------- | ---------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(b) Fixem-nos que podem tenir tots els parells amb els nu´meros coincidents, o b´e podem tenir
exactament dos parells en qu`e els nu´meros de les sabates no coincideixen, per`o en cap cas aix`o
pot pasar en exactament un parell. Com que aquests dos esdeveniments (tenir tots els parells
coincidents i tenir exactament dos parells amb nu´meros no coincidents) s´on incompatibles, en
calculem les probabilitats per separat i les sumem. Primer, hi ha una u´nica configuraci´o en qu`e
els n parells tenen els nu´meros de les dues sabates coincidents, de manera que
1
|     |     |     | P(totes |     | les parelles | concorden) |     | = . |     |     |
| --- | --- | --- | ------- | --- | ------------ | ---------- | --- | --- | --- | --- |
n!
Pel que fa a tenir dos parells en qu`e els nu´meros no coincideixen, aix`o passa si intercanviem
les sabates de dos parells. Com que tenim (cid:0)n(cid:1) maneres de triar els dos parells amb les sabates
2
intercanviades, aquest ´es el nombre de configuracions en qu`e passa aix`o. Per tant, tenim que
|           |                 |       |                   |     |            |               | (cid:18) (cid:19) |          |     |     |
| --------- | --------------- | ----- | ----------------- | --- | ---------- | ------------- | ----------------- | -------- | --- | --- |
|           |                 |       |                   |     |            | 1             | n                 | 1        |     |     |
|           |                 | P(dos | parells           | no  | concorden) | =             |                   | =        | .   |     |
|           |                 |       |                   |     |            | n!            | 2                 | 2·(n−2)! |     |     |
| En resum, | la probabilitat |       | de l’esdeveniment |     |            | de l’enunciat | ´es               |          |     |     |
|           |                 |       |                   | 1   | 1          | n(n−1)+2      |                   |          |     |     |
|           |                 |       |                   | +   |            | =             |                   | .        |     |     |
|           |                 |       |                   | n!  | 2·(n−2)!   |               | 2·n!              |          |     |     |
1

2. El nu´mero de missatges que envia un servidor ve donat per una variable aleat`oria geom`etrica de
par`ametrep. Cadamissatget´eunaprobabilitatr d’arribaradest´ı,iprobabilitatsdefallar(r+s = 1).
| Els missatges | enviats | s´on | independents | uns | dels altres. |     |     |     |
| ------------- | ------- | ---- | ------------ | --- | ------------ | --- | --- | --- |
(a) Calculeu la probabilitat de que almenys un dels missatges enviats arribi a dest´ı.
(b) Sabentquealgundelsmissatgeshaarribatadest´ı,calculeulaprobabilitatdequenom´essen’hagi
| enviat | un. |     |     |     |     |     |     | (3 punts) |
| ------ | --- | --- | --- | --- | --- | --- | --- | --------- |
Resoluci´o
Sigui X = Geom(p). Els possibles resultats s´on els nombres naturals positius, 1,2,3,...,k,..., i la
| probabilitat | de que | s’envi¨ın | k missatges | ´es |      |          |     |     |
| ------------ | ------ | --------- | ----------- | --- | ---- | -------- | --- | --- |
|              |        |           |             | P[X | = k] | = pqk−1. |     |     |
(a) Si s’envien k missatges, el nombre de missatges que arriben a dest´ı ´es una binomial Bin(k,r).
Calcular la probabilitat de que almenys un arribi a dest´ı ´es llarg, mentre que la probabilitat
contr`aria, ´es a dir, que no n’arribi cap, ´es f`acil: sk. Anomenem B a l’esdeveniment almenys un
missatge arriba a dest´ı. Aleshores apliquem la f´ormula de la probabilitat total:
∞
(cid:88)
|     |     | P[B] | = P[X | = k]P[B|X |     | = k] |     |     |
| --- | --- | ---- | ----- | --------- | --- | ---- | --- | --- |
k=1
|     |     |     | ∞                    |     |     | ∞                |     | p ∞            |
| --- | --- | --- | -------------------- | --- | --- | ---------------- | --- | -------------- |
|     |     |     | (cid:88) pqk−1(1−sk) |     |     | (cid:88) pqk−1sk |     | (cid:88) (qs)k |
|     |     |     | =                    |     | =   | 1−               | =   | 1−             |
q
|            |             |     | k=1         |           |      | k=1    |     | k=1 |
| ---------- | ----------- | --- | ----------- | --------- | ---- | ------ | --- | --- |
|            |             |     |             | ps        | 1−s  | r      |     |     |
|            |             |     | = 1−        | =         |      | =      | .   |     |
|            |             |     | 1−qs        |           | 1−qs | p+r−pr |     |     |
| (b) Nom´es | cal aplicar | la  | f´ormula de | Bayes:    |      |        |     |     |
|            |             |     | P[X         | = 1]P[B|X |      | = 1]   |     |     |
P[X
|     |     | = 1|B] | = (cid:80)∞ |       |         |      |     |     |
| --- | --- | ------ | ----------- | ----- | ------- | ---- | --- | --- |
|     |     |        |             | P[X = | k]P[B|X | = k] |     |     |
k=1
|     |     |     | pr     |             |     | (1−q)(1−s) |      |                |
| --- | --- | --- | ------ | ----------- | --- | ---------- | ---- | -------------- |
|     |     |     | =      | = p(p+r−pr) |     | =          |      | = (1−q)(1−qs). |
|     |     |     | r      |             |     |            | 1−s  |                |
|     |     |     | p+r−pr |             |     |            | 1−qs |                |
2

3. La densitat de probabilitat d’una variable aleat`oria cont´ınua X ´es
1
f (x) = e−|x−1|/s, −∞ < x < ∞,
X
2s
on s > 0 ´es un par`ametre.
(a) Calculeu l’esperan¸ca i la vari`ancia de X. Determineu la funci´o de distribuci´o de X i dibuixeu-la
per a s = 1. [ Indicaci´o: ∞ uke−udu = k! ]
(cid:114)0
(b) Calculeu la densitat condicionada f (x|X > 2). Quan val E(X|X > 2)?
X
(c) Determineu la densitat de la variable Y = |X − 1|. Quin tipus de densitat s’obt´e? Quan val
E(Y2)? Relacioneu aquest u´ltim resultat amb els c`alculs fets a l’apartat (a). (4 punts)
Resoluci´o
(a) La funci´o f (x) t´e simetria parella al voltant de l’eix x = 1. Aix´ı, ha de ser E(X) = 1. Pel que
X
fa a la vari`ancia de X, tenim:
(cid:18) (cid:19)
∞ 1 1 ∞
Var(X) = (x−1)2f (x)dx = (x−1)2e(x−1)/sdx+ (x−1)2e(x−1)/sdx
(cid:119) X (cid:119) (cid:119)
−∞ 2s −∞ 1
1 ∞ ∞
= (x−1)2e(x−1)/sdx = s2 u2e−udu = 2s2.
(cid:119) (cid:119)
s 1 0
x
La funci´o de distribuci´o de X ´es F (x) = f (t)dt. Per tant, si x < 1 llavors
X (cid:114)−∞ X
x 1 1 (x−1)/s 1
F (x) = e(t−1)/sdt = eudu = e(x−1)/s,
X (cid:119) (cid:119)
−∞ 2s 2 −∞ 2
i si x ⩾ 1,
∞ ∞ 1 1 ∞ 1
F (x) = 1− f (t)dt = 1− e−(t−1)/sdt = 1− e−udu = 1− e−(x−1)/s.
X (cid:119) X (cid:119) (cid:119)
x x 2s 2 (x−1)/s 2
(Vegeu la Figura 1.)
F X (x) 1.0
0.8
0.6
0.4
0.2
x
-2 -1 1 2 3 4
Figura 1: La funci´o de distribuci´o F (x) per a s=1
X
(b) Si x > 2, la densitat condicionada f (x|X > 2) ´es
X
f (x) f (x) e−(x−1)/s/(2s) 1
f (x|X > 2) = X = X = = e−(x−2)/s.
X P(X > 2) 1−F (2) e−1/s/2 s
X
D’altra banda,
∞
E(X|X > 2) = xf (x|X > 2)dx
(cid:119) X
−∞
∞ x ∞ ∞ ∞
= e−(x−2)/sdx = (2+su)e−udu = 2 e−udu+s ue−udu = 2+s.
(cid:119) (cid:119) (cid:119) (cid:119)
2 s 0 0 0
3

(c) Sigui Y = g(X) amb g(x) = |x − 1|. La funci´o g(x) ´es mon`otona a trossos i derivable a tot
arreu, excepte en x = 1. La variable Y ser`a, doncs, cont´ınua, i podem obtenir la seva densitat
| de probabilitat | aplicant | el  | teorema | del canvi | de variable. |     |     |     |
| --------------- | -------- | --- | ------- | --------- | ------------ | --- | --- | --- |
Si y < 0, l’equacio´ y = g(x) no t´e soluci´o i, per tant, si y < 0, tenim que f (y) = 0.
Y
Siy > 0, l’equaci´oy = g(x)t´eduessolucions, x = 1−y ix = 1+y. Am´es, |g′(x )| = |g′(x )| =
|              |        |            |           |         | 1      | 2     |        | 1 2 |
| ------------ | ------ | ---------- | --------- | ------- | ------ | ----- | ------ | --- |
| 1. Per tant, | si y > | 0, llavors |           |         |        |       |        |     |
|              |        |            |           |         | 1      | 1     | 1      |     |
|              |        |            |           |         | e−y/s+ | e−y/s | e−y/s. |     |
|              | f Y    | (y) = f    | X (1−y)+f | X (1+y) | =      |       | =      |     |
|              |        |            |           |         | 2s     | 2s    | s      |     |
La densitat f Y (y) ´es exponencial de par`ametre λ = 1/s. (El par`ametre s ´es l’esperanc¸a de Y.)
Aix´ı, E(Y2) = Var(Y)+E(Y)2 = s2 +s2 = 2s2, resultat que coincideix amb la vari`ancia de X,
E(X)
| ja que | = m | = 1 i |     |     |     |     |     |     |
| ------ | --- | ----- | --- | --- | --- | --- | --- | --- |
X
|     |     | E(cid:0) Y2(cid:1) | E(cid:0) | −1)2(cid:1) | E(cid:0) | )2(cid:1) |         |     |
| --- | --- | ------------------ | -------- | ----------- | -------- | --------- | ------- | --- |
|     |     |                    | =        | (X          | = (X −m  | =         | Var(X). |     |
X
4
