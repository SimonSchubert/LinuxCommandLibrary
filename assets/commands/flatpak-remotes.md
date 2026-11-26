# TAGLINE

List Flatpak remotes

# TLDR

List configured **remotes**

```flatpak remotes```

Show **details** such as the URL and priority

```flatpak remotes --show-details```

Include **disabled** remotes

```flatpak remotes --show-disabled```

List only the **per-user** installation

```flatpak remotes --user```

Choose **columns**

```flatpak remotes --columns name,url,priority```

List the column **names**

```flatpak remotes --columns help```

# SYNOPSIS

**flatpak remotes** [_OPTIONS_]

# PARAMETERS

**-d**, **--show-details**
> Add columns such as the remote URL, options, and priority.

**--show-disabled**
> Include remotes that are configured but disabled.

**-u**, **--user**
> Use the per-user installation instead of the system one.

**--columns** _fields_
> Print only the named columns. **help** lists the field names.

**-h**, **--help**
> Show help and exit.

# DESCRIPTION

**flatpak remotes** prints the remote repositories configured for Flatpak. A remote is a source of applications and runtimes, such as Flathub. The command is a subcommand of **flatpak**, not a separate program. Without **--user**, the system installation is listed.

Disabled remotes stay on disk but are hidden unless **--show-disabled** is set. Priority decides which remote wins when the same application is published in more than one.

# INSTALL

```apt: sudo apt install flatpak```

```dnf: sudo dnf install flatpak```

```pacman: sudo pacman -S flatpak```

```apk: sudo apk add flatpak```

```zypper: sudo zypper install flatpak```

```nix: nix profile install nixpkgs#flatpak```

<!-- packages: 2026-11-26 -->

# SEE ALSO

[flatpak](/man/flatpak)(1), [flatpak-remote-info](/man/flatpak-remote-info)(1), [flatpak-install](/man/flatpak-install)(1), [flatpak-list](/man/flatpak-list)(1)

# RESOURCES

```[Source code](https://github.com/flatpak/flatpak)```

```[Documentation](https://docs.flatpak.org/en/latest/flatpak-command-reference.html#flatpak-remotes)```

<!-- verified: 2026-11-26 -->
