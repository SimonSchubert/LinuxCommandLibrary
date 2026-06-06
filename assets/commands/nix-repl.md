# TAGLINE

Start an interactive Nix expression evaluator

# TLDR

**Start the Nix REPL**

```nix repl```

**Load the nixpkgs package set into scope**

```nix repl --expr 'import <nixpkgs> {}'```

**Open a REPL with a flake's outputs in scope**

```nix repl [.#]```

**Load a Nix file's attributes into scope**

```nix repl --file [default.nix]```

# SYNOPSIS

**nix** **repl** [_options_] [_files_]

# PARAMETERS

_FILES_
> Nix files whose top-level attributes are brought into scope.

**--expr** _EXPR_
> Evaluate the given expression and bring its attributes into scope.

**--file** _PATH_
> Load attributes from the given Nix file (deprecated positional form still works).

**--arg** _NAME_ _EXPR_
> Pass the named argument as a Nix expression to the loaded file or flake.

**--argstr** _NAME_ _STRING_
> Pass the named argument as a string.

**--help**
> Display help information.

# REPL COMMANDS

**:?**
> Show the list of available REPL commands.

**:l** _PATH_
> Load a Nix file and add its attributes to the scope.

**:r**
> Reload all loaded files.

**:b** _EXPR_
> Build a derivation and print its output paths.

**:e** _EXPR_
> Open the location of the given value in `$EDITOR`.

**:t** _EXPR_
> Show the type of the given expression.

**:q**
> Exit the REPL (Ctrl-D also works).

# DESCRIPTION

**nix repl** starts an interactive read-eval-print loop for the Nix expression language. It is useful for exploring package attributes, debugging expressions, and prototyping configuration.

Expressions are evaluated lazily. The REPL offers tab completion for attribute names and accepts colon-prefixed meta commands (see REPL COMMANDS) in addition to ordinary Nix expressions.

# CAVEATS

Part of the experimental `nix` command (enable with `experimental-features = nix-command flakes`). The older standalone `nix-repl` binary is deprecated in favor of `nix repl`. Use `:?` inside the REPL for the full command list.

# HISTORY

`nix repl` provides interactive evaluation for exploring and debugging Nix expressions. It superseded the separate `nix-repl` tool when the unified `nix` command was introduced.

# SEE ALSO

[nix](/man/nix)(1), [nix-eval](/man/nix-eval)(1), [nix-instantiate](/man/nix-instantiate)(1)

