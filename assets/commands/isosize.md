# TLDR

Display the **size** of an ISO file

```isosize [path/to/file.iso]```

Display **block count** and block size

```isosize -x [path/to/file.iso]```

Display size divided by a **specific number**

```isosize -d [number] [path/to/file.iso]```

# SYNOPSIS

**isosize** [_options_] _file_

# PARAMETERS

**-x**, **--sectors**
> Show block count and block size instead of total bytes

**-d**, **--divisor** _NUM_
> Divide size by specified number (incompatible with -x)

# DESCRIPTION

**isosize** displays the size of ISO 9660 filesystem images by reading the volume descriptor. Unlike tools that report file size, isosize reports the actual filesystem size stored in the ISO header.

This can be useful when the ISO image file has been padded or when determining the exact size needed to write the image to media.

# CAVEATS

Only works with valid ISO 9660 images. Reports the size recorded in the volume descriptor, which may differ from file size if the image was truncated or padded.

# HISTORY

isosize is part of the util-linux package, providing a simple utility for querying ISO image sizes. It reads the ISO 9660 Primary Volume Descriptor to determine size.

# SEE ALSO

[isoinfo](/man/isoinfo)(1), [genisoimage](/man/genisoimage)(1), [du](/man/du)(1)
