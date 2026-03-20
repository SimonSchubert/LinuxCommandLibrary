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

**--no-splash**
> Start without showing the splash screen.

**-g**, **--geometry** _WIDTHxHEIGHT+XOFF+YOFF_
> Set the size and position of the first window.

**-L** _LOCALE_, **--locale** _LOCALE_
> Set locale.

**-v**, **--version**
> Display the version of Gnumeric.

**--help**
> Display help information.

# DESCRIPTION

**Gnumeric** is a spreadsheet application for GNOME. It provides spreadsheet functionality including formulas, charts, and data analysis with high calculation accuracy.

**Gnumeric** supports various file formats including Excel, OpenDocument, and CSV. It is known for accurate statistical functions and being lightweight compared to full office suites.

# CAVEATS

GTK application requiring a display server. Fewer features than LibreOffice Calc but lighter weight. Known for excellent statistical accuracy. Use **ssconvert** for command-line format conversions without launching the GUI.

# HISTORY

Gnumeric was started by **Miguel de Icaza** as part of the **GNOME** project, focusing on accuracy and standards compliance.

# SEE ALSO

[libreoffice](/man/libreoffice)(1)
