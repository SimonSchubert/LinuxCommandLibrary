# TAGLINE

Extract translatable strings from source code

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

**xgettext** extracts translatable strings from source code files and produces Portable Object Template (.pot) files used in the GNU gettext internationalization workflow. It scans source files for function calls that mark strings for translation, such as **_()**, **gettext()**, and **N_()**, and collects them into a template that translators can use as a starting point.

The tool supports a wide range of programming languages including C, C++, Python, Shell, PHP, Java, Perl, and many others. It can auto-detect the source language from file extensions or accept an explicit language specification via the **-L** option. Custom extraction keywords can be defined with **-k** to match project-specific translation functions.

The output .pot file preserves source file locations, translator comments (extracted with **--add-comments**), and message context. This template serves as the basis for creating language-specific .po files with **msginit** and keeping them updated with **msgmerge** as the source code evolves.

# CAVEATS

Part of gettext. Keywords must match code. Complex strings need care.

# HISTORY

**xgettext** is part of GNU **gettext**, the standard internationalization system. It enables software translation workflow.

# SEE ALSO

[msgfmt](/man/msgfmt)(1), [msginit](/man/msginit)(1), [msgmerge](/man/msgmerge)(1)
