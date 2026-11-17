# TAGLINE

Search Flatpak applications and runtimes in configured remotes

# TLDR

**Search** remotes for text

```flatpak search [text]```

Search only the **current user's** remotes

```flatpak search -u [text]```

Choose which **columns** to print

```flatpak search --columns [name,application,version] [text]```

# SYNOPSIS

**flatpak search** [_OPTIONS_] _TEXT_

# PARAMETERS

**-u**, **--user**
> Search remotes configured for the per-user installation.

**--columns**=_FIELDS_
> Comma-separated columns to print, such as **name**, **application**, and **version**.

**-h**, **--help**
> Show help and exit.

# DESCRIPTION

**flatpak search** queries the Flatpak remotes already configured on this machine and prints matching applications and runtimes. It is a subcommand of **flatpak**, not a separate program. It does not install anything. Use **flatpak-install** for that.

# INSTALL

```apt: sudo apt install flatpak```

```dnf: sudo dnf install flatpak```

```pacman: sudo pacman -S flatpak```

```apk: sudo apk add flatpak```

```zypper: sudo zypper install flatpak```

```nix: nix profile install nixpkgs#flatpak```

<!-- packages: 2026-11-17 -->

# SEE ALSO

[flatpak](/man/flatpak)(1), [flatpak-install](/man/flatpak-install)(1), [flatpak-list](/man/flatpak-list)(1), [flatpak-info](/man/flatpak-info)(1), [flatpak-remote-info](/man/flatpak-remote-info)(1)

# RESOURCES

```[Source code](https://github.com/flatpak/flatpak)```

```[Homepage](https://flatpak.org)```

```[Documentation](https://docs.flatpak.org/en/latest/flatpak-command-reference.html#flatpak-search)```

<!-- verified: 2026-11-17 -->
