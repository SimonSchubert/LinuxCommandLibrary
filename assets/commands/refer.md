# TLDR

**Process a document with bibliographic references**

```refer [document.ms] | troff -ms```

**Use a specific bibliography database**

```refer -p [references.bib] [document.ms]```

**Process with groff**

```groff -ms -R [document.ms]```

**Generate references in footnote style**

```refer -e [document.ms]```

# SYNOPSIS

**refer** [**-p** _bibfile_] [**-e**] [**-n**] [**-l** _m,n_] [_file_...]

# PARAMETERS

**-p** _bibfile_
> Search specified bibliography file (can be repeated)

**-e**
> Accumulate references and print at end (endnotes style)

**-n**
> Do not search default bibliography file

**-l** _m_,_n_
> Label references with m significant letters and n digits

**-a** _n_
> Reverse first n author names (last name first)

**-b**
> Bare mode; suppress automatic numbering

**-c** _fields_
> Capitalize fields as specified

**-k** _field_
> Use specified field as citation key

**-s** _spec_
> Sort references according to specification

**-B** _field.macro_
> Set bibliography mode

**-S**
> Produce references compatible with sortbib

# DESCRIPTION

**refer** is a troff preprocessor that handles bibliographic references in documents. It searches bibliography databases for citations and formats them according to specified styles.

Citations in the document are marked with **.[** and **.]** delimiters containing keywords that identify the reference. Refer searches the bibliography for matching entries and inserts formatted citations and reference list entries.

Bibliography files use a simple format with fields identified by single letters (%A for author, %T for title, %J for journal, etc.). Each reference is separated by blank lines.

Refer is typically used in a pipeline with other troff preprocessors (eqn, tbl, pic) and the troff/groff formatter. The **-R** option to groff invokes refer automatically.

# BIBLIOGRAPHY FORMAT

**%A**: Author name (repeatable)
**%T**: Title
**%J**: Journal name
**%V**: Volume number
**%N**: Issue number
**%P**: Page numbers
**%D**: Date
**%I**: Publisher
**%C**: City

# CAVEATS

Refer is designed for troff/groff document processing, not for modern formats like LaTeX or Markdown. For those, use BibTeX or other format-specific tools.

The default bibliography location varies by system. Use **-p** to specify explicit bibliography files.

Reference matching uses keywords, which may produce false matches. Use unique identifiers in citations for reliable matching.

# HISTORY

Refer was written by **Mike Lesk** at Bell Labs in the 1970s as part of the Unix document preparation system. It predates BibTeX and established many conventions for bibliography management. The current implementation is part of groff.

# SEE ALSO

[groff](/man/groff)(1), [troff](/man/troff)(1), [sortbib](/man/sortbib)(1), [lookbib](/man/lookbib)(1)
