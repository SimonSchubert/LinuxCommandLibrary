# TAGLINE

export container applications and binaries to host system

# TLDR

**Export an app** to the host

```distrobox-export --app [mpv]```

**Export an app** with extra launch flags

```distrobox-export --app [atom] --extra-flags "--foreground"```

**Export a binary** to ~/.local/bin

```distrobox-export --bin [/usr/bin/vim] --export-path [~/.local/bin]```

**List** apps already exported from this container

```distrobox-export --list-apps```

**Delete** an exported application

```distrobox-export --app [atom] --delete```

# SYNOPSIS

**distrobox-export** [_options_]

# DESCRIPTION

**distrobox-export** exports applications or binaries from a Distrobox container to the host system. Exported apps appear in the host's application menu, and exported binaries become available on the host through a small wrapper script that runs them inside the container.

Run this command from inside the container. Use either **--app** or **--bin**, not both together.

# PARAMETERS

**-a, --app** _app_
> Export application by name or absolute path to a .desktop file (creates a desktop entry)

**-b, --bin** _binary_
> Export a binary by its absolute path inside the container

**--list-apps**
> List applications already exported from this container

**--list-binaries**
> List binaries already exported from this container

**-ep, --export-path** _path_
> Destination path for an exported binary (e.g. ~/.local/bin)

**-el, --export-label** _label_
> Label appended to the exported application name (defaults to "(on _container_)"; use "none" to disable)

**-ef, --extra-flags** _flags_
> Extra flags passed to the command when the exported item runs

**-nf, --enter-flags** _flags_
> Extra flags passed to the underlying `distrobox enter`

**-S, --sudo**
> Run the exported item as root inside the container

**-d, --delete**
> Un-export the specified application or binary

# CAVEATS

Must be run from inside the container. Exported apps depend on the container existing (it is started automatically on launch). Deleting the container breaks exported applications and binaries.

# INSTALL

```dnf: sudo dnf install distrobox```

```pacman: sudo pacman -S distrobox```

```apk: sudo apk add distrobox```

```zypper: sudo zypper install distrobox```

```brew: brew install distrobox```

```nix: nix profile install nixpkgs#distrobox```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[distrobox](/man/distrobox)(1), [distrobox-enter](/man/distrobox-enter)(1)

# RESOURCES

```[Source code](https://github.com/89luca89/distrobox)```

```[Homepage](https://distrobox.it/)```

<!-- verified: 2026-07-11 -->
