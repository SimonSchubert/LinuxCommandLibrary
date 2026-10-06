# TAGLINE

Compare tracking dots across scanned pages

# TLDR

**Compare** two scans

```deda_compare_prints [page-a.png] [page-b.png]```

Compare **every scan** in a set

```deda_compare_prints [page1.png] [page2.png] [page3.png]```

Set the scan **resolution**

```deda_compare_prints -d [300] [page-a.png] [page-b.png]```

# SYNOPSIS

**deda_compare_prints** [_options_] _file_...

# PARAMETERS

_file_...

> One or more scans. At least one path is required.

**-d** _dpi_, **--dpi** _dpi_

> Resolution of the scans. **0**, the default, asks the reader to detect it.

**-v**, **--verbose**

> Repeat to print more diagnostic detail.

# DESCRIPTION

**deda_compare_prints** reads the tracking-dot pattern on each scan and groups the files by the printer it detected. When every file resolves to the same printer, it prints **IDENTICAL**. Otherwise it prints how many printers it found, a manufacturer label for each group, and the paths in that group. Files it could not read are listed under **Errors**.

The scans should be lossless and about **300** dpi, the same kind of input **deda_parse_print** expects.

# CAVEATS

A page with no detectable dots, or a pattern this toolkit does not know, shows up as an error or as its own group. That is not evidence that the printers differ. Pass **-d** when the image file does not store its resolution.

# HISTORY

**deda_compare_prints** is part of **DEDA**, written by **Timo Richter** and **Stephan Escher** and described in their **2018** paper on forensic analysis and anonymisation of printed documents.

# SEE ALSO

[deda_parse_print](/man/deda_parse_print)(1), [deda_extract_yd](/man/deda_extract_yd)(1), [deda_clean_document](/man/deda_clean_document)(1)

# RESOURCES

```[Source code](https://github.com/dfd-tud/deda)```

<!-- verified: 2026-10-06 -->
