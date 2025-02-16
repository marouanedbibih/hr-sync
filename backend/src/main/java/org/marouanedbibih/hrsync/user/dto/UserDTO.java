package org.marouanedbibih.hrsync.user.dto;

import org.marouanedbibih.hrsync.user.UserRole;
import org.marouanedbibih.hrsync.utils.MyDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class UserDTO extends MyDTO {
    private String username;
    private String password;
    private UserRole role;

    // To String
    @Override
    public String toString() {
        return "UserDTO{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }

    // Equals Method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        UserDTO user = (UserDTO) obj;
        return username.equals(user.username);
    }
    
    // HashCode Method
    @Override
    public int hashCode() {
        return username.hashCode();
    }
}
