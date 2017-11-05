class Person:
    def __init__(self, name):
        self.__name = name
        
    @property
    def name(self):
        return self.__name
    	
    @name.setter
    def name(self, name):
        print("Setting name to " + name)
        self.__name = name

