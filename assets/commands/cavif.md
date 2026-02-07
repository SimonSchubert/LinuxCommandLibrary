# TAGLINE

convert images to AVIF format

# TLDR

**Convert an image to AVIF format**

```cavif [path/to/image.png]```

**Convert with specific quality (1-100)**

```cavif --quality [80] [path/to/image.jpg]```

**Convert with faster encoding speed (1-10)**

```cavif --speed [6] [path/to/image.png]```

**Convert and specify output path**

```cavif -o [path/to/output.avif] [path/to/image.png]```

**Convert multiple images to a directory**

```cavif -o [path/to/output_dir/] [image1.png] [image2.jpg]```

**Overwrite existing AVIF files**

```cavif --overwrite [path/to/image.png]```

# SYNOPSIS

**cavif** [**--quality** _1-100_] [**--speed** _1-10_] [**-o** _path_] [**--overwrite**] [**--quiet**] _file..._

# DESCRIPTION

**cavif** is a command-line tool written in Rust for converting PNG and JPEG images to AVIF (AV1 Image File Format). AVIF uses AV1 video codec compression, offering superior compression ratios compared to JPEG while maintaining image quality.

By default, output files are saved with the same name but with an **.avif** extension. Existing files are not overwritten unless **--overwrite** is specified.

# PARAMETERS

**--quality** _1-100_
> Output quality level. Higher values mean better quality and larger files. Default varies by input

**--speed** _1-10_
> Encoding speed. 1 is slowest with best compression, 10 is fastest but lower quality. Default: 4

**-o** _path_
> Output path. For multiple inputs, treated as a directory

**--overwrite**
> Replace existing .avif files instead of skipping them

**--quiet**
> Suppress output during conversion

# CAVEATS

Speeds 1-2 are extremely slow but produce ~3-5% smaller files. Speeds 7+ significantly degrade compression and are not recommended.

There is no lossless compression mode; quality 100 produces unreasonably large files without being truly lossless.

Requires Rust 1.67 or later if building from source.

# HISTORY

**cavif** was created by Kornel Lesinski as a pure Rust implementation of an AVIF encoder. AVIF itself was standardized in **2019** by the Alliance for Open Media, leveraging the AV1 video codec for still image compression.

# SEE ALSO

[cwebp](/man/cwebp)(1), [convert](/man/convert)(1)
