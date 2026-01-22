# TLDR

**Query current booktype**

```dvd+rw-booktype [/dev/dvd]```

**Set booktype** to DVD-ROM

```dvd+rw-booktype -dvd-rom [/dev/dvd]```

**Set booktype** to DVD+R

```dvd+rw-booktype -dvd+r [/dev/dvd]```

**Reset to** default

```dvd+rw-booktype -default [/dev/dvd]```

# SYNOPSIS

**dvd+rw-booktype** [_options_] _device_

# PARAMETERS

_DEVICE_
> DVD drive device path.

**-dvd-rom**
> Set booktype to DVD-ROM.

**-dvd+r**
> Set booktype to DVD+R.

**-dvd+rw**
> Set booktype to DVD+RW.

**-default**
> Reset to manufacturer default.

**-inq**
> Query drive information.

# DESCRIPTION

**dvd+rw-booktype** changes the booktype setting on DVD+R and DVD+RW media. Booktype determines how the disc identifies itself to players, affecting compatibility.

Setting booktype to DVD-ROM improves compatibility with older DVD players that may not recognize DVD+R/+RW formats. The change is permanent and cannot be undone after disc finalization.

This is primarily useful for creating video DVDs that need to play on standalone players with limited format support.

# CAVEATS

Not all drives support booktype modification. Change is permanent per disc. Only affects DVD+ media. Must be done before finalizing.

# HISTORY

dvd+rw-booktype is part of the **dvd+rw-tools** package, developed for managing DVD+R/RW media on Linux. Booktype modification became important for compatibility when DVD+ format competed with DVD-.

# SEE ALSO

[growisofs](/man/growisofs)(1), [dvd+rw-mediainfo](/man/dvd+rw-mediainfo)(1)
