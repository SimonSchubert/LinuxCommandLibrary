# TLDR

**Analyze document with oleid**

```oleid [document.doc]```

**Extract VBA macros**

```olevba [document.xlsm]```

**Detect malicious macros**

```mraptor [document.doc]```

**Find RTF exploits**

```rtfobj [document.rtf]```

**Analyze OLE structure**

```olemeta [document.doc]```

**Check for Flash**

```oleobj [document.pptx]```

# SYNOPSIS

**oletools** - Python tools for analyzing Office documents

# DESCRIPTION

**oletools** is a collection of Python tools for analyzing Microsoft Office documents (OLE, VBA, Office Open XML). It's commonly used for malware analysis and detecting malicious documents.

The toolkit includes multiple specialized tools for different analysis tasks.

# INCLUDED TOOLS

```
oleid    - Quick analysis, indicators
olevba   - Extract/analyze VBA macros
mraptor  - Detect malicious VBA
olemeta  - Show metadata
oleobj   - Extract embedded objects
rtfobj   - Analyze RTF files
oletimes - Show timestamps
oledir   - List OLE directory
```

# INSTALLATION

```bash
pip install oletools
```

# CAVEATS

Python package required. Heuristic detection may have false positives. Cannot decrypt password-protected files.

# HISTORY

oletools was created by **Philippe Lagadec** for analyzing potentially malicious Office documents, widely used in malware analysis and incident response.

# SEE ALSO

[oleid](/man/oleid)(1), [olevba](/man/olevba)(1), [mraptor](/man/mraptor)(1), [yara](/man/yara)(1)
