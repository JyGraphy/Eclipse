package book;







public class Handler {
	
	 Handler[] arr = new Handler[5];
	
	public int add(String name, String kind, int num) {
		int row = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				
				arr[i] = new Handler();
//				arr[i].setName(name);
				
			}
		}
		
		
		
		
		return row;
		
	}
	

	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
