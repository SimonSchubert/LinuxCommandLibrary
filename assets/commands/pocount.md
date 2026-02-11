# TAGLINE

Count translation statistics in PO files

# TLDR

**Count translation statistics**

```pocount [file.po]```

**Count multiple files**

```pocount [*.po]```

**Short format output**

```pocount --short [file.po]```

**CSV output**

```pocount --csv [file.po]```

# SYNOPSIS

**pocount** [_options_] [_files_]

# PARAMETERS

_FILES_
> PO translation files.

**--short**
> Short summary format.

**--csv**
> CSV output format.

**--incomplete**
> Only show incomplete files.

**--full**
> Full detailed output.

# DESCRIPTION

**pocount** counts translation statistics in PO (Portable Object) files, reporting the number of translated, fuzzy, and untranslated strings and words. It provides a quick overview of translation progress for localization projects.

Output can be formatted as a short summary (**--short**), CSV (**--csv**), or full detail (**--full**). The **--incomplete** flag filters to only show files that still need translation work. Part of the **translate-toolkit** suite.

# CAVEATS

Requires PO format files. Part of translate-toolkit.

# HISTORY

pocount was created as part of **translate-toolkit** for translation statistics.

# SEE ALSO

[msgfmt](/man/msgfmt)(1), [pofilter](/man/pofilter)(1), [gettext](/man/gettext)(1)

