# TAGLINE

arithmetic evaluation and expansion

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

Two different constructs are easily confused. **$((...))**, arithmetic *expansion*, **is POSIX** and works in every shell including dash. **((...))**, the arithmetic *command*, is **not** POSIX: it comes from ksh and works in bash, ksh, and zsh, but not in dash. In a `#!/bin/sh` script use `[ "$(( a + b ))" -gt 0 ]` rather than `(( a + b > 0 ))`.

Only **integers** are supported. `$(( 5 / 2 ))` is **2**, not 2.5, and there is no way to get a fractional result: use **bc** or **awk** for real arithmetic.

The exit status is inverted relative to the value, which trips up almost everyone once. A non-zero result means success (status 0) and a zero result means failure (status 1), because the construct is designed to read as a C-style truth test. The practical consequence is that `(( count-- ))` as the last line of a function returns failure when `count` reaches zero, and under `set -e` that will terminate the script. Write `(( count-- )) || true` when the value may be zero.

Beware also that a leading zero makes a number **octal** inside arithmetic context: `$(( 010 ))` is 8. This bites scripts handling zero-padded dates, where `$(( 08 ))` is an error rather than eight. Force base ten with `10#`, as in `$(( 10#$month ))`.

**\*\*** (exponentiation) is a bash/ksh/zsh extension and is not available everywhere, and the operator is not defined in POSIX arithmetic.

# HISTORY

Arithmetic in the original Bourne shell meant calling out to the external **expr** command, which was slow and needed escaping for almost every operator. The **Korn shell** introduced both `let` and the `((...))` command to make arithmetic a first-class part of the language, and POSIX subsequently standardised the `$((...))` expansion form, though not the `((...))` command. bash and zsh support all of them, which is why the same script can be written three different ways and why `expr` still turns up in old code.

# SEE ALSO

[bash](/man/bash)(1), [bc](/man/bc)(1), [expr](/man/expr)(1), [let](/man/let)(1), [double-bracket](/man/double-bracket)(1)
