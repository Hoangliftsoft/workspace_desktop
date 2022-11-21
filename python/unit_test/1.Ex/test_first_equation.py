import unittest
import first_equation

class TestFirst(unittest.TestCase):

    def text_find_x(self):
        args = (10,10)
        self.assertEqual(first_equation.find_x(*args),-1)

        args = (0,0)
        self.assertEqual(first_equation.find_x(*args),"ALL")

        args = (0,10)
        self.assertEqual(first_equation.find_x(*args),"NONE")

    def text_find_y(self):
        args = (10,10)
        self.assertEqual(first_equation.find_x(*args),-1)

        args = (0,0)
        self.assertEqual(first_equation.find_x(*args),"ALL")

        args = (0,10)
        self.assertEqual(first_equation.find_x(*args),"NONE")
