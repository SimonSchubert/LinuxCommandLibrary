# TLDR

**Start MusicBrainz Picard**

```picard```

**Open files**

```picard [file1.mp3] [file2.flac]```

**Open directory**

```picard [/path/to/music/]```

**Show version**

```picard --version```

**Debug mode**

```picard -d```

# SYNOPSIS

**picard** [_-d_] [_-c config_] [_-N_] [_options_] [_files_]

# PARAMETERS

**-d**, **--debug**
> Enable debug mode.

**-c** _FILE_, **--config-file** _FILE_
> Use specific config file.

**-N**, **--no-restore**
> Don't restore saved window state.

**-M**, **--no-player**
> Disable internal player.

**-P**, **--no-plugins**
> Disable plugins.

**-s** _PLUGIN_, **--stand-alone-instance** _PLUGIN_
> Run plugin standalone.

**--version**
> Show version.

**--help**
> Show help.

# DESCRIPTION

**picard** is MusicBrainz's music tagger application. It identifies music files using audio fingerprints and tags them with accurate metadata.

The application matches music against the MusicBrainz database, the largest open music encyclopedia. Fingerprinting identifies tracks even without existing tags.

Cluster mode groups files by album. Lookup queries MusicBrainz for matches. Scan uses AcoustID fingerprints for identification.

Cover art is downloaded automatically from various sources. Multiple artwork providers ensure good coverage.

Plugins extend functionality: additional tagging features, format support, and integration with other services.

The tagger handles various formats: MP3, FLAC, OGG, M4A, WMA, and more. Original files are modified in place or renamed according to patterns.

# CAVEATS

Requires internet for lookups. Matching accuracy depends on MusicBrainz coverage. Large collections take time to process. Some obscure releases may not be found.

# HISTORY

**MusicBrainz Picard** has been developed by the MusicBrainz community since **2003**. Named after the Star Trek character, it succeeded earlier tagging tools to become the official MusicBrainz tagger.

# SEE ALSO

[beets](/man/beets)(1), [kid3](/man/kid3)(1), [easytag](/man/easytag)(1), [mid3v2](/man/mid3v2)(1)
