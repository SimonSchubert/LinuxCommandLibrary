# TLDR

**Read** a CD and copy to a file

```readcd dev=/dev/sr0 f=path/to/file.iso```

# SYNOPSIS

**readcd** dev=_device_ f=_file_

# PARAMETERS

**dev=**_device_
> CD/DVD device to read from

**f=**_file_
> Output file path

# DESCRIPTION

**readcd** reads or writes Compact Disc media data. It can create ISO images from physical CDs/DVDs and write data back to writable media.

The tool accesses the raw disc data, making it suitable for creating exact copies of media.

# CAVEATS

Requires read access to the optical drive device. Some copy-protected discs may not read correctly.

# HISTORY

Part of **cdrtools** (or cdrkit on some distributions), providing CD/DVD burning and reading utilities.

# SEE ALSO

[cdrecord](/man/cdrecord)(1), [dd](/man/dd)(1), [wodim](/man/wodim)(1)
