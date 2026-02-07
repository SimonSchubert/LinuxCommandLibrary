# TAGLINE

Music library manager and metadata organizer

# TLDR

**Import** music from a directory and tag from MusicBrainz

```beet import [path/to/directory]```

**Import a single song** to the library

```beet import -s [path/to/file]```

**Query** the library

```beet list [query]```

Show **entire library statistics**

```beet stats```

Show **statistics** for a specific query

```beet stats [query]```

# SYNOPSIS

**beet** _command_ [_options_] [_arguments_]

# DESCRIPTION

**beet** (beets) is a command-line music library manager and metadata organizer. It automatically fetches metadata from MusicBrainz, organizes music files, and provides a powerful query interface.

Beets can fix tags, rename files based on metadata, fetch album art, and integrate with plugins for additional functionality like playback, web interface, and format conversion.

# SUBCOMMANDS

**import**
> Add music to the library with automatic tagging

**list** (or **ls**)
> Query the music library

**stats**
> Display library statistics

**update**
> Update the library when files change

**remove** (or **rm**)
> Remove items from the library

**move** (or **mv**)
> Move or rename files in the library

**write**
> Write metadata changes to files

# PARAMETERS

**-s, --singletons**
> Import files as singletons (not as album tracks)

**-A, --noautotag**
> Do not attempt to automatically tag

**-l, --library** _path_
> Specify the library database location

**-c, --config** _path_
> Specify the configuration file

# CONFIGURATION

**~/.config/beets/config.yaml**
> Main configuration file for library paths, import behavior, plugins, and metadata preferences.

# CAVEATS

Initial library import of large collections can be time-consuming. MusicBrainz queries have rate limits. Configuration file should be set up for optimal behavior.

# HISTORY

**beets** was created by Adrian Sampson and first released in **2010**. It has grown into a comprehensive music library manager with an active plugin ecosystem.

# SEE ALSO

[id3v2](/man/id3v2)(1), [mp3info](/man/mp3info)(1), [puddletag](/man/puddletag)(1)
