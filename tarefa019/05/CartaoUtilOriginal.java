//https://www.devmedia.com.br/artigo-java-magazine-46-refactoring-da-teoria-a-pratica/10169
package org.example._05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CartaoUtilOriginal {
    public static final int VISA = 1;
    public static final int MASTERCARD = 2;
    public static final int AMEX = 3;
    public static final int DINERS = 4;
    public static final String CARTAO_OK = "Cartão válido";
    public static final String CARTAO_ERRO = "Cartão inválido";

    public String validar(int bandeira, String numero, String validade) {
        if (!validarValidade(validade)) {
            return CARTAO_ERRO;
        }

        String numeroFormatado = removerCaracteresNaoNumericos(numero);

        if (!validarPrefixoETamanho(bandeira, numeroFormatado)) {
            return CARTAO_ERRO;
        }

        if (!validarNumero(numeroFormatado)) {
            return CARTAO_ERRO;
        }

        return CARTAO_OK;
    }

    private boolean validarValidade(String validade) {
        try {
            Date dataValidade = new SimpleDateFormat("MM/yyyy").parse(validade);
            Calendar calValidade = new GregorianCalendar();
            calValidade.setTime(dataValidade);

            Calendar calHoje = Calendar.getInstance();
            calHoje.set(Calendar.DAY_OF_MONTH, 1);
            calHoje.set(Calendar.HOUR_OF_DAY, 0);
            calHoje.set(Calendar.MINUTE, 0);
            calHoje.set(Calendar.SECOND, 0);
            calHoje.set(Calendar.MILLISECOND, 0);

            return calHoje.before(calValidade);
        } catch (ParseException e) {
            return false;
        }
    }

    private String removerCaracteresNaoNumericos(String numero) {
        StringBuilder formatado = new StringBuilder();
        for (int i = 0; i < numero.length(); i++) {
            char c = numero.charAt(i);
            if (Character.isDigit(c)) {
                formatado.append(c);
            }
        }
        return formatado.toString();
    }

    private boolean validarPrefixoETamanho(int bandeira, String numeroFormatado) {
        int tamanho = numeroFormatado.length();
        switch (bandeira) {
            case VISA:
                return (tamanho == 13 || tamanho == 16) && numeroFormatado.startsWith("4");
            case MASTERCARD:
                return tamanho == 16 && (numeroFormatado.startsWith("51") || numeroFormatado.startsWith("52") ||
                        numeroFormatado.startsWith("53") || numeroFormatado.startsWith("54") || numeroFormatado.startsWith("55"));
            case AMEX:
                return tamanho == 15 && (numeroFormatado.startsWith("34") || numeroFormatado.startsWith("37"));
            case DINERS:
                return tamanho == 14 && (numeroFormatado.startsWith("300") || numeroFormatado.startsWith("301") ||
                        numeroFormatado.startsWith("302") || numeroFormatado.startsWith("303") || numeroFormatado.startsWith("304") ||
                        numeroFormatado.startsWith("305") || numeroFormatado.startsWith("36") || numeroFormatado.startsWith("38"));
            default:
                return false;
        }
    }

    private boolean validarNumero(String numeroFormatado) {
        int soma = 0;
        boolean multiplica = false;

        for (int i = numeroFormatado.length() - 1; i >= 0; i--) {
            int digito = Integer.parseInt(numeroFormatado.substring(i, i + 1));
            int somafim = multiplica ? digito * 2 : digito;
            soma += somafim > 9 ? somafim - 9 : somafim;
            multiplica = !multiplica;
        }

        int resto = soma % 10;
        return resto == 0;
    }
}