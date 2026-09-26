# TAGLINE

SoftMaker Office spreadsheet

# TLDR

**Start PlanMaker**

```planmaker```

**Open an Excel workbook**

```planmaker [path/to/file.xlsx]```

**Open a workbook with the Office 2026 launcher**

```planmaker26 [path/to/file.xlsx]```

**Start with OpenGL disabled**

```planmaker -disableopengl```

**Export a workbook to PDF from an options file**

```planmaker -pdf:[path/to/export.ini]```

# SYNOPSIS

**planmaker** [_options_] [_file_]

# PARAMETERS

**_file_**

> Workbook to open.

**-disableopengl**

> Start with the OpenGL display engine off. Used on Linux when a faulty OpenGL driver keeps the window from opening.

**-pdf:**_inifile_

> Create a PDF from the workbook named in _inifile_, then exit. _inifile_ is UTF-8 and must begin with a byte-order mark.

# DESCRIPTION

**planmaker** starts PlanMaker, the spreadsheet in SoftMaker Office from SoftMaker Software GmbH. XLSX is its default file format. It also edits XLS, opens PlanMaker workbooks (**.pmdx** in recent versions), imports SYLK, dBASE, DIF, and OpenDocument Calc, and exports PDF and PDF/A.

On Linux the package installs a year-suffixed script. SoftMaker Office 2026 provides **planmaker26**. The 2024 release provides **planmaker24**, and FreeOffice adds **planmaker24free**. The program binary itself is named **planmaker**. Pass a workbook path to open that file instead of a blank workbook.

Batch PDF export reads an INI file passed to **-pdf:**. On Linux the switch is written with a dash. Quotation marks around the path are optional. The export shows a progress window while it runs. When the sheet has a print range, only cells inside that range are exported unless **IgnorePrintRange** is set.

# CONFIGURATION

PDF export is driven by an INI file. The **[pdf files]** section names the input and output. Further sections match the PDF dialog: **[pdf general planmaker]**, **[pdf preferences]**, **[pdf view]**, and **[pdf protection]**. Empty or invalid values fall back to defaults without a dialog.

```[pdf files]
AppFile=/home/user/budget.xlsx
PdfFile=/home/user/budget.pdf

[pdf general planmaker]
ExportRange=DOCUMENT
PageRange=ALL
IgnorePrintRange=0
TaggedPdf=1

[pdf preferences]
OpenPDFViewer=0
FontEmbedding=ALL
```

**AppFile** is the workbook to convert. If it is missing, the export stops. If **PdfFile** is empty, the PDF path is taken from **AppFile** with a **.pdf** suffix. **ExportRange** is **DOCUMENT**, **AREACELLS**, **SELCELLS**, **CURWORKSHEET**, or **MARKEDWORKSHEETS**. **AREACELLS** needs **AreaCells** in the form **sheet!C2:D4**. **MARKEDWORKSHEETS** needs **MarkedWorksheets** as a semicolon-separated list. **OpenPDFViewer** set to **1** opens the result in a PDF viewer.

# CAVEATS

Current Linux packages put a year-suffixed launcher on **PATH**. A bare **planmaker** command is the binary inside the install directory and the name used by older packages.

The program needs a graphical session. **-pdf:** shows a progress window and is not a headless converter. The manual's startup and print switches (**-N**, **-FO**, **-FN**, **-P**, **-Q**) are specified for Windows.

SoftMaker Office is proprietary. FreeOffice is the reduced free edition and uses the same style of launcher.

# HISTORY

SoftMaker released PlanMaker 1.0 for Windows in **February 1995**. It reached Linux with SoftMaker Office 2006 in **December 2006**, alongside TextMaker and Presentations.

# SEE ALSO

[textmaker](/man/textmaker)(1), [gnumeric](/man/gnumeric)(1), [soffice](/man/soffice)(1)

# RESOURCES

```[Homepage](https://softmaker.com/en/products/softmaker-office/planmaker)```

```[Documentation](https://help.softmaker.com/planmaker2026/en/index.html)```

<!-- verified: 2026-09-26 -->
