# TAGLINE

searches for packages in Nix flakes

# TLDR

**Search packages**

```nix search nixpkgs [query]```

**Search with JSON output**

```nix search nixpkgs [query] --json```

**Search specific flake**

```nix search [github:owner/repo] [query]```

# SYNOPSIS

**nix search** _flake_ [_query_] [_options_]

# PARAMETERS

_flake_
> Flake to search (e.g., nixpkgs).

_query_
> Search query regex.

**--json**
> Output in JSON format.

**-e**, **--exclude** _regex_
> Exclude matching packages.

# DESCRIPTION

**nix search** searches for packages in Nix flakes. Searches package names and descriptions. Part of the new Nix command interface.

# SEE ALSO

[nix](/man/nix)(1), [nix-profile](/man/nix-profile)(1)

