# TAGLINE

wavelet compression to PNM converter

# TLDR

**Convert FIASCO to PNM**

```fiascotopnm [input.fiasco] > [output.pnm]```

**Convert with specific frame**

```fiascotopnm --frame [5] [input.fiasco] > [output.pnm]```

# SYNOPSIS

**fiascotopnm** [_options_] _file_

# PARAMETERS

**--frame** _num_
> Frame number to extract.

# DESCRIPTION

**fiascotopnm** decodes images compressed with the FIASCO (Fractal Image And Sequence COdec) algorithm into PNM (Portable Any Map) format. FIASCO uses wavelet-based compression techniques similar to those in JPEG2000.

The tool is part of the Netpbm image processing toolkit and can extract individual frames from FIASCO-encoded image sequences. It handles both still images and video frame sequences, making the compressed data accessible for further processing with standard image tools.

fiascotopnm is useful when working with legacy FIASCO-compressed images or when interfacing with systems that use FIASCO as an intermediate format.

# SEE ALSO

[pnmtofiasco](/man/pnmtofiasco)(1), [pnm](/man/pnm)(5)

