# TAGLINE

extracts internationalization messages from Angular templates

# TLDR

**Extract messages**

```ng extract-i18n```

**Extract to specific format**

```ng extract-i18n --format [xlf]```

**Extract to output path**

```ng extract-i18n --output-path [locale/]```

**Extract for specific project**

```ng extract-i18n --project [my-app]```

# SYNOPSIS

**ng extract-i18n** [_options_]

# PARAMETERS

**--format** _format_
> Output format (xlf, xlf2, xmb, json, arb).

**--output-path** _path_
> Output directory.

**--out-file** _file_
> Output filename.

**--project** _name_
> Project to extract from.

**--progress**
> Show progress.

# DESCRIPTION

**ng extract-i18n** extracts internationalization messages from Angular templates. Generates translation source files for localization workflow. Supports XLIFF, XMB, and JSON formats.

# SEE ALSO

[ng](/man/ng)(1), [ng-build](/man/ng-build)(1)

