# TLDR

**Interactive file finder**

```find . -type f | fzf```

**Select with preview**

```fzf --preview '[cat {}]'```

**Multiple selection**

```fzf -m```

**Filter command history**

```history | fzf```

**Fuzzy find and** edit

```vim $(fzf)```

# SYNOPSIS

**fzf** [_options_]

# PARAMETERS

**-m**, **--multi**
> Enable multiple selection.

**--preview** _CMD_
> Preview command.

**-q** _QUERY_, **--query** _QUERY_
> Initial search query.

**--height** _HEIGHT_
> Display height (rows or percentage).

**--reverse**
> Layout from top.

**--border**
> Draw border.

**--bind** _KEYS_
> Custom key bindings.

**--help**
> Display help information.

# DESCRIPTION

**fzf** is a general-purpose fuzzy finder that filters any list interactively. It accepts input via stdin and outputs selected items, enabling powerful shell workflows.

The tool provides instant feedback while typing, fuzzy matching for typo tolerance, and preview windows for context. Shell integration adds keybindings for history, files, and directories.

fzf transforms command-line workflows with interactive selection for files, processes, git branches, and more.

# CAVEATS

Requires terminal with full capabilities. Some integrations need shell configuration. Large inputs may be slow.

# HISTORY

fzf was created by **Junegunn Choi** in 2013. Written in Go for performance, it became essential tooling for command-line productivity, spawning integrations across shells, editors, and tools.

# SEE ALSO

[sk](/man/sk)(1), [peco](/man/peco)(1), [fd](/man/fd)(1)
