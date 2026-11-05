public  non-sealed class WhatsApp implements Envio {
//@Override → estou implementando um método da interface.
    @Override
    public void enviar(Cupom cupom){

        System.out.println("=== ENVIADO POR WHATSAPP ===");
        System.out.println("Código: " + cupom.codigo());
        System.out.println("Desconto: " + cupom.desconto() + "%");
        System.out.println("Validade: " + cupom.validade());
        System.out.println(cupom.resumo());

    }





}
