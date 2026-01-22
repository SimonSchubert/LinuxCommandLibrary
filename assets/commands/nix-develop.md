# TLDR

**Enter development shell**

```nix develop```

**Develop with flake**

```nix develop [path/to/flake]```

**Run command in shell**

```nix develop --command [bash -c "make"]```

**Develop specific output**

```nix develop [.#devShells.default]```

**Develop with impure**

```nix develop --impure```

**Build first**

```nix develop --build```

# SYNOPSIS

**nix** **develop** [_options_] [_installable_]

# PARAMETERS

_INSTALLABLE_
> Flake reference or path.

**--command** _CMD_
> Run command in shell.

**--impure**
> Allow impure evaluation.

**--build**
> Build before entering.

**--help**
> Display help information.

# DESCRIPTION

**nix develop** enters a development shell. It provides build dependencies.

The tool sets up environment variables. Based on flake devShell or shell.nix.

nix develop creates dev environment.

# CAVEATS

Requires flakes enabled. Or shell.nix compatibility. Environment isolation.

# HISTORY

nix develop is part of **Nix 2.4+** flakes, providing reproducible development environments.

# SEE ALSO

[nix](/man/nix)(1), [nix-shell](/man/nix-shell)(1), [direnv](/man/direnv)(1)

