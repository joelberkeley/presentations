class Animal:
    def move(self):
        self.energy -= 1

class Cat(Animal):
    def __init__(self):
        self.energy = 10

    def sleep(self):
        self.energy += 1

