# TLDR

**Build default.nix**

```nix-build```

**Build specific file**

```nix-build [path/to/file.nix]```

**Build with attribute**

```nix-build -A [attribute]```

**Build from expression**

```nix-build -E "[with import <nixpkgs> {}; hello]"```

**Don't create result symlink**

```nix-build --no-out-link```

**Build and keep output**

```nix-build -o [result-link]```

**Show build log**

```nix-build -v```

# SYNOPSIS

**nix-build** [_options_] [_path_]

# PARAMETERS

_PATH_
> Nix expression file.

**-A** _ATTR_
> Build specific attribute.

**-E** _EXPR_
> Build expression.

**--no-out-link**
> Don't create result link.

**-o** _LINK_
> Output symlink name.

**-v**
> Verbose mode.

**--help**
> Display help information.

# DESCRIPTION

**nix-build** builds Nix expressions. It creates derivations and builds them.

The tool produces output in /nix/store. Creates result symlink by default.

nix-build builds Nix packages.

# CAVEATS

Legacy command. Consider nix build. Nix expressions required.

# HISTORY

nix-build is part of **Nix**, providing the traditional build command interface.

# SEE ALSO

[nix](/man/nix)(1), [nix-shell](/man/nix-shell)(1), [nix-env](/man/nix-env)(1)

