INTRODUCCIÓ A LES XARXES TELEMÀTIQUES (IXT)
1er CONTROL TEORIA – 30 de Març de 2016
NOM I COGNOMS:
Normas de realización de la prueba:
 En la resolución de los problemas se debe ser claro. Una resolución mal presentada o ilegible no será
corregida.
 La solución final de cada apartado debe quedar claramente expresada y dentro de un recuadro.
 Cada problema se debe entregar en hojas separadas. Las 4 preguntas se entregan juntas.
 Si tiene que utilizar una fórmula, escríbala previamente antes de sustituir los valores.
 Duración de la prueba: 2h.
 Publicación notas provisionales en ATENEA: 6 Abril 2016, 15:00
 Revisiones: Con vuestro/a profesor/a. La fecha os será comunicada por cada profesor/a.
 Publicación notas definitivas en ATENEA: 13 Abril 2016, 15:00
 No se permite la utilización de ningún tipo de dispositivo con capacidad de comunicación:
o Prohibido llevar encima el móvil o dispositivos similares con capacidades de comunicación.
o Todo móvil deberá ser apagado y guardado en mochila/bolso o bien será entregado voluntariamente
al profesor al inicio del examen (se lo devolverá al final del mismo).
o Si se observa que alguien hace uso de un dispositivo de comunicaciones (móvil), será expulsado del
examen y comunicado a dirección de la escuela. Se tomará la misma media aunque el móvil esté
apagado o en el bolsillo. No se puede llevar el móvil encima. Dejar el móvil apagado dentro de la
mochila/bolso.
o Se recomienda llevar otro sistema para saber la hora que no sea el móvil (reloj de pulsera).
Las preguntas test 1 y 2 se puntúan así: 2p si ambas están bien, 1-1/3=0,67 si una está bien y la otra mal,
0 si ambas están mal.
Pregunta1 (1p). Elija la respuesta verdadera sobre las técnicas de conmutación de paquetes en modo circuito
virtual (CxCV) y en modo datagrama (CxD).
a) En CxCV los paquetes pueden llegar fuera de orden al destino, aunque pueden ser reordenados gracias al
número de secuencia que los identifica.
b) En CxD los paquetes se encaminan en los nodos intermedios consultando el identificador de circuito virtual
al que pertenecen, consultando la tabla de encaminamiento y el protocolo de encaminamiento.
c) En CxD existen 3 fases en la comunicación: Establecimiento, Comunicación y Liberación.
d) Ninguna de las anteriores es correcta.
Pregunta 2 (1p). Elija la respuesta verdadera sobre las funciones básicas asociadas a cada nivel de la pila de
protocolos de la arquitectura TCP/IP.
a) Las funciones de control de flujo, para no inundar al receptor y poder regular la tasa de llegada de paquetes,
se realiza a nivel de Aplicación.
b) Las funciones de interacción con el usuario se realizan a nivel Físico.
c) Los niveles de Transporte y de Enlace incluyen funciones de control de errores.
d) Ninguna de las anteriores es correcta.
1

Pregunta 3. En un mecanisme de control d'errors per ARQ (Automatic Repeat reQuest) que té el comportament
del següent cronograma. Raoni quin hauria de ser el valor òptim (més eficient) del temporitzador de retransmissió
(T ), i què passa si utilitzem un temporitzador major o menor a l'òptim. (1 p)
out
Pregunta 4. Què passa en un mecanisme de control d'errors per ARQ Stop & Wait quan la trama de dades arriba
correctament i el reconeixement (ACK) es perd? Com es soluciona el problema ocasionat per aquest fet? (1 p)
Problema 1 (3p)
Una comunicación mediante conmutación de paquetes modo datagrama, consta de 2 enlaces a 128 y 256 Kbps
respectivamente. Los paquetes son de 256 Bytes en el primer enlace y no necesitan cabecera. En el nodo
intermedio cada paquete procedente del primer enlace se procesa durante 2ms en los que cada paquete se divide
en dos nuevos paquetes iguales a los que se añaden 20 Bytes de cabecera a cada uno para ser enviados por el
segundo enlace. Considere que el tiempo de proceso de los dos nodos extremos y los tiempos de propagación en
los enlaces son nulos. Calcule:
Nota: Considere que el tiempo de observación es el tiempo de transferencia del mensaje especificado en c).
a) (0.2p) Tiempo de transmisión de un paquete en el segundo enlace (es decir, de una mitad del paquete
original), incluyendo su cabecera.
b) (0.4p) Retardo extremo a extremo (desde que se empieza a mandar un paquete en el terminal emisor hasta
que ha sido recibido en el terminal receptor).
c) (0.4p) Tiempo total que se tarda en transferir un mensaje de 6912B (tiempo desde que sale el 1er bit del
emisor hasta que ha llegado todo el mensaje al receptor).
d) (0.4p) Tiempo máximo de proceso en el nodo intermedio para no restringir el caudal.
e) (0.4p) Throughput del segundo enlace (bits totales por segundo incluyendo la cabecera y los datos).
f) (0.4p) Utilización (o actividad) del primer enlace. Suponga que siempre hay datos listos para enviar en el
terminal emisor.
g) (0.4p) Eficiencia del protocolo del segundo enlace.
h) (0.4p) Utilización (o actividad) del segundo enlace.
2

Problema 2 (3p).
Una empresa dispone de dos sedes que se desea interconectar. Dichas sedes se encuentran separadas por 10
Km. Para llevar a cabo la conexión, se pretende emplear un enlace dedicado de 100 Mbps de capacidad. Para
asegurar la integridad de los datos recibidos, la empresa desea emplear un protocolo de nivel de enlace basado en
ARQ, que utiliza el tiempo de retransmisión (T ) mínimo y en el que las tramas son de longitud fija de tamaño 1500
out
bytes, de los cuales 26 bytes corresponden a la cabecera.
En este escenario, se asume lo siguiente:
● La velocidad de propagación del enlace dedicado es de 2·108 m/s.
● La probabilidad de que una trama de datos se reciba de forma errónea es de 0,012.
● El tamaño de los mensajes de reconocimiento (positivo o negativo) es de 26 bytes, incluida la cabecera.
● El tiempo de proceso del nodo A es despreciable, el tiempo de proceso del nodo B es de 10 µs.
● Los ACKs no tienen errores ni se pierden.
En primer lugar la empresa opta por un protocolo de control de errores basado en Stop & Wait. Bajo la suposición
de que no hubiera errores, se solicita:
a) Dibujar el cronograma de la comunicación correspondiente a la transmisión de al menos una trama de datos
(0.25 p).
b) Calcular el tiempo transcurrido desde que se inicia la transmisión de una trama hasta que se puede iniciar la
transmisión de la siguiente trama (0.5 p).
c) Calcular la cadencia (tramas de datos por unidad de tiempo) con la que se reciben las tramas en el nodo B
(0.25 p).
Teniendo en cuenta ahora la presencia de errores en la trama de datos, se solicita:
d) Calcular el tiempo medio transcurrido hasta enviar correctamente una trama de datos (1 p).
e) Calcular el caudal (o goodput) (bits de información de las tramas de datos recibidas correctamente por unidad
de tiempo, expresado en bits/seg) (0,5 p).
Con el objetivo de mejorar el caudal, la empresa se plantea aumentar el tamaño de las tramas a 3000 bytes,
manteniendo el tamaño de la cabecera. Este cambio implica que la probabilidad de que una trama se reciba con
errores, se duplica. Bajo esta premisa se pide:
f) Calcular el nuevo caudal (o goodput) obtenido Comente el resultado obtenido de modo razonado (0.5 p).
3

Solución
Pregunta1 (1p)..
 En conmutación de paquetes modo datagrama, cada paquete se encamina independientemente hacia
su destino. Los paquetes pueden seguir caminos distintos, pueden llegar desordenados. Los nodos
intermedios encaminan los paquetes utilizando información de las cabeceras de los paquetes (@ origen,
@ destino...), consutando sus tablas de encaminamiento y según sea el algoritmo de encaminamiento
que utilizan (routing protocol).
Conmutación de paquetes (modo circuito virtual) Conmutación de paquetes (modo datagrama)
Establecimiento del
circuito virtual
1 Envío de paquetes
2
3 1 1
2 2
3 1 3 1
2 2 Encaminamiento
3 3 1 de paquetes
2
Liberación del
3
circuito virtual
 En conmutación de paquetes modo circuito virtual, al inicio de la comunicación se establece un camino
virtual a través de los nodos intermedios desde origen a destino. Los nodos inermedios crean entradas
en sus tablas de encaminamiento indicando para ese cirtcuito virtual cuál es el camino (interfaz de
entrada y de salida). Una vez establecido el circuito virtual (con la reserva de recursos pertinente) se
envían todos los paquetes, que siguen el mismo camino, llegando en orden por tanto. Los nodos
intermedios solo necesitan consultar el identificador de circuito virtual, consultar su tabla de
encaminamiento y encaminar el paquete. Son 3 fases en la comunicación: (a) Establecimiento del CV, (b)
Comunicación y (c) Liberación de recursos.
 Como las respuestas a, b y c son falsas, la única correcta es la d.
4

Pregunta 2 (1p).
Aplicación Interacción con el usuario
Transporte
Distinción de procesos. Detección/corrección de errores (paquetes perdidos/erróneos)
Red
Encaminamiento de los paquetes. Control de la congestión.
Enlace
Control de errores de enlace. Control de flujo de paquetes.
Fisico
Codificación de línea. Modulación. Conectores y cables.
 La c es correcta
Pregunta 3:
El temporitzador òptim hauria de ser igual al RTT.
DADES
Si es fa un Tout menor, hi hauria retransmissions innecessàries o fins i tot el protocol no
funcionaria ja que es produiria la retransmissió continua de la mateixa trama.
Si es fa un Tout major perdrem temps abans de retransmetre.
ACK
En un cas real, es fa un Tout lleugerament major al RTT per poder assumir algun retard de
la xarxa.
Pregunta 4:
En cas de pèrdua de l'ACK, el transmissor tornarà a enviar la darrera trama i aquesta produirà un duplicat en el
receptor.
Per solventar-ho les trames es numeren i el receptor descarta les duplicades.
Problema 1 (se indica el cálculo de la solución)
a) Paquete en 2º tramo: 256/2+20=148B a 256 Kbps tarda 4,625 ms
b) 16+2+2*4,625=27,25ms
c) 6921/256=27 paquetes. Se tarda 27 veces el tiempo de transmisión 1er enlace (16 ms), más 1 Tp, más 2
tiempos de transmisión 2º enlace (4,625 ms). Tmensaje =27*16ms + 2ms + 2* 4,625ms = 443,25 ms.
d) El cuello de botella son los 16ms de transmisión en el primer enlace. Por debajo de esto se mantiene la
situación de 1 paquete cada 16ms y si Tp>16 ms se restringe el caudal.
5
TTR

e)  Throughput (2º enlace) = (datos+cabecera)/Tobs = (27*2*148*8 bits)/ (443.25 *10^‐3 seg) = 144,24
Kbps
f)  Utilización (1er enlace) = T(datos+cabecera)/Tobs = 27 * 16 ms / 443,25 ms = 0,9746
g)  Eficiencia prototoclo = 128/(20+128) = 0,8648
h)  Utilización (2º enlace) = T(datos+cabecera)/Tobs = 27 * 2*4,625 ms / 443,25 ms = 0,5634

Problema 2
a) Si no se producen errores, el mecanismo de stop & wait ARQ se comporta como estipula el mecanismo de
control de flujo subyacente. El cronograma correspondiente a la transmisión de una única trama se presenta a
continuación, donde D representa el tiempo de propagación, T  el tiempo de transmisión de una trama, T  el
x p
tiempo de procesado de dicha trama en el nodo B y Tx  es el tiempo de transmisión de un reconocimiento.
ack

Como el protocolo opera bajo el mecanismo de stop & wait, el proceso asociado a una trama será el que se
repita de forma indefinida para el resto de tramas.
b) Teniendo en cuenta el cronograma anterior, el tiempo que transcurre desde que se inicia la transmisión de una
trama hasta que se puede iniciar la transmisión de la siguiente trama es
| (cid:1846) (cid:3404)(cid:1830)(cid:3397)(cid:1846) | (cid:3397)(cid:1846) (cid:3397)(cid:1846) | (cid:3397)(cid:1830)(cid:3404)2(cid:1830)(cid:3397)(cid:1846) | (cid:3397)(cid:1846) (cid:3397)(cid:1846) | .                                        |
| --------------------------------------------------- | ----------------------------------------- | ------------------------------------------------------------- | ----------------------------------------- | ---------------------------------------- |
| (cid:2869)                                          | (cid:3051) (cid:3043)                     | (cid:3051)(cid:3276)(cid:3278)(cid:3286)                      | (cid:3051) (cid:3043)                     | (cid:3051)(cid:3276)(cid:3278)(cid:3286) |
El tiempo de propagación D se puede calcular como
|     | (cid:3031)                                         | (cid:2869)(cid:2868)(cid:3120)	(cid:3040)                      |     |     |
| --- | -------------------------------------------------- | -------------------------------------------------------------- | --- | --- |
|     | (cid:1830) (cid:3404)                              | (cid:3404) (cid:3404)50	μ(cid:1871).                           |     |     |
|     | (cid:3049)(cid:3291)(cid:3293)(cid:3290)(cid:3291) | (cid:2870)∗(cid:2869)(cid:2868)(cid:3124)(cid:3040)/(cid:3046) |     |     |
El tiempo de transmisión de una trama es
|     | (cid:1846) (cid:3404) (cid:3017) (cid:3404) | (cid:2869)(cid:2873)(cid:2868)(cid:2868)(cid:3401)(cid:2876)	(cid:3029)(cid:3036)(cid:3047)(cid:3046) (cid:3404)120	μ(cid:1871),  |     |     |
| --- | ------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------- | --- | --- |
(cid:3051) (cid:2869)(cid:2868)(cid:2868)(cid:3401)(cid:2869)(cid:2868)(cid:3122)	(cid:3029)(cid:3043)(cid:3046)
(cid:3003)
mientras que el de un reconocimiento es
|     | (cid:3017)(cid:3276)(cid:3278)(cid:3286)(cid:3404)  | (cid:2870)(cid:2874)(cid:3401)(cid:2876)	(cid:3029)(cid:3036)(cid:3047)(cid:3046)                     |     |     |
| --- | --------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | --- | --- |
|     | (cid:1846) (cid:3404)                               | (cid:3404)2,08	μ(cid:1871).                                                                           |     |     |
|     | (cid:3051)(cid:3276)(cid:3278)(cid:3286) (cid:3003) | (cid:2869)(cid:2868)(cid:2868)(cid:3401)(cid:2869)(cid:2868)(cid:3122)	(cid:3029)(cid:3043)(cid:3046) |     |     |
6

De esta forma, el tiempo T es igual a:
1
(cid:1846) (cid:3404)2(cid:1830)(cid:3397)(cid:1846) (cid:3397)(cid:1846) (cid:3397)(cid:1846) (cid:3404)2(cid:3401)50(cid:3397)120(cid:3397)10(cid:3397)2,08 μ(cid:1871)(cid:3404)232,08 μ(cid:1871).
(cid:2869) (cid:3051) (cid:3043) (cid:3051)(cid:3276)(cid:3278)(cid:3286)
c) Finalmente la cadencia puede calcularse como:
(cid:2869) (cid:3047)(cid:3045)(cid:3028)(cid:3040)(cid:3028) (cid:2869)
(cid:2019)(cid:3404) (cid:3404) (cid:3404)4308,86 (cid:1872)(cid:1870)(cid:1853)(cid:1865)(cid:1853)(cid:1871)/(cid:1871)(cid:1857)(cid:1859)(cid:1873)(cid:1866)(cid:1856)(cid:1867).
(cid:3021)(cid:3117) (cid:3046)(cid:3032)(cid:3034)(cid:3048)(cid:3041)(cid:3031)(cid:3042)(cid:3046) (cid:2870)(cid:2871)(cid:2870),(cid:2868)(cid:2876)(cid:3401)(cid:2869)(cid:2868)(cid:3127)(cid:3122)
d) Si la transmisión es correcta, el algoritmo de stop & wait tarda T segundos en permitir la transmisión de la
1
siguiente trama. Si por lo contrario la transmisión es incorrecta, el transmisor será consciente de ello transcurrido
T segundos, procediendo entonces a reenviar la trama incorrecta. Por consiguiente, cada reenvío implica añadir
1
al tiempo de transmisión un retardo igual a T segundos. De esta forma, podemos escribir el árbol de probabilidad
1
asociado a todas las situaciones posibles:
donde p es la probabilidad de que una trama se reciba de forma correcta, es decir, 1-q, con q = 0,012.
Por lo tanto, el tiempo medio transcurrido hasta que se envía una trama de forma correcta es
(cid:2998)
(cid:1846)(cid:3404)(cid:1868)(cid:3401)(cid:1846) (cid:3397)(cid:1869)(cid:1868)(cid:3401)2(cid:1846) (cid:3397)(cid:1869)(cid:2870)(cid:1868)(cid:3401)3(cid:1846) (cid:3397) (cid:3401)(cid:3401)(cid:3401) (cid:3404)(cid:1868)(cid:1846) (cid:3533)(cid:1861)(cid:3401)(cid:1869)(cid:3036)(cid:2879)(cid:2869)
(cid:2869) (cid:2869) (cid:2869) (cid:2869)
(cid:3036)(cid:2880)(cid:2869)
Tal y como se vio en clase, este tiempo se puede obtener derivando e integrando el sumatorio asociado
(cid:1846)(cid:3404)(cid:1868)(cid:1846) (cid:3404)(cid:1868)(cid:1846) (cid:3031) (cid:1516)∑(cid:2998) (cid:1861)(cid:3401)(cid:1869)(cid:3036)(cid:2879)(cid:2869) (cid:3404)(cid:1868)(cid:1846) (cid:3031) ∑(cid:2998) (cid:1516)(cid:1861)(cid:3401)(cid:1869)(cid:3036)(cid:2879)(cid:2869)(cid:1856) (cid:3404)(cid:1868)(cid:1846) (cid:3031) ∑(cid:2998) (cid:1869)(cid:3036) (cid:3404)(cid:1868)(cid:1846) (cid:3031) (cid:4672) (cid:3044) (cid:4673),
(cid:2869) (cid:2869)(cid:3031)(cid:3292) (cid:3036)(cid:2880)(cid:2869) (cid:2869)(cid:3031)(cid:3292) (cid:3036)(cid:2880)(cid:2869) (cid:3044) (cid:2869)(cid:3031)(cid:3292) (cid:3036)(cid:2880)(cid:2869) (cid:2869)(cid:3031)(cid:3292) (cid:2869)(cid:2879)(cid:3044)
(cid:1846)(cid:3404)(cid:1868)(cid:1846)
(cid:2869)
(cid:3404)
(cid:3021)(cid:3117)
(cid:3404)
(cid:2870)(cid:2871)(cid:2870),(cid:2868)(cid:2876)(cid:3401)(cid:2869)(cid:2868)(cid:3127)(cid:3122)
(cid:3404)234,89 (cid:2020)(cid:1871).
(cid:2869)(cid:4666)(cid:2869)(cid:2879)(cid:3044)(cid:4667)(cid:3118) (cid:2869)(cid:2879)(cid:3044) (cid:2868),(cid:2877)(cid:2876)(cid:2876)
e) Finalmente, podemos calcular el goodput como
(cid:1835) (cid:4666)1500(cid:3398)26(cid:4667)(cid:3401)8
(cid:1829) (cid:3404) (cid:3404) (cid:3404)50,2 (cid:1839)(cid:1854)(cid:1868)(cid:1871)
(cid:1846) 234,89(cid:3401)10(cid:2879)(cid:2874)
f) Si aumentamos el tamaño de la trama a 3000 bytes, se altera Tx, de forma que su valor pasa a ser el doble
que el anterior, es decir, 240 µs. De esta forma T pasa a valer
1
(cid:1846) (cid:3404)2(cid:1830)(cid:3397)(cid:1846) (cid:3397)(cid:1846) (cid:3397)(cid:1846) (cid:3404)2(cid:3401)50(cid:3397)240(cid:3397)10(cid:3397)2,08 μ(cid:1871)(cid:3404)352,08 μ(cid:1871)
(cid:2869) (cid:3051) (cid:3043) (cid:3051)(cid:3276)(cid:3278)(cid:3286)
Al modificar el tamaño de la trama, se duplica la probabilidad de que ésta se reciba de forma errónea, pasando
a esta probabilidad a valer 0,024. De esta forma, T toma por valor
(cid:1846) 352,08(cid:3401)10(cid:2879)(cid:2874)
(cid:1846)(cid:3404)
(cid:2869)
(cid:3404) (cid:3404)360,74 (cid:2020)(cid:1871)
1(cid:3398)(cid:1869) 0,976
7

El nuevo goodput será por tanto
(cid:1835) (cid:4666)3000(cid:3398)26(cid:4667)(cid:3401)8
(cid:1829) (cid:3404) (cid:3404) (cid:3404)65,95 (cid:1839)(cid:1854)(cid:1868)(cid:1871)
(cid:1846) 360,74(cid:3401)10(cid:2879)(cid:2874)
Es decir, el aumento del tamaño de trama y la consiguiente duplicación de la probabilidad de recibir una trama
errónea, se ha traducido en un aumento del 31,37% en el goodput.
Un aumento del tamaño de la trama conlleva un aumento en la probabilidad de que dicha trama se reciba de
forma errónea (a mayor número de bits a transmitir, mayor probabilidad de que alguno de los bits resulte erróneo).
De esta forma, la mejora en el goodput vendrá condicionada por el aumento de la probabilidad de recibir una
trama errónea.
Tal y como se ha podido observar, duplicar la trama (incremento del 100% en el tamaño de la misma) ha derivado
en un incremento del goodput en menor porcentaje (31.37%). Si la trama incrementara su tamaño en exceso,
podría darse el caso de que fuera muy probable que al menos uno de los bits de trama resultase erróneo,
incrementado notablemente el número de reintentos necesarios hasta enviar trama correctamente. Se podría el
caso entonces de que el goodput disminuyese en lugar de incrementarse, puesto que el factor negativo de los
reintentos superaría a las ventajas aportadas por el mayor tamaño de trama.
8
