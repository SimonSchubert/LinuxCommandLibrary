# TAGLINE

brace expansion and arithmetic separator in shell

# TLDR

**Brace expansion with sequence**

```echo {a,b,c}```

**Generate multiple filenames**

```touch file{1,2,3}.txt```

**Multiple values in arithmetic**

```(( a=1, b=2, c=a+b ))```

**Sequential commands (expr1, expr2)**

```for ((i=0, j=10; i<j; i++, j--)); do echo $i $j; done```

# SYNOPSIS

**{**_item1_**,**_item2_**,**...**}**

# DESCRIPTION

The **comma** has several uses in shell scripting:

**Brace expansion**: **{a,b,c}** expands to **a b c**. Combined with text: **file{1,2,3}.txt** becomes **file1.txt file2.txt file3.txt**. Can be nested: **{a,b{1,2}}** expands to **a b1 b2**.

**Arithmetic comma operator**: In **((...))**, comma separates expressions evaluated left to right, returning the rightmost value.

**For loop multiple expressions**: In C-style for loops, comma separates initialization and increment expressions.

**Parameter expansion (bash 4+)**: **${var,,}** lowercases, **${var,}** lowercases first char.

# CAVEATS

Brace expansion happens before variable expansion. **{$a,$b}** doesn't expand variables first.

No spaces around comma in brace expansion: **{a, b}** won't expand.

Brace expansion is a bash/zsh feature, not POSIX sh.

The comma operator in **((...))** is rarely needed; semicolons often suffice.

# SEE ALSO

[bash](/man/bash)(1), [zsh](/man/zsh)(1)
