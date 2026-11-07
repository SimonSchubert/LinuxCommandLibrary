# TAGLINE

Score how close a distorted image looks to the original

# TLDR

Score a distorted image against the original (same width and height)

```ssimulacra2 [original.png] [distorted.png]```

Print the score ranges and how to call the tool

```ssimulacra2```

# SYNOPSIS

**ssimulacra2** [_original_ _distorted_]

# DESCRIPTION

**ssimulacra2** prints one number for how visually close a distorted image is to the original. The score runs from negative values (very strong distortion) through 100 (mathematically lossless). Both files must have the same dimensions. With no arguments the program prints usage and the meaning of the ranges.

The scale, as published with the tool:

- Negative: extremely low quality
- 10: very low quality (obvious, annoying artifacts)
- 30: low quality
- 50: medium quality
- 70: high quality (artifacts perceptible, not annoying)
- 80: very high quality
- 85: excellent quality
- 90: visually lossless
- 100: mathematically lossless

The metric is a perceptual comparison in XYB color space. It extends multi-scale structural similarity with two extra error maps and aggregates them with two norms. It is used to judge image codecs, including JPEG XL, against what a person would notice at 1:1.

# CAVEATS

The two images must match in width and height. The program does not resize, crop, or align them. A score is not a file-size or PSNR figure. Different codecs can land on the same score with very different artifacts.

With no arguments, **ssimulacra2** explains itself and exits. It does not read a directory or a glob of frames.

# HISTORY

SSIMULACRA 2 was developed at Cloudinary, with the implementation published in the **ssimulacra2** repository. It is the second version of that group's subjective-similarity metric and is the basis for quality comparisons around JPEG XL.

# INSTALL

```apt: sudo apt install libjxl-devtools```

```dnf: sudo dnf install libjxl-devtools```

```nix: nix profile install nixpkgs#ssimulacra2```

<!-- packages: 2026-11-07 -->

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1)

# RESOURCES

```[Source code](https://github.com/cloudinary/ssimulacra2)```

```[Documentation](https://github.com/cloudinary/ssimulacra2#usage)```

<!-- verified: 2026-11-07 -->
