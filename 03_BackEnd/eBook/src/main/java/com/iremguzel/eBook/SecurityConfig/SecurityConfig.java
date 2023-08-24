/*package com.iremguzel.eBook.SecurityConfig;

import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .cors() // Spring Security CORS ayarlarını etkinleştirir
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/api/**").permitAll() // Örnek: GET isteklerine herkes erişebilir
                .antMatchers(HttpMethod.POST, "/api/**").authenticated() // Örnek: POST istekleri yetkilendirme gerektirir
                // Diğer izinleri ve ayarları burada belirleyebilirsiniz
                .and()
                .csrf().disable(); // CSRF korumasını devre dışı bırakır. Geliştirme aşamasında devre dışı bırakılabilir.
    }
}
*/
