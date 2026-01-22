# TLDR

**Update** a PO file according to the modification of its origin file

```po4a-updatepo --format [text] --master [path/to/master.txt] --po [path/to/result.po]```

**List** available formats

```po4a-updatepo --help-format```

**Update** several PO files according to the modification of their origin file

```po4a-updatepo --format [text] --master [path/to/master.txt] --po [path/to/po1.po] --po [path/to/po2.po]```

# SYNOPSIS

**po4a-updatepo** [_options_] **-f** _format_ **-m** _master_ **-p** _po_ [**-p** _po2_ ...]

# PARAMETERS

**-f, --format _format_**
> Format of the master document (text, pod, man, sgml, xml, etc.)

**-m, --master _file_**
> Path to the master (original) document

**-p, --po _file_**
> Path to the PO file to update (can be specified multiple times)

**--help-format**
> List available document formats

**-M, --master-charset _charset_**
> Character set of the master document

**--previous**
> Keep previous msgid strings in PO file for reference

**--no-deprecation**
> Don't add deprecation comments

# DESCRIPTION

**po4a-updatepo** updates the translation PO files when the original master document changes. It extracts translatable strings from the current master document and merges them with existing translations, marking obsolete, fuzzy, and new strings appropriately.

The tool is part of the **po4a** (PO for anything) suite, which facilitates documentation translation using the gettext methodology. When the source document is modified, translators use this tool to synchronize their PO files and see which translations need updating.

# CAVEATS

Running this tool modifies the PO file in place. Backup your PO files before running if needed. Strings that changed slightly will be marked fuzzy and require translator review. The master document format must match the original format used to create the PO file.

# SEE ALSO

[po4a](/man/po4a)(1), [po4a-gettextize](/man/po4a-gettextize)(1), [po4a-translate](/man/po4a-translate)(1), [msgmerge](/man/msgmerge)(1)
