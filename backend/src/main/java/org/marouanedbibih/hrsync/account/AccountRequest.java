package org.marouanedbibih.hrsync.account;

import lombok.Builder;

@Builder
public record AccountRequest(
    String username
) {
    
}
