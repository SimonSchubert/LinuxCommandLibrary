# TLDR

**List registries**

```nix registry list```

**Pin flake to specific version**

```nix registry pin [nixpkgs]```

**Add registry entry**

```nix registry add [myflake] [github:owner/repo]```

**Remove registry entry**

```nix registry remove [myflake]```

# SYNOPSIS

**nix registry** _command_ [_options_]

# PARAMETERS

**list**
> List registry entries.

**add** _name_ _flake_
> Add flake alias.

**remove** _name_
> Remove alias.

**pin** _name_
> Pin flake to current version.

# DESCRIPTION

**nix registry** manages the Nix flake registry. The registry provides shorthand names for flake URLs. Enables pinning flakes to specific versions for reproducibility.

# SEE ALSO

[nix](/man/nix)(1), [nix-flake](/man/nix-flake)(1)

