# TAGLINE

man page for nix eval, the Nix expression evaluator

# TLDR

**Evaluate Nix expression**

```nix eval --expr '1 + 2'```

**Evaluate flake attribute**

```nix eval [.#packages.x86_64-linux.default.name]```

**Evaluate nixpkgs attribute**

```nix eval nixpkgs#hello.version```

**Output as JSON**

```nix eval --json nixpkgs#hello.meta.license```

**Raw string output**

```nix eval --raw nixpkgs#hello.name```

**Read from file**

```nix eval -f [file.nix]```

**Apply a function** to the result

```nix eval nixpkgs#lib --apply 'lib: lib.version'```

**Write** an attribute set of strings as files

```nix eval --write-to [./out] --expr '{ foo = "bar"; }'```

# SYNOPSIS

**nix eval** [_options_] [_installable_]

# PARAMETERS

**--expr** _expr_
> Interpret installables as attribute paths relative to this expression.

**-f**, **--file** _file_
> Interpret installables as attribute paths relative to the expression in file. Implies --impure.

**--json**
> Output as JSON.

**--raw**
> Raw output (no quotes). The result must be a string.

**--apply** _expr_
> Apply function to result.

**--write-to** _path_
> Write a string or attribute set of strings to files under path.

**--read-only**
> Do not instantiate derivations during evaluation.

**--impure**
> Allow impure evaluation.

# DESCRIPTION

**nix3-eval** is the manual page for **nix eval**, the new-CLI command for evaluating Nix expressions. It replaces **nix-instantiate --eval** with a cleaner interface and flake support.

```
# Simple expression
nix eval --expr 'builtins.length [1 2 3]'
# Output: 3

# Flake attribute
nix eval .#packages.x86_64-linux.hello.version

# With function application
nix eval nixpkgs#lib --apply 'lib: lib.version'
```

# CAVEATS

There is no **nix3** executable: the new-CLI man pages are named nix3-_subcommand_ to avoid clashing with the old nix-* tools. Use **man nix3-eval** or **nix eval --help**.

Part of the experimental new Nix CLI: the **nix-command** feature (and **flakes** for flake references) must be enabled. Different from nix-instantiate syntax.

# HISTORY

**nix eval** first shipped with the new **nix** command in **Nix 2.0** (2018) and was redesigned around flakes and installables in **Nix 2.4** (2021).

# INSTALL

```apt: sudo apt install nix-bin```

```dnf: sudo dnf install nix```

```pacman: sudo pacman -S nix```

```apk: sudo apk add nix```

```zypper: sudo zypper install nix```

```nix: nix profile install nixpkgs#nix```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[nix](/man/nix)(1), [nix-eval](/man/nix-eval)(1), [nix-instantiate](/man/nix-instantiate)(1), [nix-build](/man/nix-build)(1)

# RESOURCES

```[Source code](https://github.com/NixOS/nix)```

```[Documentation](https://nix.dev/manual/nix/latest/command-ref/new-cli/nix3-eval.html)```

<!-- verified: 2026-09-29 -->
