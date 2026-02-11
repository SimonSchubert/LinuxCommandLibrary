# TAGLINE

Format tables for groff and troff

# TLDR

**Process a file containing tables** through tbl and groff

```groff -t [file.roff] | [less]```

**Process tables with equation support**

```tbl [file.roff] | eqn | troff```

**Process from stdin**

```cat [file.roff] | tbl```

**Show version information**

```tbl --version```

**Enable AT&T compatibility mode**

```tbl -C [file.roff]```

# SYNOPSIS

**tbl** [**-Cv**] [_file_...]

# PARAMETERS

**-C**
> Enable AT&T compatibility mode; recognize .TS and .TE followed by any character

**-v**, **--version**
> Print version information and exit

**--help**
> Display usage information and exit

# DESCRIPTION

**tbl** is a preprocessor for the groff/troff document formatting system that formats tables. It translates table descriptions embedded between **.TS** (table start) and **.TE** (table end) macros into troff formatting commands.

Tables are defined with a format section specifying column alignment and a data section containing the content. Column classifiers include **L** (left), **R** (right), **C** (center), **N** (numeric alignment), and **A** (alphabetic). Modifiers like **b** (bold) and **i** (italic) can be applied to columns.

Region options control table appearance: **box** draws a border, **center** horizontally centers the table, **expand** stretches it to fill the line width, and **tab(c)** sets the column separator character.

tbl is typically invoked via **groff -t** rather than directly. When using multiple preprocessors, tbl should run before **eqn** (equations). The groff command handles ordering automatically.

# TABLE SYNTAX

```
.TS
box center;
c c c
l l n.
Header1	Header2	Value
Data1	Data2	100
Data3	Data4	200
.TE
```

> **c/l/r/n** = center/left/right/numeric alignment
> Lines ending with **.** separate format from data
> Tab character separates columns by default

# CAVEATS

GNU tbl output requires GNU troff; it cannot be processed by AT&T troff. Complex tables with many spans or nested elements can be difficult to debug. The tab character is the default separator; use **tab(;)** to change it.

# HISTORY

**tbl** was written by **M.E. Lesk** at Bell Labs and first documented in **1976** in the paper "TBL -- A Program to Format Tables." The GNU version was written by **James Clark** as part of groff. It extends the original with features like unlimited columns and improved compatibility.

# SEE ALSO

[groff](/man/groff)(1), [troff](/man/troff)(1), [eqn](/man/eqn)(1), [pic](/man/pic)(1), [refer](/man/refer)(1)
