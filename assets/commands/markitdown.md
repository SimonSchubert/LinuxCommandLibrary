# TAGLINE

Convert files to Markdown

# TLDR

Convert a file and print **Markdown**

```markitdown [path/to/file.pdf]```

Read **standard input** and write a file

```markitdown -x [pdf] -o [document.md]```

Save to a **file**

```markitdown [path/to/file.pdf] -o [document.md]```

**Keep** embedded data URIs instead of truncating them

```markitdown --keep-data-uris [path/to/file.docx]```

**List** installed plugins

```markitdown --list-plugins```

Convert **with plugins** enabled

```markitdown --use-plugins [path/to/file.pdf]```

Use **Azure Document Intelligence**

```markitdown [path/to/file.pdf] -d -e [https://example.cognitiveservices.azure.com]```

Use **Azure Content Understanding**

```markitdown [path/to/file.pdf] --use-cu --cu-endpoint [https://example.cognitiveservices.azure.com]```

# SYNOPSIS

**markitdown** [_OPTIONS_] [_FILENAME_]

# PARAMETERS

_FILENAME_
> File to convert. If omitted, read standard input.

**-o**, **--output** _FILE_
> Write Markdown to this file. The default is standard output.

**-x**, **--extension** _EXT_
> Hint the file extension, useful when reading standard input. A leading dot is optional.

**-m**, **--mime-type** _TYPE_
> Hint the MIME type.

**-c**, **--charset** _CHARSET_
> Hint the character set, such as UTF-8.

**-d**, **--use-docintel**
> Extract text with Azure Document Intelligence instead of the offline converter. Mutually exclusive with **--use-cu**.

**-e**, **--endpoint** _URL_
> Document Intelligence endpoint. If omitted, the value of this variable is used:

```MARKITDOWN_DOCINTEL_ENDPOINT```

**--use-cu**, **--use-content-understanding**
> Extract text with Azure Content Understanding. Mutually exclusive with **--use-docintel**. Needs **--cu-endpoint** or this variable:

```MARKITDOWN_CU_ENDPOINT```

**--cu-endpoint** _URL_
> Content Understanding endpoint.

**--cu-analyzer** _ID_
> Content Understanding analyzer id. If omitted, an analyzer is chosen from the file type.

**--cu-file-types** _LIST_
> Comma-separated file types to send to Content Understanding, such as `pdf,jpeg,mp4`. If omitted, every supported type is sent.

**--docintel-model-id** _ID_
> Document Intelligence model id, such as `prebuilt-layout`. That id is the default.

**--docintel-query-fields** _LIST_
> Comma-separated field names for the Document Intelligence queryFields add-on (OCR file types).

**--docintel-features** _LIST_
> Comma-separated Document Intelligence add-ons for OCR file types: `barcodes`, `formulas`, `keyValuePairs`, `languages`, `ocrHighResolution`, `styleFont`. `none` requests none. Some add-ons are billed extra.

**-p**, **--use-plugins**
> Enable third-party plugins. Plugins are off unless this is set.

**--list-plugins**
> List installed plugins and exit.

**--keep-data-uris**
> Keep data URIs, such as base64 images, in the output. By default they are truncated.

**-v**, **--version**
> Show the version and exit.

**-h**, **--help**
> Show help and exit.

# DESCRIPTION

**markitdown** converts PDF, Office, HTML, images, audio, and other files to Markdown. It is Microsoft's Python package of the same name. Supported Python versions are 3.10 through 3.14.

With no filename it reads standard input, which is how a pipe or a container invocation feeds it a file. Optional extras turn on individual formats (PDF, Office, audio, Azure). The extra named `all` installs every optional dependency. Plugins, including the OCR plugin, stay disabled until **--use-plugins**.

Document Intelligence and Content Understanding cannot be selected together. Cloud conversion needs the matching extra and an endpoint.

# CAVEATS

The process reads and writes with its own privileges. A cloud endpoint sends the file to Azure. Plugins and optional extras are separate installs. Do not treat a Docker image tag as a distro package.

# INSTALL

```nix: nix profile install nixpkgs#markitdown```

<!-- packages: 2026-11-17 -->

# SEE ALSO

[pandoc](/man/pandoc)(1), [docling](/man/docling)(1), [python3](/man/python3)(1)

# RESOURCES

```[Source code](https://github.com/microsoft/markitdown)```

```[Documentation](https://github.com/microsoft/markitdown#markitdown)```

<!-- verified: 2026-11-17 -->
