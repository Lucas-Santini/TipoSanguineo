package com.example.tiposanguineo;

public class tipoSanguineo {

    public String doacao(String tipo) {
        switch (tipo) {
            case "A+":
                return "A+ A- O+ ou O-";
            case "A-":
                return "A- ou O-";
            case "B+":
                return "B+ B- O+ ou O-";
            case "B-":
                return "B- ou O-";
            case "AB+":
                return "TODOS";
            case "AB-":
                return "A- B- AB- ou O-";
            case "O+":
                return "O+ ou O-";
            case "O-":
                return "O-";
            default:
                return "insira o formato correto!";
        }
    }
}
