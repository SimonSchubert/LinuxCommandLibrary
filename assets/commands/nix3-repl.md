# TAGLINE

starts interactive Nix shell

# TLDR

**Start REPL**

```nix repl```

**Load nixpkgs** from the search path

```nix repl -f '<nixpkgs>'```

**Load a flake** (its outputs become variables)

```nix repl [.#]```

Load the **nixpkgs flake**

```nix repl nixpkgs```

Load an **expression**

```nix repl --expr 'import <nixpkgs> {}'```

Inside the REPL: **list special commands**

```:?```

Inside the REPL: **load a flake** into scope

```:lf [.]```

Inside the REPL: **build** a derivation

```:b [hello]```

# SYNOPSIS

**nix** **repl** [_options_] [_installables_...]

# PARAMETERS

_INSTALLABLES_
> Flakes, or attribute paths with --file/--expr, whose attributes are added to the scope.

**-f**, **--file** _FILE_
> Load attributes from the Nix expression in FILE.

**--expr** _EXPR_
> Load attributes from the expression EXPR.

**--stdin**
> Read installables from standard input.

**--impure**
> Allow impure evaluation.

**--help**
> Display help information.

# REPL COMMANDS

**:?**
> Show all special commands.

**:l** _file_, **:lf** _flake_
> Load a Nix file or a flake into scope.

**:r**
> Reload all loaded files.

**:b** _expr_
> Build a derivation.

**:p** _expr_
> Evaluate and print the result recursively.

**:e** _expr_
> Open a package or function in the editor.

**:t** _expr_
> Describe the type of the result.

**:doc** _expr_
> Show documentation of a builtin function.

**:log** _expr_
> Show the build log of a derivation.

**:q**
> Quit.

# DESCRIPTION

**nix3-repl** is the manual page for **nix repl**, an interactive read-eval-print loop for Nix expressions. Given files or flakes, it adds their attributes to the lexical scope, which makes it convenient for exploring nixpkgs, NixOS configurations and flake outputs. Tab completion and history are available.

# CAVEATS

There is no **nix3** executable: the new-CLI man pages are named nix3-_subcommand_. Use **man nix3-repl** or **nix repl --help**.

Requires the **nix-command** experimental feature (and **flakes** to load flakes). Older Nix versions loaded a positional path like **'<nixpkgs>'** as a file; current versions treat positional arguments as installables, so use **-f**.

# HISTORY

**nix repl** replaced the separate **nix-repl** tool when it was merged into Nix **2.0** (2018). The **repl-flake** feature that made positional arguments flakes was folded into **flakes** in Nix 2.19.

# INSTALL

```apt: sudo apt install nix-bin```

```dnf: sudo dnf install nix```

```pacman: sudo pacman -S nix```

```apk: sudo apk add nix```

```zypper: sudo zypper install nix```

```nix: nix profile install nixpkgs#nix```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[nix](/man/nix)(1), [nix-repl](/man/nix-repl)(1), [nix3-eval](/man/nix3-eval)(1)

# RESOURCES

```[Source code](https://github.com/NixOS/nix)```

```[Documentation](https://nix.dev/manual/nix/latest/command-ref/new-cli/nix3-repl.html)```

<!-- verified: 2026-09-29 -->
