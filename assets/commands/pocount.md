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

**pocount** counts translation statistics in PO files. Part of translate-toolkit.

The tool shows word and string counts. Reports translation progress.

pocount analyzes translations.

# CAVEATS

Requires PO format files. Part of translate-toolkit.

# HISTORY

pocount was created as part of **translate-toolkit** for translation statistics.

# SEE ALSO

[msgfmt](/man/msgfmt)(1), [pofilter](/man/pofilter)(1), [gettext](/man/gettext)(1)

