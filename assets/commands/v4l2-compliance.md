# TAGLINE

Test Video4Linux2 driver API compliance

# TLDR

**Test default video device**

```v4l2-compliance```

**Test specific device**

```v4l2-compliance -d [/dev/video0]```

**Run streaming tests**

```v4l2-compliance -s```

**Test all video formats**

```v4l2-compliance -f```

**Test color formats**

```v4l2-compliance -c```

**Verbose output**

```v4l2-compliance -v```

**Run all tests**

```v4l2-compliance -s -f -c```

# SYNOPSIS

**v4l2-compliance** [_options_]

# PARAMETERS

**-d**, **--device** _device_
> Video device to test (default: /dev/video0).

**-s**, **--streaming**
> Run basic streaming tests.

**-f**, **--stream-all-formats**
> Test all supported video formats.

**-c**, **--stream-all-colors**
> Test all color formats.

**-v**, **--verbose**
> Enable verbose output.

**-w**, **--wrapper**
> Use libv4l2 wrapper.

**-T**, **--trace**
> Trace ioctl calls.

**-n**, **--no-warnings**
> Suppress warnings.

**--help**
> Display help.

# DESCRIPTION

**v4l2-compliance** tests Video4Linux2 drivers and devices for API compliance. It verifies nearly all V4L2 ioctls and checks that drivers correctly implement the specification.

The tool tests video capture and output, VBI, radio, and software radio devices. It verifies required capabilities are present and optional features work correctly when advertised. Streaming tests validate buffer handling and format support.

New V4L2 drivers must pass compliance tests before kernel inclusion. The tool saves device state before testing and restores it afterward, including on Ctrl-C interruption.

# CAVEATS

Always use latest version from git for driver development. Some test failures may be tool bugs rather than driver issues. Streaming tests require valid input/output signal. Tests may take significant time with all options enabled.

# HISTORY

**v4l2-compliance** was developed as part of the v4l-utils package to ensure V4L2 driver quality. It evolved alongside the V4L2 API and now covers approximately 90% of the specification. It's become mandatory for new driver submissions to the Linux kernel.

# SEE ALSO

[v4l2-ctl](/man/v4l2-ctl)(1), [v4l2-dbg](/man/v4l2-dbg)(1), [qv4l2](/man/qv4l2)(1), [media-ctl](/man/media-ctl)(1)
