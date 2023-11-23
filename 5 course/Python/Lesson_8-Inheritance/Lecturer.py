class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def __str__(self):
        return f"Name: {self.name}, Age:{self.age}"


class Lecturer(Person):
    def __init__(self, name, age, uni, exp ):
        super().__init__(name, age)
        self.university = uni
        self.experience = exp

    def __str__(self):
         return f"{super().__str__()}, University: {self.university}, Experience: {self.experience}"


lecturer1 = Lecturer("Проф. Асенов", 35, "Innovation University", 5)
print(lecturer1.__str__())

