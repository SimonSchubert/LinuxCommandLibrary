# TLDR

**Hash** a password

```echo -n "password" | argon2 [salt] -e```

Hash with **Argon2id** variant

```echo -n "password" | argon2 [salt] -id -e```

Hash with **custom parameters**

```echo -n "password" | argon2 [salt] -t [3] -m [16] -p [4] -e```

**Verify** a password

```echo -n "password" | argon2 [salt] -v```

# SYNOPSIS

**argon2** _salt_ [_-d_|_-i_|_-id_] [_-t iterations_] [_-m memory_] [_-p parallelism_] [_-l length_] [_-e_|_-r_]

# DESCRIPTION

**argon2** is a command-line tool for the Argon2 password hashing algorithm, winner of the Password Hashing Competition in 2015. It provides strong, memory-hard password hashing resistant to GPU and ASIC attacks.

The tool supports Argon2d (data-dependent), Argon2i (data-independent), and Argon2id (hybrid) variants.

# PARAMETERS

**-d**
> Use Argon2d (faster, GPU-resistant)

**-i**
> Use Argon2i (side-channel resistant)

**-id**
> Use Argon2id (recommended, hybrid)

**-t** _n_
> Time cost (iterations)

**-m** _n_
> Memory cost (2^n KiB)

**-p** _n_
> Parallelism (threads)

**-l** _n_
> Output length in bytes

**-e**
> Output encoded hash

**-r**
> Output raw hash bytes

**-v**
> Verbose output

# CAVEATS

Salt must be provided and should be random. Higher memory/time costs improve security but increase computation time. Argon2id is recommended for most uses.

# HISTORY

**Argon2** was designed by Alex Biryukov, Daniel Dinu, and Dmitry Khovratovich, winning the Password Hashing Competition in **2015**. It's recommended by OWASP for password hashing.

# SEE ALSO

[openssl](/man/openssl)(1), [bcrypt](/man/bcrypt)(1), [mkpasswd](/man/mkpasswd)(1)
