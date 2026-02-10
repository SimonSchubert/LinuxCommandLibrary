# TAGLINE

edits ID3v2 tags in MP3 files

# TLDR

**Show ID3 tags**

```mid3v2 [file.mp3]```

**Set title**

```mid3v2 --title "[Song Title]" [file.mp3]```

**Set artist and album**

```mid3v2 --artist "[Artist]" --album "[Album]" [file.mp3]```

**Set track number**

```mid3v2 --track [5] [file.mp3]```

**Set year**

```mid3v2 --year [2024] [file.mp3]```

**Remove all tags**

```mid3v2 --delete-all [file.mp3]```

**Set cover art**

```mid3v2 --picture "[cover.jpg]" [file.mp3]```

**List all frames**

```mid3v2 --list [file.mp3]```

# SYNOPSIS

**mid3v2** [_--title text_] [_--artist text_] [_--album text_] [_options_] _files_

# PARAMETERS

**-t**, **--title** _TEXT_
> Set title (TIT2).

**-a**, **--artist** _TEXT_
> Set artist (TPE1).

**-A**, **--album** _TEXT_
> Set album (TALB).

**-T**, **--track** _NUM_
> Set track number (TRCK).

**-y**, **--year** _YEAR_
> Set year (TDRC).

**-g**, **--genre** _GENRE_
> Set genre (TCON).

**-c**, **--comment** _TEXT_
> Set comment (COMM).

**--picture** _FILE_
> Set cover art (APIC).

**-l**, **--list**
> List all tags.

**-D**, **--delete-all**
> Remove all tags.

**-d**, **--delete-frames** _FRAMES_
> Delete specific frames.

**--convert**
> Convert ID3v1 to ID3v2.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**mid3v2** edits ID3v2 tags in MP3 files. It's a Mutagen-based alternative to id3v2 with better Unicode and ID3v2.4 support.

The tool reads and writes ID3v2.3 and ID3v2.4 tags. It can convert legacy ID3v1 tags to the modern format. Unicode text is handled correctly.

Common tags have short options (--artist, --album, --title). Arbitrary ID3v2 frames can be set using frame identifiers like TPE2 (album artist) or TXXX (user-defined text).

Cover art embeds images in the audio file. JPEG and PNG formats are supported. Multiple pictures with different types (front, back, artist) can be added.

Batch processing handles multiple files with wildcards. Combined with shell scripting, entire music libraries can be tagged.

# CAVEATS

Only works with MP3 (ID3). For other formats use different tools. Large pictures increase file size. Some players prefer ID3v2.3 over v2.4.

# HISTORY

**mid3v2** is part of the **Mutagen** Python audio tagging library, created by **Michael Urman** and **Joe Wreschnig** around **2005**. It was designed to properly handle ID3v2.4 and Unicode, which older tools handled poorly.

# SEE ALSO

[id3v2](/man/id3v2)(1), [eyeD3](/man/eyeD3)(1), [ffmpeg](/man/ffmpeg)(1), [mutagen-inspect](/man/mutagen-inspect)(1)
