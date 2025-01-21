package org.DesafioPOO.Celular;

import org.DesafioPOO.Celular.APP.AparelhoTelefonico;
import org.DesafioPOO.Celular.APP.NavegadorInternet;
import org.DesafioPOO.Celular.APP.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical  {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

    // Chamando métodos implementados
    //começando pelo AparelhoTelefonico
    meuIphone.Ligar("123456789");
    meuIphone.atender();
    meuIphone.IniciarCorreioVoz();

    //o segundo é o ReprodutorMusical
    meuIphone.SelecionarMusica("fireworks - katy perry");
    meuIphone.Tocar();
    meuIphone.Pausar();

    //por ultimo colocamos o NavegadorInternet
    meuIphone.AdicionarNovaAba();
    meuIphone.ExibirPagina("http://example.com");
    meuIphone.AtualizarPagina();
    }
    @Override
    public void Ligar(String Numero) {
       System.out.println("Ligando para o numero: " + Numero);
    }

    @Override
    public void IniciarCorreioVoz() {
        System.out.println("iniciando correio de voz");
    }

    @Override
    public void atender() {
        System.out.println("atendendo ligação");
    }

    @Override
    public void AtualizarPagina() {
        System.out.println("atualizando pagina");
    }

    @Override
    public void AdicionarNovaAba() {
        System.out.println("adicionando nova aba");
    }

    @Override
    public void ExibirPagina(String url) {
        System.out.println("exibindo pagina com a url: " + url);
    }

    @Override
    public void Tocar() {
        System.out.println("tocando musica");
    }

    @Override
    public void Pausar() {
        System.out.println("pausando musica");
    }

    @Override
    public void SelecionarMusica(String musica) {
        System.out.println("selecionando musica: " + musica);
    }

}
