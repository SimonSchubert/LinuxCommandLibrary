# TLDR

**Translate** text

```argos-translate --from [en] --to [es] "[Hello, world]"```

List **installed languages**

```argos-translate --list```

**Download** language package

```argos-translate-gui```

Translate from **file**

```argos-translate --from [en] --to [de] < [input.txt]```

# SYNOPSIS

**argos-translate** --from _lang_ --to _lang_ [_text_]

# DESCRIPTION

**argos-translate** is an open-source offline translation tool based on OpenNMT neural machine translation. It provides privacy-focused translation without sending data to external services.

The tool supports numerous language pairs through downloadable packages, enabling translation entirely on your local machine.

# PARAMETERS

**--from** _lang_
> Source language code

**--to** _lang_
> Target language code

**--list**
> List available languages

**-h**, **--help**
> Show help

# CAVEATS

Translation quality varies by language pair. Language packages must be downloaded before use. Resource-intensive for large documents. May not match commercial translation services.

# HISTORY

**Argos Translate** was developed as an open-source, privacy-respecting alternative to cloud translation services, using OpenNMT models for neural machine translation.

# SEE ALSO

[trans](/man/trans)(1), [translate-shell](/man/translate-shell)(1)
