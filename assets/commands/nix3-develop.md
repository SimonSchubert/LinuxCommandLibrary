# TLDR

**Enter dev shell**

```nix3 develop```

**Develop from flake**

```nix3 develop [.#devShell]```

**Run command**

```nix3 develop --command [make]```

# SYNOPSIS

**nix3** **develop** [_options_] [_installable_]

# PARAMETERS

_INSTALLABLE_
> Flake reference.

**--command** _CMD_
> Run command in shell.

**--impure**
> Allow impure evaluation.

**--help**
> Display help information.

# DESCRIPTION

**nix3 develop** enters development shells. Alternative name for nix develop.

The tool provides build dependencies. Based on flake devShells output.

nix3 develop creates dev env.

# CAVEATS

Alias for nix develop. Flakes required. Environment setup.

# HISTORY

nix3 develop is the **new Nix CLI** command for reproducible development environments.

# SEE ALSO

[nix](/man/nix)(1), [nix-develop](/man/nix-develop)(1), [nix-shell](/man/nix-shell)(1)

