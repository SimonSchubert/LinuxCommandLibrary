# TAGLINE

Decode zlib-compressed JavaScript from PDFs

# TLDR

**Decode Zlib-compressed JavaScript**

```zjsdecode [encoded.js] [output.js]```

**Decode from stdin**

```cat [encoded.js] | zjsdecode > [output.js]```

**Decode and beautify**

```zjsdecode [encoded.js] | js-beautify```

# SYNOPSIS

**zjsdecode** [_input_file_] [_output_file_]

# PARAMETERS

_input_file_
> Compressed JavaScript file to decode

_output_file_
> Output file for decoded JavaScript

# DESCRIPTION

**zjsdecode** decodes JavaScript files that have been compressed using zlib encoding, commonly found in PDF files. Some malicious PDFs embed JavaScript that is zlib-compressed to evade analysis.

The tool is useful for malware analysis, PDF forensics, and extracting embedded scripts from documents. It reverses the FlateDecode compression used in PDF streams.

zjsdecode is part of several PDF analysis toolkits and is commonly used alongside other PDF examination utilities.

# CAVEATS

This is a specialized tool for PDF analysis. It won't decode JavaScript obfuscated with other methods (like eval(), string encoding, or minification).

Decoded JavaScript may still be obfuscated and require further analysis or deobfuscation.

Use caution when analyzing potentially malicious scripts. Run in isolated environments.

# SEE ALSO

[pdf-parser](/man/pdf-parser)(1), [pdfid](/man/pdfid)(1), [js-beautify](/man/js-beautify)(1), [zlib-flate](/man/zlib-flate)(1)
