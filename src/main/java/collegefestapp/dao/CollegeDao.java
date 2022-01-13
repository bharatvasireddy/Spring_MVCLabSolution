package collegefestapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import collegefestapp.model.StudentDetails;

@Component
public class CollegeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void createStudent(StudentDetails studentDetails) {

		this.hibernateTemplate.save(studentDetails);

	}

	public List<StudentDetails> getStudentDetails() {
		List<StudentDetails> studentDetails = this.hibernateTemplate.loadAll(StudentDetails.class);
		return studentDetails;
	}

	@Transactional
	public void deleteStudentDetails(int id) {

		StudentDetails sd = this.hibernateTemplate.load(StudentDetails.class, id);

		this.hibernateTemplate.delete(sd);
	}

	public StudentDetails getStudentDetails(int sid) {
		return this.hibernateTemplate.get(StudentDetails.class, sid);
	}

}
