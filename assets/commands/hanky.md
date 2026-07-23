# TAGLINE

CLI and pipeline framework for loading flash cards into Anki

# TLDR

**Import a CSV** of cards into a deck (Basic note type by default)

```hanky pipe [words.csv] --into [english::vocab]```

**Import every matching file** under a directory into nested decks

```hanky pipe-dir [french/] ["*.csv"] -r```

**Override the Anki note type** / model name

```hanky pipe [cards.csv] -m [Basic] --into [deck]```

**Dry-run** processors without writing the collection

```hanky pipe [words.csv] --dry-run```

**Verbose report** of each processed card

```hanky pipe [words.csv] -v --into [deck]```

**Run a custom pipeline script** the same way as the hanky binary

```python3 [my_script.py] pipe [words.csv] --into [english::vocab]```

# SYNOPSIS

**hanky** **pipe** [**-m** _MODEL_] [**--into** _DECK_] [**--fail-fast**] [**--dry-run**] [**-v**] [**--args** _K=V_ ...] _file_

**hanky** **pipe-dir** [**-m** _MODEL_] [**-r**] [**--fail-fast**] [**--dry-run**] [**-v**] [**--args** _K=V_ ...] _dir_ _pattern_

# PARAMETERS

**pipe** _file_
> Load cards from a single file (**.csv**, **.json**, or a registered extension) and add them to Anki.

**pipe-dir** _dir_ _pattern_
> Load many files under _dir_ matching the glob _pattern_. Deck names are derived from relative paths (e.g. **french/animals.csv** → **french::animals**).

**-m** _MODEL_, **--model** _MODEL_
> Override the Anki model (note type) used for new cards. Standalone **hanky** defaults to **Basic**; pipeline scripts set the model in **HankyPipeline(...)**.

**--into** _DECK_
> Destination deck for **pipe**. Defaults to the input filename without extension.

**-r**, **--recursive**
> For **pipe-dir**, also descend into subdirectories.

**--fail-fast**
> Stop and raise on the first card that cannot be added instead of skipping and reporting at the end.

**--dry-run**
> Run card processors and report results without modifying the Anki collection (no decks, media, cards, or backup).

**-v**, **--verbose**
> Print each card dict after processors run, plus errors in the final report.

**--args** _K=V_
> Key=value pairs forwarded to custom card processors (pipeline scripts only). May be repeated.

# DESCRIPTION

**hanky** is a Python CLI and library that reads flash cards from files (or in-script sources), optionally transforms them through user-defined **card processors**, and writes notes into a local **Anki** collection. It is aimed at ETL-style workflows: scrape or OCR material, enrich fields (translations, examples, TTS audio), then bulk-load into decks.

Built-in **pipe** / **pipe-dir** commands work with CSV and JSON out of the box when column or key names match the target note type fields. For custom logic, install the package, write a small script that registers **@hanky.card_processor** functions on a **HankyPipeline**, and call **hanky.run()** so the same CLI surface is available as **python3 my_script.py pipe ...**. Processors may attach audio media via **CardMedia** (**.mp3**, **.oga**, **.opus**, **.wav**, **.weba**, **.aac**). Custom file loaders can be registered for formats such as Excel.

hanky only **adds** cards, media, and decks. Note types (models) must already exist in the collection; create them in the Anki UI first. Requires Python **3.11+** and a local Anki collection database. Not affiliated with AnkiWeb or the Anki project.

# CONFIGURATION

**~/.config/hanky/hanky.toml**
> Optional TOML config. Needed mainly if you do not use the default Anki profile (**User 1**) or you are on Windows.

**ANKI_DB_PATH**
> Path to the Anki collection SQLite file (**collection.anki2**). Defaults to the **User 1** profile under the platform Anki2 data directory.

**DO_SAFETY_CHECK**
> When true (default), refuse to open the collection if another process (e.g. Anki) appears to hold it.

**ALLOW_DUPLICATES**
> When false (default), skip cards that duplicate existing notes.

**BACKUP_FOLDER**
> Directory for collection backups before writes. Default: **~/.local/share/hanky/backups**.

A **Config** object passed to **HankyPipeline** in a script overrides file settings.

# CAVEATS

Close Anki (or disable the safety check only if you accept corruption risk) before writing the collection. Note types must pre-exist; hanky does not create models. Duplicate detection and field names depend on your note type. Windows and non-default profiles almost always need **ANKI_DB_PATH**. Custom processors that call external APIs (translation, TTS, vision) need their own credentials and dependencies.

# HISTORY

Written by **HBA** as an open-source Python package on PyPI under the MIT license. Provides both a **hanky** console script and a library API for programmable Anki import pipelines.

# SEE ALSO

[anki](/man/anki)(1), [python](/man/python)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/Haeata-Ash/hanky)```

<!-- verified: 2026-07-23 -->
