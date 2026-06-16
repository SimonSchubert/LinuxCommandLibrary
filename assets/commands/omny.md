# TAGLINE

Terminal UI SSH connection manager

# TLDR

**Start** the interactive SSH manager

```omny```

**Use** a custom configuration file

```omny -c [path/to/config.toml]```

**Override** the color theme

```omny -t [dracula]```

**Enable** verbose debug logging

```omny -v```

**Show** the version

```omny --version```

# SYNOPSIS

**omny** [_options_]

# DESCRIPTION

**omny** (from the OmnySSH project) is a fast, keyboard-driven terminal user interface for managing SSH connections. It organizes your hosts and lets you open sessions, transfer files, and run saved commands from a single console application.

Its main views include a live metrics dashboard with color-coded CPU, memory, and disk usage; a split-panel SFTP file manager for moving files between local and remote systems; a snippets manager for saving frequently used commands and broadcasting them to several servers at once; and a multi-session terminal with PTY tabs and split views. Fuzzy search makes hosts and snippets quick to find, and the appearance and key bindings are configurable.

Inside the TUI the number keys switch views (**1** dashboard, **2** file manager, **3** snippets, **4** terminal), **/** opens fuzzy search, and **?** shows help.

# PARAMETERS

**-c** _file_, **--config** _file_

> Use the given configuration file instead of the default.

**-t** _theme_, **--theme** _theme_

> Override the color theme (for example default, dracula, nord, gruvbox).

**-v**, **--verbose**

> Enable debug logging.

**-h**, **--help**

> Print help information.

**-V**, **--version**

> Print version information.

# CONFIGURATION

omny reads a TOML configuration file in which hosts, themes, and remappable key bindings are defined. The path can be overridden with **--config**.

# CAVEATS

omny is a young, third-party tool written in Rust; its configuration format and features may change between releases. The binary is named **omny**, while the project and packages are named **omnyssh**.

# SEE ALSO

[ssh](/man/ssh)(1), [sftp](/man/sftp)(1), [sshfs](/man/sshfs)(1), [mosh](/man/mosh)(1), [tmux](/man/tmux)(1)

# RESOURCES

```[Source code](https://github.com/timhartmann7/omnyssh)```

<!-- verified: 2026-06-16 -->
