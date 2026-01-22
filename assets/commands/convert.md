# TLDR

**Convert** image format

```convert [input.png] [output.jpg]```

**Resize** image

```convert [input.jpg] -resize [800x600] [output.jpg]```

**Rotate** image

```convert [input.jpg] -rotate [90] [output.jpg]```

**Add** border

```convert [input.jpg] -border [10x10] -bordercolor [black] [output.jpg]```

**Compress** image

```convert [input.jpg] -quality [85] [output.jpg]```

# SYNOPSIS

**convert** [_options_] _input_ _output_

# DESCRIPTION

**convert** is an ImageMagick tool for image manipulation. It can convert between formats, resize, rotate, crop, add effects, and perform batch operations on images.

The command is versatile for image processing tasks in scripts and workflows.

# PARAMETERS

**-resize** _geometry_
> Resize image (e.g., 50%, 800x600, 800x)

**-rotate** _degrees_
> Rotate image

**-crop** _geometry_
> Crop image

**-quality** _value_
> Compression quality (1-100)

**-scale** _geometry_
> Scale image (faster, lower quality)

**-thumbnail** _geometry_
> Create thumbnail

**-blur** _radius_
> Blur image

**-sharpen** _radius_
> Sharpen image

**-negate**
> Invert colors

**-monochrome**
> Convert to black and white

**-flip**
> Flip vertically

**-flop**
> Flip horizontally

# GEOMETRY SPECIFICATIONS

- **800x600** - Maximum dimensions (keep aspect)
- **800x600!** - Exact dimensions (ignore aspect)
- **800x600^** - Minimum dimensions (crop)
- **50%** - Percentage scale
- **800x** - Width (calculate height)
- **x600** - Height (calculate width)

# WORKFLOW

```bash
# Convert format
convert photo.png photo.jpg

# Resize maintaining aspect ratio
convert input.jpg -resize 800x600 output.jpg

# Exact size (may distort)
convert input.jpg -resize 800x600! output.jpg

# Resize by percentage
convert input.jpg -resize 50% output.jpg

# Thumbnail
convert input.jpg -thumbnail 200x200 thumb.jpg

# Rotate
convert input.jpg -rotate 90 output.jpg

# Crop (width x height + x_offset + y_offset)
convert input.jpg -crop 800x600+100+100 output.jpg

# Quality compression
convert input.jpg -quality 85 output.jpg

# Multiple operations
convert input.jpg -resize 800x600 -rotate 90 -quality 90 output.jpg
```

# BATCH OPERATIONS

```bash
# Convert all PNG to JPG
for img in *.png; do
    convert "$img" "${img%.png}.jpg"
done

# Resize all images
for img in *.jpg; do
    convert "$img" -resize 800x600 "resized_$img"
done
```

# EFFECTS

```bash
# Blur
convert input.jpg -blur 0x8 output.jpg

# Sharpen
convert input.jpg -sharpen 0x1 output.jpg

# Border
convert input.jpg -border 5x5 -bordercolor black output.jpg

# Add text
convert input.jpg -pointsize 36 -fill white \
    -annotate +50+50 'Hello' output.jpg
```

# CAVEATS

Large images consume memory. Complex operations can be slow. Default quality settings may reduce file size significantly. Some operations change aspect ratio. Security vulnerabilities in old versions. Consider using `magick` command (ImageMagick 7+).

# HISTORY

**convert** is part of ImageMagick, created by John Cristy in **1987**, becoming one of the most versatile image manipulation tools.

# SEE ALSO

[mogrify](/man/mogrify)(1), [identify](/man/identify)(1), [ffmpeg](/man/ffmpeg)(1)
