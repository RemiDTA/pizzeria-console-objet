package tp5;


abstract class OptionMenu{
	protected String libele;
	
	public OptionMenu(String libele){
		this.libele=libele;
	}
	
	abstract void execute(PizzaDaoImpl pDaoI);

	public String getLibele() {
		return libele;
	}

	public void setLibele(String libele) {
		this.libele = libele;
	}
	
}
