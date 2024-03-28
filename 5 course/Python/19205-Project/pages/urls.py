from django.urls import path
from .views import (
    PagesListView, 
    PagesDetailView, 
    PagesCreateView,
    PagesUpdateView,
    PagesDeleteView
    )
from django.conf import settings
from django.conf.urls.static import static

urlpatterns = [
    path('pages/<int:pk>/delete/',PagesDeleteView.as_view(),name = 'post_delete'),
    path('pages/<int:pk>/edit/',PagesUpdateView.as_view(),name = 'post_edit'),
    path('pages/new/',PagesCreateView.as_view(), name="post_new"),
    path('pages/<int:pk>/',PagesDetailView.as_view(),name = 'post_detail'),
    path('',PagesListView.as_view(),name = 'home'),
]

if settings.DEBUG:
    urlpatterns += static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)
