from django.shortcuts import render,get_list_or_404
from .models import Question
# from django.http import HttpResponse
# Create your views here.

def index(request):
    name = "Phạm Quốc Hoàng"
    age = "19"
    phone = "0123456789"
    courses = ["JAVA","PHP","HTML","CSS","PYTHON"]
    result = {"name":name,"age":age,"phone":phone,"courses":courses,}
    return render(request,"polls/index.html",result)

def viewlist_question(request):
    # question_list = Question.objects.all()
    question_list = get_list_or_404(Question,pk=2)
    result = {"question_list":question_list}
    return render(request,"polls/question_list.html",result)

