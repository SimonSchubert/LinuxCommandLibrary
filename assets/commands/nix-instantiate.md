# TAGLINE

instantiates Nix expressions, producing store derivations

# TLDR

**Instantiate expression**

```nix-instantiate [expression.nix]```

**Evaluate and print**

```nix-instantiate --eval [expression.nix]```

**Evaluate to JSON**

```nix-instantiate --eval --json [expression.nix]```

**Parse only (check syntax)**

```nix-instantiate --parse [expression.nix]```

**Use expression from command line**

```nix-instantiate --eval -E '1 + 2'```

# SYNOPSIS

**nix-instantiate** [_options_] _files_...

# PARAMETERS

**--eval**
> Evaluate and print result.

**--json**
> Output as JSON.

**--strict**
> Evaluate strictly.

**--parse**
> Parse only.

**-E** _expr_
> Evaluate expression.

**--arg** _name_ _value_
> Pass argument.

**-A** _attr_
> Select attribute.

# DESCRIPTION

**nix-instantiate** instantiates Nix expressions, producing store derivations. With --eval, it evaluates expressions and prints results.

This is useful for debugging and testing Nix expressions.
# Evaluate expression
nix-instantiate --eval -E 'let x = 1; in x + 1'
# Output: 2

# Get derivation
nix-instantiate '<nixpkgs>' -A hello
# Output: /nix/store/...-hello.drv
```

# CAVEATS

Newer nix commands (nix eval) supersede some uses. Strict evaluation required for full values. Part of legacy Nix CLI.

# HISTORY

nix-instantiate is one of the original Nix commands, part of the core tooling since **Nix** was first released in **2003**.

# SEE ALSO

[nix-build](/man/nix-build)(1), [nix-store](/man/nix-store)(1), [nix-env](/man/nix-env)(1)
