int reverse(int x) {
    long rev = 0; // DECLARE it here so the return statement can see it
    
    while (x != 0) {
        int pop = x % 10;
        x /= 10;
        
        // Build the reversed number
        rev = rev * 10 + pop;
        
        // Optional: Check for 32-bit overflow (common in coding challenges)
        if (rev > 2147483647 || rev < -2147483648) return 0;
    }
    
    return (int)rev; // Now 'rev' is recognized
}