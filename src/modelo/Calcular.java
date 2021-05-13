package modelo;

import java.text.DecimalFormat;

public class Calcular extends absPropriedades
{

    public Calcular(Double n1)
    {
        super(n1);
    }

    @Override
    public void Executar()
    {
        this.n1 = Math.toRadians(this.n1);
        this.seno = Math.sin(this.n1);
        this.cosseno = Math.cos(this.n1);
        this.tangente = Math.tan(this.n1);

        DecimalFormat df = new DecimalFormat("0.##");

        this.resposta = String.format("<html>Seno = %s <br>Cosseno = %s <br>Tangente = %s", df.format(this.seno), df.format(this.cosseno), df.format(this.tangente));

    }

    @Override
    public String toString()
    {
        return this.resposta;
    }

}
