# TAGLINE

extracts and analyzes VBA macros

# TLDR

**Analyze Office document**

```olevba [document.docx]```

**Show VBA code**

```olevba -c [document.xlsm]```

**Decode obfuscated strings**

```olevba -d [document.doc]```

**JSON output**

```olevba --json [document.docm]```

**Analyze all files in directory**

```olevba [directory/]```

# SYNOPSIS

**olevba** [_options_] _file_...

# PARAMETERS

_FILE_
> Office document(s) to analyze.

**-c**
> Show VBA source code.

**-d**
> Decode obfuscated strings.

**--json**
> JSON output format.

**-a**
> Show all information.

**--help**
> Display help information.

# DESCRIPTION

**olevba** extracts and analyzes VBA macros. Detects malicious Office documents.

The tool examines embedded macros. Part of oletools security suite.

# CAVEATS

Security analysis tool. Part of oletools. Python required.

# HISTORY

olevba was created as part of **oletools** for Office document security analysis.

# SEE ALSO

[oletools](/man/oletools)(1), [mraptor](/man/mraptor)(1), [oleid](/man/oleid)(1)

