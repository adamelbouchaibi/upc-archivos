import numpy as np
import matplotlib.pyplot as plt

# 1. Paràmetres de la distribució
p = 0.3      # Probabilitat d'èxit
k_max = 10   # Rang de k a representar

# 2. Valors de k
k_values = np.arange(0, k_max + 1)

# 3. Càlcul de la funció de distribució acumulada
F_k = np.where(k_values >= 1, 1 - (1 - p)**k_values, 0)

# 4. Creació del gràfic
plt.figure(figsize=(9, 5))

# Graficar com a funció escalonada contínua per la dreta
plt.step(k_values, F_k, where='post', color='#1f77b4', linewidth=2, label=r'$F_X(k) = 1 - (1-p)^k$')

# Marcar els punts discrets
plt.scatter(k_values[1:], F_k[1:], color='#1f77b4', zorder=5)

# Configuració i estètica del gràfic
plt.title('Funció de Distribució Acumulada (Geomètrica)', fontsize=14, pad=12)
plt.xlabel('$k$ (nombre d’assajos)', fontsize=12)
plt.ylabel(r'$F_X(k) = P(X \leq k)$', fontsize=12)  # Corregit \leq i prefix r
plt.xticks(k_values)
plt.ylim(-0.05, 1.05)
plt.grid(True, linestyle='--', alpha=0.5)
plt.legend(fontsize=11)

plt.tight_layout()
plt.show()