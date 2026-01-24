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

**yarac** compiles YARA rules. It creates optimized binaries.

Rule compilation. Faster scanning.

Precompiled rules. Deploy ready.

Multiple inputs. Combine rules.

Part of YARA. Malware tool.

# CAVEATS

YARA required. Rule syntax must be valid. Binary not portable across versions.

# HISTORY

**yarac** is part of **YARA**, a pattern matching tool for malware researchers.

# SEE ALSO

[yara](/man/yara)(1), [clamav](/man/clamav)(1)
