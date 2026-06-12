package Didar.Store;


public record AuthResponse(
        Long userId,
        String fullName,
        String phone,
        String role,
        String message
) {}