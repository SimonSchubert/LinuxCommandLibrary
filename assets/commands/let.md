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

# SYNOPSIS

**let** _expression_...

# PARAMETERS

_EXPRESSION_
> Arithmetic expression(s).

Operators:
> +, -, *, /, %, ** (power)
> ++, -- (increment/decrement)
> ==, !=, <, >, <=, >=
> &&, ||, !

# DESCRIPTION

**let** is a Bash built-in for arithmetic evaluation. It performs integer math and comparisons.

The command sets exit status based on expression result. Zero result returns exit code 1.

let evaluates arithmetic.

# CAVEATS

Bash built-in. Integer only. Use (( )) as alternative. Returns 1 if result is 0.

# HISTORY

let is a **Bash** built-in command for arithmetic evaluation, similar to expr but more powerful.

# SEE ALSO

[bash](/man/bash)(1), [expr](/man/expr)(1), [bc](/man/bc)(1)
