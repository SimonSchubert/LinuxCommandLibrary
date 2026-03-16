# TAGLINE

Magical shell history with sync and search

# TLDR

**Search** command history interactively

```atuin search -i [query]```

**Import** existing history from the current shell

```atuin import auto```

**Sync** history to server

```atuin sync```

Show **statistics** about shell usage

```atuin stats```

**Login** to sync server

```atuin login```

**Register** a new sync account

```atuin register -u [username] -e [email] -p [password]```

**List** recent command history

```atuin history list```

Run **diagnostics** to check for common issues

```atuin doctor```

# SYNOPSIS

**atuin** _command_ [_options_]

# DESCRIPTION

**atuin** replaces your shell history with a SQLite database, providing powerful search, context tracking, and optional end-to-end encrypted sync across machines.

It records additional context like exit status, duration, working directory, and hostname, making history search more powerful than traditional Ctrl+R.

# PARAMETERS

**search** [_query_]
> Interactive history search. Supports filtering by directory, session, host, or globally.

**import** _source_
> Import existing history (auto, bash, zsh, fish, nu, xonsh, resh, and others).

**sync**
> Synchronize history with the Atuin server (upload and download).

**login**
> Authenticate with sync server.

**register**
> Register a new account on the Atuin sync server.

**logout**
> Remove authentication.

**key**
> Display or set the encryption key used for end-to-end encrypted sync.

**stats**
> Show usage statistics and command frequency.

**history** _subcommand_
> History management (list, delete, etc.).

**init** _shell_
> Output shell setup code for bash, zsh, fish, or nu.

**doctor**
> Run diagnostics to check for common issues with the installation.

**info**
> Display system and configuration information.

**dotfiles**
> Manage and sync shell aliases and environment variables.

# SHELL INTEGRATION

Add to shell rc file:
```bash
eval "$(atuin init bash)"  # or zsh, fish
```

Optionally disable specific keybindings:
```bash
eval "$(atuin init zsh --disable-up-arrow)"
```

# CONFIGURATION

**~/.config/atuin/config.toml**
> Main configuration file for search settings, sync options, database path, filter mode, search mode, and UI preferences.

# CAVEATS

Requires shell initialization code. Sync feature is optional (can be used fully offline). Database can grow large over time. Some shells require specific configuration for proper integration.

# HISTORY

**atuin** was created by Ellie Huxtable and released in **2021**, offering modern shell history with end-to-end encrypted sync, statistics, and improved search.

# SEE ALSO

[history](/man/history)(1), [mcfly](/man/mcfly)(1), [hstr](/man/hstr)(1), [fzf](/man/fzf)(1), [bash](/man/bash)(1), [zsh](/man/zsh)(1)
