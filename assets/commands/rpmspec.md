# TAGLINE

Query and parse RPM spec files

# TLDR

List **binary packages** from a spec file

```rpmspec --query path/to/rpm.spec```

List all **queryformat options**

```rpmspec --querytags```

Get **summary information** for packages

```rpmspec --query --queryformat "%{name}: %{summary}\n" path/to/rpm.spec```

Get the **source package** information

```rpmspec --query --srpm path/to/rpm.spec```

**Parse** a spec file to stdout

```rpmspec --parse path/to/rpm.spec```

# SYNOPSIS

**rpmspec** [_options_] _specfile_

# PARAMETERS

**--query**
> Query the spec file

**--querytags**
> List available query format tags

**--queryformat** _format_
> Custom output format

**--srpm**
> Query source package information

**--parse**
> Parse and expand spec file

# DESCRIPTION

**rpmspec** queries RPM spec files to extract package information without building packages. It can list packages that would be generated, show package metadata, and parse spec file macros.

This is useful for validating spec files and extracting information during package development.

# CAVEATS

Some spec file features may require additional macros or definitions to parse correctly.

# HISTORY

Part of **RPM** package manager tools. Provides spec file introspection capabilities.

# SEE ALSO

[rpm](/man/rpm)(8), [rpmbuild](/man/rpmbuild)(8)
