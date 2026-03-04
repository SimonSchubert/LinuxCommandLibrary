# TAGLINE

Console-based bibliography manager

# TLDR

**Start** the TUI

```cobib```

**Initialize** a new database with git tracking

```cobib init --git```

**Add** an entry from a DOI

```cobib add --doi [10.1234/example]```

**Add** an entry from an arXiv ID

```cobib add --arxiv [1701.08213]```

**Import** entries from a BibTeX file

```cobib import --bibtex [references.bib]```

**List** entries sorted by year

```cobib list --sort year --reverse --limit 20```

**Search** case-insensitively with a filter

```cobib search --ignore-case "[quantum]" -- ++year [2024]```

**Export** to BibTeX

```cobib export --bibtex [output.bib]```

# SYNOPSIS

**cobib** [**-c** _CONFIG_] [**-v**] [_COMMAND_] [_ARGS_...]

# PARAMETERS

**-c**, **--config** _CONFIG_
> Path to configuration file.

**-v**, **--verbose**
> Increase verbosity.

# SUBCOMMANDS

**init** [**--git**]
> Initialize the database. Use **--git** to enable git tracking.

**add** [**--doi**|**--arxiv**|**--isbn**|**--bibtex**|**--url**|**--yaml** _SOURCE_] [**-l** _LABEL_] [**-f** _FILE_]
> Add a new bibliography entry from various sources.

**list** [**-s** _FIELD_] [**-r**] [**-l** _N_] [**-i**] [**-z** _N_] [_FILTER_...]
> List and filter database entries. Filters use **++FIELD** VALUE to include or **--FIELD** VALUE to exclude.

**search** [**-c** _N_] [**--skip-files**] _QUERY_ [**--** _FILTER_...]
> Search through entries with regex patterns.

**show** _LABEL_
> Display a single entry in BibTeX format.

**edit** _LABEL_
> Edit an entry in your editor.

**delete** [**-y**] _LABEL_...
> Remove entries. Use **-y** to skip confirmation.

**open** _LABEL_
> Open associated files for an entry.

**export** **--bibtex**|**--zip** [**--** _FILTER_...]
> Export entries to BibTeX or ZIP archive.

**import** **--bibtex** _FILE_
> Bulk import entries from a BibTeX file.

**review** [_FILTER_...]
> Interactive review workflow for entries.

**note** _LABEL_
> Open/edit notes for an entry.

**undo** / **redo**
> Undo/redo database changes (requires git integration).

**git** [_ARGS_...]
> Pass-through to git for the database repository.

**lint**
> Validate and check database entries.

# DESCRIPTION

**cobib** (Console Bibliography) is a bibliography management tool that stores references in a plain-text YAML database. It provides both a command-line interface and a TUI built on the Textual framework. The tool supports importing references from arXiv, DOI, ISBN, BibTeX, URL, and YAML sources, and can automatically download PDFs. The database can be tracked with git for version control, enabling undo/redo operations. Search supports regex, fuzzy matching, LaTeX and Unicode decoding, and full-text PDF search via ripgrep-all. A plugin system allows custom commands, importers, exporters, and parsers.

# CONFIGURATION

Configuration stored at **~/.config/cobib/config.py** (Python file). Can be overridden with **-c** flag or **COBIB_CONFIG** environment variable. Generate an example config with **cobib _example_config**.

# CAVEATS

Requires Python 3.10 or later. Windows support is experimental; WSL is recommended. Fuzzy matching requires the optional **regex** dependency. Full-text PDF search requires **ripgrep-all** (rga). The undo/redo commands require git integration to be enabled.

# HISTORY

**cobib** was created by **Max Rossmannek** in **June 2019** as an easy-to-use alternative to reference managers like Mendeley or Zotero. Written in Python under the MIT license. Version 4.0 introduced a TUI built on Textual. The latest version is 6.0.1 (October 2025), with over 1,420 commits and 66 releases.

# SEE ALSO

[bibtex](/man/bibtex)(1), [papis](/man/papis)(1), [zotero](/man/zotero)(1)
