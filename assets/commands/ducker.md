# TAGLINE

Docker TUI inspired by k9s

# TLDR

**Launch** the Docker TUI

```ducker```

**Export default configuration file**

```ducker --export-default-config```

# SYNOPSIS

**ducker** [_options_]

# PARAMETERS

**-e, --export-default-config**
> Write default config to the default location, overwriting any existing config

**-h, --help**
> Display help and exit

**-V, --version**
> Display version and exit

# DESCRIPTION

**ducker** is a terminal user interface for Docker inspired by the Kubernetes tool k9s. It provides an efficient, keyboard-driven interface for managing Docker containers, images, volumes, and networks without typing long Docker commands.

The tool features a familiar UI pattern for those coming from k9s, with resource views, filtering, shortcuts for common actions, and real-time updates. It is configured via a YAML file (typically `~/.config/ducker/config.yaml` on Linux).

# KEYBINDINGS

**:**
> Command mode

**/**
> Filter resources

**↑/↓**
> Navigate resources

**Enter**
> View resource details

**d**
> Describe resource

**l**
> View logs

**e**
> Edit resource

**s**
> Shell into container

**r**
> Restart container

**ctrl-d**
> Delete resource

**q**
> Quit

**?**
> Show help

# CAVEATS

Requires Docker daemon access. When installing with cargo, use `--locked` to avoid upstream dependency breakage. Terminal must support the full range of characters used in the UI.

# HISTORY

**ducker** was developed to bring the k9s experience to Docker users, providing a powerful TUI for container management. It aims to make Docker management faster and more efficient for developers who prefer terminal-based workflows.

# SEE ALSO

[docker](/man/docker)(1), [k9s](/man/k9s)(1), [lazydocker](/man/lazydocker)(1), [oxker](/man/oxker)(1)