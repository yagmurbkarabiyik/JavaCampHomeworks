package dayTwoHomework;

public class CategoryManager {
	
	public void addCategory(String categoryName) {
		System.out.println(" Kategori eklendi : " + categoryName);
		
		
	}
	
	public void changeCategoryName(String categoryName, Category category) {
		category.categoryName = categoryName;
		System.out.println(" Yeni kategori adý : " + categoryName);
		
	}
	
	
	

}
