package webTech.kiet.edu;

public class GetPlanFactory {
	
  public Plan getPlan(String planType) {
	  if(planType==null) {
		  return null;
	  }
	  else if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
		  return new DomesticPlan();
	  }
	  else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
		  return new InstitutionalPlan();
	  }
	  else if(planType.equalsIgnoreCase("COMMERCIALPLAN")) {
		  return new CommercialPlan();
	  }
	  return null;
  }
}
