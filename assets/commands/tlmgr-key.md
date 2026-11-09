# TAGLINE

Manage TeX Live GPG verification keys

# TLDR

**List GPG keys**

```tlmgr key list```

**Add key**

```tlmgr key add [keyfile]```

**Add key from standard input**

```gpg --armor --export [keyid] | tlmgr key add -```

**Remove key**

```tlmgr key remove [keyid]```

# SYNOPSIS

**tlmgr key** list

**tlmgr key** add _file_

**tlmgr key** remove _keyid_

# PARAMETERS

**list**
> List all keys.

**add** _file_
> Add GPG key from file, or from standard input if _file_ is **-**.

**remove** _keyid_
> Remove key by ID from the local keyring.

# DESCRIPTION

**tlmgr key** manages the additional GPG keys trusted for verifying the TeX Live package databases. Ensures packages are from trusted sources. Part of TeX Live Manager security features.

Added keys are stored in the local keyring **GNUPGHOME/repository-keys.gpg**, normally **tlpkg/gpg/repository-keys.gpg**.

# SEE ALSO

[tlmgr-repository](/man/tlmgr-repository)(1), [tlmgr](/man/tlmgr)(1), [gpg](/man/gpg)(1)

# RESOURCES

```[Homepage](https://www.tug.org/texlive/)```

```[Documentation](https://www.tug.org/texlive/doc/tlmgr.html)```

<!-- verified: 2026-11-09 -->
