/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp3.grupal.BugHunter2.config;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
/*import static org.springframework.http.HttpHeaders.AUTHORIZATION;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;*/

/**
 *
 * @author anali
 */
public class JwtAthFilter implements Filter {
    
        private List<String> blockedPaths = Arrays.asList("/ruta-bloqueada1", "/ruta-bloqueada2");
     
        @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        String requestedPath = httpRequest.getServletPath();

        if (blockedPaths.contains(requestedPath)) {
            // Verificar si el usuario tiene privilegios de administrador
            boolean isAdmin = true;

           if (isAdmin == false) {
                // El usuario no es administrador, redirigir o mostrar un mensaje de acceso denegado
                httpResponse.sendRedirect("/acceso-denegado");
                return;
            }
        }

        // Continuar con el procesamiento de la solicitud
        chain.doFilter(request, response);
    }
   
            /*jwtToken = authHeader.substring(7);
            userEmail = "something";
            if(userEmail != null && SecurityContextHolder.getContext().getAuthentication() == null){
                var userDetails = UserDetailsService.loadUserByUsername(userEmail);
                boolean isTokenValid;
    
                if (isTokenValid) {
                    Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                    SecurityContextHolder.getContext().setAuthentication(authentication);
    }
                
                 /*if(jwtUtils.isTokenValid(jwtToken, userDetails)){
                    UsernamePasswordAuthenticationToken authToken =
                        new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                        authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                        SecurityContextHolder.getContext().setAuthentication(authToken);
                }*/
            
            

   

    // Implementa los métodos restantes del ciclo de vida del filtro (init, destroy) si es necesario
}

            
            
   

