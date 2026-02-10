# TAGLINE

interactive toplevel for OCaml, a statically-typed functional programming

# TLDR

**Start interactive toplevel**

```ocaml```

**Run OCaml script**

```ocaml [script.ml]```

**Run with library**

```ocaml -I +[str] str.cma [script.ml]```

**Run expression**

```ocaml -e "print_endline \"Hello\""```

**Start with custom init**

```ocaml -init [.ocamlinit]```

**Include library path**

```ocaml -I [/path/to/lib]```

**Run with profiling**

```ocaml -p [script.ml]```

# SYNOPSIS

**ocaml** [_-I dir_] [_-init file_] [_-e expr_] [_options_] [_script.ml_] [_arguments_]

# PARAMETERS

**-I** _DIR_
> Add directory to library search path.

**-init** _FILE_
> Load initialization file.

**-noinit**
> Don't load .ocamlinit.

**-e** _EXPR_
> Evaluate expression and exit.

**-stdin**
> Read script from stdin.

**-noprompt**
> Suppress prompt in interactive mode.

**-w** _FLAGS_
> Warning settings.

**-warn-error** _FLAGS_
> Treat warnings as errors.

**-version**
> Print version.

**-vnum**
> Print version number only.

**-help**
> Show help.

# TOPLEVEL COMMANDS

**#use "file.ml";;**
> Load source file.

**#load "module.cma";;**
> Load bytecode library.

**#directory "path";;**
> Add to search path.

**#show identifier;;**
> Show type/module info.

**#trace function;;**
> Trace function calls.

**#quit;;**
> Exit toplevel.

**#help;;**
> Show directives help.

# DESCRIPTION

**ocaml** is the interactive toplevel (REPL) for OCaml, a statically-typed functional programming language with type inference.

The toplevel reads expressions, compiles them, executes, and prints results with types. Expressions end with `;;`. The type inference system catches errors at compile time, even in interactive mode.

Loading files with #use executes their definitions in the current session. Libraries (.cma bytecode) load with #load. The -I flag adds directories to search for modules.

The .ocamlinit file in home or current directory runs on startup. It can load commonly used libraries, define utilities, and configure the environment.

Integration with utop provides an enhanced toplevel with syntax highlighting, completion, and history. Many users prefer utop for interactive development.

For larger projects, the Dune build system handles compilation, but ocaml remains useful for exploration, prototyping, and learning.

# CAVEATS

Expressions must end with ;;. Some libraries need explicit loading. Error messages can be cryptic for beginners. Mutable state possible but discouraged. Build systems preferred for real projects.

# HISTORY

**OCaml** evolved from Caml Light, developed at **INRIA** in France since the **1980s**. OCaml (Objective Caml) added objects and native compilation in **1996**. The language influenced Rust, F#, and others. The ocaml toplevel has been the standard REPL throughout its history.

# SEE ALSO

[ocamlopt](/man/ocamlopt)(1), [ocamlc](/man/ocamlc)(1), [dune](/man/dune)(1), [opam](/man/opam)(1), [utop](/man/utop)(1)
