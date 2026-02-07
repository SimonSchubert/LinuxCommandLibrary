# TAGLINE

JPEG image compressor

# TLDR

**Compress** a BMP image to JPEG with default quality

```cjpeg [image.bmp] > [output.jpg]```

**Compress** a PPM image with a specific **quality level** (1-100, higher is better)

```cjpeg -quality [85] [image.ppm] > [output.jpg]```

**Create a progressive JPEG** for web optimization

```cjpeg -progressive [image.bmp] > [output.jpg]```

**Compress with grayscale** output

```cjpeg -grayscale [image.ppm] > [output.jpg]```

**Optimize Huffman tables** for smaller file size

```cjpeg -optimize [image.bmp] > [output.jpg]```

**Set output file directly** using the outfile option

```cjpeg -outfile [output.jpg] [image.bmp]```

# SYNOPSIS

**cjpeg** [_options_] [_input_file_]

# PARAMETERS

**-quality** _N_
> Set compression quality level (1-100). Higher values produce better quality but larger files. Default is 75.

**-progressive**
> Create progressive JPEG file for incremental display during download.

**-grayscale**
> Force grayscale output even if input is color.

**-optimize**
> Optimize Huffman coding tables. Produces smaller files but slower compression.

**-outfile** _name_
> Specify output file name instead of writing to stdout.

**-targa**
> Input file is in Targa format (useful when auto-detection fails).

**-smooth** _N_
> Smooth input image to reduce dithering artifacts (1-100).

**-maxmemory** _N_
> Limit memory usage to N kilobytes.

**-restart** _N_
> Emit restart markers every N MCU rows (or N blocks if B suffix used).

**-arithmetic**
> Use arithmetic coding instead of Huffman coding (smaller files, less compatible).

**-baseline**
> Force baseline JPEG output (8-bit, non-progressive).

**-verbose** or **-debug**
> Enable debug output.

# DESCRIPTION

**cjpeg** is an image compression utility from the Independent JPEG Group's (IJG) libjpeg library, also available in the optimized libjpeg-turbo variant. It compresses raster image files into JPEG/JFIF format.

The utility reads input images in various formats including BMP, PPM, PGM, and Targa, then outputs compressed JPEG data. By default, output goes to standard output, allowing easy piping and redirection. Input formats are auto-detected based on file headers.

For web use, the **-progressive** option creates images that render progressively during download. The **-optimize** flag reduces file size through better Huffman tables at the cost of slower encoding. Quality settings around 75-85 typically offer a good balance between file size and visual fidelity.

# CAVEATS

Output goes to stdout by default, requiring redirection or **-outfile** to save. The **-arithmetic** option creates files incompatible with some older decoders. Very low quality settings (below 20) produce severe visible artifacts.

# HISTORY

cjpeg originated as part of the Independent JPEG Group's free JPEG software, first released in **1991** by Tom Lane. It became a standard Unix utility for JPEG compression. The libjpeg-turbo project, started in **2009**, provides an optimized version using SIMD instructions for significantly faster encoding and decoding.

# SEE ALSO

[djpeg](/man/djpeg)(1), [jpegtran](/man/jpegtran)(1), [convert](/man/convert)(1), [ffmpeg](/man/ffmpeg)(1)
