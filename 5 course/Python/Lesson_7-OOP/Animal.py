class Animal:
    def __init__(self,type ,color, weight, location):
        self.type = type
        self.color = color
        self.weight = weight
        self.location = location

    def set_location(self, new_location):
        self.location = new_location

    def get_location(self):
        return self.location

    def eat(self):
        print("Animal is eating")

wolf = Animal("wolf", "gray", 7, "Bulgaria")
print(wolf.type)
print(wolf.get_location())
print(wolf.eat())
wolf.set_location("Spain")
print(wolf.get_location())