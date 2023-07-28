import matplotlib.pyplot as plt
from sympy import isprime

# Generating prime numbers up to a certain limit (e.g., 100)
limit = 100
prime_numbers = [num for num in range(2, limit) if isprime(num)]

x_coordinates = []
y_coordinates = []

for prime_number in prime_numbers:
    x_coordinates.append(prime_number)
    y_value = 2 ** prime_number - 1
    y_coordinates.append(prime_number)

# Plot the graph after the loop
plt.plot(x_coordinates, y_coordinates, marker='o', linestyle='-')

plt.xlabel('X-axis (Prime Numbers)')
plt.ylabel('Y-axis (2^x - 1)')
plt.title('Graph of y = 2^x - 1')

plt.show()
