package in.shambhu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.shambhu.entity.PlanCategory;

@Repository
public interface PlanCategoryRepo extends JpaRepository<PlanCategory, Integer> {

}
