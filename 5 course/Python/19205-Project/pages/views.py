from django.shortcuts import render
from django.http import HttpResponse
from django.views.generic import ListView, DetailView
from django.views.generic.edit import CreateView, UpdateView, DeleteView
from django.urls import reverse_lazy
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
    fields = ['title','author','body','image', 'category']

class PagesUpdateView(UpdateView):
    model = Pages
    template_name = 'post_edit.html'
    fields = ['title','body','image','category']

class PagesDeleteView(DeleteView):
    model = Pages
    template_name = 'post_delete.html'
    success_url = reverse_lazy('home')
