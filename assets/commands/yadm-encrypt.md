# TAGLINE

Encrypt sensitive dotfiles with yadm

# TLDR

**Add a pattern** to the list of encrypted files

```echo "[.ssh/*.key]" >> ~/.config/yadm/encrypt```

**Encrypt all matching files** into the archive

```yadm encrypt```

**Commit the new archive**

```yadm add ~/.local/share/yadm/archive && yadm commit```

# SYNOPSIS

**yadm** **encrypt**

# DESCRIPTION

**yadm encrypt** finds all files matching the patterns in **~/.config/yadm/encrypt**, prompts for a password and saves them encrypted as **~/.local/share/yadm/archive**. Both the **encrypt** list and the **archive** should be added to the repository so they are available on other systems.

Patterns are relative to the work-tree (usually **$HOME**), one per line. **\***, **?** and **[** are supported, **\*\*** matches all subdirectories, a directory includes its contents and paths beginning with **!** are excluded. Brace and tilde expansion are not supported.

Encryption is symmetric **gpg** by default. Set **yadm.gpg-recipient** for asymmetric encryption, or **yadm.cipher** to **openssl** to use OpenSSL instead.

# CAVEATS

Patterns are added to the repository's **info/exclude** each time the command runs, to prevent committing the plain text files. This can be disabled with **yadm.auto-exclude**. yadm recommends a private repository even for encrypted files.

# INSTALL

```pacman: sudo pacman -S yadm```

```apk: sudo apk add yadm```

```zypper: sudo zypper install yadm```

```brew: brew install yadm```

```nix: nix profile install nixpkgs#yadm```

<!-- packages: 2026-11-09 -->

# SEE ALSO

[yadm](/man/yadm)(1), [yadm-decrypt](/man/yadm-decrypt)(1), [yadm-perms](/man/yadm-perms)(1), [gpg](/man/gpg)(1)

# RESOURCES

```[Source code](https://github.com/yadm-dev/yadm)```

```[Homepage](https://yadm.io)```

```[Documentation](https://yadm.io/docs/encryption)```

<!-- verified: 2026-11-09 -->
