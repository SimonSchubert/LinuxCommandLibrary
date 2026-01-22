# TLDR

List **compiled locales**

```localedef --list-archive```

Display **help**

```localedef --help```

**Compile** a locale

```localedef -i [locale] -f [charmap] [output_path]```

# SYNOPSIS

**localedef** [_options_] _output_path_

# DESCRIPTION

**localedef** compiles locale definition files into binary locale data that can be used by the C library. It reads character map and locale definition files to create locale archives.

# PARAMETERS

**--list-archive**
> List locales in the archive

**-i, --inputfile FILE**
> Locale definition input file

**-f, --charmap FILE**
> Character map file

**-c, --force**
> Create output even with warnings

**--delete-from-archive**
> Delete locale from archive

**--add-to-archive**
> Add compiled locale to archive

**-?, --help**
> Display help information

# CAVEATS

Low-level tool; most users should use locale-gen instead. Incorrect locale definitions can cause application errors.

# SEE ALSO

[locale](/man/locale)(1), [locale-gen](/man/locale-gen)(8)
