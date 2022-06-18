package com.map;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class MapDemo
{
    public static void main(String[] args)
    {

        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        //session
        Session session= sf.openSession();
        Transaction txn;

            txn = session.beginTransaction();
                //createing question
//            Question1 st = new Question1();
//            st.setquestionId(1212);
//            st.setquestion("what is java");
//                //creating answers
//            Answer1 answer1 = new Answer1();
//           answer1.setAnswer_id(343);
//           answer1.setAnswer("java is programming");
//           answer1.setQuestion(st);
//
//            session.save(st);
//            session.save(answer1);
//        //creating answers
//        Answer1 answer2 = new Answer1();
//        answer2.setAnswer_id(344);
//        answer2.setAnswer("java is oop language");
//        answer2.setQuestion(st);
//        //creating answers
//        Answer1 answer3 = new Answer1();
//        answer3.setAnswer_id(345);
//        answer3.setAnswer("java is robust");
//        answer3.setQuestion(st);
//
//        List<Answer1> list=new ArrayList<Answer1>();
//        list.add(answer1);
//        list.add(answer2);
//        list.add(answer3);
//        st.setAnswers(list);
//
//
//        //save
//        session.save(st);
//        session.save(answer1);
//        session.save(answer2);
//        session.save(answer3);

        //get use to fetch datafrom database
        Question1 q=(Question1) session.get(Question1.class,1212);
        System.out.println(q.getquestion());
        for (Answer1 a:q.getAnswers())
        {
            System.out.println(a.getAnswer());
        }

            txn.commit();


        session.close();
        sf.close();

    }
}



