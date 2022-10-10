package judisclei;
public class valoresLoja {    
     
    String nome,subnome,endereco,cpf,cnpj,extrato,ie; // loja //cliente

    public void exibirLoja() {
    System.out.println(this.nome);
    System.out.println(this.subnome);;
    System.out.println(this.endereco);
    System.out.println("CNPJ: "+this.cnpj); 
    System.out.println("IE: "+this.ie);
    System.out.println("----------------");
    System.out.println(this.extrato);
    System.out.println("CUPOM FISCAL ELETRONICO - SAL");
    System.out.println("----------------");
}

 public class valoresCli {
    String nomeCli,cpfCli;

    public void exibirCli() {
        System.out.println("CPF DO CONSUMIDOR: "+this.nomeCli);
        System.out.println("RAZAO SOCIAL/NOME: "+this.cpfCli);
    }

    

    }
}

