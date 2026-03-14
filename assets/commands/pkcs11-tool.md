# TAGLINE

Manage PKCS#11 cryptographic tokens and smart cards

# TLDR

**List available token slots**

```pkcs11-tool --list-token-slots```

**List objects on a token**

```pkcs11-tool --list-objects```

**List supported mechanisms**

```pkcs11-tool --list-mechanisms```

**Generate an RSA key pair**

```pkcs11-tool --login --keypairgen --key-type rsa:2048 --label [keyname]```

**Sign data with a key**

```pkcs11-tool --login --sign -m RSA-PKCS --id [key_id] --input [data] --output [signature]```

**Initialize a token**

```pkcs11-tool --init-token --label [label] --so-pin [so_pin]```

**Use a specific PKCS#11 library module**

```pkcs11-tool --module [/usr/lib/libpkcs11.so] --list-objects```

# SYNOPSIS

**pkcs11-tool** [_options_]

# PARAMETERS

**--list-token-slots**
> List available slots.

**--list-objects**
> List objects on the token. Can filter with --label, --id, or --type.

**--list-mechanisms**
> List mechanisms supported by the token.

**--keypairgen**
> Generate a key pair on the token.

**--sign**
> Sign data.

**--verify**
> Verify signed data.

**--init-token**
> Initialize a token.

**--init-pin**
> Initialize the user PIN (first-time setup).

**--change-pin**
> Change the user PIN.

**--login**, **-l**
> Authenticate to the token before performing operations.

**--pin** _PIN_
> Supply the PIN on the command line.

**--key-type** _spec_
> Key type and length (e.g., rsa:2048, EC:prime256v1).

**--id** _ID_
> Object ID (hex).

**--label** _LABEL_
> Object label.

**--slot** _ID_
> Specify the slot to use.

**--module** _LIB_
> PKCS#11 library to load.

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

