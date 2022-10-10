package judisclei;

import judisclei.valoresLoja.valoresCli;

public class atividade{
    public static void main(String[] args) {
        valoresLoja l1;
        l1 = new valores();

        l1.cnpj = "08723218000186";
        l1.nome = "TANCA";
        l1.subnome = "TANCA INFORMATICA IERELI";
        l1.endereco = "RUA MARECHAL FLORIANO PEIXOTO, 166 VILA MARCONDES PRESIDENTE";
        l1.ie = "149626224113";
        l1.extrato = "1000";

        valoresCli c1 = new valores();
        c1.nomeCli = "Ronaldo Fenomeno";
        c1.cpfCli = "121.121.121-85";

        c1.exibirLoja();
        c1.exibirCli();
        
    }
}  