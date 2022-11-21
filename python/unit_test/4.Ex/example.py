# Python code to demonstrate working of unittest 
import unittest 
  
class TestStringMethods(unittest.TestCase):
    """Sample test case"""
    
    # Setting up for the test
    def setUp(self):
        pass
    
    # Cleaning up after the test
    def tearDown(self):
        pass

    # Returns True if the string contains 6 a. 
    def test_strings_a(self): 
        self.assertEqual( 'a'*6, 'aaaaaa') 
  
    # Returns True if the string is in upper case. 
    def test_upper(self):
        self.assertEqual('love'.upper(), 'LOVE') 
  
    # Returns True if the string is in uppercase 
    # else returns False. 
    def test_isupper(self):
        self.assertTrue('LOVE'.isupper()) 
        self.assertFalse('Love'.isupper())  
  
if __name__ == '__main__': 
    unittest.main() 
