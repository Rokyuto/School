class Person:
    def __init__(self,name,age):
        self.name = name
        self.age = age
    def __str__(self):
       return f"Name: {self.name}, Age:{self.age}"


class Student(Person):

    def __init__(self, name, age, university, study_year):
        super().__init__(name, age)
        self.university = university
        self.study_year = study_year
    def __str__(self):
        return f"{super().__str__()}, University: {self.university}, Study Year: {self.study_year}"
student1 = Student("Viktor", 20, "Innovation University", 1)
print(student1.__str__())
