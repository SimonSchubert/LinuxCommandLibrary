# TAGLINE

Maintain documentation translations via PO files

# TLDR

**Update PO files and translated documents from config file**

```po4a [path/to/config_file]```

**Force regeneration of all files**

```po4a -f [path/to/config_file]```

**Only update PO files, skip translated document generation**

```po4a --no-translations [path/to/config_file]```

**Set minimum translation percentage threshold**

```po4a -k [80] [path/to/config_file]```

# SYNOPSIS

**po4a** [_options_] _config_file_

# PARAMETERS

**-f**, **--force**
> Force processing even if files are up-to-date.

**-v**, **--verbose**
> Increase verbosity.

**-q**, **--quiet**
> Decrease verbosity.

**-d**, **--debug**
> Output debugging information.

**--no-translations**
> Don't generate translated documents, only update POT and PO files.

**--no-update**
> Don't update POT and PO files, only generate translations.

**-k**, **--keep** _threshold_
> Minimum translation percentage to produce output (default: 80).

**--keep-translations**
> Keep existing translations even if below threshold.

**--rm-translations**
> Remove translated files that fall below threshold.

**-o**, **--option** _opt_
> Extra options for format plugins.

**-M**, **--master-charset** _charset_
> Character encoding for source documents.

**-L**, **--localized-charset** _charset_
> Character encoding for translated documents.

**--srcdir** _dir_
> Base directory for input documents.

**--destdir** _dir_
> Base directory for output documents.

**--msgmerge-opt** _options_
> Additional options passed to msgmerge.

**-V**, **--version**
> Display version and exit.

# DESCRIPTION

**po4a** (PO for anything) maintains translations of documentation using gettext PO files. It extracts translatable strings from documents, manages PO files, and generates translated versions of documents.

The tool supports many documentation formats including man pages, POD, XML, and others. It automates the workflow of keeping translations synchronized with source documents.

# CAVEATS

Requires format-specific modules. Configuration file defines document mappings. PO files must exist or be created with po4a-gettextize. Complex documents may need manual tweaking.

# HISTORY

**po4a** was created by **Martin Quinson** to simplify documentation translation using the proven gettext workflow. It enables collaborative translation using standard PO editor tools.

# SEE ALSO

[po4a-gettextize](/man/po4a-gettextize)(1), [po4a-translate](/man/po4a-translate)(1), [po4a-updatepo](/man/po4a-updatepo)(1), [gettext](/man/gettext)(1), [msgfmt](/man/msgfmt)(1)
