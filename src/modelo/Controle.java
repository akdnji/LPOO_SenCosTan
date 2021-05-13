package modelo;

import javax.swing.JOptionPane;

public class Controle extends absPropriedades
{

    public Controle(String numero)
    {
        super(numero);
    }

    @Override
    public void Executar()
    {
        absPropriedades validacao = new Validacao(this.numero);
        if (validacao.mensagem.equals(""))
        {
            absPropriedades calcular = new Calcular(validacao.n1);
            this.resposta = calcular.toString();
        }
        else
        {
            JOptionPane.showMessageDialog(null, validacao.mensagem);
        }
    }

    @Override
    public String toString()
    {
        return this.resposta;
    }

}
