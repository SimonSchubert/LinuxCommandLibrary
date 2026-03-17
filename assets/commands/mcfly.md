# TAGLINE

intelligent shell history search tool that uses a small neural network

# TLDR

**Initialize mcfly in bash**

```eval "$(mcfly init bash)"```

**Initialize mcfly in zsh**

```eval "$(mcfly init zsh)"```

**Initialize mcfly in fish**

```mcfly init fish | source```

**Search history for a pattern**

```mcfly search [pattern]```

**Add a command to history**

```mcfly add "[command]"```

**Train the suggestion engine**

```mcfly train```

# SYNOPSIS

**mcfly** _command_ [_options_]

# DESCRIPTION

**mcfly** is an intelligent shell history search tool written in Rust that uses a small neural network to suggest the most likely command based on context. It considers working directory, recent commands, exit status, and command patterns.

The tool replaces Ctrl+R with a smarter search that prioritizes commands based on relevance rather than recency alone. It stores history in a SQLite database, which can be rebuilt if deleted.

# PARAMETERS

**search** [_pattern_]
> Search history for matching commands.

**add** _command_
> Add a command to the mcfly history database.

**train**
> Train the neural network suggestion engine.

**move**
> Record a directory having been moved.

**init** _shell_
> Output shell initialization script (bash, zsh, or fish).

**--mcfly-history** _path_
> Shell history file to read from when adding or searching.

**--session-id** _id_
> Session ID to record or search under.

**-d**, **--debug**
> Enable debug output.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# CAVEATS

Requires shell integration to replace Ctrl+R. The neural network needs time to learn usage patterns; initial suggestions may not be optimal. The SQLite database grows with usage. Set **MCFLY_FUZZY** (integer, 2-5 recommended) to enable fuzzy matching. Set **MCFLY_RESULTS** to control the number of results shown (default: 10). Set **MCFLY_HISTORY_LIMIT** to limit search depth.

# HISTORY

**mcfly** was created by **Andrew Cantino** to bring intelligent command suggestion to the shell. It uses machine learning principles to provide context-aware history search, going beyond simple text matching.

# SEE ALSO

[hstr](/man/hstr)(1), [fzf](/man/fzf)(1), [atuin](/man/atuin)(1), [history](/man/history)(1), [bash](/man/bash)(1), [zsh](/man/zsh)(1)
