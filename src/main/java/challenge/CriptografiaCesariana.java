package challenge;

public class CriptografiaCesariana implements Criptografia {

	int numeroDeCasas = 3;
	
    @Override
    public String criptografar(String texto) {
        
    	if(texto.isEmpty()) {
        	throw new IllegalArgumentException("ERRO! Não foi informado um texto para ser criptografado.");
        }
    	
    	String textoCriptografado = "";
    	
    	for (char c : texto.toLowerCase().toCharArray()) {
    		if(String.valueOf(c).matches(("[a-z]*"))) {
    			textoCriptografado = textoCriptografado + (char)(c + numeroDeCasas);
    		} else {
    			textoCriptografado = textoCriptografado + c;
    		}
        }    
    	return textoCriptografado;
    }

    @Override
    public String descriptografar(String texto) {
        
    	if(texto.isEmpty()) {
        	throw new IllegalArgumentException("ERRO! Não foi informado um texto para ser descriptografado.");
        }
    	
    	String textoDescriptografado = "";
    	
    	for (char c : texto.toLowerCase().toCharArray()) {
    		if(String.valueOf(c).matches(("[a-z]*"))) {
    			textoDescriptografado = textoDescriptografado + (char)(c - numeroDeCasas);
    		} else {
    			textoDescriptografado = textoDescriptografado + c;
    		}
        }    	
    	
    	return textoDescriptografado;
    }
}
