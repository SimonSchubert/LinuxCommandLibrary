# TAGLINE

Compile YARA rules to binary

# TLDR

**Compile rules**

```yarac [rules.yar] [rules.yarc]```

**Compile multiple files**

```yarac [rule1.yar] [rule2.yar] [output.yarc]```

**Show warnings**

```yarac -w [rules.yar] [output.yarc]```

# SYNOPSIS

**yarac** [_-w_] [_options_] _rules_ _output_

# PARAMETERS

**-w**
> Show warnings.

**-d** _VAR=VAL_
> Define variable.

**--help**
> Show help.

# DESCRIPTION

**yarac** compiles YARA rule source files into an optimized binary format. Precompiled rules load significantly faster than parsing source files each time, which matters when scanning large file sets or running rules on production systems.

Multiple rule files can be combined into a single compiled output, consolidating an entire rule set into one deployable binary. External variables can be defined at compile time with **-d** to parameterize rules without modifying the source.

Compiled rule files are not portable across different YARA versions, so rules must be recompiled after upgrading YARA. The **-w** flag enables warnings during compilation to catch potential issues in rule definitions before deployment.

# CAVEATS

YARA required. Rule syntax must be valid. Binary not portable across versions.

# HISTORY

**yarac** is part of **YARA**, a pattern matching tool for malware researchers.

# SEE ALSO

[yara](/man/yara)(1), [clamav](/man/clamav)(1)
