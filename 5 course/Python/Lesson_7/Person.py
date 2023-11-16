class Person:
    def __init__(self,fname,lname,age,nationality):
        self.first_name = fname
        self.last_name = lname
        self.age = age
        self.nationality = nationality

    def get_name(self):
        return self.first_name + " " + self.last_name

    def get_nationality(self):
        return self.nationality

p1 = Person("Viktor", "Asenov", 18, "Bulgarian")
print(p1.get_name())