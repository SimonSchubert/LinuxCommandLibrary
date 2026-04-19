# TAGLINE

free lossless audio codec encoder and decoder

# TLDR

**Encode WAV to FLAC**

```flac [audio.wav]```

**Decode FLAC to WAV**

```flac -d [audio.flac]```

**Maximum compression**

```flac -8 [audio.wav]```

**Fast compression**

```flac --fast [audio.wav]```

**Test file integrity**

```flac -t [audio.flac]```

**Add metadata tags** during encoding

```flac -T "ARTIST=[Name]" -T "TITLE=[Song]" [audio.wav]```

**Output to specific file**

```flac -o [output.flac] [input.wav]```

# SYNOPSIS

**flac** [_options_] _files_...

# DESCRIPTION

**flac** encodes and decodes audio in the Free Lossless Audio Codec format. FLAC provides lossless compression, meaning the audio is identical to the original after decoding.

The tool handles encoding, decoding, testing, and metadata operations. FLAC files are typically 50-60% of the original size while maintaining perfect audio fidelity.

# PARAMETERS

**-d**, **--decode**
> Decode FLAC to WAV.

**-t**, **--test**
> Test file integrity.

**-a**, **--analyze**
> Analyze file.

**-0** to **-8**
> Compression level (0=fast, 8=best).

**--fast**
> Same as -0.

**--best**
> Same as -8.

**-o** _file_
> Output file name.

**-c**, **--stdout**
> Write output to stdout.

**-f**, **--force**
> Force overwriting of output files.

**-T**, **--tag=** _FIELD=VALUE_
> Add a Vorbis comment tag (may be repeated).

**--tag-from-file=** _FIELD=FILENAME_
> Read the tag value from a file.

**--delete-input-file**
> Delete input after successful encoding/decoding.

**-s**, **--silent**
> Suppress runtime statistics.

**-V**, **--verify**
> Verify by decoding in parallel during encoding.

**-w**, **--warnings-as-errors**
> Treat all warnings as errors.

# CAVEATS

Higher compression levels slower but not much smaller. Decoding speed consistent regardless of level. Some players don't support all FLAC features.

# HISTORY

**FLAC** was created by **Josh Coalson** starting in **2000**. It became the leading open source lossless audio format, gaining support in most media players and devices. The project became part of the Xiph.Org Foundation alongside Ogg Vorbis.

# SEE ALSO

[sox](/man/sox)(1), [lame](/man/lame)(1), [ffmpeg](/man/ffmpeg)(1), [metaflac](/man/metaflac)(1)
