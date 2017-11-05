class Circle:
    def __init__(self, radius):
        self.radius = radius
        self.perimeter = 2 * PI * radius

circle = Circle(2)
circle.perimeter = 1
# radius conflicts with perimeter!

