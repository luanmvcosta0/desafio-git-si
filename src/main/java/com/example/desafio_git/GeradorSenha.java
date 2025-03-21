package com.example.desafio_git;

import java.util.Random;

public class GeradorSenha {

    public static void main(String[] args) {
        int tamanhoSenha = 7;
        String senha = gerarSenha(tamanhoSenha);
        System.out.println("Sua senha: " + senha);
    }

    public static String gerarSenha(int tamanho) {
        String caracteresPossiveis = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random random = new Random();
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            int indice = random.nextInt(caracteresPossiveis.length());
            senha.append(caracteresPossiveis.charAt(indice));
        }

        return senha.toString();
    }

}
