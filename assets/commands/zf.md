# TAGLINE

Fuzzy finder optimized for filtering file paths

# TLDR

**Fuzzy find files interactively**

```find . -type f | zf```

**Open selected file in vim**

```vim $(find . -type f | zf)```

# SYNOPSIS

**zf** [_options_]

# DESCRIPTION

**zf** is a command-line fuzzy finder that prioritizes filename matches over full path matches. When the query resembles a file path, it applies path-aware heuristics for more accurate results. Also available as an allocation-free library.

# HISTORY

**zf** was created by **Nate Craddock** (natecraddock) and is written in **Zig**.

# SEE ALSO

[fzf](/man/fzf)(1), [skim](/man/skim)(1), [fzy](/man/fzy)(1)
