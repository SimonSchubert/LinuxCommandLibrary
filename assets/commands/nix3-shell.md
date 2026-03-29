# TAGLINE

Start a shell providing specific packages

# TLDR

**Enter a shell with a package available**

```nix shell nixpkgs#[hello]```

**Enter a shell with multiple packages**

```nix shell nixpkgs#[git] nixpkgs#[curl]```

**Run a single command with a package and exit**

```nix shell nixpkgs#[jq] --command jq --version```

**Enter a shell with a package from a specific flake**

```nix shell github:[owner/repo]#[package]```

**Enter a shell with a package** from a specific nixpkgs revision

```nix shell github:NixOS/nixpkgs/[nixos-24.05]#[hello]```

# SYNOPSIS

**nix** **shell** [_options_] _installables_

# PARAMETERS

_INSTALLABLES_
> Flake references specifying packages to make available (e.g., nixpkgs#hello).

**--command**, **-c** _CMD_ [_ARGS_]
> Run a command in the shell environment instead of starting an interactive shell.

**--ignore-environment**, **-i**
> Clear the entire environment (except those specified with --keep).

**--keep** _NAME_
> Keep the specified environment variable when using --ignore-environment.

**--keep-going**
> Continue building other derivations if one fails.

**--impure**
> Allow access to mutable paths and environment variables.

**--override-input** _INPUT_ _FLAKEREF_
> Override a specific flake input. Implies --no-write-lock-file.

**--help**
> Display help information.

# DESCRIPTION

**nix shell** starts a shell environment with the specified packages available in `$PATH`. It is the flake-based replacement for `nix-shell -p` and does not require a shell.nix or default.nix file.

Packages are specified as flake references (e.g., `nixpkgs#jq`). The packages are built or fetched as needed and made available only in the spawned shell session. Nothing is permanently installed.

# CAVEATS

Requires the experimental `nix-command` and `flakes` features to be enabled. Packages are not permanently installed; they are only available in the spawned shell session.

# SEE ALSO

[nix](/man/nix)(1), [nix-shell](/man/nix-shell)(1), [nix3-develop](/man/nix3-develop)(1), [nix3-run](/man/nix3-run)(1), [nix3-build](/man/nix3-build)(1)

