# TAGLINE

disc-at-once CD recording and reading

# TLDR

**Read** a CD and write contents to a file

```cdrdao read-cd --device [/dev/cdrom] --read-raw [image.toc]```

# SYNOPSIS

**cdrdao** _command_ [_options_] _toc-file_

# DESCRIPTION

**cdrdao** reads and writes CDs in disc-at-once (DAO) mode. Unlike track-at-once recording, DAO writes the entire disc in a single pass without gaps between tracks, preserving exact sector timing and sub-channel data. This makes it the preferred tool for creating accurate copies of audio CDs where track transitions matter.

The tool uses TOC (Table of Contents) files to describe disc layout, which can represent complex disc structures including multi-session discs, mixed-mode discs, and CDs with hidden tracks or non-standard gaps. The TOC format provides more control over disc layout than cue sheets.

A typical workflow involves reading a disc with `read-cd` to create a TOC file and binary image, then writing the image back with `write`. The `simulate` command performs a dry run without actually burning.

# COMMANDS

**read-cd**
> Read a CD to image and TOC files

**write**
> Write image to disc

**copy**
> Copy disc to disc

**simulate**
> Simulate write operation

**show-toc**
> Display TOC file contents

**blank**
> Blank a CD-RW disc

# PARAMETERS

**--device** _device_
> CD/DVD device path

**--read-raw**
> Read in raw mode (preserves all data)

**--driver** _name_
> Use specific device driver

**--speed** _n_
> Set write speed

**--eject**
> Eject disc after operation

# CAVEATS

Requires a CD/DVD writer for write operations. Raw read mode may not work with all drives. Copy protection may prevent reading some discs.

# SEE ALSO

[wodim](/man/wodim)(1), [cdrecord](/man/cdrecord)(1), [genisoimage](/man/genisoimage)(1)
