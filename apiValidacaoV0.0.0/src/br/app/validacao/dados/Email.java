/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.validacao.dados;



/**
 *
 * @author mvictor
 */
public final class Email implements IEmail{

    private static volatile Email instancia;
    private final static String email =  "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    private static volatile java.util.regex.Pattern pattern;
    private static volatile java.util.regex.Matcher matcher;
    private final static Object MONITOR = new Object();
            
    public Email()
    {
        super();
        pattern = java.util.regex.Pattern.compile(email, java.util.regex.Pattern.CASE_INSENSITIVE);
    }
    
    public static Email getInstancia()
    {
        synchronized (MONITOR) {
            if (instancia == null) {
                instancia = new Email();
            }
        }
        return instancia;
    }
    
    @Override
    public final boolean isValidEmail(final String Campo) {
       matcher = pattern.matcher(Campo);
       return matcher.matches();
    }
    
}
