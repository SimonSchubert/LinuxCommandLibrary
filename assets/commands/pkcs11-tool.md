# TAGLINE

Manage PKCS#11 cryptographic tokens and smart cards

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

**pkcs11-tool** interacts with PKCS#11 cryptographic tokens such as smart cards, USB security keys, and hardware security modules (HSMs). It can list available slots and objects, generate key pairs, sign and verify data, and initialize tokens.

Part of the OpenSC project, it communicates with tokens through PKCS#11 library modules. Different token types require their specific PKCS#11 library, specified with the **--module** option. Operations on private objects typically require PIN authentication.

# CAVEATS

Part of OpenSC. Token/reader dependent. PIN required for operations.

# HISTORY

pkcs11-tool is part of **OpenSC** for PKCS#11 token management.

# SEE ALSO

[p11-kit](/man/p11-kit)(1), [opensc-tool](/man/opensc-tool)(1)

