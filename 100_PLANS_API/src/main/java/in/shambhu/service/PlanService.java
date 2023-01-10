package in.shambhu.service;

import java.util.List;
import java.util.Map;

import in.shambhu.entity.Plan;

public interface PlanService {
	
	public Map<Integer , String> getPlanCategories();
	
	public boolean savePlan(Plan plan);
	
	public List<Plan> getAllPlan(Plan plan);
	
	public String deletePlanById(Integer planId);
	
	public String updatePlan(Integer planId,String planName);
	
	

}
