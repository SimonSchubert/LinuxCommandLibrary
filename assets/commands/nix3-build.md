# TAGLINE

builds derivations from flakes

# TLDR

**Build the default package of a flake** in the current directory

```nix build```

**Build a specific output of the current flake**

```nix build .#[package]```

**Build from nixpkgs**

```nix build nixpkgs#[hello]```

**Build without creating a result symlink**

```nix build --no-link```

**Build and print full build logs**

```nix build -L [installable]```

**Build and print output store paths**

```nix build --print-out-paths [installable]```

**Dry-run** without actually building

```nix build --dry-run [installable]```

# SYNOPSIS

**nix build** [_options_] [_installable_...]

# PARAMETERS

_INSTALLABLE_
> Flake reference, attribute path, or store path to build (e.g. _.#default_, _nixpkgs#hello_).

**--no-link**
> Do not create a result symlink.

**-o** _PATH_, **--out-link** _PATH_
> Use _PATH_ as the prefix for the result symlink (default: _result_).

**--rebuild**
> Rebuild an already-built derivation and compare outputs.

**--print-out-paths**
> Print the resulting store paths to stdout.

**-L**, **--print-build-logs**
> Show full build logs on standard error.

**--json**
> Print build results as JSON.

**--dry-run**
> Show what would be built or fetched without actually doing it.

**--impure**
> Allow evaluation of impure expressions (e.g. references to environment variables).

**--refresh**
> Consider all previously downloaded files as stale.

**--help**
> Display help information.

# DESCRIPTION

**nix build** (invoked as **nix3-build** in this manual namespace to distinguish it from the legacy **nix-build**) builds the specified installables, which may be flake references, attribute paths, or store paths. On success it creates a symlink named _result_ (or _result-N_ for additional outputs) pointing to the build output in the Nix store.

When multiple installables are given, each is built in parallel subject to the configured build concurrency.

# CAVEATS

Part of the new **nix** CLI; requires the _nix-command_ and _flakes_ experimental features to be enabled (via _nix.conf_ or _--extra-experimental-features_). Behavior may change between Nix releases.

# HISTORY

nix3 refers to the **Nix 3.x CLI**, with build being the primary compilation command.

# SEE ALSO

[nix](/man/nix)(1), [nix-build](/man/nix-build)(1), [nix3-develop](/man/nix3-develop)(1)

