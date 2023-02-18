package Smartphone;

import Aplicativos.AparelhoTelefonico;
import Aplicativos.CameraFotografica;
import Aplicativos.NavegadorDeInternet;
import Aplicativos.ReprodutorMusica;

public class Apps implements ReprodutorMusica,AparelhoTelefonico,CameraFotografica,NavegadorDeInternet  {

    @Override
    public void tirarFoto() {
       System.out.println("Tirando Foto ");
        
    }

    @Override
    public void gravarVideo() {
       System.out.println("Gravando Video ");
        
    }

    @Override
    public void visualizarGaleria() {
       System.out.println("Entrando na Galeria de fotos ");
        
    }

    @Override
    public void compartilharFotos() {
       System.out.println("Compartilhando Fotos ");
        
    }

    @Override
    public void ligar() {
       System.out.println("Realizando Ligação ");
        
    }

    @Override
    public void atender() {
       System.out.println("Atendendo Ligação");
        
    }

    @Override
    public void inicarCorreioVoz() {
        System.out.println("Correio de Voz: ");
        
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Música");
        
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada");
        
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionado Musica");
        
    }
    
 
    }

