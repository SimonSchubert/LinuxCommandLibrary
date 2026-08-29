# TAGLINE

Stamp a handwritten-style signature onto a PDF from the command line

# TLDR

**Sign interactively** when the PDF has named AcroForm fields (prompts for file, field, and name)

```qwiksi```

**List** fillable form fields (name, type, page, rectangle)

```qwiksi fields [contract.pdf]```

**Stamp** a signature image into a named field

```qwiksi sign [contract.pdf] --signature [sig.png] --field [Signature]```

**Render a name** in a bundled cursive font and stamp it in one step

```qwiksi sign [contract.pdf] --text ['Jane Doe'] --field [Signature]```

**Place** a signature at PDF-point coordinates (flat or scanned pages)

```qwiksi sign [scan.pdf] --signature [sig.png] --page [1] --x [150] --y [100]```

**Draw a coordinate grid** on a page so you can read off **--x** **--y** values

```qwiksi preview [scan.pdf] --page [1] --grid [50]```

**Generate** a transparent PNG signature image from a name

```qwiksi addsig --text ['Jane Doe'] --font [2] --out [sig.png]```

# SYNOPSIS

**qwiksi**

**qwiksi** **sign** _input.pdf_ {**--signature** _image_ | **--text** _name_} **--field** _field_ [**--output** _file_]

**qwiksi** **sign** _input.pdf_ {**--signature** _image_ | **--text** _name_} **--page** _n_ **--x** _x_ **--y** _y_ [**--width** _w_] [**--height** _h_] [**--output** _file_]

**qwiksi** **addsig** **--text** _name_ [**--font** _id_] [**--size** _pt_] [**--color** _hex_] [**--out** _file_]

**qwiksi** **fields** _input.pdf_

**qwiksi** **preview** _input.pdf_ [**--page** _n_] [**--grid** _pt_] [**--out** _file_]

**qwiksi** **help**

# PARAMETERS

With no arguments, **qwiksi** runs an interactive prompt: pick a PDF, choose an AcroForm field (and optional page), type a name, and write **_input__signed.pdf**. Flat PDFs (no fields) print the **preview** + **sign --page --x --y** flow instead of prompting for coordinates.

**sign** _input.pdf_
> Stamp a signature onto the PDF. Requires exactly one of **--signature** or **--text**, and exactly one of **--field** or the manual **--page**/**--x**/**--y** set. Default output is **_input__signed.pdf**.

**--signature** _file_
> Existing PNG or JPEG signature image. Transparent PNG works best.

**--text** _name_
> Render _name_ in a bundled cursive font and stamp that image (no intermediate PNG required). Combine with **--font**, **--size**, and **--color**.

**--font** _id_
> Cursive face for **--text** / **addsig**: **1** Sacramento (default, casual), **2** Great Vibes (formal).

**--size** _pt_
> Font size in points for **--text** / **addsig** (default **100**). Rendering uses 72 DPI so 1 pt equals 1 px.

**--color** _hex_
> Ink color as a 6-digit RGB hex, optional leading **#** (default **000000**).

**--field** _name_
> AcroForm field to stamp into. The image is scaled to fit and centered in the field rectangle. The field's widget annotation is then removed so its appearance stream does not cover the stamp. The non-interactive **sign** command always uses the first widget for that name; interactive mode can pick a page when a field appears more than once.

**--page** _n_
> 1-based page number. Required in manual **sign** mode. For **preview**, default is **1**.

**--x** _x_, **--y** _y_
> Manual placement, PDF points from the **bottom-left** of the page (same origin as **preview**).

**--width** _w_, **--height** _h_
> Manual stamp size in PDF points. Default width is **150**; height follows the image aspect ratio. If only **--height** is set, width follows the aspect ratio.

**--output** _file_
> Output PDF for **sign** (default **_input__signed.pdf**).

**addsig**
> Write a transparent-background PNG of **--text**. Default output **signature.png**.

**--out** _file_
> Output path for **addsig** (default **signature.png**) or **preview** (default **_input__preview.pdf**).

**fields** _input.pdf_
> Print a table of AcroForm fields: name, type, page, and rectangle (**llx lly urx ury**). Reports when the PDF has no form.

**preview** _input.pdf_
> Stamp a labeled coordinate grid onto one page. **--grid** is the line spacing in PDF points (default **50**). Open the result in a viewer and read numbers for **sign --x --y**.

**help**, **-h**, **--help**
> Print usage. **qwiksi** _command_ **-h** prints that command's flags.

# DESCRIPTION

**qwiksi** stamps a signature picture onto a PDF without a GUI. It is a visual overlay, not a cryptographic PDF digital signature (no certificate, no PKCS#7 / PAdES). Placement is either an existing AcroForm widget or absolute coordinates on a flat or scanned page.

The stamp is implemented as a **pdfcpu** image watermark with rotation disabled, so it sits upright at an absolute bottom-left offset. In field mode the matching widget annotation is deleted afterward; otherwise the widget's own appearance would draw on top of the stamp.

**addsig** and **sign --text** draw the name with two Google Fonts embedded in the binary (Sacramento and Great Vibes, SIL Open Font License 1.1). **sign --text** uses a temporary PNG and does not keep it.

Prebuilt static binaries are published for Linux, macOS, and Windows (amd64 and arm64). Building from source needs **Go 1.25** or newer: **go build -o qwiksi .**

# CAVEATS

This does **not** produce a legally binding digital signature; it only draws a graphic. Recipients can still edit the PDF. Encrypted, signed, or unusual PDFs may fail depending on **pdfcpu**. Keep the unsigned original.

**sign** refuses mixing **--field** with **--page**/**--x**/**--y**, and refuses both **--signature** and **--text**. Interactive mode always uses font **1**, size **100**, and black ink; it cannot load an existing PNG.

Coordinates and sizes are PDF points (1/72 inch). pdfcpu treats each image pixel as one point before **scalefactor**, which is why **--width**/**--height** are specified in points rather than pixels.

# HISTORY

Written in Go by **krisraven** (repository created **2026-08-11**). It wraps **pdfcpu** for form inspection, watermarking, and annotation removal. No SPDX license is declared on the repository.

# SEE ALSO

[pdfcpu](/man/pdfcpu)(1), [pdftk](/man/pdftk)(1), [qpdf](/man/qpdf)(1), [cpdf](/man/cpdf)(1), [mutool](/man/mutool)(1), [gs](/man/gs)(1)

# RESOURCES

```[Source code](https://github.com/krisraven/qwiksi)```

<!-- verified: 2026-08-29 -->
