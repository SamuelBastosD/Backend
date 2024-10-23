package controller;
import view.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaDeMenuController extends TelaDeMenuView {
    public static void abrirTelaDeCadastroView() {
        TelaDeCadastroView.appTelaDeCadastroView = new TelaDeCadastroView();
        TelaDeCadastroView.appTelaDeCadastroView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        appTelaDeMenuView.setVisible(false);

        TelaDeCadastroView.appTelaDeCadastroView.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                appTelaDeMenuView.setVisible(true);
                InterfaceView.definirIcone(TelaDeCadastroView.appTelaDeCadastroView);
            }
        });
    }
    public static void abrirTelaDePesquisaView() {
        TelaDePesquisaView.appTelaDePesquisaView = new TelaDePesquisaView();
        TelaDePesquisaView.appTelaDePesquisaView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        appTelaDeMenuView.setVisible(false);

        TelaDePesquisaView.appTelaDePesquisaView.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                appTelaDeMenuView.setVisible(true);
                InterfaceView.definirIcone(TelaDePesquisaView.appTelaDePesquisaView);
            }
        });
    }
    public static void abrirTelaDeAtualizacaoView() {
        TelaDeAtualizacaoView.appTelaDeAtualizacaoView = new TelaDeAtualizacaoView();
        TelaDeAtualizacaoView.appTelaDeAtualizacaoView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        appTelaDeMenuView.setVisible(false);

        TelaDeAtualizacaoView.appTelaDeAtualizacaoView.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                appTelaDeMenuView.setVisible(true);
                InterfaceView.definirIcone(TelaDeAtualizacaoView.appTelaDeAtualizacaoView);
            }
        });
    }
    public static void abrirTelaDeRemoverView() {
        TelaDeRemoverView.appTelaDeRemoverView = new TelaDeRemoverView();
        TelaDeRemoverView.appTelaDeRemoverView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        appTelaDeMenuView.setVisible(false);

        TelaDeRemoverView.appTelaDeRemoverView.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                appTelaDeMenuView.setVisible(true);
                InterfaceView.definirIcone(TelaDeRemoverView.appTelaDeRemoverView);
            }
        });
    }
}
