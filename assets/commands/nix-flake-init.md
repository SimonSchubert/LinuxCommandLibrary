# TLDR

**Initialize default flake**

```nix flake init```

**Initialize from template**

```nix flake init -t [templates#python]```

**Initialize from GitHub template**

```nix flake init -t [github:owner/repo#template]```

# SYNOPSIS

**nix flake init** [_options_]

# PARAMETERS

**-t**, **--template** _flake_
> Template flake reference.

# DESCRIPTION

**nix flake init** creates a new flake.nix in the current directory. Initializes from templates for various project types. Part of Nix flakes for reproducible builds.

# SEE ALSO

[nix-flake](/man/nix-flake)(1), [nix](/man/nix)(1)

