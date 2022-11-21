from django.urls import path
from . import views

urlpatterns =[
    path('',views.index,name='index'),
    path('list/',views.viewlist_question,name='viewlist_question'),
]