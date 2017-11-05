class Item:
    ids = []

    def __init__(self):
        self.__id = max(ids) + 1
        ids.append(self.__id)

    def __str__(self):  # human readable
        return 'An item'
        
    def __repr__(self):  # unique
        return '{}: {}'.format(self, self.id)
