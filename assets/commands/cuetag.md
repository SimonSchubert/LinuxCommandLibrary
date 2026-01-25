# TLDR

**Tag FLAC files from CUE sheet**

```cuetag [album.cue] [track*.flac]```

**Tag specific tracks**

```cuetag [album.cue] [track01.flac] [track02.flac]```

**Tag Ogg Vorbis files**

```cuetag [album.cue] [track*.ogg]```

**Tag MP3 files** (requires id3v2)

```cuetag [album.cue] [track*.mp3]```

# SYNOPSIS

**cuetag** _file.cue_ _audiofile_...

# DESCRIPTION

**cuetag** transfers metadata from a CUE sheet to audio files. It reads track information (title, performer, ISRC, etc.) from the CUE sheet and writes appropriate tags to the corresponding audio files.

The tool automatically detects file format and uses the appropriate tagging method: metaflac for FLAC, vorbiscomment for Ogg Vorbis, and id3v2/id3tag for MP3. Files must be named so that track order matches (typically from shnsplit output).

Tags transferred include: title, artist/performer, album, track number, genre, date, and ISRC codes if present in the CUE sheet.

# SUPPORTED FORMATS

**FLAC**: Uses metaflac (standard tags)
**Ogg Vorbis**: Uses vorbiscomment
**MP3**: Uses id3v2 or id3tag

# EXAMPLE WORKFLOW

```bash
# Split single FLAC using CUE breakpoints
cuebreakpoints album.cue | shnsplit -o flac album.flac

# Tag the resulting files
cuetag album.cue split-track*.flac

# Rename using tags
for f in split-track*.flac; do
  title=$(metaflac --show-tag=TITLE "$f" | cut -d= -f2)
  track=$(metaflac --show-tag=TRACKNUMBER "$f" | cut -d= -f2)
  mv "$f" "$(printf '%02d' $track) - $title.flac"
done
```

# CAVEATS

Requires format-specific tagging tools installed (metaflac, vorbiscomment, id3v2). Files must be in the same order as CUE sheet tracks. CUE sheets with limited metadata produce sparse tags. Encoding issues may occur with non-ASCII characters.

# HISTORY

cuetag is part of **cuetools**, a collection of utilities for working with CUE sheet files. The tools were created by **Svend Sorensen** to facilitate working with CD images and their metadata. They remain essential for processing single-file album rips into tagged individual tracks.

# SEE ALSO

[cuebreakpoints](/man/cuebreakpoints)(1), [shnsplit](/man/shnsplit)(1), [metaflac](/man/metaflac)(1), [id3v2](/man/id3v2)(1)
