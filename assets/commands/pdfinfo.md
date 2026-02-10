# TAGLINE

displays metadata and properties of PDF files

# TLDR

**Show PDF information**

```pdfinfo [document.pdf]```

**Show detailed metadata**

```pdfinfo -meta [document.pdf]```

**Show JavaScript info**

```pdfinfo -js [document.pdf]```

**Show structure info**

```pdfinfo -struct [document.pdf]```

**Show first page box dimensions**

```pdfinfo -box [document.pdf]```

**Show info from encrypted PDF**

```pdfinfo -upw [password] [document.pdf]```

# SYNOPSIS

**pdfinfo** [_-meta_] [_-box_] [_-js_] [_-struct_] [_options_] _file.pdf_

# PARAMETERS

**-meta**
> Show document metadata (XMP).

**-box**
> Show page box dimensions.

**-js**
> Show JavaScript.

**-struct**
> Show structure information.

**-f** _PAGE_
> First page for info.

**-l** _PAGE_
> Last page for info.

**-enc** _ENCODING_
> Text encoding.

**-opw** _PASSWORD_
> Owner password.

**-upw** _PASSWORD_
> User password.

**-rawdates**
> Show raw date strings.

**-isodates**
> Show ISO-8601 dates.

# OUTPUT FIELDS

**Title**
> Document title.

**Author**
> Document author.

**Creator**
> Creating application.

**Producer**
> PDF producer.

**CreationDate**
> Creation date.

**ModDate**
> Modification date.

**Pages**
> Page count.

**Page size**
> Dimensions.

**PDF version**
> PDF specification version.

**Encrypted**
> Encryption status.

# DESCRIPTION

**pdfinfo** displays metadata and properties of PDF files. It extracts document information without viewing the actual content.

Basic info includes title, author, creation date, page count, and dimensions. This helps identify and catalog PDF files.

Page box information shows MediaBox, CropBox, and other box dimensions that affect printing and display.

Encryption information reveals what permissions are set: printing, copying, modification. It also shows the encryption method.

XMP metadata (-meta) contains extended information that applications embed. This may include copyright, keywords, and application-specific data.

JavaScript detection (-js) reveals embedded scripts, which may be security concerns in untrusted PDFs.

# CAVEATS

Requires poppler-utils package. Some metadata may be inaccurate if PDF was poorly created. Encrypted PDFs need correct password.

# HISTORY

**pdfinfo** is part of **poppler-utils**, derived from the **Xpdf** project created by **Derek Noonburg**. These utilities became standard tools for PDF manipulation on Unix-like systems.

# SEE ALSO

[pdffonts](/man/pdffonts)(1), [pdfimages](/man/pdfimages)(1), [pdftotext](/man/pdftotext)(1), [exiftool](/man/exiftool)(1)
