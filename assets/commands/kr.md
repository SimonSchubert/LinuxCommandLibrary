# TAGLINE

krypton CLI for SSH key management

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

**kr** is the command-line interface for Krypton, a system that stores SSH and GPG private keys on a paired smartphone rather than on the computer. By keeping private keys on a separate device, Krypton provides a form of two-factor authentication for SSH connections: each login attempt triggers a push notification on the phone that must be approved before the connection proceeds.

The CLI handles pairing with the Krypton mobile app, generating keys on the phone, and copying the corresponding public key to remote servers. Once configured, kr integrates transparently with the local SSH agent so that standard ssh commands work without modification. The Krypton project has been deprecated, but the CLI and its architecture influenced later approaches to hardware-backed SSH key management.

# CAVEATS

Requires Krypton app. Phone needed for auth. Project deprecated.

# HISTORY

kr was the CLI for **Krypton** (now deprecated), which stored SSH and GPG keys on smartphones for 2FA.

# SEE ALSO

[ssh](/man/ssh)(1), [ssh-keygen](/man/ssh-keygen)(1), [gpg](/man/gpg)(1)
