input = input()
inputSpliter = input.split(" ")
words = []
result = ""
for word in inputSpliter:
    if len(word) >= 3:
        result = result + " " + word
        
print(result)
