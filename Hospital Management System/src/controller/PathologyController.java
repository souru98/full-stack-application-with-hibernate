package controller;

import service.PathologyService;


public class PathologyController {
	
	
	private PathologyService pathologyService;
	
	
	public String AdmissionForm(Model model){
		
		return "AdmissionForm";
	}
	public String FinancialDetailsOfPathology(Model model){
		
		return "FinancialDetailsOfPathology";
	}
	public String MonthlyStatementOfOperationSectionPathology(Model model){
		
		return "MonthlyStatementOfOperationSectionPathology";
	}
	public String Pathology(Model model){
		
		return "Pathology";
	}
}
