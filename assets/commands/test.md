# TAGLINE

Evaluate conditional expressions

# TLDR

**Check if a file exists**

```test -e [path/to/file] && echo "exists"```

**Check if file is a directory**

```test -d [path/to/dir] && echo "is directory"```

**Check if file is readable**

```test -r [path/to/file] && echo "readable"```

**Compare strings for equality**

```test "[string1]" = "[string2]"```

**Check if string is non-empty**

```test -n "[string]"```

**Compare integers**

```test [5] -gt [3] && echo "greater"```

**Combine conditions with AND**

```test -f [file] -a -r [file]```

**Combine conditions with OR**

```test -f [file1] -o -f [file2]```

# SYNOPSIS

**test** _EXPRESSION_

**[** _EXPRESSION_ **]**

# FILE TESTS

**-e** _FILE_
> True if file exists.

**-f** _FILE_
> True if file exists and is a regular file.

**-d** _FILE_
> True if file exists and is a directory.

**-r** _FILE_
> True if file is readable.

**-w** _FILE_
> True if file is writable.

**-x** _FILE_
> True if file is executable.

**-s** _FILE_
> True if file exists and has size greater than zero.

**-L** _FILE_
> True if file is a symbolic link.

# STRING TESTS

**-n** _STRING_
> True if string length is non-zero.

**-z** _STRING_
> True if string length is zero.

_STRING1_ **=** _STRING2_
> True if strings are equal.

_STRING1_ **!=** _STRING2_
> True if strings are not equal.

# INTEGER COMPARISONS

_INT1_ **-eq** _INT2_
> Equal.

_INT1_ **-ne** _INT2_
> Not equal.

_INT1_ **-lt** _INT2_
> Less than.

_INT1_ **-le** _INT2_
> Less than or equal.

_INT1_ **-gt** _INT2_
> Greater than.

_INT1_ **-ge** _INT2_
> Greater than or equal.

# OPERATORS

**!** _EXPR_
> True if expression is false.

_EXPR1_ **-a** _EXPR2_
> True if both expressions are true (AND).

_EXPR1_ **-o** _EXPR2_
> True if either expression is true (OR).

# DESCRIPTION

**test** evaluates conditional expressions, returning exit status 0 (true) or 1 (false). It is commonly used in shell scripts for decision-making in if statements and loops.

The command can also be invoked as **[** with a closing **]** required as the last argument. This bracket syntax is more readable in conditionals: **if [ -f file ]; then**.

Modern shells also provide **[[** which offers additional features like pattern matching and safer string handling, but is not POSIX-compliant.

# CAVEATS

Variables in test expressions should be quoted to handle empty values and spaces correctly. The **[** form requires spaces around brackets. String comparison uses **=** not **==** for POSIX compliance. Integer comparison operators (-eq, -lt) are different from string operators.

# HISTORY

test is one of the original Unix utilities, dating back to Version 7 Unix in **1979**. The bracket notation **[** was added as an alias for improved readability in shell scripts. Both forms are specified by POSIX and available as shell builtins and standalone commands.

# SEE ALSO

[bash](/man/bash)(1), [sh](/man/sh)(1), [expr](/man/expr)(1)
