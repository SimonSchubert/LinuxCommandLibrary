# TAGLINE

Show information about an installed Flatpak application or runtime

# TLDR

**Show** an installed application or runtime

```flatpak info [com.example.app]```

Show one **branch**

```flatpak info [com.example.app] [branch]```

Show **permissions**

```flatpak info -M [com.example.app]```

Show the **on-disk location**

```flatpak info -l [com.example.app]```

Show the **installed size**

```flatpak info -s [com.example.app]```

# SYNOPSIS

**flatpak info** [_OPTIONS_] _REF_ [_BRANCH_]

# PARAMETERS

**-M**, **--show-permissions**
> Print the permissions the ref is allowed.

**-l**, **--show-location**
> Print the directory where the ref is deployed.

**-s**, **--show-size**
> Print the installed size.

**-h**, **--help**
> Show help and exit.

# DESCRIPTION

**flatpak info** prints details of an installed Flatpak application or runtime. It is a subcommand of **flatpak**, not a separate program. The ref is an application id such as **com.example.app**, optionally followed by a branch name.

# INSTALL

```apt: sudo apt install flatpak```

```dnf: sudo dnf install flatpak```

```pacman: sudo pacman -S flatpak```

```apk: sudo apk add flatpak```

```zypper: sudo zypper install flatpak```

```nix: nix profile install nixpkgs#flatpak```

<!-- packages: 2026-11-17 -->

# SEE ALSO

[flatpak](/man/flatpak)(1), [flatpak-list](/man/flatpak-list)(1), [flatpak-install](/man/flatpak-install)(1), [flatpak-override](/man/flatpak-override)(1), [flatpak-run](/man/flatpak-run)(1)

# RESOURCES

```[Source code](https://github.com/flatpak/flatpak)```

```[Homepage](https://flatpak.org)```

```[Documentation](https://docs.flatpak.org/en/latest/flatpak-command-reference.html#flatpak-info)```

<!-- verified: 2026-11-17 -->
