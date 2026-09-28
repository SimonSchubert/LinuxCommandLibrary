# TAGLINE

enters development shells

# TLDR

Enter the **dev shell** of the flake in the current directory

```nix develop```

Enter a **named dev shell**

```nix develop [.#devShellName]```

Get the **build environment** of a nixpkgs package

```nix develop nixpkgs#[hello]```

**Run a command** in the dev shell instead of an interactive shell

```nix develop --command [make]```

Run a **series of commands**

```nix develop --command bash -c "[mkdir build && cd build && cmake .. && make]"```

Run a single **build phase** directly

```nix develop --build```

Start with a **clean environment**, keeping selected variables

```nix develop --ignore-env --keep-env-var [HOME]```

**Save** the environment to a profile for reuse and GC protection

```nix develop --profile [/tmp/dev-env]```

# SYNOPSIS

**nix** **develop** [_options_] [_installable_]

# PARAMETERS

_INSTALLABLE_
> Flake reference and output. Defaults to devShells.<system>.default, then packages.<system>.default of the flake in the current directory.

**-c**, **--command** _CMD_ _ARGS_
> Run the command instead of an interactive shell.

**--unpack**, **--configure**, **--build**, **--check**, **--install**, **--installcheck**
> Run that stdenv phase directly.

**--phase** _NAME_
> Run the named stdenv phase.

**--profile** _PATH_
> Record the build environment in a profile, or use one previously recorded.

**--redirect** _INSTALLABLE_ _DIR_
> Replace a store path with a mutable directory in the environment.

**-i**, **--ignore-env**
> Clear the environment, except variables given with --keep-env-var.

**-k**, **--keep-env-var** _NAME_
> Keep the variable when using --ignore-env.

**-s**, **--set-env-var** _NAME_ _VALUE_
> Set an environment variable.

**-u**, **--unset-env-var** _NAME_
> Unset an environment variable.

**--impure**
> Allow impure evaluation.

**--help**
> Display help information.

# DESCRIPTION

**nix3-develop** is the manual page for **nix develop**, which starts a bash shell with the build environment of a derivation: the variables and shell functions stdenv would set up when building it. Flakes usually define a dedicated **devShells** output with the tools a project needs.

Nix obtains the environment by building a modified derivation that only records the environment and exits. The prompt can be customised with the **bash-prompt**, **bash-prompt-prefix** and **bash-prompt-suffix** settings.

# CAVEATS

There is no **nix3** executable: the new-CLI man pages are named nix3-_subcommand_ to avoid clashing with the old nix-* tools. Read it with **man nix3-develop** or **nix develop --help**.

Requires the **nix-command** and **flakes** experimental features. Always starts **bash**, regardless of your login shell; use **--command** or a tool like direnv with nix-direnv to use another shell.

# HISTORY

**nix develop** was introduced with flakes in **Nix 2.4** (2021) as the successor to **nix-shell** for development environments.

# INSTALL

```apt: sudo apt install nix-bin```

```dnf: sudo dnf install nix```

```pacman: sudo pacman -S nix```

```apk: sudo apk add nix```

```zypper: sudo zypper install nix```

```nix: nix profile install nixpkgs#nix```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[nix](/man/nix)(1), [nix-develop](/man/nix-develop)(1), [nix-shell](/man/nix-shell)(1), [nix3-shell](/man/nix3-shell)(1), [direnv](/man/direnv)(1)

# RESOURCES

```[Source code](https://github.com/NixOS/nix)```

```[Documentation](https://nix.dev/manual/nix/latest/command-ref/new-cli/nix3-develop.html)```

<!-- verified: 2026-09-29 -->
