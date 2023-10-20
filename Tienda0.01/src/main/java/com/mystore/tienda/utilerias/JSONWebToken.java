package com.mystore.tienda.utilerias;
import java.util.Date;
import java.util.UUID;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

public class JSONWebToken {
    private static final String SECRET_KEY = "TheBestSecretEver";
    private static final String ISSUER = "Atomic Eve";
    private static final long TOKEN_LIFETIME = 3600000L;
    
    private static JWTVerifier verificador;
    private static Algorithm algoritmo;
    public static void inicializar(){
        algoritmo = Algorithm.HMAC256(SECRET_KEY);
        verificador = JWT
                .require(algoritmo)
                .withIssuer(ISSUER)
                .build();
    }
    public static String crearJWT(String idusuario, String subject){
        String jwttoken = JWT.create()
                .withIssuer(ISSUER)
                .withSubject(subject)
                .withClaim("idusuario", idusuario)
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis()+TOKEN_LIFETIME))
                .withJWTId(UUID.randomUUID().toString())
                .withNotBefore(new Date())
                .sign(algoritmo);
        return jwttoken;
    }
    public static DecodedJWT verificarToken(String jwttoken){
        try {
            DecodedJWT decode = verificador.verify(jwttoken);
            return decode;
        } catch (JWTVerificationException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public static String getClaim(DecodedJWT decode, String nombreClaim){
        return decode.getClaim(nombreClaim).toString();
    }
    public static void main(String[] args) {
        inicializar();
        String jwtoken = crearJWT("alicia", "Alicia Lopez");
        DecodedJWT decode = verificarToken(jwtoken);
        if (decode!=null){
            System.out.println("La verificacion fue superada");
            System.out.println("idusuario: "+ getClaim(decode, "idusuario"));
            System.out.println("Subject: "+ decode.getSubject());
            System.out.println("JWT Token:"+ jwtoken);
        }
        else
            System.out.println("la verificacion ha fallado");
    }}
