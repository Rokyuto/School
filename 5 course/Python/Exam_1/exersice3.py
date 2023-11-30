class Company:
    def __init__(self, name, foundDate ,employees_count):
        self.myName = name
        self.myFoundDate = foundDate
        self.myEmployeesCount = employees_count

    def __str__(self):
        return f'Company Name: {self.myName} , Fundation Date: {self.myFoundDate} , Employees Count: {self.myEmployeesCount}'

kaufland = Company("Kaufland",1984,132000)
print(kaufland.__str__())

class ITCompany(Company):
    def __init__(self,name, foundDate ,employees_count,area):
        super().__init__(name,foundDate,employees_count)
        self.myCompanyArea = area

    def printCompanyAreaAndEmployeesCount(self):
        print(f'Company Area: {self.myCompanyArea} , Company Employees Count: {self.myEmployeesCount}')

ca = ITCompany("Creative Asembly",1987,882,"Game Development")
print(ca.__str__())
ca.printCompanyAreaAndEmployeesCount()