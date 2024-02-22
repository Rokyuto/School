from django.shortcuts import render
from django.http import HttpResponse
from django.views.generic import ListView, DetailView
from django.views.generic.edit import CreateView
from .models import Pages
# Create your views here.

class PagesListView(ListView):
    model = Pages
    template_name = 'home.html'

class PagesDetailView(DetailView):
    model = Pages
    template_name = 'post_detail.html'

class PagesCreateView(CreateView):
    model = Pages
    template_name = 'post_new.html'
    fields = ['title','author','body']