# TAGLINE

modify DVD booktype for compatibility

# TLDR

**Query current booktype** settings of the drive and loaded media

```dvd+rw-booktype [/dev/dvd]```

Set the booktype of the **currently loaded disc** to DVD-ROM

```dvd+rw-booktype -dvd-rom-spec -media [/dev/dvd]```

Make the drive **default to DVD-ROM booktype** for every future recording

```dvd+rw-booktype -dvd-rom-spec -unit [/dev/dvd]```

Set the drive default **only for DVD+R** recordings

```dvd+rw-booktype -dvd-rom-spec -unit+r [/dev/dvd]```

Restore the **native booktype** of the loaded DVD+RW disc

```dvd+rw-booktype -dvd+rw-spec -media [/dev/dvd]```

**Print drive inquiry** information

```dvd+rw-booktype -inq [/dev/dvd]```

# SYNOPSIS

**dvd+rw-booktype** [**-dvd-rom-spec**|**-dvd+rw-spec**|**-dvd+r-spec**|**-inq**] [**-media**|**-unit**|**-unit+rw**|**-unit+r**] _device_

# PARAMETERS

_device_
> DVD drive device path, e.g. /dev/dvd or /dev/sr0.

**-dvd-rom-spec**
> Use the DVD-ROM book type specification.

**-dvd+rw-spec**
> Use the native DVD+RW book type specification.

**-dvd+r-spec**
> Use the native DVD+R book type specification.

**-inq**
> Print drive inquiry information and exit.

**-media**
> Apply the chosen specification to the currently loaded disc.

**-unit**
> Store the chosen specification as the drive default for future recordings.

**-unit+rw**
> Store the drive default for DVD+RW recordings only.

**-unit+r**
> Store the drive default for DVD+R recordings only.

# DESCRIPTION

**dvd+rw-booktype** changes the book type field recorded on DVD+R and DVD+RW media. The book type is what a player reads to decide which kind of disc it is holding, so it directly affects playback compatibility.

Presenting a DVD+R or DVD+RW disc as DVD-ROM makes many older standalone players and set-top boxes accept it, because those units predate the DVD+ formats. A specification flag chooses the identity to write; a target flag chooses whether it applies to the loaded disc (**-media**) or becomes the drive's default for future burns (**-unit** and its variants).

Running the command with only a device argument prints the current drive and media settings without changing anything.

# CAVEATS

Not every drive supports book type modification, and support often depends on the firmware. Changing the book type of a DVD+R disc is a one-way operation: the field is written into the disc's control data and cannot be rewritten. DVD+RW media can be changed repeatedly. The command does not affect DVD-R/-RW media at all.

# HISTORY

dvd+rw-booktype is part of the **dvd+rw-tools** package, developed for managing DVD+R/RW media on Linux. Booktype modification became important for compatibility when DVD+ format competed with DVD-.

# SEE ALSO

[growisofs](/man/growisofs)(1), [dvd+rw-mediainfo](/man/dvd+rw-mediainfo)(1)
