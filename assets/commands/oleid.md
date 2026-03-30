# TAGLINE

analyze Microsoft Office documents to detect potential security issues

# TLDR

**Analyze an Office document**

```oleid [document.doc]```

**Analyze multiple files**

```oleid [file1.docx] [file2.xlsx]```

**Output results as JSON**

```oleid -j [document.xlsm]```

**Analyze a password-protected ZIP archive**

```oleid -z [infected] [document.zip]```

# SYNOPSIS

**oleid** [_options_] _files_...

# PARAMETERS

**-j**, **--json**
> Output results in JSON format.

**-v**, **--verbose**
> Verbose output with additional details.

**-z** _PASSWORD_
> Password for opening ZIP-encrypted files.

**-l** _LEVEL_
> Set log level (DEBUG, INFO, WARNING, ERROR, CRITICAL).

**-h**, **--help**
> Display help message.

# DESCRIPTION

**oleid** analyzes Microsoft Office documents (OLE and OpenXML formats) to detect potential security issues. It identifies VBA macros, encrypted content, external links, embedded objects, and other indicators commonly found in malicious documents.

Part of the **oletools** suite, oleid provides quick triage for suspicious documents. It checks for indicators such as OLE format validity, application name, encryption, VBA macros, auto-executable macros, embedded Flash objects, and ObjectPool streams.

# INDICATORS

```
OLE format      - Valid OLE file structure
Application     - Creating application name
VBA Macros      - Contains VBA code
Auto-executable - Auto-run macros present
Encrypted       - MS Office encryption detected
ObjectPool      - Embedded OLE objects
Flash objects   - Embedded Flash content
```

# CAVEATS

Heuristic analysis; may produce false positives. Requires the **oletools** Python package. Cannot analyze encrypted files without providing the password via **-z**.

# HISTORY

oleid was developed by **Philippe Lagadec** as part of **oletools**, a Python toolkit for analyzing Microsoft OLE2 files (Structured Storage / Compound File Binary Format) and MS Office documents.

# SEE ALSO

[olevba](/man/olevba)(1), [mraptor](/man/mraptor)(1), [oletools](/man/oletools)(1), [clamscan](/man/clamscan)(1)
