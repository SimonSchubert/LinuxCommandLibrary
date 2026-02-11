# TAGLINE

Extract translatable strings from PPD files

# TLDR

**Extract strings for translation**

```ppdpo -o [messages.po] [driver.drv]```

**Extract from PPD file**

```ppdpo -o [strings.po] [file.ppd]```

# SYNOPSIS

**ppdpo** [_options_] _files_

# PARAMETERS

_FILES_
> Input PPD or driver files.

**-o** _FILE_
> Output PO file.

# DESCRIPTION

**ppdpo** extracts translatable strings from CUPS PPD files or driver source files (.drv) and generates GNU gettext PO (Portable Object) files for localization. The extracted strings include option names, group labels, and other user-visible text that translators can localize into different languages.

The resulting PO files follow standard gettext format and can be edited with translation tools like poedit or Weblate. Once translated, the localized strings are compiled back into PPD files using ppdc and ppdmerge.

# CAVEATS

CUPS specific. Creates gettext PO format.

# HISTORY

ppdpo is part of **CUPS** for PPD localization support.

# SEE ALSO

[ppdc](/man/ppdc)(1), [ppdmerge](/man/ppdmerge)(1), [gettext](/man/gettext)(1)

