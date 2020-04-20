package service;

import java.util.List;

import model.DailyAccountOfOperationSection;

public interface PharmacyService {

	public boolean insertInsertDailyAccountOfOperationSection(DailyAccountOfOperationSection dailyAccountOfOperationSection);
	public List<DailyAccountOfOperationSection> getDailyAccountOfOperationSectionList();
}
