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

**Build a specific output** of a package

```nix build nixpkgs#[glibc].dev```

**Build an attribute** from a non-flake Nix file

```nix build --file [release.nix] [attribute]```

Build and point a **profile** at the result

```nix build --profile [path/to/profile] [installable]```

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
> Rebuild an already-built derivation and compare the result to the existing store paths.

**--profile** _PATH_
> Point the profile at _PATH_ to the build result.

**-f** _FILE_, **--file** _FILE_
> Interpret installables as attribute paths relative to the Nix expression in _FILE_.

**--expr** _EXPR_
> Interpret installables as attribute paths relative to the Nix expression _EXPR_.

**--stdin**
> Read installables from standard input.

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

**nix build** (invoked as **nix3-build** in this manual namespace to distinguish it from the legacy **nix-build**) builds the specified installables, which may be flake references, attribute paths, or store paths. On success it creates symlinks to the store paths, prefixed _./result_ by default. Each has a suffix _-N-outname_, where _N_ (the installable index) is omitted for 0 and _outname_ is omitted for the default _out_ output.

When multiple installables are given, each is built in parallel subject to the configured build concurrency.

# CAVEATS

Part of the new **nix** CLI; requires the _nix-command_ experimental feature, plus _flakes_ for flake references (via _nix.conf_ or _--extra-experimental-features_). Behavior may change between Nix releases.

# HISTORY

The **nix3-** prefix names the man pages of the newer **nix** command, keeping them apart from legacy tools such as **nix-build**. It does not refer to a Nix 3.x release.

# SEE ALSO

[nix](/man/nix)(1), [nix-build](/man/nix-build)(1), [nix3-develop](/man/nix3-develop)(1)

# RESOURCES

```[Source code](https://github.com/NixOS/nix)```

```[Homepage](https://nixos.org)```

```[Documentation](https://nix.dev/manual/nix/stable/command-ref/new-cli/nix3-build.html)```

<!-- verified: 2026-11-09 -->
