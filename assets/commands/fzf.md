# TAGLINE

general-purpose command-line fuzzy finder

# TLDR

**Interactive file finder**

```find . -type f | fzf```

**Select with preview**

```fzf --preview 'cat {}'```

**Multiple selection**

```fzf -m```

**Filter command history**

```history | fzf```

**Fuzzy find and** edit

```vim $(fzf)```

**Exact match** mode

```fzf -e```

**Non-interactive filter** (fuzzy grep)

```fzf -f "[query]"```

**Auto-select single** match

```fzf --select-1 -q "[query]"```

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

**-e**, **--exact**
> Enable exact-match mode instead of fuzzy.

**-f** _QUERY_, **--filter** _QUERY_
> Non-interactive filter mode (fuzzy grep).

**-1**, **--select-1**
> Auto-select if only one match.

**-0**, **--exit-0**
> Exit immediately if no match.

**--ansi**
> Enable ANSI color code processing.

**-d** _DELIM_, **--delimiter** _DELIM_
> Field delimiter regex for --nth.

**-n** _N_, **--nth** _N_
> Limit search scope to specified fields.

**--layout** _LAYOUT_
> Display layout: default, reverse, reverse-list.

**--info** _STYLE_
> Info display style: default, right, hidden, inline.

**--header** _STR_
> Display a sticky header string.

**--bind** _KEYS_
> Custom key bindings.

**--tac**
> Reverse input order.

**--no-sort**
> Preserve original input order.

**--cycle**
> Enable cyclic scrolling.

**--print-query**
> Print the query as the first output line.

**--help**
> Display help information.

# DESCRIPTION

**fzf** is a general-purpose fuzzy finder that filters any list interactively. It accepts input via stdin and outputs selected items, enabling powerful shell workflows.

The tool provides instant feedback while typing, fuzzy matching for typo tolerance, and preview windows for context. Shell integration adds keybindings for history, files, and directories.

fzf transforms command-line workflows with interactive selection for files, processes, git branches, and more.

# SHELL INTEGRATION

**CTRL-T**: Paste selected file paths onto command line
**CTRL-R**: Search command history
**ALT-C**: cd into selected directory

# ENVIRONMENT VARIABLES

**FZF_DEFAULT_COMMAND**
> Command to run when input is a terminal (replaces default find).

**FZF_DEFAULT_OPTS**
> Default options applied to every fzf invocation.

# CAVEATS

Requires terminal with full capabilities. Shell integration requires sourcing the fzf setup script. Large inputs may be slow.

# HISTORY

fzf was created by **Junegunn Choi** in 2013. Written in Go for performance, it became essential tooling for command-line productivity, spawning integrations across shells, editors, and tools.

# SEE ALSO

[sk](/man/sk)(1), [peco](/man/peco)(1), [fd](/man/fd)(1)
