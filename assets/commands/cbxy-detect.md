# TAGLINE

Detect comic panels and write a .cbxy sidecar

# TLDR

**Detect panels** in a CBZ and write a sibling .cbxy

```cbxy-detect [path/to/book.cbz]```

**Write output** to an explicit path

```cbxy-detect [path/to/book.cbz] -o [path/to/book.cbxy]```

**Force OpenCV** detection (fast, no model download)

```cbxy-detect [path/to/book.cbz] --engine cv```

**Force ML** detection for irregular layouts

```cbxy-detect [path/to/book.cbz] --engine ml```

**Process only the first N pages**

```cbxy-detect [path/to/book.cbz] --limit [N]```

**Write annotated preview JPEGs**

```cbxy-detect [path/to/book.cbz] --preview-dir [dir]```

**Install** the cbxy tools

```pip install cbxy```

# SYNOPSIS

**cbxy-detect** [_options_] _comic_

# DESCRIPTION

**cbxy-detect** finds comic panels in a book and writes a **.cbxy** sidecar archive beside it. A **.cbxy** file is a ZIP of per-page JSON (same idea as CBZ, but panel geometry instead of images). Coordinates are normalized fractions of the page (**0–1**), so they remain valid after resize; array order is reading order.

Input can be a **.cbz**, **.cbr**, an image folder, or a single page image. Detection engines: **auto** (default) tries OpenCV first and falls back to ML when a page looks irregular (for example one huge panel); **cv** uses traditional gutter-based detection (fast, no model download); **ml** uses Ultralytics YOLO with pretrained comic-panel weights (**mosesb/best-comic-panel-detection** on Hugging Face), downloaded on first ML run.

Part of the **cbxy** Python package, which also ships **cbxy-reader** and **cbxy-editor**.

# PARAMETERS

_comic_
> Path to a **.cbz**, **.cbr**, image folder, or single page image.

**-o**, **--out** _path_
> Output **.cbxy** path (default: same stem beside the comic).

**--engine** **auto**|**cv**|**ml**
> Detection backend (default: **auto**).

**--min-area** _fraction_
> Minimum panel area as a fraction of the page (default: **0.03**).

**--gutter** _0-255_
> Near-white gutter threshold for CV (default: **230**).

**--conf** _threshold_
> ML confidence threshold (default: **0.25**).

**--limit** _N_
> Only process the first N pages.

**--preview-dir** _dir_
> Write annotated preview JPEGs into this folder.

# CAVEATS

OpenCV works best on traditional grids with clear white gutters; borderless or overlapping layouts often need **--engine ml**, which downloads a YOLO model on first use. Detection quality varies by scan quality and page design—review results with **cbxy-editor** when needed. Input archives must be readable; some CBR tools may need extra system libraries depending on platform packaging.

# HISTORY

**cbxy** is a Python reference implementation of a comic panel geometry sidecar format by **ngafar**, published under the MIT license with **cbxy-detect**, **cbxy-reader**, and **cbxy-editor**.

# SEE ALSO

[cbxy-reader](/man/cbxy-reader)(1), [cbxy-editor](/man/cbxy-editor)(1), [pip](/man/pip)(1), [uv](/man/uv)(1)

# RESOURCES

```[Source code](https://github.com/ngafar/cbxy)```

```[Documentation](https://github.com/ngafar/cbxy/blob/main/spec/v0.1.0.md)```

<!-- verified: 2026-07-21 -->
