package dao;

import java.util.List;

import model.DailyAccountOfOperationSection;

public interface PharmacyDao {

	public boolean insertInsertDailyAccountOfOperationSection(DailyAccountOfOperationSection dailyAccountOfOperationSection);
	public List<DailyAccountOfOperationSection> getDailyAccountOfOperationSectionList();
}
