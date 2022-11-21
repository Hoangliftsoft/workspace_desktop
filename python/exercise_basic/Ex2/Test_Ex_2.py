import unittest
import Ex_2

class Test_Ex2(unittest.TestCase):

    def test_sum(self):
        args = (int(Ex_2.first_number),int(Ex_2.second_number))
        self.assertEqual(Ex_2.sum(*args),30)

