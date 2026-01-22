# TLDR

**Build expression**

```nix-build [file.nix]```

**Build with arguments**

```nix-build --arg [name] [value]```

**Build keeping logs**

```nix-build --keep-going```

**Show derivation**

```nix-build --dry-run```

# SYNOPSIS

**nix-build** [_options_] [_path_]

# PARAMETERS

_PATH_
> Path to Nix expression.

**--arg** _NAME_ _VALUE_
> Pass argument to expression.

**--keep-going**
> Continue on errors.

**--dry-run**
> Show what would be built.

**--help**
> Display help information.

# DESCRIPTION

**nix-build** builds Nix packages. This is another documentation variant.

The tool processes Nix files. Outputs to Nix store with result symlink.

nix-build compiles Nix expressions.

# CAVEATS

Requires Nix installation. Expression evaluation. Store path outputs.

# HISTORY

nix-build provides **derivation building** as part of the core Nix toolchain.

# SEE ALSO

[nix-build](/man/nix-build)(1), [nix](/man/nix)(1), [nix-env](/man/nix-env)(1)

