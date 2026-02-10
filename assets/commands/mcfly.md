# TAGLINE

intelligent shell history search tool that uses a small neural network

# TLDR

**Launch mcfly search**

```mcfly search [pattern]```

**Initialize in shell**

```eval "$(mcfly init bash)"```

**Add command to history**

```mcfly add "[command]"```

**Train neural network**

```mcfly train```

**Show stats**

```mcfly stats```

# SYNOPSIS

**mcfly** _command_ [_options_]

# DESCRIPTION

**mcfly** is an intelligent shell history search tool that uses a small neural network to suggest the most likely command based on context. It considers working directory, exit status, and command patterns.

The tool replaces Ctrl+R with a smarter search that prioritizes commands based on relevance rather than recency alone.

# PARAMETERS

**search** [_pattern_]
> Search history.

**add** _command_
> Add command to history.

**train**
> Train neural network.

**stats**
> Show usage statistics.

**init** _shell_
> Output shell initialization.

**--light**
> Light color scheme.

**--dump-facets**
> Debug facet information.

# SHELL INTEGRATION

For bash:
```eval "$(mcfly init bash)"```

For zsh:
```eval "$(mcfly init zsh)"```

For fish:
```mcfly init fish | source```

# CAVEATS

Requires shell integration. Learning takes time. Database grows with usage. Initial suggestions may not be optimal.

# HISTORY

**mcfly** was created by **Andrew Cantino** to bring intelligent command suggestion to the shell. It uses machine learning principles to provide context-aware history search, going beyond simple text matching.

# SEE ALSO

[hstr](/man/hstr)(1), [fzf](/man/fzf)(1), [history](/man/history)(1), [bash](/man/bash)(1)
