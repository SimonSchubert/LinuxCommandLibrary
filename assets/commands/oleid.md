# TLDR

**Analyze Office document**

```oleid [document.doc]```

**Analyze multiple files**

```oleid [*.docx]```

**Output as JSON**

```oleid -j [document.xlsm]```

**Verbose output**

```oleid -v [document.pptx]```

# SYNOPSIS

**oleid** [_options_] _files_...

# PARAMETERS

**-j**, **--json**
> JSON output.

**-v**, **--verbose**
> Verbose output.

**-z** _password_
> ZIP password.

**-l** _level_
> Log level.

# DESCRIPTION

**oleid** analyzes Microsoft Office documents to detect potential security issues. It identifies macros, encrypted content, external links, and other indicators of malicious content.

Part of the oletools suite, oleid provides quick triage for suspicious documents.

# INDICATORS

```
VBA Macros      - Contains VBA code
Auto-executable - Auto-run macros
Suspicious      - Suspicious keywords
Encrypted       - Password protected
External links  - External references
Flash objects   - Embedded Flash
```

# EXAMPLE OUTPUT

```
Indicator                 Value
VBA Macros                Yes
Auto-executable           Yes
Suspicious VBA            HIGH
Flash Objects             No
```

# CAVEATS

Heuristic analysis; may have false positives. Part of oletools package. Cannot analyze encrypted files without password.

# HISTORY

oleid was developed by **Philippe Lagadec** as part of **oletools**, a Python toolkit for analyzing Microsoft OLE and Office files.

# SEE ALSO

[olevba](/man/olevba)(1), [mraptor](/man/mraptor)(1), [oletools](/man/oletools)(1)
