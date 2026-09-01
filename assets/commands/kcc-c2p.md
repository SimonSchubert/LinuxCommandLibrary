# TAGLINE

split tall comic images into device-height pages

# TLDR

Split images in a folder to a **1448-pixel** screen height (mutates the folder)

```kcc-c2p -y 1448 [path/to/pages]```

Also set **width** (used when computing virtual page height)

```kcc-c2p -y 1448 -x 1072 [path/to/pages]```

**Merge** every subdirectory into one tall image, then split

```kcc-c2p -y 1448 -m [path/to/chapter-folders]```

Write **debug overlays** showing detected panel bounds

```kcc-c2p -y 1448 -d [path/to/pages]```

# SYNOPSIS

**kcc-c2p** [**-y** _height_] [**-x** _width_] [**-i**] [**-m**] [**-d**] [_input_...]

# DESCRIPTION

**kcc-c2p** is the command-line comic-to-panel splitter from **Kindle Comic Converter** (KCC). It walks directories of raster images, detects panel-like regions in tall pages, and cuts them into new PNG pages that fit a target screen height. That is useful for webtoon-style strips and oversized scans before loading them on an e-reader.

Input must be one or more **directories** of images, not a CBZ/CBR/PDF. Non-image files in those trees are removed. Detected panels that exceed the target height are split (with overlap on very tall panels). The original image is deleted after a successful split.

The Qt GUI is **kcc**. Full ebook conversion (MOBI, EPUB, CBZ, PDF, device profiles) is **kcc-c2e**, which also has a **-w** webtoon mode. Use **kcc-c2p** when you only need to slice folders of images.

**-y** is required. With no input, or with an empty input list, the tool prints help and exits **1**.

# PARAMETERS

**-y** _HEIGHT_, **--height** _HEIGHT_
> Target device screen height in pixels. Required. Conversion is skipped with an error if this is unset or **0**.

**-x** _WIDTH_, **--width** _WIDTH_
> Target device screen width in pixels. Used when computing a virtual height cap (widths above 1072 are scaled down internally).

**-i**, **--in-place**
> Declared as "overwrite source directory". Current **11.0.3** always writes into the input tree and does not branch on this flag.

**-m**, **--merge**
> Combine every directory into a single image before splitting. Directories that would exceed a very large combined height (on the order of hundreds of thousands of pixels) fail instead of merging.

**-d**, **--debug**
> Write a ***-debug.png** overlay for each split image showing detected panel rectangles.

**-h**, **--help**
> Print help and exit.

# CAVEATS

Only directories of images are accepted. Convert archives with **kcc-c2e** or extract them first.

The tool always works in the input directory. Successful splits **delete** the source image after writing the new PNG pages. Copy the tree first if you need the originals.

Work is parallelized with a process pool. A worker crash aborts the run and may delete the target tree.

This is a preprocessor, not a full ebook converter: there is no device profile, no MOBI/EPUB output, and no KindleGen step.

# HISTORY

**kcc-c2p** is the comic2panel CLI from **Kindle Comic Converter**, started in **2012** by **Ciro Mattia Gonano** and later maintained by **Paweł Jastrzębski**, **Darodi**, and **Alex Xu**. Python, ISC License. Current package version is **11.0.3** (2026).

# INSTALL

```aur: yay -S kcc```

```nix: nix profile install nixpkgs#kcc```

<!-- packages: 2026-09-01 -->

# SEE ALSO

[kcc-c2e](/man/kcc-c2e)(1), [ebook-convert](/man/ebook-convert)(1), [convert](/man/convert)(1)

# RESOURCES

```[Source code](https://github.com/ciromattia/kcc)```

```[Documentation](https://github.com/ciromattia/kcc/wiki)```

<!-- verified: 2026-09-01 -->
