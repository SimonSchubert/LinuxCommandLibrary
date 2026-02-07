# TAGLINE

list, edit, and re-execute shell commands

# TLDR

**Edit and rerun** last command

```fc```

**List recent commands**

```fc -l```

**List commands with** numbers

```fc -ln [10] [20]```

**Rerun command** by number

```fc -s [15]```

**Edit specific command**

```fc [20]```

# SYNOPSIS

**fc** [_options_] [_first_] [_last_]

# PARAMETERS

_FIRST_
> First command (number or string).

_LAST_
> Last command in range.

**-l**
> List commands without editing.

**-n**
> Suppress command numbers in listing.

**-r**
> Reverse order of listing.

**-s** [_OLD=NEW_]
> Rerun command, optionally with substitution.

**-e** _EDITOR_
> Use specified editor.

# DESCRIPTION

**fc** is a shell builtin for listing, editing, and re-executing commands from history. It opens commands in an editor for modification before execution, enabling quick fixes to previous commands.

The command can list history entries, open single commands or ranges in an editor, and directly re-execute commands with optional text substitution. The default editor is taken from FCEDIT, EDITOR, or vi.

fc is particularly useful for fixing typos in long commands or re-running complex pipelines with modifications.

# CAVEATS

Only works with interactive shell history. Editing spawns external editor. Substitution syntax is limited. History must be enabled.

# HISTORY

fc (fix command) is a **POSIX-specified** shell builtin present in Korn shell, Bash, and Zsh. It originated in the Korn shell as a way to edit and re-execute command history entries.

# SEE ALSO

[history](/man/history)(1), [bash](/man/bash)(1), [zsh](/man/zsh)(1)
