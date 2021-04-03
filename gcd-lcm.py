raw_numbers = input("Enter numbers (e.g. 10 120 240 360):")
numbers = raw_numbers.split(" ")

def calculator(a, b):
    while(b > 0):
        temp = b
        b = a % b
        a = temp
    return a

resultofGCD = int(numbers[0])
resultofLCM = int(numbers[0])

for x in numbers:
    resultofGCD = calculator(resultofGCD, int(x))
    resultofLCM = resultofLCM * int((int(x) / calculator(resultofLCM, int(x))))
    


print("ebob: ",resultofGCD)
print("ekok: ",resultofLCM)
