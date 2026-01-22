# TLDR

**Evaluate arithmetic** expression

```expr [5] + [3]```

**String length**

```expr length "[string]"```

**Substring extraction**

```expr substr "[string]" [1] [5]```

**Pattern matching**

```expr "[string]" : '[regex]'```

**Compare values**

```expr [10] \> [5]```

# SYNOPSIS

**expr** _expression_

# PARAMETERS

_EXPRESSION_
> Mathematical or string expression to evaluate.

**+**, **-**, **\***, **/**, **%**
> Arithmetic operators (multiply must be escaped).

**=**, **!=**, **\<**, **\>**, **\<=**, **\>=**
> Comparison operators (escape < and >).

**length** _STRING_
> Return string length.

**substr** _STRING_ _POS_ _LEN_
> Extract substring (1-indexed).

**index** _STRING_ _CHARS_
> Find first occurrence of characters.

**match** _STRING_ _REGEX_
> Pattern match and extract.

**--help**
> Display help information.

# DESCRIPTION

**expr** evaluates expressions and outputs the result. It handles integer arithmetic, string operations, and comparisons. Results are printed to standard output with exit status indicating boolean results.

Operators must be passed as separate arguments, with shell metacharacters escaped. For arithmetic, expr only handles integers. String operations include length, substring extraction, and regex matching.

expr is often used in shell scripts for calculations and string manipulation, though modern shells provide built-in alternatives.

# CAVEATS

Operators need escaping (\* for multiply, \> for comparison). Only integer arithmetic supported. Returns exit code 1 for zero/false results. Regex uses basic regular expressions only.

# HISTORY

expr originated in **Version 7 Unix** (1979) as a general-purpose expression evaluator. It remains part of POSIX and GNU coreutils, though many of its functions are now handled by shell builtins.

# SEE ALSO

[bc](/man/bc)(1), [test](/man/test)(1), [bash](/man/bash)(1)
