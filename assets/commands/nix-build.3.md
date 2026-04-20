# TAGLINE

Build a Nix derivation and create a result symlink

# TLDR

**Build the default expression in the current directory**

```nix-build```

**Build a specific Nix expression**

```nix-build [file.nix]```

**Build a named attribute from a file**

```nix-build [file.nix] -A [attribute]```

**Pass a typed argument to the expression**

```nix-build --arg [name] [value]```

**Pass a string argument to the expression**

```nix-build --argstr [name] "[string]"```

**Continue building other derivations on failure**

```nix-build --keep-going```

**Show what would be built without building**

```nix-build --dry-run```

**Build without creating a result symlink**

```nix-build --no-out-link```

# SYNOPSIS

**nix-build** [_options_] [_paths_...]

# PARAMETERS

_PATH_
> Path to a Nix expression file or attribute. Defaults to **default.nix**.

**-A** _attr_, **--attr** _attr_
> Select an attribute from the top-level expression (dotted paths supported).

**--arg** _NAME_ _VALUE_
> Pass **VALUE** (a Nix expression) as the argument **NAME**.

**--argstr** _NAME_ _VALUE_
> Pass **VALUE** as a string argument **NAME**.

**--keep-going**, **-k**
> Keep building dependencies even after a failure.

**--dry-run**
> Show which derivations would be built or substituted without building them.

**--no-out-link**
> Do not create a **result** symlink to the output.

**-o** _name_, **--out-link** _name_
> Change the name of the result symlink (default: **result**).

**-j** _n_, **--max-jobs** _n_
> Number of derivations to build in parallel.

**--option** _NAME_ _VALUE_
> Set an arbitrary Nix configuration option.

# DESCRIPTION

**nix-build** is one of the classic Nix CLI tools. It evaluates a Nix expression into one or more derivations, realises them (building or substituting their outputs), and creates a symlink named **result** in the current directory pointing at the output path. If multiple outputs are produced, symlinks are named **result**, **result-2**, and so on.

This manpage variant documents the same binary as **nix-build(1)**, shipped under an alternate section in some distributions.

# CAVEATS

The **result** symlink is a garbage-collection root, preventing the build output from being garbage collected. Delete the symlink (or pass **--no-out-link**) when you no longer need the output. For flake-based workflows prefer the newer **nix build** command.

# SEE ALSO

[nix-build](/man/nix-build)(1), [nix](/man/nix)(1), [nix-env](/man/nix-env)(1), [nix-store](/man/nix-store)(1)
