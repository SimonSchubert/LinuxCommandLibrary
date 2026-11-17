# TAGLINE

Convert documents to Markdown, JSON, HTML, or text

# TLDR

Convert a file to **Markdown** in the current directory

```docling [path/to/file.pdf]```

Write the result to a **directory**

```docling [path/to/file.pdf] --output [path/to/directory]```

Export images as **placeholders** or as referenced PNG files

```docling --image-export-mode [placeholder|referenced] [path/to/file.pdf]```

Choose the **output format**

```docling --to [json|html|md|text] [path/to/file.pdf]```

Skip **OCR** on a digital PDF

```docling --no-ocr [path/to/file.pdf]```

Use a **vision-language model**

```docling --vlm-model granite_docling [https://arxiv.org/pdf/2206.01062]```

Show **help**

```docling -h```

# SYNOPSIS

**docling** [_OPTIONS_] _SOURCE_...

# PARAMETERS

**--output** _DIRECTORY_
> Write converted files under this directory instead of the current directory.

**--image-export-mode** _MODE_
> **placeholder** replaces figures with placeholders. **referenced** writes PNG files and links them from the output.

**--to** _FORMAT_
> Output format: **json**, **html**, **md**, or **text**.

**--no-ocr**
> Do not run OCR. Faster on PDFs that already contain text.

**--vlm-model** _NAME_
> Select a vision-language model. One name the project documents is the token in the example above.

**-h**, **--help**
> Show help and exit.

# DESCRIPTION

**docling** converts PDF, Office, HTML, and image inputs into Markdown or another structured form. It uses layout analysis and, unless **--no-ocr** is set, OCR. A source can be a local path or a URL.

The package needs Python 3.10 or newer. Release 2.70.0 dropped Python 3.9. The command is the console script of the **docling** Python package. The CLI also exposes further subcommands; **docling --help** lists them.

Optional pieces such as a VLM model are selected with flags. They are not separate programs.

# CAVEATS

Conversion downloads models on first use and can be heavy on CPU. A URL source fetches that document with the privileges of the process.

# INSTALL

```aur: yay -S docling```

```nix: nix profile install nixpkgs#docling```

<!-- packages: 2026-11-17 -->

# SEE ALSO

[pandoc](/man/pandoc)(1), [markitdown](/man/markitdown)(1), [python3](/man/python3)(1)

# RESOURCES

```[Source code](https://github.com/docling-project/docling)```

```[Documentation](https://docling-project.github.io/docling/)```

<!-- verified: 2026-11-17 -->
