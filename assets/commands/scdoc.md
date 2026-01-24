# TLDR

**Generate man page**

```scdoc < [input.scd] > [output.1]```

**Compile to roff**

```scdoc < [file.scd]```

**View generated page**

```scdoc < [file.scd] | man -l -```

# SYNOPSIS

**scdoc** < _input_ > _output_

# DESCRIPTION

**scdoc** generates roff-format man pages from a simple syntax. It provides readable source for documentation.

Input uses a lightweight markup. Headers, paragraphs, and lists have simple syntax.

Output is roff suitable for man. The man command renders it directly.

Document metadata comes from first line. Name and section number defined there.

Sections use markdown-like headers. # for top-level sections in man pages.

# SYNTAX

```
command(1)

# NAME

command - description

# SYNOPSIS

*command* [_options_]

# DESCRIPTION

Text paragraph.

*bold* _italic_
```

# CAVEATS

Simple syntax, limited features. No tables. Less powerful than full roff.

# HISTORY

**scdoc** was created by **Drew DeVault** for the sway project. It provides a simpler alternative to writing raw roff for man pages.

# SEE ALSO

[man](/man/man)(1), [groff](/man/groff)(1), [pandoc](/man/pandoc)(1), [ronn](/man/ronn)(1)
