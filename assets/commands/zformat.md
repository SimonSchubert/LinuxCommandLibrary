# TAGLINE

Zsh string formatting and alignment builtin

# TLDR

**Format a string** with named specifiers

```zformat -f REPLY "Name: %n, Age: %a" n:Alice a:30```

**Format with field width** padding and truncation

```zformat -f REPLY "%-20n %5a" n:Alice a:30```

**Use ternary expressions** to conditionally output text

```zformat -f REPLY "Status: %(s.active.inactive)" s:1```

**Align strings** into columns with a separator

```zformat -a result " = " "key1:value1" "key2:value2" "longkey:value3"```

**Format with existence-based** ternary (non-empty test)

```zformat -F REPLY "%(n.Name: %n.anonymous)" n:Alice```

# SYNOPSIS

**zformat** **-f** _param_ _format_ _spec_ ...
**zformat** **-F** _param_ _format_ _spec_ ...
**zformat** **-a** _array_ _sep_ _spec_ ...

# PARAMETERS

**-f** _param_ _format_ _spec_ ...
> Format a string. Each _spec_ is **char:string**. Every **%char** in _format_ is replaced by the corresponding _string_. The result is stored in _param_. Supports field widths and ternary expressions with numeric comparison.

**-F** _param_ _format_ _spec_ ...
> Like **-f**, but ternary expressions choose between true/false text based on whether the format specifier is **present and non-empty**, rather than numeric comparison.

**-a** _array_ _sep_ _spec_ ...
> Align strings. Each _spec_ is **left:right**. The colon is replaced by _sep_ and left strings are padded with spaces so all separators align vertically. Result is stored in _array_.

# DESCRIPTION

**zformat** is a builtin command provided by the **zsh/zutil** module. It performs string formatting and alignment operations commonly used in zsh completion system internals and custom scripts.

The **-f** form replaces **%char** sequences in a format string with values from named specifiers. Each specifier is a single character followed by a colon and a value string. Optional minimum and maximum field widths can be specified as **%min.maxc** where negative minimum widths pad to the left. Ternary expressions in the form **%(X.true_text.false_text)** compare the specifier value numerically against a test number (default 0).

The **-F** form works identically except ternary expressions test whether the specifier value is present and non-empty rather than performing numeric comparison.

The **-a** form aligns a list of **left:right** string pairs by padding the left portions with spaces so that the separator strings all line up when displayed vertically. This is useful for formatting option lists and help text.

The module must be loaded before use with **zmodload zsh/zutil**.

# FIELD WIDTH

Format specifiers support **%min.maxc** notation:

**%20n** pads with spaces to the right to minimum width 20
**%-20n** pads with spaces to the left to minimum width 20
**%.10n** truncates after 10 characters
**%20.30n** pads to 20, truncates at 30
**%12.12i** displays exactly 12 characters (useful for truncating hashes)

# TERNARY EXPRESSIONS

With **-f**, ternary expressions use numeric comparison:

**%(X.true.false)** outputs true if X equals 0 (default test number)
**%3(X.true.false)** outputs true if X equals 3
**%-1(X.true.false)** outputs true if X equals -1

With **-F**, ternary expressions test presence:

**%(X.true.false)** outputs true if X is present and non-empty
A test number with **-F** indicates minimum width for the value

Ternary expressions can be nested and the delimiter character after the specifier is arbitrary (not limited to dot).

# CAVEATS

**zformat** requires the **zsh/zutil** module to be loaded first with **zmodload zsh/zutil**. It is zsh-specific and not available in other shells. The single-character specifier limit means only 62 unique format variables (a-z, A-Z, 0-9) are available per format string. Ternary expression delimiters must not conflict with the specifier values.

# HISTORY

**zformat** was introduced as part of the **zsh/zutil** module in **zsh 4.0** (2001). It was designed primarily to support the zsh completion system's formatting needs, particularly the **zstyle** based configuration and **vcs_info** version control status displays. The **-F** option for existence-based ternary testing was added later to complement the numeric comparison of **-f**.

# SEE ALSO

[zsh](/man/zsh)(1), [zstyle](/man/zstyle)(1), [zmodload](/man/zmodload)(1), [zparseopts](/man/zparseopts)(1)
