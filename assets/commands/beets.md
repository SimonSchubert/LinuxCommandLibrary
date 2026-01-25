# TLDR

**Import music into your library**

```beet import [path/to/music]```

**Import without auto-tagging**

```beet import -A [path/to/music]```

**List all albums**

```beet ls -a```

**Search for tracks**

```beet ls [artist:beatles]```

**Update library statistics**

```beet stats```

**Move files to match library organization**

```beet move```

**Modify metadata**

```beet modify [query] [field=value]```

**Fetch missing album art**

```beet fetchart```

# SYNOPSIS

**beet** _command_ [_options_] [_query_]

# PARAMETERS

**import** [_path_]
> Import music files into the library.

**ls** [_query_]
> List tracks or albums matching query.

**modify** _query_ _field=value_
> Modify metadata for matching items.

**move** [_query_]
> Move files to match configured paths.

**rm** _query_
> Remove items from the library.

**update** [_query_]
> Update library from file changes.

**stats**
> Show library statistics.

**-a**, **--album**
> Operate on albums instead of tracks.

**-f**, **--format** _template_
> Custom output format.

**-A**, **--noautotag**
> Skip automatic tagging during import.

# QUERY SYNTAX

**artist:name**: Match artist field
**album:name**: Match album field
**year:2020**: Match year
**year:2018..2022**: Year range
**bitrate:320..**: Minimum bitrate
**path:/music/**: Match file path

# DESCRIPTION

**beets** is a music library manager and organizer that automatically tags, organizes, and manages music collections. It queries online databases like MusicBrainz to identify albums and correct metadata.

During import, beets identifies albums, fixes metadata, downloads album art, and moves files into a structured directory hierarchy. The query system allows powerful searches and bulk modifications across the library.

The plugin system extends functionality with features like fetching lyrics, managing play counts, converting formats, and integrating with music players. Configuration is stored in **~/.config/beets/config.yaml**.

# PLUGINS

**fetchart**: Download album artwork
**lyrics**: Fetch song lyrics
**lastgenre**: Get genres from Last.fm
**convert**: Transcode to different formats
**duplicates**: Find duplicate tracks
**web**: Web interface for browsing

# CAVEATS

Initial import of large libraries can be time-consuming due to online lookups. Automatic matching may fail for obscure releases or poorly-tagged files. The database must be kept in sync with actual files; moving files outside beets can cause inconsistencies.

# HISTORY

Beets was created by **Adrian Sampson** starting in **2010** as a research project while pursuing a PhD in computer science. It grew from a personal tool into a comprehensive music management system. The project has been open source since inception and benefits from community-contributed plugins. It remains one of the most capable command-line music library managers available.

# SEE ALSO

[mpd](/man/mpd)(1), [kid3](/man/kid3)(1), [picard](/man/picard)(1), [metaflac](/man/metaflac)(1)
