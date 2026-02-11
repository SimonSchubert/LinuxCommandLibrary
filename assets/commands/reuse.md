# TAGLINE

Manage FSFE REUSE software licensing compliance

# TLDR

**Check compliance**

```reuse lint```

**Add license header**

```reuse annotate --license [MIT] --copyright "[Author]" [file]```

**Download license**

```reuse download [MIT]```

**Generate SPDX bill**

```reuse spdx```

**Initialize project**

```reuse init```

**Show file status**

```reuse status```

# SYNOPSIS

**reuse** _command_ [_options_]

# PARAMETERS

**lint**
> Check compliance.

**annotate**
> Add license headers.

**download**
> Get license text.

**spdx**
> Generate SPDX file.

**init**
> Initialize project.

**--license** _ID_
> SPDX license identifier.

**--copyright** _TEXT_
> Copyright holder.

# DESCRIPTION

**reuse** is a tool for managing software licensing according to the FSFE REUSE specification, which ensures every file in a project has clear, machine-readable copyright and license information. It helps developers add standardized SPDX license headers to source files and validates that the entire project meets compliance requirements.

The **lint** command checks a project for REUSE compliance, verifying that all files have proper license and copyright annotations. The **annotate** command adds or updates SPDX headers in source files, automatically adapting the comment style to match the file type. License texts can be downloaded with **reuse download** using standard SPDX identifiers like MIT, Apache-2.0, or GPL-3.0-or-later.

The tool also generates SPDX Software Bill of Materials files with the **spdx** command, providing a complete machine-readable inventory of all licenses and copyrights in the project. This output integrates well with CI/CD pipelines and compliance auditing workflows.

# CAVEATS

SPDX identifiers required. Some licenses complex. Learning curve for setup.

# HISTORY

**reuse** implements the **FSFE REUSE** specification, providing tools to make software licensing clear and machine-readable.

# SEE ALSO

[licensecheck](/man/licensecheck)(1), [spdx](/man/spdx)(1)
