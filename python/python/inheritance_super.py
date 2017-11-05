class Animal:
    def __init__(self, persistence):
        self.persistence = persistence

    def move(self):
        self.energy -= 1 / self.persistence

class Cat(Animal):
    def __init__(self, persistence):
        super().__init__(persistence)
        self.energy = 10

    def sleep(self):
        self.energy += 1

