# TAGLINE

Convert raster images to EPS or PDF

# TLDR

**Convert image to PDF**

```sam2p [input.png] [output.pdf]```

**Convert to EPS**

```sam2p [input.png] [output.eps]```

**Convert with ZIP compression**

```sam2p -c:zip [input.png] [output.pdf]```

**Convert with JPEG compression**

```sam2p -c:jpeg [input.png] [output.pdf]```

**Scale image to fit page**

```sam2p -e:scale [input.png] [output.pdf]```

**Set page margins**

```sam2p -m:1cm [input.png] [output.pdf]```

# SYNOPSIS

**sam2p** [_options_] _input_ _output_

# PARAMETERS

**-c:**_method_
> Compression method: none, zip, lzw, rle, fax, dct, jpeg.

**-1**, **-ps:1**
> Produce PostScript Level 1 output.

**-2**, **-ps:2**
> Produce PostScript Level 2 output (default for PS).

**-3**, **-ps:3**
> Produce PostScript Level 3 output.

**-pdf:b2**
> Produce PDF 1.2 with inline image (default for PDF).

**-e:scale**
> Scale image to fit page.

**-e:rotate**
> Scale and rotate image to fit page.

**-m:**_dimen_
> Set all page margins (e.g., -m:1cm, -m:0.5in).

**-m:**_spec_**:**_dimen_
> Set specific margin: l (left), r (right), t (top), b (bottom).

**-m:dpi:**_res_
> Set output resolution.

**-j:quiet**
> Suppress warnings, show only errors.

# DESCRIPTION

**sam2p** converts raster (bitmap) images to Adobe PostScript or PDF files with minimal output size. It gives full control over standards-compliance, compression, and bit depths.

Supported input formats include PNM, PBM, PGM, PPM, XPM, GIF, LBM, TGA, PCX, JPEG, TIFF, PNG, BMP, PS, EPS, and PDF. Output formats include PS (levels 1-3), EPS, PDF, and many raster formats.

# SEE ALSO

[convert](/man/convert)(1), [img2pdf](/man/img2pdf)(1), [a2ping](/man/a2ping)(1), [epstopdf](/man/epstopdf)(1), [ps2pdf](/man/ps2pdf)(1)

