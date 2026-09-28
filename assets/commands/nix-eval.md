# TAGLINE

evaluates Nix expressions

# TLDR

**Evaluate** an expression

```nix eval --expr "[1 + 1]"```

Evaluate a **flake attribute**

```nix eval [.#packages.x86_64-linux.default.name]```

Get a **package version** from nixpkgs

```nix eval --raw nixpkgs#[hello].version```

**Apply a function** to the result

```nix eval --apply builtins.attrNames --expr "{a=1; b=2;}"```

Output as **JSON**

```nix eval --json --expr "[{a = 1;}]"```

Evaluate a **file**

```nix eval -f [file.nix]```

Evaluate an **attribute from a file**

```nix eval -f [default.nix] [attribute]```

Print a string **without quotes**

```nix eval --raw --expr "\"hello\""```

Read a NixOS **configuration option** from a flake

```nix eval .#nixosConfigurations.[hostname].config.[networking.hostName]```

# SYNOPSIS

**nix** **eval** [_options_] [_installable_]

# PARAMETERS

_INSTALLABLE_
> Flake output attribute, or attribute path when used with --expr or --file.

**--expr** _EXPR_
> Interpret installables as attribute paths relative to this Nix expression.

**-f**, **--file** _FILE_
> Interpret installables as attribute paths relative to the expression in FILE (- reads stdin). Implies --impure.

**--json**
> Output as JSON. Fails if the result contains functions.

**--raw**
> Print strings without quotes or escaping. The result must be a string.

**--apply** _FUNC_
> Apply function to result.

**--write-to** _PATH_
> Write a string, or a nested attribute set of strings, as files under PATH.

**--read-only**
> Do not instantiate evaluated derivations. Faster, but can fail when store paths of derivations are accessed.

**--impure**
> Allow access to mutable paths, environment variables and the current time.

**--arg** _NAME_ _EXPR_, **--argstr** _NAME_ _STRING_
> Pass arguments to Nix functions.

**--debugger**
> Start an interactive debugger if evaluation fails.

**--help**
> Display help information.

# DESCRIPTION

**nix eval** evaluates the given Nix expression or installable and prints the result on standard output. Nested attribute values and list items are evaluated too.

By default the result is printed as a Nix expression; **--json** and **--raw** give output suitable for scripts. It is the new-CLI replacement for **nix-instantiate --eval**.

# CAVEATS

Part of the experimental new Nix CLI: requires the **nix-command** experimental feature, plus **flakes** for flake references. Evaluation is pure by default, so builtins.getEnv, builtins.currentTime and paths outside a flake need **--impure**.

# HISTORY

**nix eval** appeared with the new **nix** command in **Nix 2.0** (2018) and was reworked for flakes and installables in **Nix 2.4** (2021).

# INSTALL

```apt: sudo apt install nix-bin```

```dnf: sudo dnf install nix```

```pacman: sudo pacman -S nix```

```apk: sudo apk add nix```

```zypper: sudo zypper install nix```

```nix: nix profile install nixpkgs#nix```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[nix](/man/nix)(1), [nix-repl](/man/nix-repl)(1), [nix-instantiate](/man/nix-instantiate)(1), [nix3-eval](/man/nix3-eval)(1)

# RESOURCES

```[Source code](https://github.com/NixOS/nix)```

```[Documentation](https://nix.dev/manual/nix/latest/command-ref/new-cli/nix3-eval.html)```

<!-- verified: 2026-09-29 -->
