# TLDR

**Run commands in a subshell**

```(cd [/tmp] && [command])```

**Create an array**

```array=([one] [two] [three])```

**Command grouping without subshell**

```{ [command1]; [command2]; }```

**Function definition**

```function_name() { [commands]; }```

**Arithmetic evaluation**

```(( count++ ))```

# SYNOPSIS

**(** _commands_ **)**

**((**_arithmetic_**))**

# DESCRIPTION

Parentheses **( )** in shell have several distinct uses depending on context:

**Subshell execution**: Commands in **(...)** run in a child shell. Environment changes (cd, variable assignments) don't affect the parent shell.

**Array literals**: In bash/zsh, **array=(a b c)** creates an array.

**Function definition**: **name() { ... }** defines a function (parentheses are part of syntax, not grouping).

**Command substitution**: **$(...)** captures command output.

**Arithmetic**: **((...))** performs arithmetic evaluation, **$((...))** expands to the result.

# SUBSHELL BEHAVIOR

```bash
# Changes don't affect parent
(cd /tmp; pwd)  # prints /tmp
pwd             # still original directory

# Variables don't leak
(x=5)
echo $x         # empty or original value
```

# ARITHMETIC (( ))

```bash
(( x = 5 + 3 ))    # Assignment
(( x++ ))          # Increment
(( x > 5 )) && echo "big"  # Condition
result=$(( a * b ))         # Capture result
```

# CAVEATS

Subshells have overhead from process creation. For simple grouping without isolation, use braces **{ ...; }** instead.

**{ }** grouping requires a space after **{** and semicolon before **}**; parentheses don't.

Subshell exit status is visible to parent, but variable changes are not.

Nested parentheses may need careful quoting to avoid syntax issues.

# SEE ALSO

[bash](/man/bash)(1), [sh](/man/sh)(1), [test](/man/test)(1)
