# TLDR

**Search** command history

```atuin search [query]```

**Import** existing history

```atuin import auto```

**Sync** history to server

```atuin sync```

Show **statistics**

```atuin stats```

**Login** to sync server

```atuin login```

# SYNOPSIS

**atuin** _command_ [_options_]

# DESCRIPTION

**atuin** replaces your shell history with a SQLite database, providing magical search, context tracking, and optional end-to-end encrypted sync across machines.

It records additional context like exit status, duration, and working directory, making history search more powerful than traditional Ctrl+R.

# PARAMETERS

**search** _query_
> Interactive history search

**import** _shell_
> Import existing history (auto, bash, zsh, fish)

**sync**
> Synchronize with remote server

**login**
> Authenticate with sync server

**logout**
> Remove authentication

**stats**
> Show usage statistics

**history** _subcommand_
> History management (list, delete, etc.)

**init** _shell_
> Output shell setup code

# SHELL INTEGRATION

Add to shell rc file:
```bash
eval "$(atuin init bash)"  # or zsh, fish
```

# CAVEATS

Requires shell initialization code. Sync feature optional (can use locally). Database can grow large over time. Some shells require specific configuration.

# HISTORY

**atuin** was created by Ellie Huxtable and released in **2021**, offering modern shell history with sync, statistics, and improved search.

# SEE ALSO

[history](/man/history)(1), [mcfly](/man/mcfly)(1), [hstr](/man/hstr)(1)
