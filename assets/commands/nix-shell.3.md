# TAGLINE

Start an interactive shell based on a Nix expression

# TLDR

**Development shell** from shell.nix

```nix-shell [shell.nix]```

**Pure shell** with no host environment leaking in

```nix-shell --pure```

**Ad-hoc shell** with specific packages

```nix-shell -p [python3] [git]```

**Run a command** in the shell environment and exit

```nix-shell --run "[make check]"```

**Select attribute** from a Nix expression

```nix-shell -A [dev]```

**Keep environment variable** in a pure shell

```nix-shell --pure --keep [HOME]```

# SYNOPSIS

**nix-shell** [_options_] [_path_]

# PARAMETERS

_PATH_
> Nix expression file (default: shell.nix or default.nix).

**-p**, **--packages** _packages..._
> Set up an environment with the specified packages from Nixpkgs.

**--pure**
> Clear the environment before starting the shell, retaining only HOME, USER, and DISPLAY.

**--run** _cmd_
> Run a command in a non-interactive shell, then exit.

**--command** _cmd_
> Run a command in an interactive shell, then exit.

**-A**, **--attr** _attrPath_
> Select an attribute from the Nix expression.

**--keep** _name_
> Keep an environment variable when using --pure.

**--exclude** _regexp_
> Do not build dependencies whose store path matches the regexp.

**-i** _interpreter_
> Specify the interpreter for nix-shell shebang scripts.

**-I** _path_
> Add a path to the Nix expression search path.

**-v**
> Verbose output.

# DESCRIPTION

**nix-shell** starts an interactive shell in which the environment is set up based on a Nix expression. It provides all build dependencies of the specified derivation without actually building it, making it ideal for development environments.

When used with **--packages/-p**, it creates ad-hoc environments with specific packages available. When used with **--pure**, the host environment is cleared to closely match a real Nix build environment.

nix-shell can also be used as a script interpreter via shebang lines (`#!/usr/bin/env nix-shell`) to create reproducible scripts with declared dependencies.

# CAVEATS

Without **--pure**, the host environment leaks into the shell, which may cause builds to succeed locally but fail in a clean Nix build. The **--packages** flag uses Nixpkgs attribute names, not package names.

# SEE ALSO

[nix](/man/nix)(1), [nix-build](/man/nix-build)(1), [nix-shell](/man/nix-shell)(1), [nix-develop](/man/nix-develop)(1), [nix-store](/man/nix-store)(1)
