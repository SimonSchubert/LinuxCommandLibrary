# TAGLINE

OpenSCAP command-line scanner for SCAP-based security compliance

# TLDR

**Show profiles and metadata** in a content file

```oscap info [content.xml]```

**Scan system against an XCCDF profile** and write XML + HTML reports

```oscap xccdf eval --profile [profile_id] --results [results.xml] --report [report.html] [ssg-content.xml]```

**Scan and auto-remediate** failed rules

```oscap xccdf eval --remediate --profile [profile_id] [ssg-content.xml]```

**Allow downloading remote OVAL content** referenced from XCCDF

```oscap xccdf eval --fetch-remote-resources --profile [profile_id] [ssg-content.xml]```

**Use a tailored profile** from a tailoring file

```oscap xccdf eval --tailoring-file [tailoring.xml] --profile [tailored_profile_id] [ssg-content.xml]```

**Run an OVAL definitions file** (e.g. CVE feed)

```oscap oval eval --results [results.xml] --report [report.html] [oval-definitions.xml]```

**Generate a remediation script** (Bash, Ansible, or Puppet)

```oscap xccdf generate fix --fix-type [bash|ansible|puppet] --profile [profile_id] --output [fix.sh] [content.xml]```

# SYNOPSIS

**oscap** [_global_options_] _module_ _operation_ [_operation_options_] _content_file_

# MODULES

**info**
> Print metadata about a SCAP file (profiles, streams, OVAL counts).

**xccdf**
> XCCDF (Extensible Configuration Checklist Description Format) operations: **eval**, **resolve**, **validate**, **export-oval-variables**, **generate** _subcommand_.

**oval**
> OVAL (Open Vulnerability and Assessment Language) operations: **eval**, **collect**, **analyse**, **validate**, **list-probes**, **generate report**.

**ds**
> Data-stream operations: **sds-compose**, **sds-split**, **sds-validate**, **rds-create**, **rds-split**, **rds-validate**.

**cpe**
> CPE (Common Platform Enumeration) operations.

**cvss**
> Compute CVSS scores from a vector string.

# COMMON OPTIONS

**--profile** _ID_
> XCCDF profile to evaluate.

**--results** _FILE_
> Write the machine-readable XCCDF/ARF result file.

**--report** _FILE_
> Write a human-readable HTML report.

**--oval-results**
> Also write per-OVAL-definition result files alongside **--results**.

**--cpe** _FILE_
> Use the given CPE dictionary or language for applicability checks.

**--tailoring-file** _FILE_
> Apply a tailoring XML file to customise the profile.

**--tailoring-id** _ID_
> Use a tailoring component embedded in a data stream.

**--fetch-remote-resources**
> Allow OpenSCAP to download remote OVAL content referenced by the XCCDF.

**--remediate**
> Execute XCCDF fix scripts for rules that fail evaluation. **Use with care — modifies the system.**

**--rule** _ID_
> Limit evaluation to the given rule (repeatable).

**--skip-rule** _ID_
> Skip the given rule (repeatable).

**--datastream-id** _ID_, **--xccdf-id** _ID_, **--benchmark-id** _ID_
> Select a specific component when the file is a multi-stream datastream.

**--fix-type** _TYPE_
> For **generate fix**: bash (default), ansible, puppet, kubernetes, anaconda, ignition, blueprint.

**-V**, **--version**
> Print version, supported features, and probe list.

# DESCRIPTION

**oscap** is the OpenSCAP command-line tool for evaluating systems against SCAP (Security Content Automation Protocol) content. It can run XCCDF benchmarks, evaluate OVAL definitions for vulnerabilities or configuration issues, generate human-readable reports, and even apply remediations automatically.

Typical content is shipped by the **scap-security-guide** (SSG) project as data-stream files such as **/usr/share/xml/scap/ssg/content/ssg-rhel9-ds.xml**, providing profiles like **xccdf_org.ssgproject.content_profile_cis** or **_pci-dss**.

# CAVEATS

Requires SCAP content (commonly from **scap-security-guide**). Full system scans must usually run as root. **--remediate** modifies the live system — review the profile and test in staging before using it. **--fetch-remote-resources** performs network access; avoid in air-gapped environments. Reports can be very large for full RHEL profiles.

# HISTORY

**OpenSCAP** was launched in **2008** by **Red Hat** and became a NIST-certified SCAP scanner in **2014**. It is the reference implementation of the SCAP standards used by RHEL, Fedora, CentOS, Ubuntu, SUSE, and Oracle Linux for compliance auditing (CIS, PCI-DSS, STIG, HIPAA, etc.).

# INSTALL

```apt: sudo apt install openscap-scanner```

```dnf: sudo dnf install openscap-scanner```

```apk: sudo apk add openscap```

```zypper: sudo zypper install openscap```

```nix: nix profile install nixpkgs#openscap```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[scap-workbench](/man/scap-workbench)(1), [lynis](/man/lynis)(1)

