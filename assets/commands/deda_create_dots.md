# TAGLINE

Stamp a synthetic tracking-dot pattern onto a PDF

# TLDR

**Add** a dot pattern to a PDF

```deda_create_dots [page.pdf]```

Set the **serial** and **manufacturer** encoded in the dots

```deda_create_dots --serial [123456] --manufacturer [Epson] [page.pdf]```

Set the **timestamp** stored in the pattern

```deda_create_dots --year [18] --month [11] --day [11] --hour [11] --minutes [11] [page.pdf]```

Print the dots in **magenta** so they are easy to see

```deda_create_dots --debug [page.pdf]```

# SYNOPSIS

**deda_create_dots** [_options_] _pdf_

# PARAMETERS

_pdf_

> PDF the dots are added to. The original file is not modified.

**--serial** _n_

> Serial number encoded in the pattern. The default is **123456**.

**--manufacturer** _name_

> Manufacturer name encoded in the pattern. The default is **Epson**. The names this pattern accepts are **Xerox**, **Epson**, and **Dell**.

**--year** _n_, **--month** _n_, **--day** _n_, **--hour** _n_, **--minutes** _n_

> Timestamp fields encoded in the pattern. The defaults are year **18**, month **11**, day **11**, hour **11**, and minutes **11**.

**--dotradius** _inches_

> Radius of each dot, in inches. The default is the toolkit's built-in radius.

**--debug**

> Draw magenta dots instead of yellow ones.

# DESCRIPTION

**deda_create_dots** builds a tracking-dot matrix from the serial, manufacturer, and timestamp fields and stamps it onto a copy of a PDF. It prints the matrix, then writes **new_dots.pdf** in the working directory. The input PDF is left unchanged.

**--debug** uses magenta so the added dots are visible without a microscope. The calibration page from **deda_anonmask_create -w** can be used as the input PDF.

# CAVEATS

The output path is always **new_dots.pdf** in the current directory. A file of that name is overwritten. There is no flag to choose another path.

The manufacturer string has to be one the pattern tables include. An unknown name fails when the matrix is built. The year field is a two-digit value, matching the default of **18**.

# HISTORY

**deda_create_dots** is part of **DEDA**, written by **Timo Richter** and **Stephan Escher** and described in their **2018** paper on forensic analysis and anonymisation of printed documents.

# SEE ALSO

[deda_anonmask_create](/man/deda_anonmask_create)(1), [deda_anonmask_apply](/man/deda_anonmask_apply)(1), [deda_parse_print](/man/deda_parse_print)(1)

# RESOURCES

```[Source code](https://github.com/dfd-tud/deda)```

<!-- verified: 2026-10-06 -->
