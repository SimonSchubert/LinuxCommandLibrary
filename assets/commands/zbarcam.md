# TAGLINE

Scan barcodes from webcam video

# TLDR

**Scan** barcodes

```zbarcam```

Scan **without display**

```zbarcam --nodisplay```

Print **raw** output

```zbarcam --raw```

Specify **device**

```zbarcam [/dev/video_device]```

# SYNOPSIS

**zbarcam** [_OPTIONS_] [_DEVICE_]

# PARAMETERS

**--nodisplay**
> Disable video window

**--raw**
> Print barcode data without type

**--prescale** _WxH_
> Prescale video to specified size

**-v, --verbose**
> Increase verbosity

**-q, --quiet**
> Suppress output

# DESCRIPTION

**zbarcam** scans and decodes barcodes and QR codes from a video device (webcam). Decoded data is printed to stdout in real-time.

Part of the ZBar barcode reader package.

# CAVEATS

Requires webcam or video capture device. Barcode must be clearly visible and properly lit. May need v4l2 permissions.

# SEE ALSO

[zbarimg](/man/zbarimg)(1), [qrencode](/man/qrencode)(1)
