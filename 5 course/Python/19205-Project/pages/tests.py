from django.contrib.auth import get_user_model
from django.test import TestCase
from django.urls import reverse
from .models import Pages
class BlogTests(TestCase):
    def setUp(self):
        self.user = get_user_model().objects.create_user(
            username='testuser',
            email = 'test@email.com',
            password='secret'
        )
        self.pages = Pages.objects.create(
        title='A good title',
        body='Nice body content',
        author=self.user,
        )
        def test_string_representation(self):
            pages = Pages(title='A sample title')
            self.assertEqual(str (pages),pages.title)
        def test_post_content(self):
            self.assertEqual(f'{self .pages.title}', 'A good title')
            self.assertEqual(f' {self.pages.author}', 'testuser')
            self.assertEqual(f' {self.pages.body}', 'Nice body content')
        def test_post_list_view(self):
            response = self.client.get(reverse('home'))
            self.assertEqual (response. status_code, 200)
            self.assertContains (response, 'Nice body content')
            self.assertTemplateUsed (response, 'home.html')
        def test_post_detail_view(self):
            response = self.client.get('/pages/1/')
            no_response = self.client.get('/pages/100000/')
            self.assertequal (response. status_code, 200)
            self.assertEqual(no_response. status_code, 404)
            self.assertContains (response, 'A good title')
            self.assertTemplateUsed (response, 'post_detail.html')
