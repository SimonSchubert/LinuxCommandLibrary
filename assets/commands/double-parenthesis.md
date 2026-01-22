# TLDR

**Arithmetic evaluation**

```(( x = 5 + 3 ))```

**Increment variable**

```(( count++ ))```

**Conditional test**

```(( x > 10 )) && echo "big"```

**Capture arithmetic result**

```result=$(( a * b ))```

**Complex expression**

```(( result = (a + b) * c / d ))```

# SYNOPSIS

**((**_expression_**))**

**$((**_expression_**))**

# OPERATORS

**Arithmetic**: +, -, *, /, % (modulo), ** (exponent)

**Assignment**: =, +=, -=, *=, /=, %=

**Comparison**: ==, !=, <, >, <=, >=

**Logical**: && (and), || (or), ! (not)

**Bitwise**: &, |, ^, ~, <<, >>

**Increment/Decrement**: ++, --

**Ternary**: condition ? true : false

# DESCRIPTION

**((  ))** is the shell's arithmetic evaluation construct. It evaluates mathematical expressions and returns success (0) if the result is non-zero, failure (1) if zero.

Inside **((...))**, variables don't need the **$** prefix and whitespace is ignored. Standard C-style operators work as expected.

**$((...))** performs arithmetic expansion, substituting the result. **((...))** evaluates without substitution (for side effects like assignment).

```bash
# Evaluation (for conditionals/assignments)
(( x = 5 ))
(( x > 3 )) && echo "yes"

# Expansion (to get the value)
echo "Result: $(( 5 + 3 ))"
```

# CAVEATS

**((...))** only handles integers. For floating-point, use **bc** or **awk**.

Division is integer division: **$(( 5 / 2 ))** gives **2**, not **2.5**.

Return value logic is inverted from typical boolean: **(( 0 ))** returns failure (exit 1), **(( 1 ))** returns success (exit 0).

This is a bash/zsh feature, not POSIX. Use **$((...))** for better portability.

# SEE ALSO

[bash](/man/bash)(1), [bc](/man/bc)(1), [expr](/man/expr)(1), [let](/man/let)(1)
