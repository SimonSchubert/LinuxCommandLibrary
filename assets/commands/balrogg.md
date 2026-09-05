# TAGLINE

Lossless Ogg Vorbis and Ogg Opus recompressor

# TLDR

**Compress** an Ogg Vorbis or Opus file into a `.blr` archive

```balrogg e [track.ogg] [track.blr]```

**Expand** an archive back to the original bytes

```balrogg d [track.blr] [track.ogg]```

**Batch-compress** every remaining path (writes `[file].blr` beside each input)

```balrogg -b e [album/*.ogg]```

**Batch-expand** archives (strips the `.blr` suffix)

```balrogg -b d [album/*.blr]```

Show a **progress bar** while encoding at default effort (`-9`)

```balrogg --progress -9 e [music.ogg] [music.blr]```

Lower **effort** for faster encoding (through `-4` also changes the decoder)

```balrogg -4 e [music.ogg] [music.blr]```

Limit **parallel jobs** in batch mode

```balrogg -j [2] -b e [*.ogg] [*.opus]```

Print an archive's **header, tune, and stream lengths**

```balrogg dump [track.blr]```

Print every **Ogg page** and whether it can be reframed

```balrogg pages [track.ogg]```

# SYNOPSIS

**balrogg** [**-1**..**-9**] [**-p**] **e** _input_ _output_

**balrogg** [**-p**] **d** _input_ _output_

**balrogg** [**-1**..**-9**] [**-p**] [**-j** _N_] **-b** **e**|**d** _file_...

**balrogg** **dump** _archive_

**balrogg** **pages** _oggfile_

**balrogg** **-h**|**-v**

# DESCRIPTION

**balrogg** losslessly recompresses Ogg Vorbis and Ogg Opus files. Expanding an archive restores the original bytes. Typical savings are about 8-12% for `.ogg` and 3-8% for `.opus`.

Both **e** and **d** detect the codec from the input: encoding inspects the first Ogg page, decoding inspects the archive header. Files that cannot be reproduced exactly are refused.

Input and output must be seekable. Each file uses one thread. In batch mode, remaining arguments are processed in separate processes within CPU and memory limits, with larger inputs started first. Encoding writes _file_**.blr** beside each input; decoding strips that suffix, or appends **.out** when there is none.

# VERBS

**e**
> Compress _input_ to _output_. Refuses files it cannot reproduce exactly.

**d**
> Expand the archive _input_ to _output_.

**dump**
> Print an archive's header, tune, and stream lengths.

**pages**
> Print every page of an Ogg file and whether it can be reframed.

# PARAMETERS

**-1** .. **-9**
> Effort. **-9** is the default. Through **-4**, each level adds a residue-model stage and affects decoding. Above **-4** only the encoder's parameter search grows; decoding speed is the same from **-4** onward. Tuning evaluates the whole file and keeps the best candidate.

**-p**, **--progress**
> Show encoding, decoding, and individual Vorbis tuning progress bars on stderr. Off by default. The final phase reaches 100 percent only after the output is written. Batch mode uses separate lines labeled by input file.

**--progress-lines**
> Write progress checkpoints as separate lines, suitable for log files.

**-b**, **--batch**
> Treat every remaining argument as an input. Files run in separate processes. Remaining files continue after a refusal.

**-j**, **--jobs=**_N_
> Run _N_ files at once instead of measuring the machine. Used with **-b**.

**-h**, **--help**
> Print usage and exit.

**-v**, **--version**
> Print the version, build host, and source libopus release.

# ENVIRONMENT

**BLR_MEMCAP**
> Per-process memory cap in MiB. The default is **2048**. A value of **0** disables it. Sanitizer builds omit the cap.

**BLR_SIMD**
> Select the context-mixer kernel on x86. **scalar** forces the portable kernel; **sse2** refuses to run unless the SSE2 kernel is built and the CPU supports it. SSE2 is the default when CPUID reports it.

# EXIT STATUS

**0**
> Success.

**1**
> Malformed, unsupported, or unrecognized input. In batch mode, at least one file was refused and no higher status occurred.

**2**
> Usage error.

**3**
> A file could not be opened, read, or written.

**4**
> Internal error.

Batch mode returns the highest nonzero status reported by any file.

# CAVEATS

Archives are not backwards or forwards compatible until **v2.0**.

Opus mode supports one mono or stereo logical stream with channel mapping family 0. Packets, including OpusHead and OpusTags, are limited to 61,440 bytes. Chained and multichannel Opus files are refused.

Vorbis floor type 0 and codebook lookup type 2 are unsupported. Pages with bad checksums, invalid page sequences, unsupported Vorbis features, or files without a final end-of-stream page are refused.

# HISTORY

**balrogg** is a GNU GPL v3 tool by **Kamila Szewczyk**. Version **1.0** was released on **2026-09-03**. It losslessly recompresses Ogg Vorbis with adaptive context models (levels **-5** and above improve encoding without slowing decoding) and Ogg Opus using a parser derived from libopus.

# SEE ALSO

[opusenc](/man/opusenc)(1), [opusdec](/man/opusdec)(1), [flac](/man/flac)(1), [ffmpeg](/man/ffmpeg)(1)

# RESOURCES

```[Source code](https://github.com/iczelia/balrogg)```

<!-- verified: 2026-09-06 -->
