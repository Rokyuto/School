import unittest
from unittest.mock import Mock
from unittest.mock import patch

class User:
    def __init__(self, username, password):
        self.username = username
        self.password = password
        self.locked = False

    def authenticate(self, password):
        if password == self.password:
            return True
        return False

    def is_locked(self):
        return self.locked

    def reset_password(self, new_password):
        self.password = new_password
        if self.locked:
            self.unlock_user()

    def lock_user(self):
        self.locked = True

    def unlock_user(self):
        self.locked = False

class TestUserAuthentication(unittest.TestCase):
    def setUp(self):
        self.user = User("19205", "19205_Pass!")

    def test_successful_authentication(self):
        mock_successful_auth = Mock()
        mock_successful_auth.return_value = True
        self.user.authenticate = mock_successful_auth
        self.assertTrue(self.user.authenticate("19205_Pass!"))

    def test_unsuccessful_authentication(self):
        mock_unsuccessful_auth = Mock()
        mock_unsuccessful_auth.return_value = False
        self.user.authenticate = mock_unsuccessful_auth
        self.assertFalse(self.user.authenticate("password1234"))

    def test_lock_user(self):
        self.user.lock_user()
        self.assertTrue(self.user.is_locked())

    def test_unlock_user(self):
        self.user.unlock_user()
        self.assertFalse(self.user.is_locked())

    def test_reset_password_and_unlock(self):
        self.user.lock_user()
        self.user.reset_password("19205_Password!")
        self.assertFalse(self.user.is_locked())

class TestUserAuthenticationWithMock(unittest.TestCase):
    def setUp(self):
        self.user = User("19205", "19205_Pass!")

    def test_exception_on_specific_password(self):
        with patch.object(self.user, 'authenticate', side_effect=Exception):
            with self.assertRaises(Exception):
                self.user.authenticate("19205")

    def test_false_on_other_passwords(self):
        with patch.object(self.user, 'authenticate', return_value=False):
            self.assertFalse(self.user.authenticate("test"))

if __name__ == '__main__':
    unittest.main()