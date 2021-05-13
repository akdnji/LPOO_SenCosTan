package modelo;

public class Validacao extends absPropriedades
{

    public Validacao(String numero)
    {
        super(numero);
    }

    @Override
    public void Executar()
    {
        this.mensagem = "";
        try
        {
            this.n1 = Double.parseDouble(this.numero);
            if (this.n1 > 360.0)
            {
                this.mensagem = "Maior que 360º";
            }
        }
        catch (NumberFormatException e)
        {
            mensagem = "Número inválido";
        }
        catch (Exception e)
        {
            mensagem = "Erro";
        }
    }

}
