# TAGLINE

Set Readline key bindings and variables in Bash

# TLDR

**List all Readline key bindings**

```bind -P```

**List key bindings in reusable format**

```bind -p```

**Bind a key sequence to a Readline function**

```bind '"\e[24~": end-of-line'```

**Bind a key sequence to execute a shell command**

```bind -x '"\C-l": clear'```

**Remove binding for a key sequence**

```bind -r '\e[24~'```

**Read key bindings from a file**

```bind -f [~/.inputrc]```

**Query which keys invoke a specific function**

```bind -q [complete]```

# SYNOPSIS

**bind** [**-lpsvPSVX**] [**-m** _keymap_] [**-f** _filename_] [**-q** _name_] [**-u** _name_] [**-r** _keyseq_] [**-x** _keyseq:shell-command_] [_keyseq:readline-function_]

# DESCRIPTION

**bind** is a Bash shell builtin that sets Readline key bindings and variables. It controls how Bash responds to keyboard input by mapping key sequences to Readline functions, macros, or shell commands.

By default, Bash uses Emacs-style key bindings, but bind allows customization to any preferred scheme. Key bindings can be set interactively or loaded from configuration files like **~/.inputrc**.

To discover the escape sequence for a key, press **Ctrl+v** at the command line followed by the key, or use the **read** builtin and press the desired key combination.

# PARAMETERS

**-l**
> List names of all Readline functions

**-P**
> List function names and their current bindings

**-p**
> List bindings in a format suitable for reuse as input

**-S**
> List key sequences that invoke macros and their values

**-s**
> List macro bindings in reusable format

**-V**
> List Readline variable names and values

**-v**
> List Readline variables in reusable format

**-X**
> List key sequences bound to shell commands in reusable format

**-m** _keymap_
> Use specified keymap: emacs, emacs-standard, emacs-meta, emacs-ctlx, vi, vi-move, vi-command, vi-insert

**-f** _filename_
> Read key bindings from file

**-q** _function_
> Query which keys invoke the named function

**-u** _function_
> Unbind all keys bound to the named function

**-r** _keyseq_
> Remove binding for key sequence

**-x** _keyseq:shell-command_
> Execute shell command when key sequence is entered

# CAVEATS

When using **-x** to bind shell commands, the shell sets **READLINE_LINE** and **READLINE_POINT** variables to the current line buffer contents and cursor position. Modifying these variables in the command affects the editing state.

Key binding syntax must be passed as a single argument, matching the format used in **~/.inputrc**.

# SEE ALSO

[bash](/man/bash)(1), [readline](/man/readline)(3)
