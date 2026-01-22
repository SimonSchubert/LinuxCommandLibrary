# TLDR

**Capture entire screen**

```import.im6 screenshot.png```

**Capture by clicking window**

```import.im6 window.png```

**Capture root window**

```import.im6 -window root screen.png```

**Capture with pause**

```import.im6 -pause [3] screenshot.png```

# SYNOPSIS

**import.im6** [_options_] _output_file_

# PARAMETERS

**-window** _ID_
> Capture specific window or "root".

**-pause** _SECONDS_
> Delay before capture.

**-frame**
> Include window frame.

**-crop** _GEOMETRY_
> Crop captured image.

**--help**
> Display help information.

# DESCRIPTION

**import.im6** is the ImageMagick 6 version of the import screen capture tool. It captures X Window screenshots to various image formats.

This legacy version is maintained for compatibility with scripts depending on ImageMagick 6 behavior.

import.im6 is legacy ImageMagick screen capture.

# CAVEATS

Legacy ImageMagick 6 version. X11 only. Use import for newer systems.

# HISTORY

import.im6 is the versioned name for **ImageMagick 6** import, allowing coexistence with ImageMagick 7.

# SEE ALSO

[import](/man/import)(1), [convert.im6](/man/convert.im6)(1), [display.im6](/man/display.im6)(1)
