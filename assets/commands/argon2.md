# TAGLINE

Hash passwords using the Argon2 algorithm

# TLDR

**Hash** a password

```echo -n "password" | argon2 [salt] -e```

Hash with **Argon2id** variant

```echo -n "password" | argon2 [salt] -id -e```

Hash with **custom parameters**

```echo -n "password" | argon2 [salt] -t [3] -m [16] -p [4] -e```

**Output raw bytes** instead of encoded form

```echo -n "password" | argon2 [salt] -r```

**Pin to Argon2 version 13** (current standard)

```echo -n "password" | argon2 [salt] -v [13] -e```

# SYNOPSIS

**argon2** _salt_ [_-d_|_-i_|_-id_] [_-t iterations_] [_-m memory_] [_-p parallelism_] [_-l length_] [_-e_|_-r_] [_-v_ _10|13_]

# DESCRIPTION

**argon2** is a command-line tool for the Argon2 password hashing algorithm, winner of the Password Hashing Competition in 2015. It provides strong, memory-hard password hashing resistant to GPU and ASIC attacks.

The tool supports Argon2d (data-dependent), Argon2i (data-independent), and Argon2id (hybrid) variants.

# PARAMETERS

**-d**
> Use Argon2d (data-dependent, GPU-resistant). Default is Argon2i.

**-i**
> Use Argon2i (data-independent, side-channel resistant). This is the default if no variant flag is given.

**-id**
> Use Argon2id (hybrid; recommended for password hashing).

**-t** _N_
> Time cost (iterations). Default: _3_.

**-m** _N_
> Memory cost expressed as 2^_N_ KiB. Default: _12_ (4 MiB).

**-p** _N_
> Parallelism (threads). Default: _1_.

**-l** _N_
> Output hash length in bytes. Default: _32_.

**-e**
> Print only the encoded hash (PHC string format).

**-r**
> Print only the raw hash bytes.

**-v** _10|13_
> Argon2 algorithm version. Default: _13_.

**-h**
> Display tool usage and exit.

# CAVEATS

Salt must be provided as a positional argument and should be at least 8 random bytes. Higher memory/time costs improve security but increase computation time. Argon2id is recommended for password hashing. The CLI hashes only — there is no built-in verification mode; verify hashes from a library that understands the PHC-encoded output.

# HISTORY

**Argon2** was designed by Alex Biryukov, Daniel Dinu, and Dmitry Khovratovich, winning the Password Hashing Competition in **2015**. It's recommended by OWASP for password hashing.

# INSTALL

```apt: sudo apt install argon2```

```dnf: sudo dnf install argon2```

```pacman: sudo pacman -S argon2```

```apk: sudo apk add argon2```

```zypper: sudo zypper install argon2```

```brew: brew install argon2```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[openssl](/man/openssl)(1), [bcrypt](/man/bcrypt)(1), [mkpasswd](/man/mkpasswd)(1)
