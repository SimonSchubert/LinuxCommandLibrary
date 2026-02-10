# TAGLINE

starts interactive Nix shell

# TLDR

**Start Nix REPL**

```nix repl```

**Load nixpkgs**

```nix repl '<nixpkgs>'```

**Load flake**

```nix repl [.#]```

**Load file**

```nix repl [file.nix]```

# SYNOPSIS

**nix** **repl** [_options_] [_files_]

# PARAMETERS

_FILES_
> Nix files to load.

**--expr** _EXPR_
> Evaluate expression first.

**--help**
> Display help information.

# DESCRIPTION

**nix repl** starts interactive Nix shell. Evaluate expressions interactively.

The tool provides tab completion. Load packages and explore attributes.

# CAVEATS

Part of Nix CLI. :? for help. Expression evaluation.

# HISTORY

nix repl provides **interactive evaluation** for exploring and debugging Nix expressions.

# SEE ALSO

[nix](/man/nix)(1), [nix-eval](/man/nix-eval)(1), [nix-instantiate](/man/nix-instantiate)(1)

