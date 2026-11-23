# TAGLINE

build, split, and tag M4B audiobooks from MP3 or other audio sources

# TLDR

**Merge a folder of MP3s** into an M4B with chapters

```m4b-tool merge [folder/] --output-file=[audiobook.m4b]```

**Split an audiobook** by chapters into separate files

```m4b-tool split --audio-format mp3 --audio-bitrate 96k [audiobook.m4b]```

**Adjust misplaced chapter** marks via silence detection

```m4b-tool chapters --adjust-by-silence -o [fixed.m4b] [audiobook.m4b]```

**Batch merge** a whole library using directory patterns, 4 jobs in parallel

```m4b-tool merge --jobs=4 --batch-pattern="[input/%a/%s/%p - %n/]" --output-file=[output/] [input/]```

**Merge with full metadata**

```m4b-tool merge [folder/] --output-file=[book.m4b] --name="[Title]" --artist="[Author]" --album="[Series]"```

**Convert a single MP3** to M4B

```m4b-tool merge [file.mp3] --output-file=[file.m4b]```

**Export** cover, description and chapters of an existing file

```m4b-tool meta --export-all [audiobook.m4b]```

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
> View and change metadata of a single file; import or export cover, description, chapters, ffmetadata and cue sheets (**--import-all**, **--export-all**, ...).

**-o**, **--output-file** _FILE_
> Path to the output file (or directory with **--batch-pattern**).

**--audio-format** _FORMAT_
> Output format ffmpeg creates (default **m4b**).

**--audio-bitrate** _RATE_, **--audio-channels** _N_, **--audio-samplerate** _HZ_
> Encoding parameters, e.g. **64k**, **1**, **22050**.

**--no-conversion**
> Skip re-encoding; the output keeps the source encoding.

**--name** _TITLE_
> Book or album title.

**--artist** _NAME_
> Author or narrator name.

**--album** _TEXT_
> Album/series name.

**--cover** _FILE_
> Embed a cover image (JPEG or PNG); **cover.jpg** in the input folder is used automatically.

**--series** _NAME_, **--series-part** _N_
> Series pseudo tags used to build the sort order.

**--use-filenames-as-chapters**
> Name chapters after the input files instead of their title tags.

**--batch-pattern** _PATTERN_
> Merge every audiobook in a directory tree matching placeholders like **%a** (author), **%n** (name), **%s** (series), **%p** (series part).

**-f**, **--force**
> Overwrite existing files.

**--jobs** _N_
> Number of parallel encoding jobs.

**--no-cache**
> Clear the cache completely before doing anything.

# DESCRIPTION

**m4b-tool** is a PHP-based command-line wrapper around **ffmpeg** and **mp4v2** that creates, splits, retags, and inspects M4B audiobook files. The **merge** subcommand concatenates a directory of audio files (MP3, M4A, OGG, FLAC, WAV, etc.) into a single AAC-encoded M4B, creating one chapter per input file from its title tag, or loading chapter names from **chapters.txt** or MusicBrainz (**--musicbrainz-id**).

The **split** subcommand reverses the process, exporting each chapter as a separate file in a chosen format, or splitting a FLAC album via its cue sheet. **chapters** allows inspecting or rewriting the chapter table, optionally aligning markers to detected silences with **--adjust-by-silence** for better playback experience. **meta** edits ID3/MP4 tags and can embed cover artwork.

A persistent cache speeds up repeated runs across the same files; clear it with **--no-cache** when input changes are not being detected.

# CAVEATS

Requires **ffmpeg** and the **mp4v2** tools (**mp4chaps**, **mp4art**, **mp4tags**) on PATH plus a **PHP** runtime with the **mbstring** extension; **fdkaac** is optional for high-efficiency AAC at low bitrates. The official Docker image bundles all dependencies. Long audiobooks can take significant CPU and disk space for the merge stage.

# HISTORY

**m4b-tool** was written by **Andreas** (GitHub: **sandreas**), first published in **2017**, and is distributed under the MIT license. The author has since started **tone**, a C# successor experiment, while continuing m4b-tool. It became popular as an open-source alternative to commercial M4B builders, particularly for Linux users who maintain audiobook libraries with Audiobookshelf or Plex.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [mp4box](/man/mp4box)(1), [sox](/man/sox)(1)

# RESOURCES

```[Source code](https://github.com/sandreas/m4b-tool)```

<!-- verified: 2026-11-23 -->
