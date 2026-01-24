# TLDR

**Convert RAW to JPEG**

```ufraw-batch --out-type=jpeg [image.raw]```

**Convert to TIFF**

```ufraw-batch --out-type=tiff [image.raw]```

**Set output directory**

```ufraw-batch --out-path=[output/] [image.raw]```

**Apply white balance**

```ufraw-batch --wb=camera [image.raw]```

**Batch process**

```ufraw-batch --out-type=jpeg [*.raw]```

# SYNOPSIS

**ufraw-batch** [_--out-type format_] [_--out-path dir_] [_options_] _files_

# PARAMETERS

**--out-type** _FORMAT_
> Output format (jpeg, tiff, png).

**--out-path** _DIR_
> Output directory.

**--wb** _MODE_
> White balance.

**--exposure** _STOPS_
> Exposure adjustment.

**--compression** _N_
> JPEG quality.

# DESCRIPTION

**ufraw-batch** converts RAW photos. It's batch processing.

RAW format support. Camera formats.

Color correction. White balance.

Exposure adjustment. Light tweaks.

Batch processing. Multiple files.

# CAVEATS

Legacy tool. Consider darktable-cli. Many RAW formats.

# HISTORY

**UFRaw** (Unidentified Flying Raw) was created for reading and manipulating camera RAW images.

# SEE ALSO

[darktable-cli](/man/darktable-cli)(1), [dcraw](/man/dcraw)(1), [rawtherapee-cli](/man/rawtherapee-cli)(1)
