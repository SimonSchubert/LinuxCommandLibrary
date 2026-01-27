# TLDR

**Launch SCAP Workbench**

```scap-workbench```

**Open a specific SCAP content file**

```scap-workbench [/usr/share/xml/scap/ssg/content/ssg-rhel8-ds.xml]```

**Open with a specific profile**

```scap-workbench --profile [xccdf_org.ssgproject.content_profile_pci-dss]```

# SYNOPSIS

**scap-workbench** [_options_] [_SCAP_content_]

# PARAMETERS

**--profile** _id_
> Select a specific profile from the content

**--tailoring** _file_
> Load a tailoring file for profile customization

**--skip-valid**
> Skip content validation

**-h**, **--help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**SCAP Workbench** is a graphical tool for security compliance scanning based on the Security Content Automation Protocol (SCAP). It provides an intuitive interface for evaluating systems against security policies like PCI-DSS, HIPAA, and OSPP.

The tool uses XCCDF (Extensible Configuration Checklist Description Format) and OVAL (Open Vulnerability and Assessment Language) to define and check security configurations. It can scan local or remote systems, generate HTML reports, and apply remediation scripts.

Security content is typically provided by the **scap-security-guide** package, installed to /usr/share/xml/scap/ssg/content/. Results can be exported in XCCDF, ARF (Asset Reporting Format), or HTML formats.

# CAVEATS

SCAP Workbench processes only data stream files, limiting some functionality compared to the **oscap** command-line tool. System modifications during remediation require root privileges. Always review remediation actions before applying them to production systems.

# HISTORY

SCAP Workbench is part of the **OpenSCAP** ecosystem, developed to provide graphical access to SCAP compliance scanning. OpenSCAP is NIST-certified and widely used in enterprise environments for security automation and compliance verification.

# SEE ALSO

[oscap](/man/oscap)(8), [openscap](/man/openscap)(8), [lynis](/man/lynis)(8)
