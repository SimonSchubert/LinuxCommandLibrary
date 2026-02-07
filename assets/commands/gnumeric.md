# TAGLINE

lightweight GNOME spreadsheet application

# TLDR

**Start Gnumeric**

```gnumeric```

**Open spreadsheet**

```gnumeric [spreadsheet.xlsx]```

**Convert to CSV**

```ssconvert [input.xlsx] [output.csv]```

**Convert to PDF**

```ssconvert [input.xlsx] [output.pdf]```

# SYNOPSIS

**gnumeric** [_options_] [_files_]

# PARAMETERS

_FILES_
> Spreadsheet files to open.

**-n**, **--new**
> Open new window.

**-L** _LOCALE_, **--locale** _LOCALE_
> Set locale.

**--help**
> Display help information.

# DESCRIPTION

**Gnumeric** is a spreadsheet application for GNOME. It provides spreadsheet functionality including formulas, charts, and data analysis with high calculation accuracy.

**Gnumeric** supports various file formats including Excel, OpenDocument, and CSV. It is known for accurate statistical functions and being lightweight compared to full office suites.

# CAVEATS

GTK application. Fewer features than LibreOffice Calc. Excellent statistical accuracy.

# HISTORY

Gnumeric was started by **Miguel de Icaza** as part of the **GNOME** project, focusing on accuracy and standards compliance.

# SEE ALSO

[ssconvert](/man/ssconvert)(1), [libreoffice](/man/libreoffice)(1)
