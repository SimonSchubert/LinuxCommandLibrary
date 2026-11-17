# TAGLINE

List installed Flatpak applications and runtimes

# TLDR

List **everything** installed

```flatpak list```

List **applications** only

```flatpak list --app```

List **runtimes** only

```flatpak list --runtime```

Include locale and debug **extensions**

```flatpak list -a```

List the **per-user** installation

```flatpak list -u```

Show origin, size, and other **details**

```flatpak list -d```

# SYNOPSIS

**flatpak list** [_OPTIONS_]

# PARAMETERS

**--app**
> List applications only.

**--runtime**
> List runtimes only.

**-a**, **--all**
> Include extensions such as locales and debug runtimes.

**-u**, **--user**
> Use the per-user installation instead of the system one.

**-d**, **--show-details**
> Add columns such as origin and size.

**-h**, **--help**
> Show help and exit.

# DESCRIPTION

**flatpak list** prints Flatpak applications and runtimes that are installed. It is a subcommand of **flatpak**, not a separate program. Without **--user**, the default system installation is listed.

# INSTALL

```apt: sudo apt install flatpak```

```dnf: sudo dnf install flatpak```

```pacman: sudo pacman -S flatpak```

```apk: sudo apk add flatpak```

```zypper: sudo zypper install flatpak```

```nix: nix profile install nixpkgs#flatpak```

<!-- packages: 2026-11-17 -->

# SEE ALSO

[flatpak](/man/flatpak)(1), [flatpak-info](/man/flatpak-info)(1), [flatpak-search](/man/flatpak-search)(1), [flatpak-install](/man/flatpak-install)(1), [flatpak-uninstall](/man/flatpak-uninstall)(1)

# RESOURCES

```[Source code](https://github.com/flatpak/flatpak)```

```[Homepage](https://flatpak.org)```

```[Documentation](https://docs.flatpak.org/en/latest/flatpak-command-reference.html#flatpak-list)```

<!-- verified: 2026-11-17 -->
