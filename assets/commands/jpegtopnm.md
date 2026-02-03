# TLDR

**Convert JPEG to PNM**

```jpegtopnm [image.jpg] > [image.pnm]```

**Convert with EXIF extraction**

```jpegtopnm -exif=[exif.dat] [image.jpg] > [image.pnm]```

**Repair corrupted JPEG**

```jpegtopnm -repair [corrupted.jpg] > [output.pnm]```

**Display comments from JPEG**

```jpegtopnm -comments [image.jpg] > /dev/null```

# SYNOPSIS

**jpegtopnm** [_options_] [_filename_]

# PARAMETERS

**-repair**
> Attempt to salvage data from corrupted JPEG.

**-exif** _file_
> Extract EXIF data to file.

**-comments**
> Print comments from JPEG file.

**-dct** _method_
> DCT method: int, fast, or float.

**-multiple**
> Read multiple images from stream.

# DESCRIPTION

**jpegtopnm** converts JFIF/JPEG images to Netpbm PNM format. Outputs PPM for color images or PGM for grayscale. Part of the Netpbm toolkit, it uses the Independent JPEG Group's library for decoding.

# SEE ALSO

[pnmtojpeg](/man/pnmtojpeg)(1), [djpeg](/man/djpeg)(1), [pamscale](/man/pamscale)(1)

