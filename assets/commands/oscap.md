# TLDR

**Scan system**

```oscap xccdf eval --profile [profile] [ssg-content.xml]```

**Generate report**

```oscap xccdf eval --results [results.xml] --report [report.html] [content.xml]```

**List profiles**

```oscap info [content.xml]```

**Check CVE**

```oscap oval eval --results [results.xml] [oval-definitions.xml]```

**Generate fix script**

```oscap xccdf generate fix --profile [profile] [content.xml]```

# SYNOPSIS

**oscap** [_module_] [_command_] [_options_]

# PARAMETERS

**xccdf** _COMMAND_
> XCCDF operations.

**oval** _COMMAND_
> OVAL operations.

**eval**
> Evaluate content.

**info**
> Show information.

**--profile** _ID_
> Security profile.

**--results** _FILE_
> Results file.

**--report** _FILE_
> HTML report.

**--help**
> Display help information.

# DESCRIPTION

**oscap** is the OpenSCAP scanner. Performs security compliance scanning.

The tool evaluates systems against SCAP content. Generates reports and fixes.

oscap scans for compliance.

# CAVEATS

Requires SCAP content. Root for full scan. RHEL/CentOS focused content available.

# HISTORY

OpenSCAP was created for **security compliance scanning** based on SCAP standards.

# SEE ALSO

[scap-workbench](/man/scap-workbench)(1), [lynis](/man/lynis)(1)

