F. probabilitat total: P(B) = P
F. Bayes: P(Ai|B) = P(B|Ai) P(Ai)

P
k

P(B|Ak) P(Ak) .

i P(B ∩ Ai) = P

i P(B|Ai) P(Ai).

(cid:16)
F. distribuci´o: FX(x) = PX(](cid:57)∞, x]) = P(X ≤ x) = P
T. Poisson: Si n → ∞, p → 0, i np → λ,
T. Moivre–Laplace: Si X ∼ Binom(n, p) i ˆX ∼ N (m = np, σ2 = np(1−p)), P(X=k) ≈ f ˆX(k) quan
n → ∞ i k ≈ np.

{ω ∈ Ω | X(ω) ≤ x}
pk(1−p)n−k → e−λ λk
k! .

(cid:16)n
k

(cid:17)

(cid:17)

.

F. distribuci´o i densitat condicionades: FX(x|B) = P(X≤x|B); fX(x|B) = F′

X(x|B); si I ⊂ R,

f (x|X∈I) = f (x)/P(X∈I).

F. prob. total i f. Bayes, cas continu: P(B|X=x) = f (x|B) P(B)

f (x)

f (x|B) =

P(B|X=x) f (x)

−∞ P(B|X=x′) f (x′) dx′ .

+∞

(cid:114)

; P(B) =

+∞
−∞ P(B|X=x) f (x) dx;
(cid:114)

F. canvi de variable: si Y = g(X) i y ∈ ΩY t´e antiimatges xi = hi(y), essent hi les inverses locals de g,

1

i fX(hi(y))

aleshores fY (y) = P
T. esperan¸ca: E[g(X)] =
Moment i moment central: mn = E[X n], µn = E [(X−m1)n]. V[X] = E[X 2] − (E[X])2.
Esperan¸ca condicionada: E[X|A] =

|g′(hi(y))|.
+∞
−∞dx fX(x) g(x).
(cid:114)

−∞dx fX(x|A) x. E[X] = P

i E[X|Ai] P(Ai).

+∞

Desigualtat de Txebixev: P

(cid:16)

|X−m| ≥ a

≤ σ2/a2.

(cid:114)

(cid:17)

Llei feble dels grans nombres (distribuci´o de Bernoulli). Sigui X el nombre d’`exits en la repetici´o n

vegades d’un experiment de Bernoulli. Per a tot ε > 0, limn→∞ P

(cid:16) (cid:12)
(cid:12)
(cid:12)

X
n − p

(cid:12)
(cid:12)
(cid:12) ≤ ε

(cid:17)

= 1.

variable

Bern(p)

ΩX

{0, 1}

Binom(n, p)

{0, 1, . . . , n}

Geom(p)

Poiss(α)

N -- {0}

N

PX (k)

PX (1) = p
(cid:0)n
k

(cid:1)pk(1 − p)n−k

(1 − p)k−1p

e−α αk/k!

m

p

np

1/p

α

σ2

p(1 − p)

np(1 − p)

(1 − p)/p2

α

HGeom(N, K, n)

[max(0, n+K−N ), min(n, K)]

BinomNeg(r, p)

{r, r+1, . . .}

(cid:1)

(cid:0)K
k
(cid:0)k−1
r−1

(cid:1)(cid:0)N −K
n−k

(cid:1)/(cid:0)N
(cid:1)pr(1−p)k−r

n

nK/N nK(N −K)(N −n)

N 2(N −1)

r/p

r(1−p)/p2

FX (x)

x−a
b−a

variable

ΩX

fX (x)

Unif(a, b)

[a, b]

1/(b−a)

Exp(λ)

[0, +∞[

λ e−λx

N(m, σ)

R

Cauchy(α) R

e− (x−m)2

2σ2

1√

2πσ

1
π

α
x2+α2

1 − e−λx
(cid:0)1+ erf (cid:0)x−m√

1
2

2σ

(cid:1)(cid:1) m

1

2 + 1

π arctan x

α

-

σ2

-

m

σ2

(a+b)/2

(b−a)2/12

1/λ

1/λ2

alguns valors cr´ıtics de la normal est`andard, p = FZ(z), z = QZ(p)

p

z

0.75

0.90

0.95

0.975

0.99

0.995

0.9975

0.999

0.674

1.282

1.645

1.960

2.326

2.576

2.807

3.090


