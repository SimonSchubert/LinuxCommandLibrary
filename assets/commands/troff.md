# TLDR

**Format a document** using the man macro package

```troff -man [file.1]```

**Format with the ms macro package**

```troff -ms [file.ms]```

**Generate ASCII output**

```troff -a [file]```

**Print version information**

```troff -v```

**Enable all warnings**

```troff -w all [file]```

**Format with compatibility mode**

```troff -C [file]```

# SYNOPSIS

**troff** [_-abcivzCERU_] [_-d cs_] [_-f fam_] [_-F dir_] [_-m name_] [_-n num_] [_-o list_] [_-r cn_] [_-T name_] [_-w name_] [_file ..._]

# PARAMETERS

**-a**
> Generate ASCII approximation of typeset output.

**-b**
> Print backtrace with each warning or error message.

**-c**
> Disable color output.

**-C**
> Enable compatibility mode with traditional troff.

**-d** _cs_
> Define string c as s.

**-f** _fam_
> Set default font family.

**-F** _dir_
> Search directory for font files.

**-i**
> Read standard input after processing files.

**-m** _name_
> Include macro package (e.g., **man**, **ms**, **me**, **mom**).

**-n** _num_
> Number first page as num.

**-o** _list_
> Output only pages in list.

**-r** _cn_
> Set register c to value n.

**-T** _name_
> Prepare output for device name (default: ps).

**-U**
> Enable unsafe mode (allows dangerous requests).

**-v**
> Print version number.

**-w** _name_
> Enable warning name. Use **-w all** for most warnings.

**-W** _name_
> Disable warning name.

# DESCRIPTION

**troff** is the typesetting processor of the groff (GNU roff) text formatting system. It reads text files containing formatting commands and produces formatted output for various devices including PostScript, PDF, and terminals.

troff is usually invoked through **groff**, which handles preprocessors (tbl, eqn, pic) and postprocessors automatically. Macro packages provide high-level formatting: **man** for manual pages, **ms** for general documents, **mom** for complex documents.

The groff implementation extends traditional Unix troff with color support, additional escape sequences, and improved compatibility features while maintaining backward compatibility.

# CAVEATS

Direct use of troff is uncommon; **groff** is the preferred wrapper that handles the complete processing pipeline. The **-U** unsafe mode should be avoided unless necessary as it enables potentially dangerous file operations. Compatibility mode (**-C**) may be needed for older documents.

# HISTORY

The original troff was written by **Joe Ossanna** at Bell Labs in **1973** as part of Unix, evolving from the earlier runoff formatter. After Ossanna's death in 1977, **Brian Kernighan** rewrote and maintained troff. GNU troff (groff) was developed by **James Clark** starting in **1989** as a free software replacement, and is now maintained by the groff project as part of the GNU system.

# SEE ALSO

[groff](/man/groff)(1), [nroff](/man/nroff)(1), [man](/man/man)(1), [tbl](/man/tbl)(1), [eqn](/man/eqn)(1)
