# TAGLINE

command-line tool for manipulating PDF documents

# TLDR

**Merge PDF files**

```pdftk [file1.pdf] [file2.pdf] cat output [merged.pdf]```

**Extract specific pages**

```pdftk [input.pdf] cat [1-5] [10] output [pages.pdf]```

**Rotate pages**

```pdftk [input.pdf] cat [1-endeast] output [rotated.pdf]```

**Split PDF into single pages**

```pdftk [input.pdf] burst output [page_%02d.pdf]```

**Decrypt PDF**

```pdftk [encrypted.pdf] input_pw [password] output [decrypted.pdf]```

**Add password protection**

```pdftk [input.pdf] output [protected.pdf] owner_pw [pass] user_pw [pass]```

**Fill PDF form**

```pdftk [form.pdf] fill_form [data.fdf] output [filled.pdf]```

**Get PDF info**

```pdftk [input.pdf] dump_data```

# SYNOPSIS

**pdftk** _input_ [_input_pw password_] [_operation_] [_output file_] [_encryption options_]

# PARAMETERS

**cat**
> Concatenate pages (merge, extract, reorder).

**shuffle**
> Interleave pages from multiple files.

**burst**
> Split into single-page PDFs.

**rotate**
> Rotate pages.

**fill_form**
> Fill form fields from FDF/XFDF.

**dump_data**
> Report PDF metadata.

**dump_data_fields**
> Report form field information.

**update_info**
> Update PDF metadata.

**attach_files**
> Attach files to PDF.

**unpack_files**
> Extract attachments.

**background**
> Apply PDF as background.

**stamp**
> Apply PDF as foreground stamp.

**output**
> Specify output file.

**input_pw** _PASS_
> Input file password.

**owner_pw** _PASS_
> Set owner password (full permissions).

**user_pw** _PASS_
> Set user password (limited permissions).

**allow** _PERMS_
> Set allowed permissions.

**encrypt_40bit**
> Use 40-bit encryption.

**encrypt_128bit**
> Use 128-bit encryption.

**flatten**
> Flatten form fields.

**compress**
> Compress output.

**uncompress**
> Decompress output.

# DESCRIPTION

**pdftk** (PDF Toolkit) is a command-line tool for manipulating PDF documents. It can merge, split, rotate, encrypt, decrypt, fill forms, and modify metadata without quality loss.

Page selection uses flexible syntax: ranges (1-5), specific pages (3,7,10), reverse order (end-1), and rotation suffixes (north, south, east, west). Multiple input files can be combined with per-file page selections.

Form handling fills interactive PDF forms from FDF (Forms Data Format) or XFDF data files. The dump_data_fields command extracts field information for preparing fill data. Flatten permanently merges form data into the document.

Encryption options set owner and user passwords with permission controls. Owner password grants full access; user password can have restricted permissions (no printing, no copying, etc.).

The stamp and background operations overlay PDFs, useful for watermarks, letterheads, or combining content. Attachments can embed files within PDFs.

# CAVEATS

Some complex PDFs may not process correctly. Java version (pdftk-java) differs from original C++ version. Encryption is not always strong. Large files may be slow. Form filling works best with Acrobat-created forms. Some features deprecated in newer PDF standards.

# HISTORY

**pdftk** was originally written by **Sid Steward** in **2003** using iText library. It became the standard command-line PDF tool on Linux. After the original became unmaintained, **pdftk-java** emerged as a port to Java, maintaining compatibility while enabling continued development.

# SEE ALSO

[qpdf](/man/qpdf)(1), [poppler-utils](/man/poppler-utils)(1), [ghostscript](/man/ghostscript)(1), [pdfunite](/man/pdfunite)(1)
