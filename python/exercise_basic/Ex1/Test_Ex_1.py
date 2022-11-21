import unittest
import Ex_1

class Test_Ex1(unittest.TestCase):
    
    # Hàm kiểm tra lỗi hàm sum
    def test_sum(self):
        args = (Ex_1.first_digit,Ex_1.second_digit)
        self.assertEqual(Ex_1.sum(*args),30)

