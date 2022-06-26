# Fibonacci
Código elaborado para o processo seletivo da target Sistemas

Vou deixar aqui as respostas das outras questões:

1)SOMA = 91. 

3)
a)1,3,5,7,9</br>
b)2,4,8,16,32,64,128</br>
c)0,1,4,9,16,25,36,49</br>
d)4,16,36,64,100</br>
e)1,1,2,3,5,8,13</br>
f)2,10,12,16,17,18,19,200</br>

4)
carro - 110km/h Não para no pedágio Ribeirão Preto -> Franca 54m,55s</br>
caminhão 80km/h caminhão perde 10 minutos(2 pedágios de 5) Franca -> Ribeirão Preto 1H25m</br>
distância de Ribeirão Preto para Franca 100km.

Valocidade em m/s é dada por essa fórmula: (km/h * 1000)/3600</br>
carro = 30.56m/s</br>
caminhão = 22.23m/s, com o pedágio ficou em 19.05m/s, pois acresci os
600 segundos das duas paradas ao denominador</br>

De tal forma, vamos elaborar funções para sabermos o ponto de encontro
e assim, descobrimos qual veículo está mais próximo da cidade de Ribeirão Preto.</br>

função do carro 1: X1 = 0+30.56*t</br>
função do caminhão: X2 = 100000-19.05*t</br>

X1=X2</br>
0+30.56*t = 100000-19.05*t</br>
30.56*t+19.05*t = 100000</br>
49.61t = 100000</br>
t = 100000/49.61</br>
t = 2015,72s</br>
Ponto de encontro: substitui o t na primeira função = 0+30.56*2015.72 = 61.600m = 61,6km</br>
Podemos deduzir que o caminhão rodou por 38,4 km.</br>
Distância do caminhão para Ribeirão Preto; 100000-(19.05*2015.72) = 61.600m = 61,6km</br>
Ambos os veículos estão a mesma distância de Ribeirão Preto.</br>
