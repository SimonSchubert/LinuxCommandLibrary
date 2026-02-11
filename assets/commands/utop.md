# TAGLINE

Enhanced interactive OCaml toplevel REPL

# TLDR

**Start utop REPL**

```utop```

**Load a file into utop**

```utop -init [file.ml]```

**Start with specific library**

```utop -require [lwt]```

**Evaluate expression and exit**

```utop -e "[print_endline \"Hello\"]"```

**Start without initialization file**

```utop -no-init```

# SYNOPSIS

**utop** [_options_] [_file_]

# PARAMETERS

**-init** _file_
> Load specified file on startup.

**-require** _package_
> Require specified findlib package.

**-e** _expression_
> Evaluate expression and exit.

**-no-init**
> Skip loading initialization files.

**-emacs**
> Run in Emacs mode.

**-stdin**
> Read input from standard input.

**-help**
> Display help.

# COMMANDS

**#help**: Show available commands.

**#quit** or Ctrl-D: Exit utop.

**#use** _file_: Load file into the session.

**#require** _package_: Load findlib package.

**#list**: List loaded modules.

**#utop_bindings**: Show key bindings.

# DESCRIPTION

**utop** is an enhanced toplevel (REPL) for OCaml with features including real-time context-sensitive completion, syntax highlighting, history, and support for multiple editing modes.

The completion bar displays possible completions as you type and updates dynamically. Navigate completions with Alt-Left/Right and select with Alt-Down. The interface supports multiline input without requiring explicit line continuation.

utop integrates with Emacs using the Tuareg, caml, and ReasonML modes. From Emacs, use M-x utop to start a session with additional key bindings for evaluating code from buffers.

# CONFIGURATION

**~/.config/utop/init.ml**: Initialization script.

**~/.utoprc**: Configuration file for colors and settings.

**~/.ocamlinit**: Alternative initialization (also used by standard ocaml).

# CAVEATS

Requires OCaml installation. Some features need findlib. Emacs integration requires mode setup. Heavy packages may slow startup.

# HISTORY

**utop** was created as a modern replacement for the standard OCaml toplevel, providing a significantly improved user experience with completion, history, and editor integration. It's maintained by the OCaml community and has become the recommended REPL for OCaml development.

# SEE ALSO

[ocaml](/man/ocaml)(1), [ocamlfind](/man/ocamlfind)(1), [opam](/man/opam)(1)
