# TAGLINE

Merge multiple PPD printer files

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
> Output file name. If not specified, the merged PPD file is written to standard output.

# DESCRIPTION

**ppdmerge** merges multiple PPD (PostScript Printer Description) files into a single multi-language PPD file. This is primarily used to combine localized versions of a printer driver so that a single PPD file supports multiple languages, with CUPS selecting the appropriate translation based on the user's locale.

The input files should be variants of the same printer definition differing only in their translated strings. The merged output contains all language variants, reducing the number of PPD files that need to be distributed and installed. ppdmerge does not check whether the merged PPD files are for the same device; merging different device PPDs will yield unpredictable results.

# CAVEATS

Deprecated. PPD files and ppdmerge will be removed in a future release of CUPS.

# HISTORY

ppdmerge is part of **CUPS** for PPD file merging.

# SEE ALSO

[ppdc](/man/ppdc)(1), [ppdi](/man/ppdi)(1), [ppdhtml](/man/ppdhtml)(1), [ppdpo](/man/ppdpo)(1), [cups](/man/cups)(1)

