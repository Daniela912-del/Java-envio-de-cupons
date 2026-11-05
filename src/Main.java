import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();

        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Data e hora atual: "
                + agora.format(formato));

        Cupom cupom = new Cupom(
                "LOJA20",
                20,
                "30/11/2026",
                Status.ATIVO

        );
        // Polimorfismo
        CanalEnvio[] canais = CanalEnvio.values();

        // Envio pelos canais
        for (CanalEnvio canal : canais) {
            canal.enviar(cupom);
            System.out.println("=============================");
        }

        // Lambda
        Desconto desconto = valor -> valor * 0.20;

        double valorProduto = 1000.00;
        double valorDesconto = desconto.calcular(valorProduto);
        double valorFinal = valorProduto - valorDesconto;

        System.out.println("===== CÁLCULO DO DESCONTO =====");
        System.out.println("Valor original: R$ " + valorProduto);
        System.out.println("Desconto: R$ " + valorDesconto);
        System.out.println("Valor Final: R$ " + valorFinal);
        System.out.println(cupom.status().getDescricao());
    }

    private enum CanalEnvio {
        EMAIL(new Email()),
        WHATSAPP(new WhatsApp()),
        SMS(new SMS());

        private final Envio envio;

        CanalEnvio(Envio envio) {
            this.envio = envio;
        }

        public void enviar(Cupom cupom) {
            envio.enviar(cupom);
        }
    }
}
