# TAGLINE

Generate translated documents from PO files

# TLDR

**Convert a translated PO file back to a document**

```po4a-translate -f [text] -m [path/to/master.doc] -p [path/to/result.po] -l [path/to/translated.txt]```

**Require at least 90% translation before generating output**

```po4a-translate -f [man] -m [path/to/master.1] -p [path/to/result.po] -l [path/to/translated.1] -k 90```

**Add a translator credits addendum to the output**

```po4a-translate -f [text] -m [path/to/master.doc] -p [path/to/result.po] -l [path/to/translated.txt] -a [path/to/addendum]```

**List all available formats**

```po4a-translate --help-format```

# SYNOPSIS

**po4a-translate** [_options_] **-f** _format_ **-m** _master_ **-p** _po_ **-l** _localized_

# PARAMETERS

**-f**, **--format** _format_
> Format of the master document (text, pod, man, sgml, xml, etc.)

**-m**, **--master** _file_
> Path to the original (master) document.

**-p**, **--po** _file_
> Path to the translated PO file.

**-l**, **--localized** _file_
> Output path for the translated document.

**-k**, **--keep** _percent_
> Minimum translation percentage required to produce output (default: 80).

**-a**, **--addendum** _file_
> Add supplementary content to the translated document (e.g., translator credits). Can be specified multiple times.

**-o**, **--option** _key=value_
> Pass extra parameters to the format plugin.

**-w**, **--width** _columns_
> Line wrapping column (default: 76). Use 0 or negative to disable wrapping.

**-M**, **--master-charset** _charset_
> Character set of the master document.

**-L**, **--localized-charset** _charset_
> Character set of the output document.

**-A**, **--addendum-charset** _charset_
> Character set of the addendum files.

**--help-format**
> List available document formats.

**-v**, **--verbose**
> Increase verbosity of output.

**-d**, **--debug**
> Output debugging information.

**-h**, **--help**
> Display help message.

**-V**, **--version**
> Show version information.

# DESCRIPTION

**po4a-translate** converts a translated PO file back into the original documentation format. It takes the master document and a PO file containing translations (typically created by po4a-gettextize), then produces a localized version of the document.

The tool is part of the **po4a** (PO for anything) suite, which helps maintain translations of documentation using the gettext methodology. This allows translators to work with PO files while the final output retains the original document format.

# CAVEATS

The PO file must be the translation of the POT file produced by **po4a-gettextize** from the same master document. By default, translation must be at least 80% complete to produce output; use **-k** to adjust this threshold. Formatting may differ slightly from the original depending on the document format.

# SEE ALSO

[po4a](/man/po4a)(1), [po4a-gettextize](/man/po4a-gettextize)(1), [po4a-updatepo](/man/po4a-updatepo)(1), [msgfmt](/man/msgfmt)(1), [xgettext](/man/xgettext)(1), [gettext](/man/gettext)(1)
