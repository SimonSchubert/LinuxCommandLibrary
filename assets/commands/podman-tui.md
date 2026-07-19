# TAGLINE

Terminal UI for Podman containers

# TLDR

**Start** the Podman TUI

```podman-tui```

**Ensure** the Podman API socket is running (user)

```systemctl --user start podman.socket```

**Or** start the API service without systemd

```podman system service --time=0```

# SYNOPSIS

**podman-tui**

# DESCRIPTION

**podman-tui** is a terminal user interface for the Podman environment. It uses Podman Go bindings to talk to a local or remote Podman machine (including over SSH). You can browse and manage containers, images, pods, volumes, networks, and related resources without leaving the terminal.

Compatibility: release-2.x targets Podman v6, release-1.x targets Podman v5, release-0.x targets Podman v4. Install from packages or build from source (see upstream install guide).

# PARAMETERS

Interactive application; primary control is via key bindings rather than CLI subcommands. Common keys:

**m**

> Command menu

**s**

> Sort menu

**l** / **h**

> Next / previous screen

**k** / **j**

> Move up / down

**Tab**

> Switch widgets

**Esc**

> Close active dialog

**Ctrl+c**

> Exit

# CAVEATS

Requires **podman.socket** (or **podman system service**) for the API. SSH key passphrases need **CONTAINER_PASSPHRASE**. Uses 256-color mode on Unix-like systems. Match **podman-tui** major version to your Podman major version.

# SEE ALSO

[podman](/man/podman)(1), [docker](/man/docker)(1), [lazydocker](/man/lazydocker)(1), [ctop](/man/ctop)(1)

# RESOURCES

```[Source code](https://github.com/containers/podman-tui)```

```[Homepage](https://podman.io)```

<!-- verified: 2026-07-19 -->
