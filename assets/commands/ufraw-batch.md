# TAGLINE

Batch convert camera RAW photos

# TLDR

**Convert RAW to JPEG**

```ufraw-batch --out-type=jpeg [image.raw]```

**Convert to 16-bit TIFF**

```ufraw-batch --out-type=tiff --out-depth=16 [image.raw]```

**Set output directory**

```ufraw-batch --out-type=jpeg --out-path=[output/] [image.raw]```

**Use the camera white balance**

```ufraw-batch --wb=camera --out-type=jpeg [image.raw]```

**Set JPEG quality and overwrite existing files**

```ufraw-batch --out-type=jpeg --compression=[95] --overwrite [image.raw]```

**Extract the embedded preview image**

```ufraw-batch --embedded-image [image.raw]```

**Batch process**

```ufraw-batch --out-type=jpeg [*.raw]```

# SYNOPSIS

**ufraw-batch** [_options_] _rawfiles_

# PARAMETERS

**--out-type**=_FORMAT_
> Output format: ppm, tiff, tif, png, jpeg, jpg or fits (default: ppm).

**--out-depth**=_8|16_
> Output bit depth per channel. JPEG allows only 8.

**--out-path**=_DIR_
> Output directory (default: same as the input file).

**--output**=_FILE_
> Output file name, for a single input. Use - for stdout.

**--overwrite**
> Overwrite existing files without asking.

**--wb**=_camera|auto_
> White balance setting.

**--temperature**=_K_, **--green**=_VALUE_
> Set white balance manually.

**--exposure**=_auto|EV_
> Auto exposure or correction in EV, from -3.00 to 3.00 (default: 0).

**--compression**=_N_
> JPEG quality from 0 to 100 (default: 85).

**--shrink**=_FACTOR_, **--size**=_SIZE_
> Shrink by a factor, or downsize the longest side to SIZE.

**--rotate**=_camera|ANGLE|no_
> Rotation (default: camera).

**--conf**=_FILE_
> Load all parameters from a UFRaw ID-file.

**--embedded-image**
> Extract the embedded preview image instead of converting.

**--silent**
> Do not display messages during conversion.

# DESCRIPTION

**ufraw-batch** is the batch processing mode of UFRaw (Unidentified Flying Raw), a tool for reading and converting camera RAW image files. It processes files non-interactively with no preview, applying adjustments like white balance, exposure compensation, and color correction before writing the output format.

UFRaw reads RAW formats using Dave Coffin's dcraw. Settings can be given as command-line options or loaded from UFRaw ID-files, enabling consistent processing across large sets of images. Command-line options take precedence over settings from ID-files and from the user's resource file.

# CAVEATS

UFRaw is no longer developed: its last release on SourceForge is 0.22, and Debian dropped the package after buster. Consider darktable-cli or rawtherapee-cli. Newer camera models may not be supported. Without **--out-type**, output is PPM.

# HISTORY

**UFRaw** (Unidentified Flying Raw) was created for reading and manipulating camera RAW images.

# SEE ALSO

[darktable-cli](/man/darktable-cli)(1), [dcraw](/man/dcraw)(1), [rawtherapee-cli](/man/rawtherapee-cli)(1)

# RESOURCES

```[Homepage](https://ufraw.sourceforge.net)```

```[Source code](https://sourceforge.net/projects/ufraw/)```

<!-- verified: 2026-11-09 -->
