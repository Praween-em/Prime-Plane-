from sympy import isprime

number = (2**97)-1

if isprime(number):
    print(f"{number} is a prime number.")
else:
    print(f"{number} is not a prime number.")



