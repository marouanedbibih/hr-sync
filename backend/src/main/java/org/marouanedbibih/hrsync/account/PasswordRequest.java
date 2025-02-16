package org.marouanedbibih.hrsync.account;

import lombok.Builder;

@Builder
public record PasswordRequest(
    String password
) {
    
}
