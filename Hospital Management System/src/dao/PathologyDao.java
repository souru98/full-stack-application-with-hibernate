package dao;

import java.util.List;

import model.DailyAccountOfOperationSection;

public interface PathologyDao {

	public boolean insert(DailyAccountOfOperationSection dailyAccountOfOperationSection);
	public List<DailyAccountOfOperationSection> getDailyAccountOfOperationSectionList();
}
