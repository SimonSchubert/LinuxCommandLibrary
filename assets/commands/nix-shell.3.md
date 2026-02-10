# TAGLINE

enters development environments

# TLDR

**Development shell**

```nix-shell [shell.nix]```

**With specific attribute**

```nix-shell -A [dev]```

**Keep environment**

```nix-shell --keep [HOME]```

**Verbose mode**

```nix-shell -v```

# SYNOPSIS

**nix-shell** [_options_] [_path_]

# PARAMETERS

_PATH_
> Shell expression file.

**-A** _ATTR_
> Select attribute.

**--keep** _VAR_
> Keep environment variable.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**nix-shell** enters development environments. Another documentation variant.

The command loads shell.nix. Provides buildInputs and environment.

# CAVEATS

Evaluates Nix expressions. Store paths used. Environment modification.

# HISTORY

nix-shell enables **Nix-based** development workflows across different projects.

# SEE ALSO

[nix-shell](/man/nix-shell)(1), [nix](/man/nix)(1), [nix-build](/man/nix-build)(1)

