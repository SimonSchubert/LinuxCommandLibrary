# TAGLINE

Terminal user interface for Docker containers

# TLDR

**Launch the container management TUI**

```sen```

**Run sen in a Docker container**

```docker run -v /var/run/docker.sock:/run/docker.sock -ti -e TERM tomastomecek/sen```

# SYNOPSIS

**sen** [_options_]

# DESCRIPTION

**sen** is an interactive TUI for managing Docker containers and images. You can start, stop, restart, kill, and delete containers, inspect containers and images, stream real-time logs, view an image layer tree, and monitor disk usage. It features Vim-like keybindings and real-time Docker event updates. Also supports Podman v2.0+ via its Docker-compatible API.

# CAVEATS

The project is in maintenance mode. The author provides bug fixes only; new features must come as community pull requests.

# HISTORY

**sen** was created by **Tomas Tomecek** (TomasTomecek) and is written in **Python**.

# SEE ALSO

[lazydocker](/man/lazydocker)(1), [ctop](/man/ctop)(1), [oxker](/man/oxker)(1)
