# TLDR

**List tokens**

```pkcs11-tool --list-token-slots```

**List objects on token**

```pkcs11-tool --list-objects```

**Generate key pair**

```pkcs11-tool --keypairgen --key-type rsa:2048 --label [keyname]```

**Sign data**

```pkcs11-tool --sign -m RSA-PKCS --input [data] --output [signature]```

**Initialize token**

```pkcs11-tool --init-token --label [label]```

# SYNOPSIS

**pkcs11-tool** [_options_]

# PARAMETERS

**--list-token-slots**
> List available slots.

**--list-objects**
> List token objects.

**--keypairgen**
> Generate key pair.

**--sign**
> Sign data.

**--init-token**
> Initialize token.

**--module** _LIB_
> PKCS#11 library.

**--help**
> Display help.

# DESCRIPTION

**pkcs11-tool** manages PKCS#11 tokens. Smart card and HSM operations.

The tool interacts with cryptographic tokens. Part of OpenSC.

pkcs11-tool manages tokens.

# CAVEATS

Part of OpenSC. Token/reader dependent. PIN required for operations.

# HISTORY

pkcs11-tool is part of **OpenSC** for PKCS#11 token management.

# SEE ALSO

[p11-kit](/man/p11-kit)(1), [opensc-tool](/man/opensc-tool)(1)

