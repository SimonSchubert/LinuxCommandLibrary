# TAGLINE

EXIF-based photo, video, and audio organizer

# TLDR

**Import** files into a destination library

```elodie.py import --destination=["/path/to/library"] ["/path/to/photos"]```

**Dry-run** an import (no changes)

```elodie.py import --dry-run --destination=["/path/to/library"] ["/path/to/photos"]```

**Import** and set location when EXIF lacks it

```elodie.py import --destination=["/path/to/library"] --location=["Las Vegas, NV"] ["/path/to/photos"]```

**Update** location EXIF and reorganize

```elodie.py update --location=["Las Vegas, NV"] [file.jpg]...```

**Update** capture time

```elodie.py update --time=["2015-04-15"] [file.jpg]...```

**Regenerate** checksum database

```elodie.py generate-db --source=["/path/to/library"]```

**Verify** library against bit rot

```elodie.py verify```

**Run** plugin batch operations (dry-run)

```elodie.py batch --dry-run```

# SYNOPSIS

**elodie.py** *command* [*options*] [*paths*...]

# DESCRIPTION

**Elodie** is a personal EXIF-based assistant for organizing photos, videos, and audio. It reads metadata (via **ExifTool**), copies media into a structured library, can update location/time/title/album tags, and optionally moves originals to the trash after import.

Primary entry point from the repository is **elodie.py** (run after **pip install -r requirements.txt** in a clone). Requires **ExifTool** on PATH (**exiftool -ver**); video features need ExifTool 10.20+, HEIC 11.50+, and geolocation-to-city translation 13.13+.

Library layout and naming are configurable via **~/.elodie/config.ini** (or **ELODIE_APPLICATION_DIRECTORY**). A **hash.json** under **~/.elodie/** tracks SHA-256 signatures for duplicate detection and **verify**.

# PARAMETERS

**import** [*paths*...]

> Copy media into **--destination** (required), reading EXIF. Options include **--source**, **--file**, **--album-from-folder**, **--trash**, **--allow-duplicates**, **--location**, **--time**, **--exclude-regex**, **--debug**, **--dry-run**.

**update** *files*...

> Update EXIF and reorganize. Options: **--album**, **--location**, **--time**, **--title**, **--debug**, **--dry-run**.

**generate-db**

> Rebuild **hash.json** from **--source** (required).

**batch**

> Run **batch()** for all plugins (**--debug**, **--dry-run**).

**verify**

> Check the library against stored checksums for bit rot.

Use **elodie.py** *command* **--help** for full option text.

# CONFIGURATION

Place **config.ini** in **~/.elodie/** (or under **ELODIE_APPLICATION_DIRECTORY**). Sections can define custom folder/file path templates and **[Exclusions]** patterns. Command-line **--exclude-regex** also skips paths at import time. **--location** / **--time** on import overwrite existing EXIF when provided; use them when data is missing or known wrong.

# CAVEATS

Depends on system ExifTool; missing or old ExifTool limits formats and geolocation. MapQuest integration is deprecated in favor of ExifTool. Always prefer **--dry-run** before bulk imports. Default import **copies** files; **--trash** moves sources after success.

# SEE ALSO

[exiftool](/man/exiftool)(1), [exif](/man/exif)(1), [rsync](/man/rsync)(1)

# RESOURCES

```[Source code](https://github.com/jmathai/elodie)```

<!-- verified: 2026-07-19 -->
