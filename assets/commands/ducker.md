# TAGLINE

Docker TUI inspired by k9s

# TLDR

**Launch** the Docker TUI

```ducker```

**Connect** to specific Docker context

```ducker --context [context_name]```

**View** specific resource type on startup

```ducker --view [pods|containers|images|volumes]```

**Use** specific namespace

```ducker --namespace [namespace]```

# SYNOPSIS

**ducker** [_options_]

# PARAMETERS

**--context** _CONTEXT_
> Docker context to use

**--view** _VIEW_
> Initial view: pods, containers, images, volumes, networks

**--namespace** _NS_
> Namespace filter

**--readonly**
> Start in read-only mode

**-c, --config** _FILE_
> Configuration file path

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**ducker** is a terminal user interface for Docker inspired by the Kubernetes tool k9s. It provides an efficient, keyboard-driven interface for managing Docker containers, images, volumes, and networks without typing long Docker commands.

The tool features a familiar UI pattern for those coming from k9s, with resource views, filtering, shortcuts for common actions, and real-time updates. It supports both Docker and Docker Compose environments.

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

Requires Docker daemon access. Some features require elevated permissions. Podman compatibility may vary. Complex Docker Compose setups may have limited support. Terminal must support the full range of characters used in the UI.

# HISTORY

**ducker** was developed to bring the k9s experience to Docker users, providing a powerful TUI for container management. It aims to make Docker management faster and more efficient for developers who prefer terminal-based workflows.

# SEE ALSO

[docker](/man/docker)(1), [k9s](/man/k9s)(1), [lazydocker](/man/lazydocker)(1), [dtop](/man/dtop)(1)