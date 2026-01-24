# TLDR

**List fonts in PDF**

```pdffonts [document.pdf]```

**List fonts with page range**

```pdffonts -f [1] -l [10] [document.pdf]```

**Substitute font names**

```pdffonts -subst [document.pdf]```

**List from specific page**

```pdffonts -f [5] [document.pdf]```

# SYNOPSIS

**pdffonts** [_-f first_] [_-l last_] [_-subst_] [_options_] _file.pdf_

# PARAMETERS

**-f** _PAGE_
> First page to examine.

**-l** _PAGE_
> Last page to examine.

**-subst**
> Show font substitutions.

**-opw** _PASSWORD_
> Owner password.

**-upw** _PASSWORD_
> User password.

**-v**
> Print version.

**-h**
> Print help.

# OUTPUT COLUMNS

**name**
> Font name.

**type**
> Font type (Type 1, TrueType, CID, etc.).

**emb**
> Embedded (yes/no).

**sub**
> Subset (yes/no).

**uni**
> Unicode mapping (yes/no).

**object ID**
> PDF object identifier.

# DESCRIPTION

**pdffonts** lists fonts used in PDF documents. It shows font names, types, and embedding status.

Embedded fonts are included in the PDF, ensuring consistent display regardless of installed fonts. Non-embedded fonts rely on system fonts, which may cause appearance differences.

Subset fonts contain only characters used in the document, reducing file size. Full fonts include all glyphs.

Font types include Type 1 (PostScript), TrueType, CID fonts (for Asian languages), and Type 3 (bitmap/user-defined).

Unicode mapping indicates whether text can be reliably extracted or searched. Missing Unicode mapping affects copy/paste and accessibility.

Page range options examine specific sections without processing the entire document.

# CAVEATS

Part of poppler-utils package. May not show all font details. Password needed for encrypted PDFs. Font names may be cryptic for subsets.

# HISTORY

**pdffonts** is part of **poppler-utils**, derived from the **Xpdf** project created by **Derek Noonburg**. Poppler became the standard PDF rendering library for many open-source applications.

# SEE ALSO

[pdfinfo](/man/pdfinfo)(1), [pdftotext](/man/pdftotext)(1), [pdftops](/man/pdftops)(1), [pdftocairo](/man/pdftocairo)(1)
