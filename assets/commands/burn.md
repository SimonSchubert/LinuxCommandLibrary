# TAGLINE

Console front-end for burning Data, Audio, ISO and copy CDs

# TLDR

**Burn a data CD** from a directory tree

```burn -D -p [path/to/dir]```

**Burn an ISO image** to disc

```burn -I -n [image.iso]```

**Create an audio CD** from MP3, Ogg, or WAV files

```burn -A -a [track1.mp3] -a [track2.wav]```

**Copy a CD** on the fly

```burn -C```

**Simulate** a burn without actually writing

```burn -D -s -p [path/to/dir]```

**Burn a multisession data CD**

```burn -D -m -p [path/to/dir]```

# SYNOPSIS

**burn** _MAIN_MODE_ [_options_]... [_file/s_]...

# PARAMETERS

**-D**, **--data-cd**
> Create a Data-CD from files and directories.

**-I**, **--iso-cd**
> Burn an existing ISO image to disc.

**-C**, **--copy-cd**
> Copy a CD, optionally on the fly.

**-A**, **--audio-cd**
> Create an audio CD from MP3, Ogg, or WAV input files.

**-s**, **--simulate**
> Perform a burn simulation (no laser write); useful for testing media and pipeline.

**-p**, **--path** _path_
> Add the contents of _path_ to the CD root without wrapping the directory.

**-r**, **--preserve-path** _path_
> Add files while preserving the original directory structure.

**-x**, **--exclude-path** _pattern_
> Exclude files or directories matching _pattern_.

**-c**, **--change-path** _from_=_to_
> Rename a path on the CD during burning.

**-l**, **--follow-symlink**
> Follow symbolic-link directories instead of recording the link.

**-m**, **--multisession**
> Mark the session as appendable so further data can be added later.

**-n**, **--name** _file_
> Name of the ISO image to burn (with **-I**).

**-a**, **--audio-file** _file_
> Audio track to add (with **-A**); repeat for additional tracks.

**--help**
> Print built-in help and exit.

# DESCRIPTION

**burn** is a console-driven wrapper around the standard CD-recording tool-chain (**cdrecord/wodim**, **mkisofs/genisoimage**, decoders for MP3 and Ogg) that exposes the common burning workflows through a single command. One of four mutually exclusive main modes selects whether to write data, an ISO image, a copy of another disc, or an audio CD assembled from compressed and uncompressed sources.

The program decodes audio files transparently before writing, generates the necessary ISO9660 filesystem for data discs, and forwards the resulting track to the underlying burner. Burn parameters and recorder device are read from the user and system configuration; command-line options override them per invocation.

# CONFIGURATION

**/etc/burn.conf**
> System-wide configuration: device path, speed, default file system options.

**~/.burn/burn.conf**
> Per-user override of the system configuration.

# CAVEATS

Requires a working **cdrecord** or **wodim** plus **mkisofs**/**genisoimage** in **PATH**. Audio mode depends on external decoders (**lame**, **oggdec**) being installed for non-WAV input. Optical media is largely obsolete; consider USB images and **dd**, **xorriso**, or **growisofs** for modern workflows.

# HISTORY

**burn** was written by **Ben Finney** and **Gaetano Paolone** as a friendly Bash wrapper over the cdrtools suite, packaged in **Debian** since the early **2000s**. It is distributed under the **GNU GPL v2** or later.

# SEE ALSO

[wodim](/man/wodim)(1), [cdrecord](/man/cdrecord)(1), [growisofs](/man/growisofs)(1), [genisoimage](/man/genisoimage)(1)
