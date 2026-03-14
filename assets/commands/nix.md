# TAGLINE

package manager CLI

# TLDR

**Search packages**

```nix search nixpkgs [package]```

**Run package**

```nix run nixpkgs#[package]```

**Build derivation**

```nix build```

**Enter development shell**

```nix develop```

**Show flake info**

```nix flake show```

**Update flake**

```nix flake update```

**Evaluate expression**

```nix eval --expr "[1 + 1]"```

**Garbage collect unused store paths**

```nix store gc```

**Install a package to profile**

```nix profile install nixpkgs#[package]```

**Start an interactive Nix REPL**

```nix repl```

**Start a temporary shell with a package**

```nix shell nixpkgs#[package]```

# SYNOPSIS

**nix** [_command_] [_options_]

# PARAMETERS

**search** _flakeref_ _query_
> Search packages in a flake.

**run** _installable_
> Build and run a package.

**build** [_installable_]
> Build a derivation or fetch a store path.

**develop** [_installable_]
> Enter a development shell from a flake.

**shell** _installable..._
> Run a shell with specified packages available.

**flake** _subcommand_
> Manage Nix flakes (show, update, init, check, lock).

**profile** _subcommand_
> Manage Nix profiles (install, remove, list, upgrade).

**store** _subcommand_
> Manage the Nix store (gc, verify, repair, optimise).

**repl**
> Start an interactive Nix expression evaluator.

**eval** _installable_
> Evaluate a Nix expression.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**nix** is the unified Nix package manager CLI providing reproducible package management, builds, and development environments. It is the modern replacement for older commands like nix-env and nix-build.

The tool uses **flakes** for reproducible project definitions with lock files. Flakes standardize how Nix projects declare dependencies and outputs.

**nix develop** creates development shells with project dependencies. **nix run** builds and executes packages directly. **nix shell** provides a temporary shell with specified packages available.

The Nix store holds all packages in isolation, enabling atomic upgrades and rollbacks. Garbage collection with **nix store gc** removes unused paths.

# CAVEATS

Steep learning curve. The Nix expression language is functional and unique. Many new-style nix commands are still marked as experimental and require enabling experimental features. Requires Nix daemon installation.

# HISTORY

Nix was created by **Eelco Dolstra** as his PhD thesis project at Utrecht University, first released in **2003**. The unified nix CLI was introduced in Nix 2.0.

# SEE ALSO

[nix-shell](/man/nix-shell)(1), [nix-env](/man/nix-env)(1), [nix-build](/man/nix-build)(1), [nix-store](/man/nix-store)(1), [nixos-rebuild](/man/nixos-rebuild)(1), [home-manager](/man/home-manager)(1)

