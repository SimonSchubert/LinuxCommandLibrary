# TLDR

**Interactive filter for stdin**

```[command] | percol```

**Filter command history**

```history | percol```

**Search files interactively**

```find . | percol```

**Use with custom query**

```percol --query [pattern] [file]```

# SYNOPSIS

**percol** [_options_] [_file_]

# PARAMETERS

**--query** _string_
> Initial query.

**--prompt-bottom**
> Show prompt at bottom.

**--match-method** _method_
> Matching method (string, regex, migemo).

**--reverse**
> Reverse order.

**--auto-match**
> Auto-select single match.

# DESCRIPTION

**percol** adds interactive filtering to any text. It reads lines from stdin or a file and provides an incremental search interface, outputting selected lines.

Similar to fzf but with different keybindings and extensibility.

# EXAMPLES

```bash
# Interactive file selection
ls | percol | xargs cat

# Filter history and execute
$(history | percol)

# Git branch selector
git checkout $(git branch | percol)

# Process killer
ps aux | percol | awk '{print $2}' | xargs kill
```

# KEYBINDINGS

```
C-i     - Toggle selection
C-m     - Finish selection
C-h     - Delete character
C-u     - Clear query
C-a/C-e - Beginning/end of line
```

# CAVEATS

Written in Python. Slower than fzf for large inputs. Configuration via Python file.

# HISTORY

percol was created by **mooz** as an interactive grep-like tool inspired by Emacs helm/anything.

# SEE ALSO

[fzf](/man/fzf)(1), [peco](/man/peco)(1), [sk](/man/sk)(1), [grep](/man/grep)(1)
