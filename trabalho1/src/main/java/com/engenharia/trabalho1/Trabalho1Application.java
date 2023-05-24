package com.engenharia.trabalho1;

import com.engenharia.trabalho1.entities.*;
import com.engenharia.trabalho1.entities.Class;
import com.engenharia.trabalho1.repositories.ClassRepository;
import com.engenharia.trabalho1.repositories.CourseRepository;
import com.engenharia.trabalho1.repositories.ScheduleClassCourseRepository;
import com.engenharia.trabalho1.repositories.StudentRepository;
import com.engenharia.trabalho1.services.CourseService;
import com.engenharia.trabalho1.services.StudentService;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

@Slf4j
@SpringBootApplication
public class Trabalho1Application{

	public static void main(String[] args) {
		SpringApplication.run(Trabalho1Application.class, args);
	}

	@Bean
	@Transactional
	public CommandLineRunner initialDump(StudentRepository studentRepo, ClassRepository classRepo, ScheduleClassCourseRepository scheduleRepo, CourseRepository courseRepo) {
		return (args) -> {
			Student s1, s2, s3, s4;
			Course c1, c2;
			ScheduleClassCourse scc1, scc2, scc3, scc4, scc5, scc6;
			Class class1, class2, class3;

			s1 = new Student("00001", "Joao", "Av da Minha Casa 11");
			s2 = new Student("00002", "Pedro", "Av da Minha Casa 12");
			s3 = new Student("00003", "Ana", "Av da Minha Casa 13");
			s4 = new Student("00004", "Maria", "Av da Minha Casa 14");

			class1 = new Class("130");
			class2 = new Class("131");
			class3 = new Class("132");

			c1 = new Course("45000", "Course 1");
			c2 = new Course("65000", "Course 2");

			scc1 = new ScheduleClassCourse(new ClassId("130", "45000"), "AB", c1, class1);
			scc2 = new ScheduleClassCourse(new ClassId("131", "45000"), "CD", c1, class2);
			scc3 = new ScheduleClassCourse(new ClassId("132", "45000"), "JK", c1, class3);
			scc4 = new ScheduleClassCourse(new ClassId("130", "65000"), "LM", c2, class1);
			scc5 = new ScheduleClassCourse(new ClassId("131", "65000"), "NP", c2, class2);
			scc6 = new ScheduleClassCourse(new ClassId("132", "65000"), "EE0", c2, class3);

			log.info("*************************************************");
			log.info("*************************************************");
			log.info("=================================================");
			log.info(s1.toString());
			log.info(s2.toString());
			log.info(s3.toString());
			log.info(s4.toString());

			studentRepo.save(s1);
			studentRepo.save(s2);
			studentRepo.save(s3);
			studentRepo.save(s4);

			log.info(class1.toString());
			log.info(class2.toString());
			log.info(class3.toString());

			classRepo.save(class1);
			classRepo.save(class2);
			classRepo.save(class3);

			log.info(c1.toString());
			log.info(c2.toString());

			courseRepo.save(c1);
			courseRepo.save(c2);

			log.info(scc1.toString());
			log.info(scc2.toString());
			log.info(scc3.toString());
			log.info(scc4.toString());
			log.info(scc5.toString());
			log.info(scc6.toString());

			scheduleRepo.save(scc1);
			scheduleRepo.save(scc2);
			scheduleRepo.save(scc3);
			scheduleRepo.save(scc4);
			scheduleRepo.save(scc5);
			scheduleRepo.save(scc6);

			display( studentRepo,  classRepo,  scheduleRepo, courseRepo);


		};
	}

	@Transactional
	public void display(StudentRepository studentRepo, ClassRepository classRepo, ScheduleClassCourseRepository scheduleRepo, CourseRepository courseRepo){
		log.info("*************************************************");
		log.info("**********  Finds *******************************");
		log.info("=================================================");

		log.info("*************************************************");
		log.info("Estudantes com findAll():");
		log.info("-------------------------------");
		for (Student est : studentRepo.findAll()) {
			log.info(est.toString());
		}
		log.info("===============================");


		log.info("*************************************************");
		log.info("Rel Horarios com findAll():");
		log.info("-------------------------------");
		for (ScheduleClassCourse est : scheduleRepo.findAll()) {
			log.info(est.toString());
		}
		log.info("===============================");

		log.info("*************************************************");
		log.info("Disciplinas com findAll():");
		log.info("-------------------------------");
		for (Course est : courseRepo.findAll()) {
			log.info(est.toString());
		}
		log.info("===============================");


		log.info("*************************************************");
		log.info("Turmas com findAll():");
		log.info("-------------------------------");
		for (Class est : classRepo.findAll()) {
			log.info(est.toString());
		}
		log.info("===============================");
	}
}
