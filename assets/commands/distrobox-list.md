# TAGLINE

list all Distrobox containers

# TLDR

**List** all Distrobox containers

```distrobox-list```

List with **verbose information**

```distrobox-list -v```

# SYNOPSIS

**distrobox-list** [_options_]

# DESCRIPTION

**distrobox-list** lists all Distrobox containers. Distrobox containers are shown separately from regular Podman or Docker containers.

The output shows container name, status, and image used.

# PARAMETERS

**-v, --verbose**
> Show verbose information

# CAVEATS

Only shows containers created by Distrobox, not regular Docker/Podman containers.

# INSTALL

```dnf: sudo dnf install distrobox```

```pacman: sudo pacman -S distrobox```

```apk: sudo apk add distrobox```

```zypper: sudo zypper install distrobox```

```brew: brew install distrobox```

```nix: nix profile install nixpkgs#distrobox```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[distrobox](/man/distrobox)(1), [distrobox-create](/man/distrobox-create)(1), [podman](/man/podman)(1)

# RESOURCES

```[Source code](https://github.com/89luca89/distrobox)```

```[Homepage](https://distrobox.it/)```

<!-- verified: 2026-07-11 -->
