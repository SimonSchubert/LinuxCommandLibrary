# TAGLINE

Offline neural machine translation

# TLDR

**Translate** text between languages

```argos-translate --from-lang [en] --to-lang [es] "[Hello, world]"```

**Pipe input** for translation

```echo "[Text]" | argos-translate --from-lang [en] --to-lang [de]```

**Translate from a file**

```argos-translate --from-lang [en] --to-lang [fr] < [input.txt]```

**Install** a language package (via argospm)

```argospm install translate-[en]_[es]```

**List installed** language packages

```argospm list```

**Update** the package index and **search** available packages

```argospm update && argospm search --from-lang [en]```

# SYNOPSIS

**argos-translate** **--from-lang** _code_ **--to-lang** _code_ [_text_]

**argospm** _subcommand_ [_options_]

# DESCRIPTION

**argos-translate** is an open-source, offline translation tool based on OpenNMT neural machine translation models. It runs entirely on the local machine, providing privacy-preserving translation without sending data to cloud services.

Languages are provided as downloadable packages named **translate-_from_\__to_** (e.g. `translate-en_es`). Packages are managed with the companion **argospm** command, which supports update, search, install, list, and remove subcommands.

# PARAMETERS

**-f** _code_, **--from-lang** _code_
> ISO 639-1 source language code (e.g. `en`, `es`, `fr`).

**-t** _code_, **--to-lang** _code_
> ISO 639-1 target language code.

**-h**, **--help**
> Show help and exit.

# CAVEATS

Language packages must be installed via **argospm** before translation works. Translation quality varies by language pair and may not match commercial services. First-run translations are slower due to model loading; subsequent calls in the same process are faster. Large documents are memory- and CPU-intensive.

# HISTORY

**Argos Translate** was created by Argos Open Tech as an open-source, privacy-respecting alternative to cloud translation services, using CTranslate2 and OpenNMT models. It also powers the self-hosted LibreTranslate web API.

# SEE ALSO

[trans](/man/trans)(1)
