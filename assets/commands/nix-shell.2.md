# TAGLINE

provides ad-hoc development environments

# TLDR

**Quick package shell**

```nix-shell -p [package]```

**Shell with multiple packages**

```nix-shell -p [git] [curl] [jq]```

**Execute and exit**

```nix-shell -p [ripgrep] --run "rg pattern"```

**From expression**

```nix-shell -E "with import <nixpkgs> {}; mkShell { buildInputs = [hello]; }"```

# SYNOPSIS

**nix-shell** [_options_]

# PARAMETERS

**-p** _PKG_
> Add package to shell.

**--run** _CMD_
> Run command and exit.

**-E** _EXPR_
> Evaluate expression.

**--help**
> Display help information.

# DESCRIPTION

**nix-shell** provides ad-hoc development environments. This is alternate documentation.

The tool is essential for quick environment setup. No permanent changes.

# CAVEATS

Downloads packages. Network required. Uses Nix store.

# HISTORY

nix-shell is a foundational **Nix** tool for reproducible development environments.

# SEE ALSO

[nix-shell](/man/nix-shell)(1), [nix-develop](/man/nix-develop)(1), [nix](/man/nix)(1)

