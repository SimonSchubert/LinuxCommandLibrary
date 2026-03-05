# TAGLINE

Interactive TUI for browsing and connecting to SSH hosts

# TLDR

**Launch the interactive SSH host selector**

```sshs```

**Use a custom SSH config file**

```sshs --config [~/.ssh/custom_config]```

# SYNOPSIS

**sshs** [**--config** _path_]

# DESCRIPTION

**sshs** is a terminal user interface for SSH that reads your ~/.ssh/config file to list and connect to hosts. It provides a fuzzy-searchable interactive interface to quickly select and connect to configured SSH destinations.

# HISTORY

**sshs** was created by **quantumsheep** and is written in **Rust**.

# SEE ALSO

[ssh](/man/ssh)(1), [sshclick](/man/sshclick)(1), [ssh-list](/man/ssh-list)(1)
