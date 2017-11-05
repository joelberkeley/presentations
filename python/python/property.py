class Circle:
    def __init__(self, radius):
        self.radius = radius
        
    @property
    def perimeter(self):
    	return 2 * PI * radius
    	
circle = Circle(2)
circle.perimeter = 1  # AttributeError

