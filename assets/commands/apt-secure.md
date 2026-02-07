# TAGLINE

Archive authentication and trust model documentation.

# TLDR

This is a **manual page** describing APT's security model, not a command.

Read the man page:

```man apt-secure```

# DESCRIPTION

**apt-secure** is a manual page (not a command) that describes APT's archive authentication system. It explains how APT verifies package integrity using cryptographic signatures.

The document covers:
- How Release files are signed with GPG
- How Packages files are verified via checksums
- How to add trusted keys
- Security implications of untrusted repositories

# KEY CONCEPTS

**Release.gpg**
> Detached GPG signature for Release file

**InRelease**
> Release file with inline signature

**Trusted keys**
> Stored in /etc/apt/trusted.gpg.d/

**signed-by**
> Modern method to specify per-repository keys

# CONFIGURATION

**/etc/apt/trusted.gpg.d/**
> Directory for trusted keyring files used to verify repository signatures.

**/etc/apt/sources.list**
> Package sources, supporting signed-by option for per-repository keys.

# CAVEATS

Understanding apt-secure is important for adding third-party repositories safely. Using allow-insecure or allow-unauthenticated bypasses security.

# SEE ALSO

[apt](/man/apt)(8), [apt-key](/man/apt-key)(8), [sources.list](/man/sources.list)(5)
