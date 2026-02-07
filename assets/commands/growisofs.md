# TAGLINE

DVD and Blu-ray disc burning tool

# TLDR

**Burn ISO to DVD**

```growisofs -dvd-compat -Z /dev/dvd=[image.iso]```

**Create DVD from directory**

```growisofs -Z /dev/dvd -R -J [directory]```

**Append to multisession DVD**

```growisofs -M /dev/dvd -R -J [directory]```

**Burn with verification**

```growisofs -dvd-compat -Z /dev/dvd=[image.iso] && md5sum /dev/dvd```

# SYNOPSIS

**growisofs** [_options_] **-Z** _device_ [_mkisofs-options_] _path_

# PARAMETERS

**-Z** _DEVICE_
> Create new session on device.

**-M** _DEVICE_
> Append to existing multisession.

**-dvd-compat**
> Close disc for maximum compatibility.

**-speed=** _N_
> Set burn speed.

**-dry-run**
> Simulate without writing.

**-use-the-force-luke**
> Override safety checks.

**--help**
> Display help information.

# DESCRIPTION

**growisofs** burns DVDs and Blu-ray discs. It combines an mkisofs frontend with a dvd+rw-tools backend for seamless disc creation.

The tool handles session management, supports multisession DVDs, and works with DVD-R, DVD+R, DVD-RW, and Blu-ray media. It is the standard Linux DVD burning utility.

# CAVEATS

Requires dvd+rw-tools. Media type affects options. Speed depends on drive and media.

# HISTORY

growisofs was developed by **Andy Polyakov** as part of the **dvd+rw-tools** package for Linux optical disc burning.

# SEE ALSO

[mkisofs](/man/mkisofs)(1), [cdrecord](/man/cdrecord)(1), [dvd+rw-format](/man/dvd+rw-format)(1)
