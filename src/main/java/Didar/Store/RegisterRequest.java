package Didar.Store;

public record RegisterRequest(
        String fullName,
        String phone,
        String email,
        String password
) {}