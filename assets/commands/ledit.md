# TLDR

**Run command with line editing**

```ledit [command]```

**Run OCaml with line editing**

```ledit ocaml```

**Use vi-style editing**

```ledit -v [command]```

**Specify history file**

```ledit -h [~/.ledit_history] [command]```

# SYNOPSIS

**ledit** [_options_] _command_ [_args_...]

# PARAMETERS

**-v**
> Use vi-style editing mode.

**-e**
> Use emacs-style editing mode (default).

**-h** _file_
> Specify history file.

**-x**
> Expand history on space.

# DESCRIPTION

**ledit** provides line editing capabilities to programs that read from standard input. It wraps commands to add readline-style editing, command history, and line completion.

ledit is particularly useful with interpreters and REPLs that lack built-in line editing support, such as older versions of OCaml.

# CAVEATS

Not needed for programs with built-in readline. May interfere with some interactive programs. History file format is specific to ledit.

# HISTORY

ledit was written by **Daniel de Rauglaudre** as part of the Camlp5 project for use with OCaml and other interpreters lacking line editing.

# SEE ALSO

[rlwrap](/man/rlwrap)(1), [readline](/man/readline)(3), [ocaml](/man/ocaml)(1)
