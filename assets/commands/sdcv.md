# TAGLINE

Console dictionary using StarDict format

# TLDR

**Look up word**

```sdcv [word]```

**Look up with specific dictionary**

```sdcv -u "[dictionary_name]" [word]```

**List available dictionaries**

```sdcv -l```

**Non-interactive mode**

```sdcv -n [word]```

**Show exact matches only**

```sdcv -e [word]```

**Use data directory**

```sdcv --data-dir [/path/to/dicts] [word]```

**JSON output**

```sdcv --json [word]```

# SYNOPSIS

**sdcv** [_-u dict_] [_-n_] [_-e_] [_--data-dir dir_] [_options_] [_word_]

# PARAMETERS

**-l**, **--list-dicts**
> List available dictionaries.

**-u** _DICT_
> Use specific dictionary.

**-n**, **--non-interactive**
> Non-interactive mode.

**-e**, **--exact-search**
> Exact matches only.

**-f**, **--fuzzy-search**
> Fuzzy search.

**--data-dir** _DIR_
> Dictionary data directory.

**--json**
> JSON output.

**--color**
> Colored output.

**--utf8-input**
> UTF-8 input.

**--utf8-output**
> UTF-8 output.

**-h**, **--help**
> Show help.

# DESCRIPTION

**sdcv** (StarDict console version) provides command-line dictionary lookup. It uses StarDict format dictionaries, which are widely available.

Dictionaries are stored in ~/.stardict/dic or system directories. Many languages and specialized dictionaries are available for download.

Interactive mode provides a prompt for multiple lookups. Non-interactive mode suits scripting and integration.

Fuzzy search finds similar words when exact matches fail. This helps with spelling variations or typos.

Multiple dictionaries can be searched simultaneously. Results from all are shown unless a specific dictionary is selected.

Output formatting supports terminal display and programmatic processing. JSON output enables integration with other tools.

# CONFIGURATION

**~/.stardict/dic/**
> Default user dictionary directory where StarDict format dictionaries are stored.

**/usr/share/stardict/dic/**
> System-wide dictionary directory.

**STARDICT_DATA_DIR**
> Environment variable overriding the default dictionary data directory.

# CAVEATS

Requires dictionary files to be installed. Quality varies by dictionary. Some dictionaries are large. Character encoding issues possible.

# HISTORY

**sdcv** is the console version of **StarDict**, an open-source dictionary project started in **2003** by **Hu Zheng**. StarDict became popular for its cross-platform GUI, and sdcv extended it to command-line users.

# SEE ALSO

[dict](/man/dict)(1), [dictd](/man/dictd)(8), [espeak](/man/espeak)(1)
