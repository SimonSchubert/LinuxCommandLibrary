# TAGLINE

Generate man pages from simple markup

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

**scdoc** generates roff-format man pages from a simple, readable markup syntax. Rather than writing raw roff macros, authors use a lightweight format with markdown-like headers, paragraphs, and lists that compiles to properly formatted manual pages.

The first line of each document defines metadata including the command name and section number. Sections are marked with **#** headers matching standard man page conventions (NAME, SYNOPSIS, DESCRIPTION, etc.). Text formatting uses **\*bold\*** and **\_italic\_** syntax, and the output is standard roff that can be rendered directly by the **man** command.

The tool reads from stdin and writes to stdout, fitting naturally into build system pipelines. This makes it straightforward to integrate into project build processes where documentation is compiled alongside code.

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
