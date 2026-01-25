# TLDR

**Evaluate Nix expression**

```nix eval --expr '1 + 2'```

**Evaluate flake attribute**

```nix eval [.#packages.x86_64-linux.default]```

**Evaluate nixpkgs attribute**

```nix eval nixpkgs#hello.version```

**Output as JSON**

```nix eval --json nixpkgs#hello.meta```

**Raw string output**

```nix eval --raw nixpkgs#hello.name```

**Read from file**

```nix eval -f [file.nix]```

# SYNOPSIS

**nix eval** [_options_] _installable_

# PARAMETERS

**--expr** _expr_
> Evaluate expression.

**--json**
> Output as JSON.

**--raw**
> Raw output (no quotes).

**-f** _file_
> Evaluate file.

**--apply** _expr_
> Apply function to result.

**--impure**
> Allow impure evaluation.

# DESCRIPTION

**nix eval** is the new Nix 3.x command for evaluating Nix expressions. It replaces nix-instantiate --eval with a cleaner interface and flake support.

The command evaluates expressions and prints the result.

# EXAMPLES

```bash
# Simple expression
nix eval --expr 'builtins.length [1 2 3]'
# Output: 3

# Flake attribute
nix eval .#packages.x86_64-linux.hello.version

# With function application
nix eval nixpkgs#lib --apply 'lib: lib.version'
```

# CAVEATS

Part of experimental Nix 3.x commands. Flakes must be enabled. Different from nix-instantiate syntax.

# HISTORY

nix eval was introduced as part of the Nix 2.4 flakes experimental features, redesigning the Nix CLI for better ergonomics.

# SEE ALSO

[nix](/man/nix)(1), [nix-instantiate](/man/nix-instantiate)(1), [nix-build](/man/nix-build)(1)
