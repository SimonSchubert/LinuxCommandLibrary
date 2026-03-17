# TAGLINE

Search for packages in Nix flakes

# TLDR

**Search Nixpkgs for a package**

```nix search nixpkgs [query]```

**Search with JSON output**

```nix search nixpkgs [query] --json```

**Search a specific flake**

```nix search [github:owner/repo] [query]```

**Search and exclude matching packages**

```nix search nixpkgs [query] --exclude [regex]```

**Search with multiple terms (AND logic)**

```nix search nixpkgs [python] [http]```

# SYNOPSIS

**nix search** _flake_ [_query..._] [_options_]

# PARAMETERS

_flake_
> Flake reference to search (e.g., nixpkgs, github:owner/repo).

_query_
> Search query as a regex. Multiple queries are ANDed together.

**--json**
> Output results in JSON format.

**-e**, **--exclude** _regex_
> Exclude packages whose attribute path, name, or description match the regex.

**--impure**
> Allow access to mutable paths and external repositories.

**-I**, **--include** _path_
> Add a path to the Nix search path for resolving lookup paths.

**--offline**
> Operate without network access.

**--refresh**
> Force a refresh of the flake registry and inputs before searching.

# DESCRIPTION

**nix search** searches for packages in Nix flakes by matching against package names, attribute paths, and descriptions. Multiple search terms are ANDed together. Part of the experimental new Nix CLI (requires `nix-command` and `flakes` experimental features enabled).

# CAVEATS

Requires the **nix-command** and **flakes** experimental features to be enabled. The first search against a flake may be slow as it evaluates and caches the package set. Results depend on the flake's lock file version.

# SEE ALSO

[nix](/man/nix)(1), [nix-env](/man/nix-env)(1), [nix-profile](/man/nix-profile)(1), [nix-shell](/man/nix-shell)(1)
