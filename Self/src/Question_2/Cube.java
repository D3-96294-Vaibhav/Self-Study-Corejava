package Question_2;

 class Cube extends ThreeDShape{
	 
	 private double side;

	@Override
	double calculateVolume() {
		// TODO Auto-generated method stub
		return Math.pow(side, 3);
	}
	
	public void setSide(double side) {
		this.side = side;
	}

	@Override
	void shapeType() {
		// TODO Auto-generated method stub
		System.out.println("3-D Shape");	
	}
	

}
