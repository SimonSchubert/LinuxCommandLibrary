# TAGLINE

PDF processing toolkit for the command line

# TLDR

**Validate** a PDF

```pdfcpu validate [input.pdf]```

**Merge** PDFs into one file

```pdfcpu merge [out.pdf] [in1.pdf] [in2.pdf]```

**Split** a PDF into single pages

```pdfcpu split [input.pdf] [out_dir]```

**Optimize** (compress) a PDF

```pdfcpu optimize [input.pdf] [out.pdf]```

**Encrypt** a PDF

```pdfcpu encrypt -upw [user] -opw [owner] [input.pdf]```

**Add a watermark** string

```pdfcpu watermark add -mode text -- "[text]" [input.pdf] [out.pdf]```

**Extract** pages to a new PDF

```pdfcpu trim -pages [1-3] [input.pdf] [out.pdf]```

# SYNOPSIS

**pdfcpu** *command* [*options*] [*file*...]

# DESCRIPTION

**pdfcpu** is a PDF toolkit written in Go. It provides both a Go API and a rich CLI for validating, merging, splitting, optimizing, encrypting, stamping, watermarking, rotating, cropping, extracting images/fonts, managing bookmarks, and many other PDF operations without requiring Ghostscript or Adobe tools.

Each verb (**validate**, **merge**, **split**, **optimize**, **encrypt**, **watermark**, **stamp**, **pages**, **trim**, **rotate**, **extract**, etc.) has its own flags. Run **pdfcpu** *command* **help** or see https://pdfcpu.io for the full command matrix.

# PARAMETERS

**validate** *file*

> Check PDF integrity / compliance related checks.

**merge** *out* *in*...

> Concatenate input PDFs into *out*.

**split** *file* *out_dir*

> Split into page-level PDFs.

**optimize** *in* [*out*]

> Reduce size via resource optimization.

**encrypt** / **decrypt** / **changeopw** / **changeupw**

> Password and permission management (**-upw**, **-opw**).

**watermark** / **stamp**

> Add text or image watermarks/stamps.

**trim** **-pages** *range*

> Keep selected pages.

**rotate**, **resize**, **nup**, **poster**, **booklet**

> Page geometry and imposition helpers.

**extract**

> Extract images, fonts, content, pages, and more.

**version**, **help**

> Version and command help.

# CAVEATS

Not all PDF features (especially exotic encryption, signed forms, or proprietary constructs) are fully supported. Always keep originals before bulk transforms. Some operations rewrite structure and may affect advanced interactive features.

# INSTALL

```apk: sudo apk add pdfcpu```

```brew: brew install pdfcpu```

```nix: nix profile install nixpkgs#pdfcpu```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[qpdf](/man/qpdf)(1), [pdftk](/man/pdftk)(1), [gs](/man/gs)(1), [mutool](/man/mutool)(1)

# RESOURCES

```[Source code](https://github.com/pdfcpu/pdfcpu)```

```[Homepage](https://pdfcpu.io)```

```[Documentation](https://pdfcpu.io)```

<!-- verified: 2026-07-19 -->
