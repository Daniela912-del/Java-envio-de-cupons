public sealed interface Envio
// sealed está restringindo.
//O permits é a lista dos permitidos.
        permits Email, WhatsApp, SMS {
//A primeira palavra é o tipo, a segunda é o nome da variável.

    //Cupom → tipo do objeto
    //cupom → nome da variável que vai guardar o objeto recebido


    void enviar(Cupom cupom);
}