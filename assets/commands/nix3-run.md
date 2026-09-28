# TAGLINE

executes packages without installing

# TLDR

**Run package**

```nix run nixpkgs#[hello]```

**Run from flake** in the current directory

```nix run```

Run a **named app** from a flake

```nix run [.#app-name]```

**Run with args**

```nix run nixpkgs#[cowsay] -- "[text]"```

Run a program from a **GitHub flake**

```nix run github:[owner]/[repo]```

Run a package that needs **unfree** or other impure settings

```NIXPKGS_ALLOW_UNFREE=1 nix run --impure nixpkgs#[package]```

Run with a **clean environment**

```nix run --ignore-env nixpkgs#[package]```

# SYNOPSIS

**nix** **run** [_options_] [_installable_] [-- _args_...]

# PARAMETERS

_INSTALLABLE_
> Flake reference and output. Defaults to apps.<system>.default, then packages.<system>.default of the flake in the current directory.

_ARGS_
> Arguments passed to the program. Put them after **--** so nix does not parse them.

**-i**, **--ignore-env**
> Clear the environment, except variables given with --keep-env-var.

**-k**, **--keep-env-var** _NAME_
> Keep the variable when using --ignore-env.

**-s**, **--set-env-var** _NAME_ _VALUE_
> Set an environment variable.

**-u**, **--unset-env-var** _NAME_
> Unset an environment variable.

**--impure**
> Allow impure evaluation, e.g. to read NIXPKGS_ALLOW_UNFREE.

**--help**
> Display help information.

# DESCRIPTION

**nix3-run** is the manual page for **nix run**, which builds (or downloads) an installable and runs it without installing it into a profile.

If the installable is an **app** (a flake output with type = "app"), its **program** is executed. If it is a derivation, **nix run** executes _out_/bin/_name_, where _name_ is the first of **meta.mainProgram**, **pname**, or the name part of **name**.

# CAVEATS

There is no **nix3** executable: the new-CLI man pages are named nix3-_subcommand_. Use **man nix3-run** or **nix run --help**.

Requires the **nix-command** experimental feature (and **flakes** for flake references). The first positional argument is always the installable, even after **--**, so write **nix run . -- arg** to pass arguments to the default app. The package stays in the store until the next garbage collection; network access is needed unless it is already cached.

# HISTORY

In Nix 2.0-2.3, **nix run** started a shell with packages available; Nix **2.4** (2021) renamed that behavior to **nix shell** and made **nix run** execute a single app.

# INSTALL

```apt: sudo apt install nix-bin```

```dnf: sudo dnf install nix```

```pacman: sudo pacman -S nix```

```apk: sudo apk add nix```

```zypper: sudo zypper install nix```

```nix: nix profile install nixpkgs#nix```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[nix](/man/nix)(1), [nix-run](/man/nix-run)(1), [nix3-shell](/man/nix3-shell)(1), [nix-shell](/man/nix-shell)(1)

# RESOURCES

```[Source code](https://github.com/NixOS/nix)```

```[Documentation](https://nix.dev/manual/nix/latest/command-ref/new-cli/nix3-run.html)```

<!-- verified: 2026-09-29 -->
