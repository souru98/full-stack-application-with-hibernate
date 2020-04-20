package controller;

import java.util.ArrayList;
import java.util.List;

import model.DailyAccountOfOperationSection;
import service.PharmacyService;



public class PharmacyController {

	
	private PharmacyService pharmacyService;
	
	public String DailyAccountOfOperationSection(Model model){
		
		DailyAccountOfOperationSection dailyAccountOfOperationSection = new DailyAccountOfOperationSection();
		List<DailyAccountOfOperationSection> dailyAccountOfOperationSectionList = new ArrayList<DailyAccountOfOperationSection>();
		
		try{
			dailyAccountOfOperationSectionList = pharmacyService.getDailyAccountOfOperationSectionList();
		}catch(Exception e){
			e.printStackTrace();
		}
		model.addAttribute("dailyAccountOfOperationSection",dailyAccountOfOperationSection);
		model.addAttribute("dailyAccountOfOperationSectionList", dailyAccountOfOperationSectionList);
		
		return "DailyAccountOfOperationSection";
	}
	public String InsertDailyAccountOfOperationSection(("dailyAccountOfOperationSection") DailyAccountOfOperationSection dailyAccountOfOperationSection){
		
		try{
			
			pharmacyService.insertInsertDailyAccountOfOperationSection(dailyAccountOfOperationSection);
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return "redirect:/main/dailyAccountOfOperationSection";
	}
	public String DailyAccountOfPharmacy(Model model){
		
		return "DailyAccountOfPharmacy";
	}
	public String InsertDailyAccountOfPharmacy(){
		
		return "redirect:/main/dailyAccountOfPharmacy";
	}
	public String MonthlyStatementOfOperationSection(Model model){
		
		return "MonthlyStatementOfOperationSectionPharmacy";
	}
	public String InsertMonthlyStatementOfOperationSection(){
		
		return "redirect:/main/monthlyStatementOfOperationSectionPharmacy";
	}
	public String MonthlyAccountOfPharmacy(Model model){
		
		return "MonthlyAccountOfPharmacy";
	}
	public String InsertMonthlyAccountOfPharmacy(){
		
		return "redirect:/main/monthlyAccountOfPharmacy";
	}
	public String StockBalanceOfPharmacy(Model model){
		
		return "StockBalanceOfPharmacy";
	}
	public String InsertStockBalanceOfPharmacy(){
		
		return "redirect:/main/stockBalanceOfPharmacy";
	}
	public String StatementOfCompany(Model model){
		
		return "StatementOfCompany";
	}
	public String InsertStatementOfCompany(){
		
		return "redirect:/main/statementOfCompany";
	}
	
}
