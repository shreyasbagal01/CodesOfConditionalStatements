class Demo{
	public static void main(String [] shreyas){
		int SP =1200;
		int CP =1000;
		if (SP>CP){
			int X=SP-CP;
			System.out.println(X+"is Profit");
		}else if(SP<CP){
			int Y=CP-SP;
			System.out.println(Y+ " is Loss ");
		}else{
			System.out.println("No Profit And Loss");
		}
	}
}

