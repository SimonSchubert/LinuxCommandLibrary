# TAGLINE

Synced queryable shell history with context

# TLDR

**Install and enable** hishtory

```hishtory install```

**Query shell history**

```hishtory query [search_term]```

**Enable Control+R integration**

```hishtory config-set enable-control-r true```

**Search with AI assistance** (prefix with ?)

```hishtory query ?[how to find large files]```

**Export all history entries**

```hishtory export```

**Show sync and configuration status**

```hishtory status```

**Delete history entries matching a query**

```hishtory redact [search_term]```

**Temporarily disable recording**

```hishtory disable```

# SYNOPSIS

**hishtory** _command_ [_options_] [_arguments_]

# DESCRIPTION

**hishtory** is a shell history tool that replaces the default history with a synced, queryable, and context-aware alternative. It hooks into your shell to track all commands that are run, saving them in a local **SQLite** database with additional context like the working directory, exit code, and duration.

History is **end-to-end encrypted** with AES-GCM and can be synced across all your devices. When you press **Control+R** or run **hishtory query**, a SQL query finds matching entries in the local database. Queries can also be prefixed with **?** to use ChatGPT for natural language command search.

# PARAMETERS

**install**
> Install and configure hishtory

**query** _term_
> Search shell history

**export**
> Export all history entries

**status**
> Show sync and configuration status

**config-set** _key_ _value_
> Set a configuration option

**config-get** _key_
> Get a configuration value

**redact** _query_
> Delete matching history entries locally and from all synced devices.

**update**
> Securely download and apply the latest hishtory update.

**disable**
> Temporarily stop recording shell history.

**enable**
> Resume recording shell history.

# CAVEATS

Requires an active shell session to record commands. Syncing across devices requires internet connectivity. The AI-powered search feature requires a ChatGPT API connection. End-to-end encryption means lost encryption keys result in unrecoverable data. Commands prefixed with a space are not recorded, following shell conventions.

# HISTORY

**hishtory** was created by **David Dworken** and is written in **Go**. It was designed to address the limitations of built-in shell history by adding encryption, cross-device sync, and contextual metadata.

# SEE ALSO

[history](/man/history)(1), [atuin](/man/atuin)(1), [fzf](/man/fzf)(1)
