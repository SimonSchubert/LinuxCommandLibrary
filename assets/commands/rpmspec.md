# TAGLINE

Query and parse RPM spec files

# TLDR

List **binary packages** from a spec file

```rpmspec --query [path/to/rpm.spec]```

List all **queryformat options**

```rpmspec --querytags```

Get **summary information** for packages

```rpmspec --query --queryformat "%{name}: %{summary}\n" [path/to/rpm.spec]```

Get the **source package** information

```rpmspec --query --srpm [path/to/rpm.spec]```

**Parse** and expand a spec file to stdout

```rpmspec --parse [path/to/rpm.spec]```

List **build requirements** from a spec file

```rpmspec --query --buildrequires [path/to/rpm.spec]```

Query with **macro definitions**

```rpmspec --define "[dist .el9]" --query [path/to/rpm.spec]```

# SYNOPSIS

**rpmspec** {**--query** | **--parse**} [_options_] _specfile_

# PARAMETERS

**--query**, **-q**
> Query the spec file for package information.

**--querytags**
> List available query format tags.

**--queryformat** _format_
> Custom output format using rpm header tags (e.g., %{name}, %{version}).

**--srpm**
> Query source package information instead of binary packages.

**--buildrequires**
> List build requirements from the spec file.

**--parse**
> Parse and expand spec file macros, outputting the processed spec to stdout.

**--define** _"macro value"_
> Define a macro for spec file processing.

**--target** _platform_
> Set target platform for the query.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**rpmspec** queries RPM spec files to extract package information without building packages. It can list packages that would be generated, show package metadata, expand macros, and parse spec file content.

This is useful for validating spec files, extracting build requirements, and debugging macro expansion during package development.

# CAVEATS

Some spec file features may require additional macros or definitions to parse correctly. Conditional blocks (%if/%endif) are evaluated during parsing and may produce different results depending on defined macros. The --define flag is needed to simulate target distribution settings.

# HISTORY

Part of the **RPM** package manager toolchain. Provides spec file introspection capabilities separate from the full build process.

# SEE ALSO

[rpm](/man/rpm)(8), [rpmbuild](/man/rpmbuild)(8), [dnf](/man/dnf)(8)
