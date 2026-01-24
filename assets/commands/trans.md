# TLDR

**Translate text** to your default language

```trans "[text]"```

**Translate to a specific language**

```trans :[target_lang] "[text]"```

**Translate from one language to another**

```trans [source]:[target] "[text]"```

**Translate to multiple languages**

```trans :fr+de+es "[text]"```

**Brief mode** (show only translation)

```trans -b "[text]"```

**Listen to the translation** (text-to-speech)

```trans -p :[target] "[text]"```

**Identify the language** of text

```trans -id "[text]"```

**Start interactive mode**

```trans -shell```

# SYNOPSIS

**trans** [_options_] [_source_]:[_target_] [_text ..._]

# PARAMETERS

**-b**, **-brief**
> Brief mode; show only the translation.

**-d**, **-dictionary**
> Show dictionary definition of the word.

**-id**, **-identify**
> Identify the language of the text.

**-p**, **-play**
> Listen to translation via text-to-speech.

**-speak**
> Listen to the original text.

**-s**, **-source** _lang_
> Specify source language.

**-t**, **-target** _lang_
> Specify target language.

**-i**, **-input** _file_
> Read text from a file.

**-o**, **-output** _file_
> Write translation to a file.

**-shell**, **-interactive**
> Start an interactive translation shell.

**-e**, **-engine** _engine_
> Use a specific translation engine (google, bing, yandex, apertium).

**-T**, **-reference**
> Print reference table of all supported languages.

**-V**, **-version**
> Print version and exit.

**-H**, **-help**
> Print help message and exit.

# DESCRIPTION

**Translate Shell** (trans) is a command-line translator powered by Google Translate (default), Bing Translator, Yandex.Translate, and Apertium. It provides quick access to translation services from the terminal.

Language codes follow ISO 639 standards (e.g., en, fr, de, zh-CN, ja). The source language is auto-detected if not specified. Multiple target languages can be specified by joining codes with **+**.

Interactive mode (**-shell**) allows translating line by line. Audio playback requires mplayer, mpv, or mpg123. The tool can also function as a dictionary with the **-d** flag.

# CAVEATS

Requires internet connection and depends on external translation services. Heavy usage may trigger rate limiting. Audio playback requires a compatible audio player (mplayer, mpv, or mpg123) to be installed.

# HISTORY

Translate Shell was originally named "Google Translate CLI" and was created by **Mort Yao** (soimort). It was first released around **2012** to provide command-line access to Google Translate. The project was later renamed and expanded to support multiple translation engines including Bing, Yandex, and Apertium.

# SEE ALSO

[dict](/man/dict)(1), [espeak](/man/espeak)(1), [aspell](/man/aspell)(1)
