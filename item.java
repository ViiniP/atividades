
public class item{
    String id,nome;

    float val1 = (float)9.654;
    float val2 = (float)3.85;
    float dinheiro = (float) 37.16;
    float troco;

    public void calcTroco(float total){
    total = (val1*val2);
    troco = (dinheiro-total);
    }

    public void exibirItem(){
        System.out.println(this.id);
        System.out.println(this.nome);
    }
}
