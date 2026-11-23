# TAGLINE

bash built-in for arithmetic evaluation

# TLDR

**Arithmetic assignment**

```let "x = 5 + 3"```

**Increment variable**

```let "count++"```

**Multiple expressions**

```let "a = 1" "b = 2" "c = a + b"```

**Comparison (exit code)**

```let "5 > 3"```

**Modulo operation**

```let "result = 10 % 3"```

**Compound assignment** without quotes (no spaces allowed)

```let x+=10```

**Convert** a hexadecimal or binary number to decimal

```let "n = 16#ff" "b = 2#1010"; echo $n $b```

**Bitwise shift**

```let "y = 1 << 4"```

# SYNOPSIS

**let** _expression_...

# PARAMETERS

_EXPRESSION_
> Arithmetic expression(s).

**Operators**
> +, -, *, /, %, ** (power)
> ++, -- (increment/decrement)
> ==, !=, <, >, <=, >=
> &&, ||, !
> &, |, ^, ~, <<, >> (bitwise)
> ?: (ternary), = += -= *= /= %= <<= >>= &= ^= |= (assignment)

**Numbers**
> Decimal by default; leading **0** means octal, **0x** hexadecimal, and **base#n** any base from 2 to 64.

# DESCRIPTION

**let** is a Bash (and ksh) built-in that evaluates one or more arithmetic expressions. Each expression is evaluated using the same rules as `$(( ... ))`: integer math, C-style operators, and shell variable references without the leading `$`.

The exit status is **0** if the value of the **last** evaluated expression is non-zero, and **1** if it is zero. This makes `let` usable in `if`/`while` conditions but is the inverse of typical command exit semantics: a successful arithmetic result of 0 (e.g., `let "x = 0"`) reports failure.

# CAVEATS

Bash/ksh/zsh built-in; not available in POSIX `sh` or `dash`. Each argument is a separate expression, so unquoted expressions must not contain spaces, and characters like `*`, `<` or `>` need quoting to avoid globbing and redirection. Integer arithmetic only; use `bc` or `awk` for floating point. The `(( ... ))` arithmetic command is generally preferred in modern Bash because it does not require quoting and has cleaner exit semantics. Returns exit code 1 when the final expression evaluates to 0, which can trigger `set -e` exits unexpectedly.

# HISTORY

**let** originated in the **KornShell** (David Korn, Bell Labs) as a built-in replacement for the external **expr** command, and was adopted by **Bash** and **zsh**. POSIX standardized the **$(( ))** arithmetic expansion instead of **let**.

# SEE ALSO

[bash](/man/bash)(1), [ksh](/man/ksh)(1), [declare](/man/declare)(1), [expr](/man/expr)(1), [bc](/man/bc)(1)

# RESOURCES

```[Homepage](https://tiswww.case.edu/php/chet/bash/bashtop.html)```

```[Documentation](https://tiswww.case.edu/php/chet/bash/bashref.html)```

<!-- verified: 2026-11-23 -->
