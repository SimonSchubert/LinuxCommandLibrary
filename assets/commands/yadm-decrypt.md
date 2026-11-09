# TAGLINE

Decrypt yadm encrypted files

# TLDR

**Decrypt files**

```yadm decrypt```

**List files in the archive** without extracting them

```yadm decrypt -l```

# SYNOPSIS

**yadm** **decrypt** [**-l**]

# PARAMETERS

**-l**
> List the files stored in the archive without extracting them.

# DESCRIPTION

**yadm decrypt** decrypts the archive at **~/.local/share/yadm/archive** created by **yadm encrypt** and extracts the files relative to the configured work-tree (usually **$HOME**). It prompts for the password, or uses the matching private key when the archive was encrypted to a **yadm.gpg-recipient**.

After files are decrypted, yadm automatically updates their permissions as described in **yadm perms**.

# CAVEATS

The tool used must match the one that created the archive: **gpg** by default, or **openssl** when **yadm.cipher** is set to it.

# INSTALL

```pacman: sudo pacman -S yadm```

```apk: sudo apk add yadm```

```zypper: sudo zypper install yadm```

```brew: brew install yadm```

```nix: nix profile install nixpkgs#yadm```

<!-- packages: 2026-11-09 -->

# SEE ALSO

[yadm](/man/yadm)(1), [yadm-encrypt](/man/yadm-encrypt)(1), [yadm-perms](/man/yadm-perms)(1)

# RESOURCES

```[Source code](https://github.com/yadm-dev/yadm)```

```[Homepage](https://yadm.io)```

```[Documentation](https://yadm.io/docs/encryption)```

<!-- verified: 2026-11-09 -->
