# TLDR

**Merge PPD files**

```ppdmerge -o [output.ppd] [file1.ppd] [file2.ppd]```

**Merge multiple language versions**

```ppdmerge -o [combined.ppd] [en.ppd] [de.ppd] [fr.ppd]```

# SYNOPSIS

**ppdmerge** [_options_] _files_

# PARAMETERS

_FILES_
> Input PPD files.

**-o** _FILE_
> Output file name.

# DESCRIPTION

**ppdmerge** merges multiple PPD files. Combines language variants.

The tool creates multi-language PPD. Part of CUPS.

ppdmerge combines PPD files.

# CAVEATS

CUPS specific. For language localization.

# HISTORY

ppdmerge is part of **CUPS** for PPD file merging.

# SEE ALSO

[ppdc](/man/ppdc)(1), [ppdi](/man/ppdi)(1), [cups](/man/cups)(1)

