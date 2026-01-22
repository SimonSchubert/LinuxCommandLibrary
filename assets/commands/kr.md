# TLDR

**Pair with phone**

```kr pair```

**Show paired devices**

```kr devices```

**Generate SSH key**

```kr generate --email [email@example.com]```

**Add public key to server**

```kr add [user@host]```

**Remove pairing**

```kr unpair```

# SYNOPSIS

**kr** _command_ [_options_]

# PARAMETERS

**pair**
> Pair with Krypton phone app.

**devices**
> List paired devices.

**generate**
> Generate SSH key on phone.

**add** _HOST_
> Add key to host.

**unpair**
> Remove device pairing.

**--help**
> Display help information.

# DESCRIPTION

**kr** is the Krypton CLI for SSH key management. It stores SSH keys on a smartphone instead of the computer.

The tool pairs with the Krypton mobile app. SSH authentication requires phone approval for each connection.

kr manages mobile SSH keys.

# CAVEATS

Requires Krypton app. Phone needed for auth. Project deprecated.

# HISTORY

kr was the CLI for **Krypton** (now deprecated), which stored SSH and GPG keys on smartphones for 2FA.

# SEE ALSO

[ssh](/man/ssh)(1), [ssh-keygen](/man/ssh-keygen)(1), [gpg](/man/gpg)(1)
