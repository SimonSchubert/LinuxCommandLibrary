# TLDR

**Check if number is prime**

```openssl prime [number]```

**Check hex number**

```openssl prime -hex [hex-number]```

**Generate random prime**

```openssl prime -generate -bits [256]```

**Generate safe prime**

```openssl prime -generate -bits [256] -safe```

# SYNOPSIS

**openssl** **prime** [_options_] [_number_]

# PARAMETERS

**-hex**
> Input/output in hexadecimal.

**-generate**
> Generate a prime number.

**-bits** _n_
> Number of bits for generation.

**-safe**
> Generate safe prime (p where (p-1)/2 is also prime).

**-checks** _n_
> Number of Miller-Rabin tests.

# DESCRIPTION

**openssl prime** tests numbers for primality or generates prime numbers. Uses Miller-Rabin primality testing. Useful for cryptographic applications requiring prime numbers.

# SEE ALSO

[openssl](/man/openssl)(1)

