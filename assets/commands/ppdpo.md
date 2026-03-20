# TAGLINE

Extract translatable strings from PPD files

# TLDR

**Extract strings to a PO file**

```ppdpo -o [messages.po] [driver.drv]```

**Extract with an include directory**

```ppdpo -I [/path/to/includes] -o [strings.po] [file.drv]```

**Extract to macOS strings format**

```ppdpo -o [strings.strings] [file.drv]```

# SYNOPSIS

**ppdpo** [_options_] _source-file_

# PARAMETERS

_source-file_
> Input PPDC source file (.drv).

**-o** _output-file_
> Output file. Supported extensions: .po or .po.gz for GNU gettext format, .strings for macOS strings format.

**-D** _name[=value]_
> Set a named variable for use in the source file, equivalent to the #define directive.

**-I** _include-directory_
> Specify an alternate include directory. Can be used multiple times.

# DESCRIPTION

**ppdpo** extracts UI strings from PPDC source files and generates GNU gettext PO (Portable Object) files or macOS strings files for localization. The extracted strings include option names, group labels, and other user-visible text that translators can localize into different languages.

The resulting PO files follow standard gettext format and can be edited with translation tools like poedit or Weblate. Once translated, the localized strings are compiled back into PPD files using ppdc and ppdmerge.

# CAVEATS

CUPS specific. Deprecated and will be removed in a future release of CUPS.

# HISTORY

ppdpo is part of **CUPS** for PPD localization support.

# SEE ALSO

[ppdc](/man/ppdc)(1), [ppdmerge](/man/ppdmerge)(1), [ppdhtml](/man/ppdhtml)(1), [ppdi](/man/ppdi)(1), [gettext](/man/gettext)(1)

