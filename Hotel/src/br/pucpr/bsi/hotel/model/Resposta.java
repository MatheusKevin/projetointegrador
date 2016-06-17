package br.pucpr.bsi.hotel.model;

public class Resposta {
    private Integer alternativa;
    private Avaliacao avaliacao;
    private Pergunta pergunta;

    public Resposta(Avaliacao avaliacao, Pergunta pergunta) {
        this.avaliacao = avaliacao;
        this.pergunta = pergunta;
        this.avaliacao.addResposta(this);
        this.pergunta.addResposta(this);
    }

    public Integer getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(Integer alternativa) {
        this.alternativa = alternativa;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }
    
}
