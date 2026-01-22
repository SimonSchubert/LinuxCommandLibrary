# TLDR

Generate **ed25519** key

```dropbearkey -t ed25519 -f [path/to/key_file]```

Generate **ECDSA** key

```dropbearkey -t ecdsa -f [path/to/key_file]```

Generate **RSA** key with 4096 bits

```dropbearkey -t rsa -s 4096 -f [path/to/key_file]```

Print **fingerprint and public key**

```dropbearkey -y -f [path/to/key_file]```

# SYNOPSIS

**dropbearkey** [_options_]

# DESCRIPTION

**dropbearkey** generates SSH keys in Dropbear format. Dropbear is a lightweight SSH implementation for embedded systems.

Keys generated are not directly compatible with OpenSSH format; use dropbearconvert to convert between formats.

# PARAMETERS

**-t** _type_
> Key type (rsa, ecdsa, ed25519)

**-f** _file_
> Output key file

**-s** _bits_
> Key size in bits (for RSA)

**-y**
> Print public key and fingerprint from existing key

# CAVEATS

Dropbear key format differs from OpenSSH. Use dropbearconvert to convert keys. Part of Dropbear SSH suite, common in embedded Linux.

# SEE ALSO

[dropbearconvert](/man/dropbearconvert)(1), [dropbear](/man/dropbear)(8), [ssh-keygen](/man/ssh-keygen)(1)
