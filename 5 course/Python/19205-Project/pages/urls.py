from django.urls import path
from .views import PagesListView, PagesDetailView

urlpatterns = [
    path('pages/<int:pk>/',PagesDetailView.as_view(),name = 'post_detail'),
    path('',PagesListView.as_view(),name = 'home'),

]