# TLDR

**Extract strings from C**

```xgettext -o [messages.pot] [*.c]```

**Extract from Python**

```xgettext -L Python -o [messages.pot] [*.py]```

**Extract with keyword**

```xgettext -k_ -o [messages.pot] [*.c]```

**Join with existing**

```xgettext -j -o [messages.pot] [*.c]```

**Add comments**

```xgettext --add-comments=TRANSLATORS -o [messages.pot] [*.c]```

**Set package info**

```xgettext --package-name=[MyApp] --package-version=[1.0] -o [messages.pot] [*.c]```

# SYNOPSIS

**xgettext** [_-L language_] [_-k keyword_] [_-o output_] [_options_] _files_

# PARAMETERS

**-o**, **--output** _FILE_
> Output file.

**-L**, **--language** _LANG_
> Source language.

**-k** _KEYWORD_
> Extraction keyword.

**-j**, **--join-existing**
> Append to existing.

**-c**, **--add-comments** _TAG_
> Extract comments.

**--package-name** _NAME_
> Package name.

**--from-code** _ENC_
> Source encoding.

# DESCRIPTION

**xgettext** extracts translatable strings. It creates .pot template files.

Language detection or specification. C, Python, Shell, PHP, etc.

Keywords identify translatable functions. _(), gettext(), N_().

Comments guide translators. Context and instructions preserved.

Output is POT format. Template for translations.

# CAVEATS

Part of gettext. Keywords must match code. Complex strings need care.

# HISTORY

**xgettext** is part of GNU **gettext**, the standard internationalization system. It enables software translation workflow.

# SEE ALSO

[msgfmt](/man/msgfmt)(1), [msginit](/man/msginit)(1), [msgmerge](/man/msgmerge)(1)
