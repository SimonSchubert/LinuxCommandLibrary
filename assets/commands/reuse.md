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

**reuse** manages software licensing. It ensures REUSE compliance.

FSFE REUSE specification. Clear licensing for projects.

Adds license headers. Standard copyright format.

Generates SPDX files. Machine-readable licensing.

Validates compliance. CI/CD integration ready.

# CAVEATS

SPDX identifiers required. Some licenses complex. Learning curve for setup.

# HISTORY

**reuse** implements the **FSFE REUSE** specification, providing tools to make software licensing clear and machine-readable.

# SEE ALSO

[licensecheck](/man/licensecheck)(1), [spdx](/man/spdx)(1)
