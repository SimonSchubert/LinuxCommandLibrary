# TAGLINE

Evaluate conditional expressions in shell scripts

# TLDR

**Test condition (synonym for test)**

```[ -f [file] ] && echo "exists"```

**String comparison**

```[ "[string1]" = "[string2]" ]```

**Numeric comparison**

```[ [5] -gt [3] ]```

**File tests**

```[ -d [directory] ] && echo "is directory"```

**Combine conditions**

```[ -f [file] ] && [ -r [file] ]```

# SYNOPSIS

**[** _expression_ **]**

# FILE TESTS

**-e** _file_: File exists
**-f** _file_: Regular file
**-d** _file_: Directory
**-r** _file_: Readable
**-w** _file_: Writable
**-x** _file_: Executable
**-s** _file_: Size > 0
**-L** _file_: Symbolic link

# STRING TESTS

**-z** _string_: Length is zero
**-n** _string_: Length is non-zero
_s1_ **=** _s2_: Strings equal
_s1_ **!=** _s2_: Strings not equal

# NUMERIC TESTS

_n1_ **-eq** _n2_: Equal
_n1_ **-ne** _n2_: Not equal
_n1_ **-lt** _n2_: Less than
_n1_ **-le** _n2_: Less or equal
_n1_ **-gt** _n2_: Greater than
_n1_ **-ge** _n2_: Greater or equal

# DESCRIPTION

**[** is the POSIX test command for evaluating conditional expressions. It's equivalent to **test** but requires a closing **]**. Spaces around **[** and **]** are mandatory.

The command returns exit status 0 (true) or 1 (false), used in if statements and conditional execution.

```bash
if [ -f "$file" ]; then
    echo "File exists"
fi

[ -d "$dir" ] && cd "$dir"
```

For bash/zsh, **[[** provides an enhanced version with pattern matching and safer syntax.

# CAVEATS

**[** is a command, not syntax. Spaces are required: **[ "$a" = "$b" ]** not **["$a"="$b"]**.

Always quote variables: **[ "$var" = "test" ]** to handle empty values and spaces.

Use **-a** and **-o** for AND/OR, or combine with **&&** and **||** outside brackets.

**=** is for strings, **-eq** for numbers: **[ "01" = "1" ]** is false, **[ 01 -eq 1 ]** is true.

# SEE ALSO

[test](/man/test)(1), [bash](/man/bash)(1), [sh](/man/sh)(1)
