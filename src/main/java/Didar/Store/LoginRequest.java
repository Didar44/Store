package Didar.Store;

public record LoginRequest(
        String phone,
        String password
) {}