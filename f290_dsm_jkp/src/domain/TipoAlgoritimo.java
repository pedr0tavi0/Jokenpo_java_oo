package domain;

public enum TipoAlgoritimo {
    PAPEL(1),
    TESOURA(2), 
    PEDRA(3),
    LAGARTO(4), 
    SPOCK(5);

    private Integer id;

    TipoAlgoritimo(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public static TipoAlgoritimo getTipo(Integer pId){
        for(TipoAlgoritimo t: TipoAlgoritimo.values()){
            if(t.getId()==pId) 
            return t; 
        }
        throw new RuntimeException("Tipo algoritimo inválido.");
    }

}
