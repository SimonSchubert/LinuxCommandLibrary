# TLDR

**Evaluate expression**

```nix eval --expr "[1 + 1]"```

**Evaluate from flake**

```nix eval [.#packages.x86_64-linux.default]```

**Evaluate and apply function**

```nix eval --apply [builtins.attrNames] --expr "{a=1; b=2;}"```

**Output as JSON**

```nix eval --json --expr "[{a = 1;}]"```

**Evaluate file**

```nix eval -f [file.nix]```

**Raw output**

```nix eval --raw --expr "\"hello\""```

# SYNOPSIS

**nix** **eval** [_options_] [_installable_]

# PARAMETERS

_INSTALLABLE_
> Flake attribute to evaluate.

**--expr** _EXPR_
> Nix expression.

**--json**
> Output as JSON.

**--raw**
> Raw string output.

**--apply** _FUNC_
> Apply function to result.

**--help**
> Display help information.

# DESCRIPTION

**nix eval** evaluates Nix expressions. It outputs the evaluated value.

The tool inspects Nix values. Useful for debugging and querying.

nix eval evaluates expressions.

# CAVEATS

Part of Nix CLI. Expression syntax. Flakes or expressions.

# HISTORY

nix eval is part of the **new Nix CLI** providing expression evaluation functionality.

# SEE ALSO

[nix](/man/nix)(1), [nix-repl](/man/nix-repl)(1), [nix-instantiate](/man/nix-instantiate)(1)

