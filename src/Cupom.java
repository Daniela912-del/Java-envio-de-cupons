//  record foi criado no Java para representar classes que servem apenas para armazenar dados.

public record Cupom(

        //o Java gera automaticamente:
        String codigo,
        double desconto,
        String validade
) {
}