# TAGLINE

CPU-only OCR for screenshots, images, PDFs, and webpages

# TLDR

**OCR a local image** to a text file in ./textsnaps/

```textsnap [path/to/image.png]```

**OCR an image at a URL**

```textsnap [https://example.com/image.png]```

**OCR a webpage** (renders the page, then extracts text)

```textsnap [https://example.com/article]```

**OCR an image already on the clipboard**, no arguments

```textsnap```

**Write output to a specific file**

```textsnap [image.png] -o [out.txt]```

**Strip markdown** and emit plain text only

```textsnap [image.png] --plaintext```

**Cap the decoder** at 1024 generated tokens

```textsnap [image.png] --max-tokens 1024```

**Use a custom local model directory**

```textsnap [image.png] --model-dir [path/to/model]```

**Show progress diagnostics** on stderr

```textsnap -v [image.png]```

# SYNOPSIS

**textsnap** [_options_] [_FILE_|_URL_]

# PARAMETERS

**-o**, **--output** _PATH_
> Write the OCR text to _PATH_. Default: **./textsnaps/_name_\_ocr.txt**.

**-v**, **--verbose**
> Print progress diagnostics to stderr.

**--plaintext**
> Convert the default Markdown output into plain text (no tables, no headings).

**--model-dir** _PATH_
> Use ONNX model files from _PATH_ instead of the cached download.

**--max-tokens** _N_
> Cap the decoder at _N_ generated tokens (default **2048**).

**--max-pixels** _N_
> Limit the vision encoder pixel budget per image to _N_.

**--no-verify**
> Skip SHA-256 verification of downloaded model files.

**--generate-checksums**
> Re-download the model and rewrite the checksum manifest.

# DESCRIPTION

**textsnap** is a command-line OCR utility built around the **PaddleOCR-VL-1.5** vision-language model exported to ONNX. It reads an image from a file path, a URL, or the system clipboard and writes the recognized text to a file inside **./textsnaps/**, printing only the output path on stdout so it composes cleanly in shell pipelines.

The model runs entirely on the CPU, no GPU and no cloud calls. Default output is Markdown so structure such as tables, headings, and lists is preserved; **--plaintext** flattens it for callers that only want raw text. Webpage URLs are rendered before OCR, which makes the tool usable as a "screenshot to text" pipeline for content that is hard to copy directly.

# INPUT MODES

**No argument**
> Read an image from the system clipboard. The OCR text is also copied back to the clipboard.

**Local file**
> Process a local image. Supported formats: PNG, JPG, JPEG, WebP, BMP, GIF, TIFF.

**Image URL**
> Fetch and OCR a remote image.

**Webpage URL**
> Render the page and OCR the resulting screenshot.

# CONFIGURATION

**~/.cache/textsnap/**
> Cached ONNX model files (about **890 MB**) downloaded on first use. Contains the vision encoder (q4 quantized), the autoregressive decoder (q4 quantized), token embeddings (fp32), and a **model_checksums.sha256** manifest.

**./textsnaps/**
> Default output directory, created in the current working directory on first run.

**TEXTSNAP_DECODE_THREADS**
> Environment variable that overrides the decoder thread count. Defaults to the number of physical cores.

# CAVEATS

The first invocation downloads the model bundle (about 890 MB), so be ready for the initial wait and the disk usage. The tool is CPU-only, so OCR of large images or long PDFs takes longer than GPU pipelines. Webpage OCR requires a working headless browser stack provided by the package.

# HISTORY

**textsnap** was published by **kouhxp** in 2026 under the MIT license. The bundled model, **PaddleOCR-VL-1.5**, is released by **PaddlePaddle** under the Apache-2.0 license. The CLI is distributed through PyPI and depends on **onnxruntime** and **huggingface_hub**.

# SEE ALSO

[tesseract](/man/tesseract)(1), [pdftotext](/man/pdftotext)(1), [imagemagick](/man/imagemagick)(1), [curl](/man/curl)(1)
