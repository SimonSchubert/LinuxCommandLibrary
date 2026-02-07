# TAGLINE

generate SSH keys for Dropbear

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

**dropbearkey** generates SSH host and user keys in Dropbear's native format. Dropbear is a lightweight SSH implementation commonly used on embedded systems, routers, and resource-constrained devices where OpenSSH would be too large.

The tool supports modern key types including Ed25519, ECDSA, and RSA with configurable key sizes. Generated keys are stored in Dropbear's own format, which differs from OpenSSH's format. If you need to use keys with OpenSSH or vice versa, use dropbearconvert to convert between formats.

Host keys are typically stored in /etc/dropbear/, while user keys can be placed in standard SSH locations.

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
