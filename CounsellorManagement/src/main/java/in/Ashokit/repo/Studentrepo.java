package in.Ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Ashokit.entity.Student;

public interface Studentrepo extends JpaRepository<Student, Long> {

}
