# TLDR

**Scan document for macros**

```mraptor [document.doc]```

**Scan multiple files**

```mraptor [*.doc]```

**Scan directory recursively**

```mraptor -r [directory/]```

**Output as JSON**

```mraptor -j [document.xlsm]```

**Match specific patterns**

```mraptor -m [pattern] [document.doc]```

# SYNOPSIS

**mraptor** [_options_] _files_...

# PARAMETERS

**-r**, **--recursive**
> Scan directories recursively.

**-j**, **--json**
> JSON output.

**-m** _pattern_
> Match specific pattern.

**-l** _level_
> Log level.

**-z** _password_
> ZIP password.

# DESCRIPTION

**mraptor** (Macro Raptor) detects malicious VBA macros in Microsoft Office documents. It analyzes macro code to identify suspicious patterns typically found in malware.

Part of the oletools suite, mraptor provides rapid triage of potentially dangerous documents.

# DETECTION FLAGS

```
A - AutoExec (auto-run)
W - Write file
X - Execute
S - Suspicious keywords
```

# RISK LEVELS

```
SAFE      - No macros or no suspicious code
LOW       - Macros but no execution
MEDIUM    - Some suspicious patterns
HIGH/VERY HIGH - Strong malware indicators
```

# CAVEATS

Heuristic-based; may have false positives. Cannot detect all malware. Part of oletools package.

# HISTORY

mraptor was developed by **Philippe Lagadec** as part of **oletools**, a collection of Python tools for analyzing Microsoft Office documents.

# SEE ALSO

[olevba](/man/olevba)(1), [oleid](/man/oleid)(1), [oletools](/man/oletools)(1), [yara](/man/yara)(1)
