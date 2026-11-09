# TAGLINE

TUI tool for Docker container management

# TLDR

**Launch the Docker TUI**

```pocker```

**Install the latest version**

```pocker update```

**Force an update**

```pocker update --force```

# SYNOPSIS

**pocker** [**update** [**-f**]]

# PARAMETERS

**update**
> Fetch and install the latest version.

**-f**, **--force**
> Force the update.

# DESCRIPTION

**pocker** is a terminal user interface for managing Docker containers. It displays containers, images, logs, attributes, environment variables, and container statistics, can filter logs by keyword and can start a shell inside a container. Built on docker-py and Textual, it provides a keyboard-driven interface for common Docker operations. Press **?** for help.

# CONFIGURATION

**$HOME/.config/pocker/config.yaml**
> Generated on first start. Holds keybindings and behavior such as log_tail, max_log_lines, show_all_containers, start_fullscreen, start_scroll and start_wrap.

# CAVEATS

Requires Docker to be installed and running. After an update adds new keybindings, an older config can cause errors; add the new keys or delete the config.

# HISTORY

**pocker** was created by **pommee** and is written in **Python**. It is published on PyPI as **pocker-tui**.

# SEE ALSO

[docker](/man/docker)(1), [lazydocker](/man/lazydocker)(1), [oxker](/man/oxker)(1)

# RESOURCES

```[Source code](https://github.com/pommee/Pocker)```

<!-- verified: 2026-11-09 -->
