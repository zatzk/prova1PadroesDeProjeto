package academia.fm;

public enum TipoEquipamento {
    Halteres("academia.fm.HaltereFactory"),
    Acessorios("academia.fm.AcessorioFactory"),
    Maquinas("academia.fm.MaquinaFactory");

    String className;
	
	private TipoEquipamento(String className) {
		this.className = className;
	}
	
	public String getFactoryName() {
		return this.className;
	}	
}
