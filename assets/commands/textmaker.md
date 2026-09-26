# TAGLINE

SoftMaker Office word processor

# TLDR

**Start TextMaker**

```textmaker```

**Open a Word document**

```textmaker [path/to/file.docx]```

**Open a document with the Office 2026 launcher**

```textmaker26 [path/to/file.docx]```

**Start with OpenGL disabled**

```textmaker -disableopengl```

**Export a document to PDF from an options file**

```textmaker -pdf:[path/to/export.ini]```

# SYNOPSIS

**textmaker** [_options_] [_file_]

# PARAMETERS

**_file_**

> Document to open.

**-disableopengl**

> Start with the OpenGL display engine off. Used on Linux when a faulty OpenGL driver keeps the window from opening.

**-pdf:**_inifile_

> Create a PDF from the document named in _inifile_, then exit. _inifile_ is UTF-8 and must begin with a byte-order mark.

# DESCRIPTION

**textmaker** starts TextMaker, the word processor in SoftMaker Office from SoftMaker Software GmbH. DOCX is its default file format. It also opens and saves RTF, OpenDocument Text, Markdown, plain text, and TextMaker documents from earlier versions, and it can export PDF.

On Linux the package installs a year-suffixed script. SoftMaker Office 2026 provides **textmaker26**. The 2024 release provides **textmaker24**, and FreeOffice adds **textmaker24free**. The program binary itself is named **textmaker**. Pass a document path to open that file instead of a blank document.

Batch PDF export reads an INI file passed to **-pdf:**. On Linux the switch is written with a dash. Quotation marks around the path are optional. The export shows a progress window while it runs.

# CONFIGURATION

PDF export is driven by an INI file. The **[pdf files]** section names the input and output. Further sections match the PDF dialog: **[pdf general textmaker]**, **[pdf preferences]**, **[pdf view]**, and **[pdf protection]**. Empty or invalid values fall back to defaults without a dialog.

```[pdf files]
AppFile=/home/user/report.docx
PdfFile=/home/user/report.pdf

[pdf general textmaker]
PageRange=ALL
PageExport=ALL
TaggedPdf=1

[pdf preferences]
OpenPDFViewer=0
FontEmbedding=ALL
```

**AppFile** is the document to convert. If it is missing, the export stops. If **PdfFile** is empty, the PDF path is taken from **AppFile** with a **.pdf** suffix. **PageRange** accepts lists such as **1-2;4**. **PageExport** is **ALL**, **ODD**, or **EVEN**. **OpenPDFViewer** set to **1** opens the result in a PDF viewer.

# CAVEATS

Current Linux packages put a year-suffixed launcher on **PATH**. A bare **textmaker** command is the binary inside the install directory and the name used by older packages.

The program needs a graphical session. **-pdf:** shows a progress window and is not a headless converter. The manual's startup and print switches (**-N**, **-FO**, **-FN**, **-P**, **-Q**) are specified for Windows.

SoftMaker Office is proprietary. FreeOffice is the reduced free edition and uses the same style of launcher.

# HISTORY

SoftMaker released TextMaker 1.0 for DOS in the fall of **1987**. A Linux build followed as TextMaker 2002 in **May 2003**. SoftMaker Office 2006 for Linux, which also includes PlanMaker and Presentations, shipped in **December 2006**.

# SEE ALSO

[planmaker](/man/planmaker)(1), [lowriter](/man/lowriter)(1), [soffice](/man/soffice)(1)

# RESOURCES

```[Homepage](https://softmaker.com/en/products/softmaker-office/textmaker)```

```[Documentation](https://help.softmaker.com/textmaker2026/en/index.html)```

<!-- verified: 2026-09-26 -->
