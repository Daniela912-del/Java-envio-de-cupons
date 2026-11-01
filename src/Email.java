
public non-sealed class Email implements Envio {
// non-sealed = libera a herança .
    @Override
    public void enviar(Cupom cupom) {

        System.out.println("=== ENVIADO POR EMAIL ===");
        System.out.println("Código: " + cupom.codigo());
        System.out.println("Desconto: " + cupom.desconto() + "%");
        System.out.println("Validade: " + cupom.validade());
    }
}