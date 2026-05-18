# TAGLINE

build, split, and tag M4B audiobooks from MP3 or other audio sources

# TLDR

**Merge a folder of MP3s** into an M4B with chapters

```m4b-tool merge [folder/] --output-file=[audiobook.m4b]```

**Split an audiobook** by chapters into separate files

```m4b-tool split --audio-format=mp3 [audiobook.m4b]```

**Refresh embedded chapter** markers

```m4b-tool chapters --adjust-by-silence [audiobook.m4b]```

**Merge with full metadata**

```m4b-tool merge [folder/] --output-file=[book.m4b] --name="[Title]" --artist="[Author]" --album="[Series]"```

**Convert a single MP3** to M4B

```m4b-tool merge [file.mp3] --output-file=[file.m4b]```

**Add a cover image** to an existing file

```m4b-tool meta --cover=[cover.jpg] [audiobook.m4b]```

# SYNOPSIS

**m4b-tool** _command_ [_options_] [_input_]

# PARAMETERS

**merge**
> Combine multiple input files into one M4B with chapters preserved.

**split**
> Split an M4B by chapter into one file per chapter.

**chapters**
> Inspect, generate, or rewrite chapter markers (supports **--adjust-by-silence**).

**meta**
> Read or update tags such as title, artist, cover art, and description.

**--output-file** _FILE_
> Path to the output file (M4B).

**--audio-format** _FORMAT_
> Output audio format for **split** (m4b, m4a, mp3, ...).

**--name** _TITLE_
> Book or album title.

**--artist** _NAME_
> Author or narrator name.

**--album** _TEXT_
> Album/series name.

**--cover** _FILE_
> Embed a cover image (JPEG or PNG).

**--jobs** _N_
> Number of parallel encoding jobs.

**--no-cache**
> Disable caching of intermediate analysis results.

# DESCRIPTION

**m4b-tool** is a PHP-based command-line wrapper around **ffmpeg** and **mp4v2** that creates, splits, retags, and inspects M4B audiobook files. The **merge** subcommand concatenates a directory of audio files (MP3, M4A, WAV, FLAC, etc.) into a single AAC-encoded M4B, automatically inserting chapter markers based on the order of input files or an accompanying **chapters.txt**.

The **split** subcommand reverses the process, exporting each chapter as a separate file in a chosen format. **chapters** allows inspecting or rewriting the chapter table, optionally aligning markers to detected silences with **--adjust-by-silence** for better playback experience. **meta** edits ID3/MP4 tags and can embed cover artwork.

A persistent cache speeds up repeated runs across the same files; disable it with **--no-cache** when input changes are not being detected.

# CAVEATS

Requires **ffmpeg** and **mp4v2** binaries on PATH plus a working **PHP 7.4+** runtime. Encoding quality is governed by ffmpeg flags; high-bitrate libfdk_aac builds give the best results. Long audiobooks can take significant CPU and disk space for the merge stage.

# HISTORY

**m4b-tool** was written by **Andreas Sandberg** (sandreas) and is distributed under the MIT license. It became popular as an open-source alternative to commercial M4B builders, particularly for Linux users who maintain audiobook libraries with Audiobookshelf or Plex.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [mp4box](/man/mp4box)(1), [sox](/man/sox)(1)
