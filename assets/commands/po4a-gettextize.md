# TLDR

**Convert** a text file to PO format

```po4a-gettextize --format [text] --master [path/to/master.txt] --po [path/to/result.po]```

**List** all available formats

```po4a-gettextize --help-format```

**Convert** a text file along with a translated document to a PO file

```po4a-gettextize --format [text] --master [path/to/master.txt] --localized [path/to/translated.txt] --po [path/to/result.po]```

# SYNOPSIS

**po4a-gettextize** [_options_] **-f** _format_ **-m** _master_ **-p** _po_

# PARAMETERS

**-f, --format _format_**
> Format of the master document (text, pod, man, sgml, xml, etc.)

**-m, --master _file_**
> Path to the original (master) document

**-p, --po _file_**
> Output path for the generated PO file

**-l, --localized _file_**
> Existing translation (can be specified multiple times)

**--help-format**
> List available document formats

**-M, --master-charset _charset_**
> Character set of the master document

**-L, --localized-charset _charset_**
> Character set of the localized document

# DESCRIPTION

**po4a-gettextize** extracts translatable strings from a documentation file and creates a PO (Portable Object) file suitable for translation. It is part of the **po4a** (PO for anything) suite that enables using gettext methodology for documentation translation.

If an existing translation is provided with the **-l** option, the tool attempts to match translated strings with the original and pre-populate the PO file with existing translations.

# CAVEATS

The output PO file should be reviewed by translators as automatic matching may not be perfect. When providing an existing translation, both documents must have the same structure for proper alignment.

# SEE ALSO

[po4a](/man/po4a)(1), [po4a-translate](/man/po4a-translate)(1), [po4a-updatepo](/man/po4a-updatepo)(1), [msginit](/man/msginit)(1)
