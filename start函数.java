package com.zhynb.orgn;

import java.util.Scanner;

import static java.nio.file.Files.delete;

public class studentback {
    Scanner xue=new Scanner(System.in);
    student[] stu=new student[50];
    int count=0;
    public void start(){
        while(true){
            System.out.println("--------学生管理系统--------");
            System.out.println("1  添加学生");
            System.out.println("2  修改学生");
            System.out.println("3  删除学生");
            System.out.println("4  查看学生");
            System.out.println("5  关闭系统");
            System.out.println("请选择(1~5): ");
            int num=xue.nextInt();
            System.out.println("--------------------------");
            switch (num)
            {
                case 1:
                {
                    add();
                    break;
                }
                case 2:
                {
                    xiugai();
                    break;
                }
                case 3:
                {
                    delete();
                    break;
                }
                case 4:
                {
                    chakan();
                    break;
                }
                case 5:
                {
                    System.out.println("确认退出请按0,取消请按9");
                    int key=xue.nextInt();
                    if(key==0)
                    {
                        System.out.println("再见管理员!!!!!");
                        return;
                    }
                    break;
                }
            }
        }
    }

    private void chakan() {
        System.out.println("所有的学生如下:");
        System.out.println("    "+"学号"+"       "+"姓名"+"    "+"性别"+"      "+"年龄"+"     " +"成绩");
        if(count!=0)
        for(int i=0;i<count;i++)
        {
            System.out.println(stu[i].getNumber()+"  "+stu[i].getName()+"    "+stu[i].getXin()+"        "+stu[i].getAge()+"     "+stu[i].getScore()+"  ");
        }
        else
            System.out.println("还未有学生!!!!!");
    }

    private void delete() {
        System.out.println("请输入你要删除学生的学号:");
        String id= xue.next();
        int flag=0;
        for(int i=0;i<count;i++)
        {
            if(stu[i].getNumber().equals(id))
            {
                flag=1;
                for(int j=i+1;j<count;j++)
                {
                    stu[j-1]=stu[j];
                }
            }
        }
        if(flag==1){
           count--;
        System.out.println("删除成功!!!!!");
        }
        else
            System.out.println("删除失败,未找到该学生!!!!!");
    }
    private void xiugai() {
        int flag=0;
        int index=0;
        System.out.println("请输入你要修改学生的学号");
        String id= xue.next();
        for(int i=0;i<count;i++)
        {
            if(stu[i].getNumber().equals(id))
            {
                index=i;
                flag=1;
                break;
            }
        }
        if(flag==1) {
            System.out.println("请输入你想修改什么(1~4):");
            System.out.println("--------修改列表--------");
            System.out.println("1 姓名");
            System.out.println("2 性别");
            System.out.println("3 年龄");
            System.out.println("4 成绩");
            System.out.println("-----------------------");
            int yu = xue.nextInt();
            switch (yu) {
                case 1: {
                    System.out.println("请输入姓名:");
                    String name=xue.next();
                    stu[index].setName(name);
                    break;
                }
                case 2: {
                    System.out.println("请输入性别:");
                    String xin=xue.next();
                    stu[index].setXin(xin);
                    break;
                }
                case 3: {
                    System.out.println("请输入年龄:");
                    int age=xue.nextInt();
                    stu[index].setAge(age);
                    break;
                }
                case 4: {
                    System.out.println("请输入成绩:");
                    double score=xue.nextDouble();
                    stu[index].setScore(score);
                    break;
                }
            }
            System.out.println("修改完成!!!!!");
        }
        else
            System.out.println("未找到该名学生!!!!!");
    }

    private void add() {
        System.out.println("请输入学生的学号:");
        String id= xue.next();
        System.out.println("请输入学生的姓名:");
        String name= xue.next();
        System.out.println("请输入学生的性别:");
        String xin= xue.next();
        System.out.println("请输入学生的年龄:");
        int age = xue.nextInt();;
        System.out.println("请输入学生的成绩:");
        double score= xue.nextDouble();
        student member=new student(id,name,xin,age,score);
        stu[count]=member;
        count++;
        System.out.println("添加成功!!!!!");
    }
}
