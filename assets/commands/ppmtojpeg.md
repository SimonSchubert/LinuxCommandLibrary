# TAGLINE

Convert PPM images to JPEG format

# TLDR

**Convert PPM to JPEG**

```ppmtojpeg [input.ppm] > [output.jpg]```

**Convert with specific quality** (default: 75)

```ppmtojpeg -quality [90] [input.ppm] > [output.jpg]```

**Create a progressive JPEG**

```ppmtojpeg -progressive [input.ppm] > [output.jpg]```

**Convert with optimized Huffman encoding**

```ppmtojpeg -optimize [input.ppm] > [output.jpg]```

**Convert with grayscale output**

```ppmtojpeg -grayscale [input.ppm] > [output.jpg]```

# SYNOPSIS

**ppmtojpeg** [_options_] [_file_]

# PARAMETERS

**-quality** _n_
> JPEG quality factor (0-100, default: 75). Higher values produce better quality but larger files.

**-progressive**
> Create a progressive JPEG (loads in multiple passes).

**-optimize**
> Optimize Huffman coding tables for smaller file size at the cost of slower compression.

**-grayscale**
> Create a grayscale JPEG regardless of input color.

**-density** _DPI_
> Set pixel density in dots per inch.

**-smooth** _n_
> Smooth input image (1-100) to reduce dithering artifacts.

# DESCRIPTION

**ppmtojpeg** converts PPM (Portable Pixel Map) images to JPEG/JFIF format. It is an alias for **pnmtojpeg** and is part of the Netpbm toolkit. The command reads from a file or stdin and writes JPEG data to stdout.

The default quality of 75 provides a good balance between file size and visual quality. Values above 95 produce diminishing returns in quality while significantly increasing file size.

# CAVEATS

Output is written to stdout and must be redirected to a file. JPEG is a lossy format; converting from PPM to JPEG and back will lose quality. The **-optimize** flag increases encoding time but typically reduces file size by 5-10%.

# SEE ALSO

[pnmtojpeg](/man/pnmtojpeg)(1), [jpegtopnm](/man/jpegtopnm)(1), [cjpeg](/man/cjpeg)(1), [netpbm](/man/netpbm)(1)

