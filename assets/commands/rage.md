# TAGLINE

Simple modern file encryption tool

# TLDR

**Encrypt file with passphrase**

```rage -p -o [encrypted.age] [file.txt]```

**Encrypt with recipient**

```rage -r [age1...] -o [encrypted.age] [file.txt]```

**Decrypt file**

```rage -d -i [key.txt] [encrypted.age]```

**Generate new key**

```rage-keygen -o [key.txt]```

**Encrypt with SSH key**

```rage -R [~/.ssh/id_ed25519.pub] [file.txt]```

**Armor output**

```rage -a -r [age1...] [file.txt]```

**Encrypt stdin**

```echo "secret" | rage -r [age1...] -o [secret.age]```

# SYNOPSIS

**rage** [_-e_|_-d_] [_-r recipient_] [_-i identity_] [_-o output_] [_options_] [_file_]

# PARAMETERS

**-e**, **--encrypt**
> Encrypt mode.

**-d**, **--decrypt**
> Decrypt mode.

**-r**, **--recipient** _KEY_
> Recipient public key.

**-R**, **--recipients-file** _FILE_
> File with recipients.

**-i**, **--identity** _FILE_
> Identity/private key.

**-p**, **--passphrase**
> Use passphrase.

**-a**, **--armor**
> ASCII armor output.

**-o**, **--output** _FILE_
> Output file.

# DESCRIPTION

**rage** is a Rust implementation of the age encryption tool. It provides simple, modern file encryption.

Public key encryption uses age keys or SSH keys. Recipients are specified by their public key.

Passphrase mode uses scrypt for key derivation. No key management needed for simple use.

ASCII armor produces text output. Safe for email or other text channels.

Multiple recipients allow group encryption. Any recipient can decrypt.

# CAVEATS

Age format, not compatible with GPG. Key management is manual. No key servers.

# HISTORY

**rage** is a Rust implementation of **age** (Actually Good Encryption), designed by Filippo Valsorda. Age aims to be a simpler alternative to GPG.

# SEE ALSO

[age](/man/age)(1), [gpg](/man/gpg)(1), [openssl](/man/openssl)(1)
