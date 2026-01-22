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

**ppdpo** extracts translatable strings from PPD files. Creates PO files.

The tool supports localization. Part of CUPS.

ppdpo extracts strings.

# CAVEATS

CUPS specific. Creates gettext PO format.

# HISTORY

ppdpo is part of **CUPS** for PPD localization support.

# SEE ALSO

[ppdc](/man/ppdc)(1), [ppdmerge](/man/ppdmerge)(1), [gettext](/man/gettext)(1)

