# TLDR

Update PO files and documents from **config** file

```po4a [path/to/config_file]```

# SYNOPSIS

**po4a** [**-f**] [**-v**] [**--no-translations**] _config_file_

# PARAMETERS

**-f, --force**
> Force processing even if files are up-to-date

**-v, --verbose**
> Increase verbosity

**--no-translations**
> Don't generate translated documents

**--keep _threshold_**
> Minimum translation percentage to produce output

**--srcdir _dir_**
> Source directory

**--destdir _dir_**
> Destination directory

# DESCRIPTION

**po4a** (PO for anything) maintains translations of documentation using gettext PO files. It extracts translatable strings from documents, manages PO files, and generates translated versions of documents.

The tool supports many documentation formats including man pages, POD, XML, and others. It automates the workflow of keeping translations synchronized with source documents.

# CAVEATS

Requires format-specific modules. Configuration file defines document mappings. PO files must exist or be created with po4a-gettextize. Complex documents may need manual tweaking.

# HISTORY

**po4a** was created by **Martin Quinson** to simplify documentation translation using the proven gettext workflow. It enables collaborative translation using standard PO editor tools.

# SEE ALSO

[po4a-gettextize](/man/po4a-gettextize)(1), [po4a-translate](/man/po4a-translate)(1), [po4a-updatepo](/man/po4a-updatepo)(1)
