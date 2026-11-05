// record foi criado no Java para representar classes que servem apenas para armazenar dados.

public record Cupom(
        String codigo,
        double desconto,
        String validade,
        Status status
) {

    public String resumo() {
        return """
                Código: %s
                Desconto: %.0f%%
                Validade: %s
                Status do cupom: %s
                """.formatted(
                codigo,
                desconto,
                validade,
                status
        );
    }
}