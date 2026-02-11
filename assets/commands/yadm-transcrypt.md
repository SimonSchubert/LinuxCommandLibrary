# TAGLINE

Transparent encryption for yadm files

# TLDR

**Initialize transcrypt**

```yadm transcrypt -c aes-256-gcm```

**Unlock files**

```yadm transcrypt --display```

**Configure transcrypt**

```yadm transcrypt -p [password]```

# SYNOPSIS

**yadm** **transcrypt** [_options_]

# PARAMETERS

**-c** _cipher_
> Encryption cipher.

**-p** _password_
> Set password.

**--display**
> Show configuration.

# DESCRIPTION

**yadm transcrypt** wraps transcrypt for transparent file encryption. Encrypts files on push using .gitattributes patterns. Alternative encryption method to yadm encrypt.

# SEE ALSO

[yadm](/man/yadm)(1), [transcrypt](/man/transcrypt)(1)

