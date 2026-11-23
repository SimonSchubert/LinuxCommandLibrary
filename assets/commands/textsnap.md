# TAGLINE

CPU-only OCR for screenshots, images, and webpages

# TLDR

**OCR a local image** to a text file in ./textsnaps/

```textsnap [path/to/image.png]```

**OCR an image at a URL**

```textsnap [https://example.com/image.png]```

**OCR the most prominent image** in a webpage's main content

```textsnap [https://example.com/article]```

**OCR an image already on the clipboard** (text is copied back to the clipboard)

```textsnap```

**Write output to a specific file**

```textsnap [image.png] -o [out.txt]```

**Batch OCR** several images into a directory, loading the models once

```textsnap [scans/*.png] -o [path/to/outdir/]```

**Keep tables and headings** as Markdown using the vision-language model

```textsnap [image.png] --structured```

**Never fall back** to the large model (fastest)

```textsnap [image.png] --min-quality 0```

**Judge recognized words** against French and English dictionaries

```textsnap [scan.png] --lang fr,en```

**Print the recognized text** directly

```textsnap [image.png] | xargs cat```

# SYNOPSIS

**textsnap** [_options_] [_FILE_|_URL_...]

**ocr** [_options_] [_FILE_|_URL_...]

# PARAMETERS

**-o**, **--output** _PATH_
> Output .txt path, or a directory (required to be a directory with several inputs). Default: **./textsnaps/_name_\_ocr.txt**.

**-v**, **--verbose**
> Print progress diagnostics (engine used, page-quality score, decode speed) to stderr.

**--structured**, **--markdown**
> Skip PP-OCRv6 and run PaddleOCR-VL directly, keeping its native Markdown (tables, headings).

**--plaintext**
> With **--structured**: flatten the Markdown to plain text. Default output is already plain text.

**--min-quality** _Q_
> Page-quality threshold from 0 to 1 below which the VLM re-reads the page. Default **0.8**; **0** never falls back.

**--lang** _L_
> Comma-separated wordfreq language codes used by the quality check. Default **en**.

**--model-dir** _PATH_
> Use model files from _PATH_ (**ppocr/**, **onnx/**, **tokenizer.json**) instead of portable mode or the cache.

**--max-tokens** _N_
> VLM: cap generated tokens (default **2048**). Raise for very dense pages.

**--max-pixels** _N_
> VLM: pixel budget fed to the vision encoder. Lower is faster but less accurate.

**--vision** _q8_|_q4_
> VLM vision-encoder variant. Default **q8**; **q4** is a smaller download.

**--no-verify**
> Skip SHA-256 verification of downloaded model files.

**--generate-checksums**
> Download the pinned model files, write a fresh checksum manifest, and exit.

**--version**
> Print the version and exit.

# DESCRIPTION

**textsnap** is a command-line OCR utility that runs entirely on the CPU via ONNX Runtime, with no GPU and no cloud calls. Every image first goes through **PP-OCRv6 medium**, a small text detector and line recognizer. Each line is scored with cheap heuristics (confidence, symbol ratio, dictionary words); if the page score falls below **--min-quality**, the page is re-read by **PaddleOCR-VL-1.5**, a 0.9B vision-language model.

Input can be a file path, a direct image URL, a webpage URL, or the system clipboard (no argument). For webpages, textsnap isolates the main content with readability and OCRs the most prominent image, not the whole rendered page. Several inputs can be given at once; models are loaded only once for the batch.

Output is plain UTF-8 text in reading order, written to **./textsnaps/** by default. Only the path of the written file is printed on stdout (one per line in batch mode), so it composes cleanly in shell pipelines. **--structured** keeps the VLM's Markdown output instead. The package also installs **ocr** as an alias.

# CONFIGURATION

**~/.cache/textsnap/**
> Cached model files: PP-OCRv6 (about **140 MB**) on first use, PaddleOCR-VL (about **1.1 GB**) the first time a page falls back or **--structured** is used.

**./textsnaps/**
> Default output directory, created in the current working directory.

**TEXTSNAP_DECODE_THREADS**
> Overrides the VLM decoder thread count. Defaults to a value derived from the physical core count.

**TEXTSNAP_MIN_QUALITY**, **TEXTSNAP_LANG**, **TEXTSNAP_VISION**
> Defaults for **--min-quality**, **--lang** and **--vision**.

# CAVEATS

The first run downloads about 140 MB, plus about 1.1 GB the first time the VLM is needed; afterwards it works offline. Plain-text mode does not understand layout: multi-column pages interleave and tables lose their grid, so use **--structured** for those. PP-OCRv6 mode has no rotation handling. For non-English text pass **--lang**, otherwise clean pages may fall back to the slow VLM needlessly. Reading the clipboard on Linux needs **xclip** or **wl-clipboard**. PDFs are not supported directly.

Version 0.4 changed the default output from the VLM's Markdown to PP-OCRv6 plain text; use **--structured** for the old behavior.

# HISTORY

**textsnap** was published by **kouhxp** in 2026 under the MIT license and is distributed through PyPI. It originally ran only **PaddleOCR-VL-1.5**; version 0.4 made **PP-OCRv6** the default engine with the VLM as fallback. Both models are released by **PaddlePaddle** under the Apache-2.0 license.

# SEE ALSO

[tesseract](/man/tesseract)(1), [ocrmypdf](/man/ocrmypdf)(1), [pdftotext](/man/pdftotext)(1), [imagemagick](/man/imagemagick)(1), [xclip](/man/xclip)(1)

# RESOURCES

```[Source code](https://github.com/kouhxp/textsnap)```

<!-- verified: 2026-11-23 -->
