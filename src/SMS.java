public  non-sealed class SMS implements Envio {
    //@Override → estou implementando um método da interface.
    @Override
    public void enviar(Cupom cupom){

        System.out.println("=== ENVIADO POR SMS ===");
        System.out.println("Código: " + cupom.codigo());
        System.out.println("Desconto: " + cupom.desconto() + "%");
        System.out.println("Validade: " + cupom.validade());

    }





}