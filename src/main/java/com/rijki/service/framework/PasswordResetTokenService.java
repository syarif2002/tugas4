package com.rijki.service.framework;

import com.rijki.entity.PasswordResetToken;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-reset-password
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/04/22
 * Time: 08.39
 */
public interface PasswordResetTokenService {
    PasswordResetToken findByToken(String token);

    PasswordResetToken save(PasswordResetToken passwordResetToken);
}
